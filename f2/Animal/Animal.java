package Animal;

import Utils.SpellingHelper;

public class Animal {
    protected String name;
    public int age;

    public Animal(String name, int age) {
        this.name = SpellingHelper.bigFirstLetter(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}