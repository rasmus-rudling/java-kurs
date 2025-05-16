package org.rasmus;

public class Person {
    public String name;
    public double age;

    public Person(String name, double age) {
        this.validateAge(age);

        this.name = name;
        this.age = age;
    }

    private void validateAge(double age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive number");
        } else if (age > 100) {
            throw new IllegalArgumentException("You are too old.");
        }
    }
}
