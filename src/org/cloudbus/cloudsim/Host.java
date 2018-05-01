package org.cloudbus.cloudsim;

import java.util.List;

import org.cloudbus.cloudsim.provisioners.BwProvisioner;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisioner;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

public class Host {

	public Host(int id, RamProvisioner ramProvisioner, BwProvisioner bwProvisioner, long storage,
			List<? extends Pe> peList, VmScheduler vmScheduler) {
		// TODO Auto-generated constructor stub
	}

	public Host(int id, RamProvisionerSimple ramProvisionerSimple, BwProvisionerSimple bwProvisionerSimple,
			long storage, List<? extends Pe> peList, VmSchedulerSpaceShared vmSchedulerSpaceShared) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean vmCreate(Vm vm) {
		// TODO Auto-generated method stub
		return false;
	}

	public void vmDestroy(Vm vm) {
		// TODO Auto-generated method stub
		
	}

}
