package Animal;

public class Cat extends Animal {
    private int lives;

    public Cat(String name, int age, int lives) {
        super(name, age); // Anropar Animal-konstruktorn
        this.lives = lives;
    }

    public void sleep(int hours) {
        super.sleep();

        // Lägg till subklassens specifika beteende
        System.out.println("Slept for " + hours + " hours");
    }
}