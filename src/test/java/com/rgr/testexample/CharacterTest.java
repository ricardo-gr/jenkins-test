package com.rgr.testexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
	private Character ch, ch2;
	
	@Before
	public void setUp() {
		ch = new Character("Taryc", Float.valueOf(56.2f), Long.valueOf(2500));
		ch2 = new Character("Kuthan", Float.valueOf(83.9f), Long.valueOf(-100));
	}
	
	@Test
	public void testCharacterName() {
		assertEquals("Taryc", ch.getName());
		assertEquals("Kuthan", ch2.getName());
	}
	
	@Test
	public void testWeight() {
		assertTrue(ch.getWeight() > 45 && ch.getWeight() < 100);
		assertTrue(ch2.getWeight() > 45 && ch2.getWeight() < 100);
	}
	
	@Test
	public void testXp() {
		assertEquals(ch.getExperience(), Long.valueOf(2500));
		assertEquals(ch2.getExperience(), Long.valueOf(0));
	}
	
	@Test
	public void testLevel() {
		assertEquals(ch.getLevel(), Integer.valueOf(2));
		assertEquals(ch2.getLevel(), Integer.valueOf(1));
	}
	
	@Test
	public void testAddXp() {
		ch.addExperience(Long.valueOf(2000));
		ch2.addExperience(Long.valueOf(2000));
		
		assertEquals(ch.getLevel(), Integer.valueOf(3));
		assertEquals(ch2.getLevel(), Integer.valueOf(2));
	}
	
	
	

}
