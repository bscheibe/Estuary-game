package JUNIT_TESTS;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;

import game.Main;
import game.NPC;

public class NPCTest {
	
	@Test
	public void testMoveNPC() {
		NPC n1 = new NPC();
		assertEquals("Get Value",600,n1.getXloc());
		int original = n1.getXloc();
		n1.moveNPC();
		int right = n1.getXloc();
		assertEquals("Get Value",right,n1.getXloc());
		assertNotEquals("Get Value",original,n1.getXloc());
	}
	@Test
	public void testGetIsGarbage() {
		NPC n1 = new NPC();
		n1.getIsGarbage();
		int right = n1.getValue() * 1 ;
		int wrong = n1.getValue()* -1;
		assertEquals("Get Value",right,n1.getValue());
		assertNotEquals("Get Value",wrong,n1.getValue());
		//True or False return isGarbage;
	}
	@Test
	public void testGetValue() {
		NPC n1 = new NPC();
		int right = n1.getValue();
		int wrong = n1.getValue() * -1;

		assertEquals("Get Value",right,n1.getValue());
		assertNotEquals("Get Value",wrong,n1.getValue());
		assertNotEquals("Get Value",0,n1.getValue());
	}
	@Test
	public void testGetXloc() {
		NPC n1 = new NPC();
		assertEquals("Starting X Location",600,n1.getXloc());
		assertNotEquals("Not Starting X Location",Main.frameWidth - 450,n1.getXloc());
		assertNotEquals("Not Starting X Location",Main.frameWidth - 750,n1.getXloc());
	}

	@Test
	public void testToString() {
		NPC n1 = new NPC();
		if (n1.getIsGarbage()){
			n1.toString();
			assertEquals("Test to string method","This garbage has lane:"+n1.getLane()+" It's xloc is:600" ,n1.toString());
		}else
			assertEquals("Test to string method","This food has lane:"+n1.getLane()+" It's xloc is:600" ,n1.toString());
		
	}

}
