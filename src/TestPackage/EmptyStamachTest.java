package TestPackage;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import HomeworkPackage.Ant;
import HomeworkPackage.Bat;
import HomeworkPackage.Creature;
import HomeworkPackage.Fly;
import HomeworkPackage.Thing;
import HomeworkPackage.Tiger;

public class EmptyStamachTest {
	//used to test systme.out.print
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//create creatures
	Thing testThing=new Thing("Apple");
	Creature testCreature=new Tiger("TestTiger");
	Creature testCreature1=new Ant("TestAnt");
	Creature testCreature2=new Fly("TestFly");
	Creature testCreature3=new Bat("TestBat");
	
	//used to test system.out.print
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    }
	
	//used to test system.out.print
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void test() {
		
		//test all creatures before they eat anything
		testCreature.whatDidYouEat();
		testCreature1.whatDidYouEat();
		testCreature2.whatDidYouEat();
		testCreature3.whatDidYouEat();
		assertEquals("TestTiger Tiger has nothing to eat!"+"\n"
				+"TestAnt Ant has nothing to eat!"+"\n"
				+"TestFly Fly has nothing to eat!"+"\n"
				+"TestBat Bat has nothing to eat!"+"\n",outContent.toString());

	}
	
}
