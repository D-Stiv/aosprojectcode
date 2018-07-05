package org.cloudbus.cloudsim;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VmAllocationPolicy {

	private HashMap<Vm, Host> hostList;

	public VmAllocationPolicy(List<? extends Host> list) {
		hostList = new HashMap<>();
		int i = 0;
		Iterator<Entry<Vm, Host>> entries = hostList.entrySet().iterator();
		while (entries.hasNext() && i < list.size()) {
			Entry<Vm, Host> entry = entries.next();
			entry.setValue(list.get(i));
			i++;
		}
		//to verify the initialization of the hostList
		while (entries.hasNext()) {
	  		Entry<Vm, Host> entry = entries.next();
	  		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	public boolean allocateHostForVm(Vm vm) {
		boolean found = false;
		Iterator<Entry<Vm, Host>> entries = hostList.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<Vm, Host> entry = entries.next();
			if(entry.getKey().equals(vm))
				found = true;
		}
		return found;
	}

	public boolean allocateHostForVm(Vm vm, Host host) {
		boolean found = false;
		Iterator<Entry<Vm, Host>> entries = hostList.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<Vm, Host> entry = entries.next();
			if(entry.getKey().equals(vm) && entry.getValue().equals(host))
				found = true;
		}
		return found;
	}

	public List<Map<String, Object>> optimizeAllocation(List<? extends Vm> vmList) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deallocateHostForVm(Vm vm) {
		// TODO Auto-generated method stub
		
	}

	public Map<Vm, Host> getHostList() {
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
