package com.dewitt;

import java.util.HashMap;
import java.util.Map;

public class Well {
	private float cost;
	private int projectLength;
	private HashMap<Integer, ProductionProjection> productionProjections = new HashMap<Integer, ProductionProjection>();

	public Well(float cost, int projectLength){
		setCost(cost);
		setProjectLength(projectLength);
		generateProfitProjection();
	}
	
	private void generateProfitProjection() {
		for(int day = 1; day<366; day++){
			productionProjections.put(day, ProductionProjection.randomProductionProjection(day));
		}
	}

	private void setProjectLength(int projectLength) {
		this.projectLength = projectLength;
	}

	public float getCost(){
		return cost;
	}
	
	public void setCost(float cost){
		this.cost = cost;
	}

	public int getProjectLength() {
		return this.projectLength;
	}

	public HashMap<Integer, ProductionProjection> getProductionProjections() {
		return this.productionProjections;
	}
	
}
