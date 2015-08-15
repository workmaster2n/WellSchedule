package com.dewitt;

import java.util.ArrayList;

public class Well {
	private float cost;
	private int projectLength;
	private ArrayList<ProductionProjection> productionProjections = new ArrayList<ProductionProjection>();

	public Well(float cost, int projectLength){
		setCost(cost);
		setProjectLength(projectLength);
		generateProfitProjection();
	}
	
	private void generateProfitProjection() {
		for(int day = 1; day<366; day++){
			productionProjections.add(ProductionProjection.randomProductionProjection(day));
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

	public ArrayList<ProductionProjection> getProductionProjections() {
		return this.productionProjections;
	}
	
}
