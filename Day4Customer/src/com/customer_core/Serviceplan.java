package com.customer_core;

public enum Serviceplan {
	SILVER(1000),GOLD(3000),DIAMOND(5000),PLATINUM(10000);
	double planCharges;

	private Serviceplan(double planCharges) {
		this.planCharges = planCharges;
	}

	public double getPlanCharges() {
		return planCharges;
	}
}
