package com.dewitt;

import java.util.Random;

public class ProductionProjection {
	private int day;
	private float barrels;
	
	public ProductionProjection(int day, float barrels){
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
	
	public static ProductionProjection randomProductionProjection(int day){
		Random random = new Random();
		float randomBarrels = Math.abs(random.nextFloat()*random.nextInt());
		return new ProductionProjection(day, randomBarrels);
	}
	
	
}
