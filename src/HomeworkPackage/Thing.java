package HomeworkPackage;

public class Thing {
	
	String thing_name;
	public Thing (String name){
		thing_name=name;
	}
	
	public String toString(){
		if(this.getClass().getSimpleName().equals("Thing")){
			return thing_name;
		}
		else{
			return thing_name+" "+this.getClass().getSimpleName();
		}
			
		
	}
	
}
