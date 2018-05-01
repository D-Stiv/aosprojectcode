package org.cloudbus.cloudsim;

import java.util.List;

import edu.boun.edgecloudsim.edge_client.MobileDeviceManager;
import edu.boun.edgecloudsim.edge_client.Task;
import edu.boun.edgecloudsim.edge_server.EdgeVM;

public class DatacenterBroker {

	private List<Cloudlet> cloudletList;
	private MobileDeviceManager datacenter;
	private String name;

	public DatacenterBroker(String name) {
		this.name = name;
	}
	
	public void schedule(int id, double wlanDelay, int responseReceivedByMobileDevice, Task task) {
		// TODO Auto-generated method stub
		
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public void bindCloudletToVm(int cloudletId, int vmId) {
		// TODO Auto-generated method stub
		
	}

	public MobileDeviceManager getDatacenter() {
		// TODO Auto-generated method stub
		return datacenter;
	}

	public List<EdgeVM> getVmsToDatacentersMap() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cloudlet> getCloudletList() {
		// TODO Auto-generated method stub
		return cloudletList;
	}
	public void finishExecution() {
		// TODO Auto-generated method stub
		
	}

	public void clearDatacenters() {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void submitVmList(List<EdgeVM> vmList) {
		// TODO Auto-generated method stub
		
	}
	
	public void schedule(EdgeVM edgeVM, double delay, int cloudletSubmit, Task task) {
		// TODO Auto-generated method stub
		
	}

}
