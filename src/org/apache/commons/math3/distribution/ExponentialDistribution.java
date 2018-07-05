package org.apache.commons.math3.distribution;

public class ExponentialDistribution {
	private double lambda;
	private double mean;
	private double stdDev; // sigma which is sqrt(sigma^2)

	public ExponentialDistribution(double d) {
		setLambda(d);
		setMean(d);
		setStdDev(d);
	}

	private void setStdDev(double d) {
		stdDev = mean;
		
	}

	private void setMean(double d) {
		mean = 1/lambda;
		
	}

	public double getLambda() {
		return lambda;
	}

	public double getMean() {
		return mean;
	}

	public double getStdDev() {
		return stdDev;
	}

	public void setLambda(double lambda) {
		this.lambda = lambda;
	}

	public double sample() {
		double sample = 10 * (0.1 + Math.random());
		return sample;
	}

}
