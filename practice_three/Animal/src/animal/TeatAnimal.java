package animal;

public class TeatAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();

		d.walk();
		d.eat();
		System.out.println();
		c.walk();
		c.eat();
		System.out.println(c.getName());
		c.play();
		System.out.println();
		e.walk();
		e.eat();
		System.out.println();
		p.setName("HuaJi");
		System.out.println(p.getName());
		p.play();




	}

}
