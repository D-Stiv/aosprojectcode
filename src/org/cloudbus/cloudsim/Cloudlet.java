package org.cloudbus.cloudsim;

public class Cloudlet{
	
	private int cloudletId;
	private long cloudletLength;
	private int pesNumber;
	private long cloudletFileSize;
	private long cloudletOutputSize;
	private UtilizationModel utilizationModelCpu;
	private UtilizationModel utilizationModelRam;
	private UtilizationModel utilizationModelBw;

	public Cloudlet(int cloudletId, long cloudletLength, int pesNumber, long cloudletFileSize, long cloudletOutputSize,
			UtilizationModel utilizationModelCpu, UtilizationModel utilizationModelRam,
			UtilizationModel utilizationModelBw) {
		this.cloudletId = cloudletId;
		this.cloudletLength = cloudletLength;
		this.pesNumber = pesNumber;
		this.cloudletFileSize = cloudletFileSize;
		this.cloudletOutputSize = cloudletOutputSize;
		this.utilizationModelCpu = utilizationModelCpu;
		this.utilizationModelRam = utilizationModelRam;
		this.utilizationModelBw = utilizationModelBw;
	}


	public int getCloudletId() {
		return cloudletId;
	}

	public long getCloudletLength() {
		return cloudletLength;
	}

	public int getPesNumber() {
		return pesNumber;
	}

	public long getCloudletFileSize() {
		return cloudletFileSize;
	}

	public long getCloudletOutputSize() {
		return cloudletOutputSize;
	}

	public UtilizationModel getUtilizationModelCpu() {
		return utilizationModelCpu;
	}

	public UtilizationModel getUtilizationModelRam() {
		return utilizationModelRam;
	}

	public UtilizationModel getUtilizationModelBw() {
		return utilizationModelBw;
	}

	public int getVmId() {		
		return 0;
	}

	public void setUserId(int id) {
		
		
	}
	
}
