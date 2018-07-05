package org.cloudbus.cloudsim;

public class Vm {
	private int vmId;
	private int userId;
	private double mips;
	private int numberOfPes;
	private int ram;
	private long bandwidth;
	private long size;
	private String vmm;
	private CloudletScheduler cloudletScheduler;

	public Vm(int id, int userId, double mips, int numberOfPes, int ram, long bw, long size, String vmm,
			CloudletScheduler cloudletScheduler) {
		this.vmId = id;
		this.userId = userId;
		this.mips = mips;
		this.numberOfPes = numberOfPes;
		this.ram = ram;
		this.bandwidth = bw;
		this.size = size;
		this.vmm = vmm;
		this.cloudletScheduler = cloudletScheduler;
	}

	public int getId() {
		return vmId;
	}

	public int getVmId() {
		return vmId;
	}

	public int getUserId() {
		return userId;
	}

	public double getMips() {
		return mips;
	}

	public int getNumberOfPes() {
		return numberOfPes;
	}

	public int getRam() {
		return ram;
	}

	public long getBandwidth() {
		return bandwidth;
	}

	public long getSize() {
		return size;
	}

	public String getVmm() {
		return vmm;
	}

	public CloudletScheduler getCloudletScheduler() {
		return cloudletScheduler;
	}

	public void setVmId(int vmId) {
		this.vmId = vmId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setMips(double mips) {
		this.mips = mips;
	}

	public void setNumberOfPes(int numberOfPes) {
		this.numberOfPes = numberOfPes;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setBandwidth(long bandwidth) {
		this.bandwidth = bandwidth;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void setVmm(String vmm) {
		this.vmm = vmm;
	}

	public void setCloudletScheduler(CloudletScheduler cloudletScheduler) {
		this.cloudletScheduler = cloudletScheduler;
	}

	public static int getId(int userId2, int vmId2) {
		return 0;
	}

}
