/*
 * Title:        EdgeCloudSim - EdgeHost
 * 
 * Description: 
 * EdgeHost adds location information over CloudSim's Host class
 *               
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.edge_server;

import java.util.List;

import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.VmSchedulerSpaceShared;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

import edu.boun.edgecloudsim.utils.Location;

public class EdgeHost extends Host {
	private Location location;
	
	public EdgeHost(int id, RamProvisionerSimple ramProvisionerSimple,
			BwProvisionerSimple bwProvisionerSimple, long storage,
			List<? extends Pe> peList, VmSchedulerSpaceShared vmSchedulerSpaceShared) {
		super(id, ramProvisionerSimple, bwProvisionerSimple, storage, peList, vmSchedulerSpaceShared);

	}
	
	public void setPlace(Location _location){
		location=_location;
	}
	
	public Location getLocation(){
		return location;
	}
}
