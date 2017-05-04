package animal;

public class Fish extends Animal {
    public Fish(){
        super(0);
    }

    public void walk() {
        System.out.println("fish can't walk! it doesn't has leg.");
    }

    public void eat() {
        System.out.println("fish eat little fish");
    }
}
