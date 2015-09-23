package TestPackage;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import HomeworkPackage.Ant;
import HomeworkPackage.Fly;
import HomeworkPackage.Thing;

public class AntEatMoveTest {

	//used to test systme.out.print
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//create objects
	Thing testThing=new Thing("Apple");
	Ant testCreature=new Ant("TestAnt");
	Fly testCreature1=new Fly("TestFly");
	
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
		
		assertEquals("TestAnt Ant has just eaten a Apple"+"\n"
		+"TestAnt Ant has just eaten a TestFly Fly"+"\n"
		+"TestAnt Ant has eaten a TestFly Fly"+"\n" 
		+"TestAnt Ant is crawling around"+"\n",outContent.toString());
		
	}
}
