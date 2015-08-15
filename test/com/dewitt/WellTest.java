package com.dewitt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WellTest {
	private Well well;
	private final float COST = 100;
	private final int PROJECT_LENGTH = 21;
	
	@Before
	public void setUP() throws Exception{
		well = new Well(COST, PROJECT_LENGTH);
	}


	@Test
	public void testConstructorAcceptsCost(){
		assertEquals("Cost is passed fom constructor", COST, well.getCost(), 0.001);
	}
	
	@Test 
	public void testConstructorAcceptsProjectLength() {
		assertEquals("Project length is passed from constructor", PROJECT_LENGTH, well.getProjectLength());
	}
	
	@Test
	public void testConstructorCreates21ProductionProjections() {
		
		
	}

}
