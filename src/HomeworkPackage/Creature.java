package HomeworkPackage;

public abstract class Creature extends Thing{

	private Thing content_in_stamach;
	public Creature(String name) {
		super(name);
		
	}

	
	public void eat (Thing aThing){
		content_in_stamach=aThing;
		System.out.println(this.toString() +" has just eaten a "+aThing.toString());
	}
	
	abstract void move();
	
	public void whatDidYouEat(){
		if(content_in_stamach==null){
			System.out.println(this.toString()+" has nothing to eat!");
		}else{
			System.out.println(this.toString()+" has eaten a "+content_in_stamach.toString());
		}
	}
}
