package org.cloudbus.cloudsim.core;

import org.cloudbus.cloudsim.Cloudlet;

import edu.boun.edgecloudsim.utils.EdgeTask;

public class SimEvent {

	private Cloudlet data;
	private int tag;
	private EdgeTask newDataa;

	public SimEvent(Cloudlet data, int tag) {
		this.data = data;
		this.tag = tag;
	}
	
	public Cloudlet getData() {
		return data;
	}

	public int getTag() {
		return tag;
	}

	public EdgeTask getNewData(){
		return newDataa ;
	}
}
