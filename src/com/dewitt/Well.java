package com.dewitt;

import java.util.ArrayList;
import java.util.Random;

public class Well {
	private float cost;
	private int projectLength;
	private ArrayList<ProductionProfile> productionProfiles = new ArrayList<ProductionProfile>();

	public Well(float cost, int projectLength){
		setCost(cost);
		setProjectLength(projectLength);
		generateProfitProjection();
	}
	
	private void generateProfitProjection() {
		for(int day = 1; day<366; day++){
			productionProfiles.add(ProductionProfile.randomProductionProjection(day));
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

	public ArrayList<ProductionProfile> getProductionProfiles() {
		return this.productionProfiles;
	}

	public Float analyze() {
		Random random = new Random();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cost * random.nextInt();
	}
	
}
