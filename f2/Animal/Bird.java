package Animal;

public class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    // Överlagra eat-metoden
    @Override
    public void eat() {
        System.out.println(this.name + " is pecking at seeds");
    }

    // Lägga till en metod som är specifik för Bird
    public void fly() {
        System.out.println(this.name + " is flying with wingspan " + wingspan + " cm");
    }
}