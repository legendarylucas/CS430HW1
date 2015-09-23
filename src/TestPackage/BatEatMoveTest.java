package TestPackage;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import HomeworkPackage.Bat;
import HomeworkPackage.Fly;
import HomeworkPackage.Thing;

public class BatEatMoveTest {

	//used to test systme.out.print
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//create objects
	Thing testThing=new Thing("Apple");
	Bat testCreature=new Bat("TestBat");
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
		testCreature.eat(testThing);		//Bat cannot eat things
		testCreature.eat(testCreature1);	//creature can eat creatures
		testCreature.whatDidYouEat();		//only remember the last eaten thing
		testCreature.move();				//creature can move
		
		assertEquals("TestBat Bat won't eat Apple"+"\n"
		+"TestBat Bat has just eaten a TestFly Fly"+"\n"
		+"TestBat Bat has eaten a TestFly Fly"+"\n" 
		+"TestBat Bat is swooping through the dark."+"\n",outContent.toString());
		
	}

}
