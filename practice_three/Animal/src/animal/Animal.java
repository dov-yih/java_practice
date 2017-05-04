package animal;

abstract public class Animal {
	protected  int legs;
	
	protected Animal(){
		
	}
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk(){
		System.out.println("用" + this.legs + "条腿行走");
	}
	abstract public void eat();
}
