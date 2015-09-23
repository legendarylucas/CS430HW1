package TestPackage;
import static org.junit.Assert.*;


import org.junit.Test;

import HomeworkPackage.Ant;
import HomeworkPackage.Bat;
import HomeworkPackage.Creature;
import HomeworkPackage.Fly;
import HomeworkPackage.Thing;
import HomeworkPackage.Tiger;


public class ToStringTest {

	@Test
	public void test() {
		Thing testThing=new Thing("TestThing");
		Creature testCreature=new Tiger("TestTiger");
		Creature testCreature1=new Ant("TestAnt");
		Creature testCreature2=new Fly("TestFly");
		Creature testCreature3=new Bat("TestBat");
		
		//test a toString for a Thing
		assertEquals("TestThing",testThing.toString()); 				
		
		//test a toString for a creature
		assertEquals("TestTiger Tiger",testCreature.toString());
		assertEquals("TestAnt Ant",testCreature1.toString());	
		assertEquals("TestFly Fly",testCreature2.toString());
		assertEquals("TestBat Bat",testCreature3.toString());
		
		
	}

}
