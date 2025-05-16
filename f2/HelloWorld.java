import Animal.Animal;
import Animal.Dog;
import Animal.Cat;
import Utils.MathUtils;
import Utils.Predicate;

class Main {
    public static void main(String[] args) {
        // Traditionell implementation med anonym inre klass
//         Predicate<String> isLong = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//         };
//        Predicate<String> isLongLambda = s -> s.length() > 5;

        Predicate<String> isLongLambda = (s) -> s.length() > 5;

        boolean result1 = isLongLambda.test("Hello, World");
        boolean result2 = isLongLambda.test("Hej");

        System.out.println(result1);
        System.out.println(result2);







//        Animal genericAnimal = new Animal("Rasmus", 27);
//        Dog dog = new Dog("Pelle", 4, "Labrador");
//        Cat zimbaCat = new Cat("Zimba", 5, 9);
//
//        Animal[] animals = {genericAnimal, dog, zimbaCat};
//
//        for (Animal animal : animals) {
//            if (animal instanceof Cat cat) {
//                cat.sleep(8);
//            } else {
//                animal.sleep();
//            }
//        }
//
//        int[] ages = {genericAnimal.age, genericAnimal.age, genericAnimal.age};
//
//        int totalAge = MathUtils.sum(ages);
//        System.out.println(totalAge);
    }
}
