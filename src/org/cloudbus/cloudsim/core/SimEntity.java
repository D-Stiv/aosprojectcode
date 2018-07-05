package org.cloudbus.cloudsim.core;

import edu.boun.edgecloudsim.utils.EdgeTask;

public class SimEntity {
	private String name;
	private int Id;

	public SimEntity(String name) {
		this.name = name;
		Id = 9001;
	}

	public String getName() {
		return name;
	}

	public void startEntity() {
		System.out.println("Entity started ...");
		
	}

	public int getId(){
		return Id;
		
	}
	
	public void shutdownEntity() {
		System.out.println("Entity shut down ...");
	}

	public void processEvent(SimEvent ev) {
		// TODO Auto-generated method stub
		
	}

	public void schedule(int id, double d, int printProgress) {
		// TODO Auto-generated method stub
		
	}

	public void schedule(int id, double startTime, int createTask, EdgeTask edgeTask) {
		// TODO Auto-generated method stub
		
	}

}
