package HomeworkPackage;
import java.util.ArrayList;

public class TestCreature{
	public static final int CREATURE_COUNT=6;
	public static final int THING_COUNT=10;
	
	/**
	 * @param args
	 * @param Creature 
	 */
	public static void main(String[] args) {
		//array of Things
		ArrayList<Thing> thingArray= new ArrayList<Thing>();
		thingArray.add(new Thing("Banana"));
		thingArray.add(new Thing("Apple"));
		thingArray.add(new Thing("Computer"));
		thingArray.add(new Thing("Cash"));
		
		//array of creatures
		ArrayList<Creature> creatureArray= new ArrayList<Creature>();
		creatureArray.add(new Tiger("TheKing"));
		creatureArray.add(new Ant("AntMan"));
		creatureArray.add(new Bat("BatMan"));
		creatureArray.add(new Ant("Tiny"));
		creatureArray.add(new Tiger("Roarrrr"));
		creatureArray.add(new Fly("Blacky"));
		
		//add creatures to things
		thingArray.addAll(creatureArray);
	    
		//print a blank line
		System.out.println("Things:"+"\n");
		
		//print all things
		for(int x=1; x<THING_COUNT;x++){
			System.out.println(thingArray.get(x).toString());
		}
		
		System.out.println("\n"+"Creatures:"+"\n");
		
		//print all creatures
		for(int x=1; x<THING_COUNT;x++){
			if(thingArray.get(x) instanceof Creature)
				System.out.println(thingArray.get(x).toString());
		}
		
		System.out.println();
		
		//print all creature moves
		for(int x=1; x<CREATURE_COUNT;x++){
			creatureArray.get(x).move();
		}
		
	}
	
	
}
