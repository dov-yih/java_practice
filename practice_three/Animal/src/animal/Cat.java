package animal;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat(){
		this("");
	}
	public Cat(String name){
		super(4);
		this.name = name;
	}
	
	public void eat() {
		System.out.println("cat eat");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play(){
		System.out.println("cat play with you!");
	}
}
