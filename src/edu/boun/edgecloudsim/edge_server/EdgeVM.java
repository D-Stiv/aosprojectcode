/*
 * Title:        EdgeCloudSim - EdgeVM
 * 
 * Description: 
 * EdgeVM adds vm type information over CloudSim's VM class
 *               
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.edge_server;

import org.cloudbus.cloudsim.CloudletScheduler;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Vm;

import edu.boun.edgecloudsim.core.SimSettings;
import edu.boun.edgecloudsim.edge_client.MobileDeviceManager;

public class EdgeVM extends Vm {
	private SimSettings.VM_TYPES type;
	private int id;
	private CloudletScheduler cloudletScheduler;
	private MobileDeviceManager host;
	
	public EdgeVM(int id, int userId, double mips, int numberOfPes, int ram,
			long bw, long size, String vmm, CloudletSchedulerTimeShared cloudletSchedulerTimeShared) {
		super(id, userId, mips, numberOfPes, ram, bw, size, vmm, cloudletSchedulerTimeShared);

	}

	public void setVmType(SimSettings.VM_TYPES _type){
		type=_type;
	}
	
	public SimSettings.VM_TYPES getVmType(){
		return type;
	}

	public MobileDeviceManager getHost() {
		// TODO Auto-generated method stub
		return host;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public CloudletScheduler getCloudletScheduler() {
		// TODO Auto-generated method stub
		return cloudletScheduler;
	}
}
