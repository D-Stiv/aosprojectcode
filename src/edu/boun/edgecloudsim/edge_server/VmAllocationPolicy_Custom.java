/*
 * Title:        EdgeCloudSim - Custom Vm Allocation Policy
 * 
 * Description: 
 * VmAllocationPolicy_Custom implements VmAllocationPolicy to decide which.
 * VM is created on which host locatied on the datacenters. For those
 * who wants to add another Vm Allocation Policy to EdgeCloudSim should
 * provide another concreate instance of VmAllocationPolicy via ScenarioFactory
 *               
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.edge_server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicy;
import org.cloudbus.cloudsim.core.CloudSim;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edu.boun.edgecloudsim.core.SimSettings;

/*
 * Same as VmAllocationPolicySimple.
 */
public class VmAllocationPolicy_Custom extends VmAllocationPolicy {
	/** The vm table. */
	private Map<String, Host> vmTable;
	private static int createdVmNum;
	private int DataCenterIndex;
	
	public VmAllocationPolicy_Custom(List<? extends Host> list, int _DataCenterIndex) {
		super(list);
		
		setVmTable(new HashMap<String, Host>());
		DataCenterIndex=_DataCenterIndex;
		createdVmNum = 0;
	}

	@Override
	public boolean allocateHostForVm(Vm vm) {
		boolean result = false;

		if (!getVmTable().containsKey(vm.getId())) { // if this vm was not created
			boolean vmFound = false;
			int vmCounter = 0;
			int hostIndex = 0;
			int dataCenterIndex = 0;
			
			//find proper datacenter id and host id for this VM
			Document doc = SimSettings.getInstance().getEdgeDevicesDocument();
			NodeList datacenterList = doc.getElementsByTagName("datacenter");
			for (int i = 0; (!vmFound && i < datacenterList.getLength()); i++) {
				Node datacenterNode = datacenterList.item(i);
				Element datacenterElement = (Element) datacenterNode;
				NodeList hostNodeList = datacenterElement.getElementsByTagName("host");
				for (int j = 0; (!vmFound  && j < hostNodeList.getLength()); j++) {
					Node hostNode = hostNodeList.item(j);
					Element hostElement = (Element) hostNode;
					NodeList vmNodeList = hostElement.getElementsByTagName("VM");
					for (int k = 0; (!vmFound && k < vmNodeList.getLength()); k++) {

						if(vmCounter == vm.getId()){
							dataCenterIndex = i;
							hostIndex = j;
							vmFound = true;
						}

						vmCounter++;
					}
				}
			}

			if(vmFound && dataCenterIndex == DataCenterIndex && hostIndex < getHostList().size()){
				Host host = getHostList().get(hostIndex);
				result = host.vmCreate(vm);
	
				if (result) { // if vm were succesfully created in the host
					getVmTable().put(Integer.toString(vm.getId()), host);
					createdVmNum++;
					Log.formatLine("%.2f: VM #" + vm.getId() + " has been allocated to the host #" + host.getId(),CloudSim.clock());
					result = true;
				}
			}
		}
		
		return result;
	}

	@Override
	public boolean allocateHostForVm(Vm vm, Host host) {
		if (host.vmCreate(vm)) { // if vm has been succesfully created in the host
			getVmTable().put(Integer.toString(vm.getId()), host);
			createdVmNum++;
			
			Log.formatLine("%.2f: VM #" + vm.getId() + " has been allocated to the host #" + host.getId(),CloudSim.clock());
			return true;
		}

		return false;
	}

	@Override
	public List<Map<String, Object>> optimizeAllocation(
			List<? extends Vm> vmList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deallocateHostForVm(Vm vm) {
		Host host = getVmTable().remove(vm.getId());
		if (host != null) {
			host.vmDestroy(vm);
		}
	}

	@Override
	public Host getHost(Vm vm) {
		return getVmTable().get(vm.getId());
	}

	@Override
	public Host getHost(int vmId, int userId) {
		return getVmTable().get(Vm.getId(userId, vmId));
	}

	public static int getCreatedVmNum(){
		return createdVmNum;
	}
	
	/**
	 * Gets the vm table.
	 * 
	 * @return the vm table
	 */
	public Map<String, Host> getVmTable() {
		return vmTable;
	}

	/**
	 * Sets the vm table.
	 * 
	 * @param vmTable the vm table
	 */
	protected void setVmTable(Map<String, Host> vmTable) {
		this.vmTable = vmTable;
	}
}
