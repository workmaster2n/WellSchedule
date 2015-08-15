package com.dewitt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductionProfileTest {

	private ProductionProfile productionProjection;
	private final int DAY = 3;
	private final float BARRELS = 100;

	@Before
	public void setUp() throws Exception {
		productionProjection = new ProductionProfile(DAY, BARRELS);
	}
	
	@Test
	public void testDayIsReadInConstructor(){
		assertEquals("Days not read in from constructor", DAY, productionProjection.getDay());
	}
	
	@Test
	public void testBarrelsIsReadInConstructor(){
		assertEquals("Barrels not read in from constructor", BARRELS, productionProjection.getBarrels(), 0.1);
	}

	@Test
	public void testRandomProductionProjection(){
		float barrels = ProductionProfile.randomProductionProjection(DAY).getBarrels();
		assertTrue("Barrels should be greater or equal to 0", barrels >= 0);
	}

}
