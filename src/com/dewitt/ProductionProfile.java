package com.dewitt;

import java.util.Random;

public class ProductionProfile {
	private int day;
	private float barrels;
	private static Random random = new Random();
	
	public ProductionProfile(int day, float barrels){
		setDays(day);
		setBarrels(barrels);
	}
	private void setDays(int day) {
		this.day=day;
	}
	private void setBarrels(float barrels){
		this.barrels = barrels;
	}
	public int getDay() {
		return this.day;
	}
	public float getBarrels() {
		return this.barrels;
	}
	
	public static ProductionProfile randomProductionProjection(int day){
		float randomBarrels = Math.abs(random.nextFloat()*random.nextInt());
		return new ProductionProfile(day, randomBarrels);
	}
	
	
}
