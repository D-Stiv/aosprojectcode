package cern.jet.random;

import cern.jet.random.engine.RandomEngine;

public class Poisson {

	private double mean;
	private RandomEngine engine;

	public Poisson(double mean, RandomEngine engine) {
		this.mean = mean;
		this.engine = engine;
	}

	public double getMean() {
		return mean;
	}

	public RandomEngine getEngine() {
		return engine;
	}

	public double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

}
