package com.dewitt;

public class Well {
	private float cost;
	private int projectLength;

	public Well(float cost, int projectLength){
		setCost(cost);
		setProjectLength(projectLength);
		generateProfitProjection();
	}
	
	private void generateProfitProjection() {
		
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
	
}
