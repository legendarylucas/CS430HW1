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

public class FlyEatMoveTest {

	//used to test systme.out.print
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//create objects
	Thing testThing=new Thing("Apple");
	Bat testCreature1=new Bat("TestBat");
	Fly testCreature=new Fly("TestFly");
	
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
		testCreature.eat(testThing);		//Fly can eat things
		testCreature.eat(testCreature1);	//Fly cannot eat creatures
		testCreature.whatDidYouEat();		//only remember the last eaten thing
		testCreature.move();				//creature can move
		
		assertEquals("TestFly Fly has just eaten a Apple"+"\n"
		+"TestFly Fly won't eat a TestBat Bat"+"\n"
		+"TestFly Fly has eaten a Apple"+"\n" 
		+"TestFly Fly is buzzing around in flight."+"\n",outContent.toString());
		
	}

}
