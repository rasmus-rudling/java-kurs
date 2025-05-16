package Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Anropar superklassens konstruktor
        this.breed = breed;
    }

    public void bark() {
        System.out.println(this.name + " is barking!");
    }
}