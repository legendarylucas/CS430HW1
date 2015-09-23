package HomeworkPackage;

public class Fly extends Creature implements Flyer{

	public Fly(String name) {
		super(name);

	}

	public void fly() {
		System.out.println(this.toString()+" is buzzing around in flight.");
		
	}

	public void move() {
		fly();
		
	}
	
	public void eat(Thing aThing){
		//fly can only eat simply things and cannot eat creatures
		if(aThing instanceof Creature){
			System.out.println(this.toString()+" won't eat a "+ aThing.toString());
		}else{
			super.eat(aThing);
		}
	}

}
