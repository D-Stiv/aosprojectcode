package org.cloudbus.cloudsim.core;

import org.cloudbus.cloudsim.Cloudlet;

public class SimEvent {

	private Cloudlet data;
	private int tag;

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


}
