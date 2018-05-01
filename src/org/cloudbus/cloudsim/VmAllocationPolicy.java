package org.cloudbus.cloudsim;

import java.util.List;
import java.util.Map;

public class VmAllocationPolicy {

	private Map<String, Host> hostList;

	public VmAllocationPolicy(List<? extends Host> list) {
		// TODO Auto-generated constructor stub
	}

	public boolean allocateHostForVm(Vm vm) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean allocateHostForVm(Vm vm, Host host) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Map<String, Object>> optimizeAllocation(List<? extends Vm> vmList) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deallocateHostForVm(Vm vm) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, Host> getHostList() {
		// TODO Auto-generated method stub
		return hostList;
	}


	public Host getHost(Vm vm) {
		// TODO Auto-generated method stub
		return null;
	}

	public Host getHost(int vmId, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
