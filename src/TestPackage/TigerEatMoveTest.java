package TestPackage;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import HomeworkPackage.Ant;
import HomeworkPackage.Thing;
import HomeworkPackage.Tiger;

public class TigerEatMoveTest {
	//used to test systme.out.print
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//create objects
	Thing testThing=new Thing("Apple");
	Tiger testCreature=new Tiger("TestTiger");
	Ant testCreature1=new Ant("TestAnt");
	
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
		testCreature.eat(testThing);		//creature can eat thing
		testCreature.eat(testCreature1);	//creature can eat creature
		testCreature.whatDidYouEat();		//only remember the last eaten thing
		testCreature.move();				//creature can move
		
		assertEquals("TestTiger Tiger has just eaten a Apple"+"\n"
		+"TestTiger Tiger has just eaten a TestAnt Ant"+"\n"
		+"TestTiger Tiger has eaten a TestAnt Ant"+"\n" 
		+"TestTiger Tiger has just pounced"+"\n",outContent.toString());
		
	}

}
