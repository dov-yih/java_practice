package animal;

abstract public class Animal {
	protected  int legs;
	
	protected Animal(){
		
	}
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk(){
		System.out.println("ÓÃ" + this.legs + "ÐÐ×ß");
	}
	abstract public void eat();
}
