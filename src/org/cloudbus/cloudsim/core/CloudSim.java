package org.cloudbus.cloudsim.core;

import java.util.Calendar;

public class CloudSim {
	private static int scenarioNbr = 0;

	public static double clock() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void startSimulation() {
		scenarioNbr++;
		System.out.println("Scenario number " + scenarioNbr);
		
	}

	public static void terminateSimulation() {
		System.out.println("This simulation terminates");

	}

	public static void init(int num_user, Calendar calendar, boolean trace_flag, double d) {
		System.out.println("num_user = " + num_user + "\ncalendar = " + calendar.getTime() + "\nTrace flag = " + trace_flag);
	}

}
