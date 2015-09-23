package HomeworkPackage;

public class Bat extends Creature implements Flyer{

	public Bat(String name) {
		super(name);
	}

	public void fly() {
		System.out.println(this.toString()+" is swooping through the dark.");
		
	}

	public void move() {
		fly();
	}

	public void eat(Thing aThing){
		//bat can only eat creature and cannot eat simply things
		if(!(aThing instanceof Creature) && aThing instanceof Thing){
			System.out.println(this.toString()+" won't eat "+aThing.toString());
		}
		else if(aThing instanceof Creature){
			super.eat(aThing);
		}
		else{
			
		}
	}
}
