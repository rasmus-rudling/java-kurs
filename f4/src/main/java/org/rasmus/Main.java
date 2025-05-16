package org.rasmus;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Skapa en stream från en samling
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//        Stream<String> nameStream = names.stream();

        // Skapa stream från andra källor
//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
//        numbers.forEach(System.out::println);
//
//        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
//        randoms.forEach(System.out::println);
//
//        ArrayList<Double> randomsList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            randomsList.add(Math.random());
//        }
//        for (Double aDouble : randomsList) {
//            System.out.println(aDouble);
//        }
//
//        Stream<Integer> sequence = Stream.iterate(0, n -> n + 2).limit(5); // 0, 2, 4, 6, 8
//        sequence.forEach(System.out::println);

        ///  ----------
        List<String> names = Arrays.asList("Bob", "Alice", "Charlie", "Dave", "Eve", "Frank");

        // Filter - behåller endast element som matchar predikatet
        Stream<String> longNames = names.stream()
                .filter(name -> name.length() > 3); // ["Alice", "Charlie", "Dave", "Frank"]
        longNames.forEach(System.out::println);

        // Map - transformerar varje element
        Stream<Integer> nameLengths = names.stream()
                .map(String::length); // [5, 3, 7, 4, 3, 5]
        nameLengths.forEach(System.out::println);

        // Sorted - sorterar elementen
        Stream<String> sortedNames = names.stream()
                .sorted(); // ["Alice", "Bob", "Charlie", "Dave", "Eve", "Frank"]
        sortedNames.forEach(System.out::println);

        // Sorted med Comparator
        Stream<String> sortedByLength = names.stream()
                .sorted(Comparator.comparing(String::length)); // ["Bob", "Eve", "Dave", "Alice", "Frank", "Charlie"]

        // Distinct - behåller endast unika element
        Stream<Integer> uniqueLengths = names.stream()
                .map(String::length)
                .distinct(); // [5, 3, 7, 4]

        // Limit - begränsar antalet element
        Stream<String> firstThree = names.stream()
                .limit(3); // ["Alice", "Bob", "Charlie"]

        // Skip - hoppar över ett antal element
        Stream<String> skipFirst = names.stream()
                .skip(2); // ["Charlie", "Dave", "Eve", "Frank"]

        int numItemsToSave = 3;
        int startIdx = names.size() - numItemsToSave;
        Stream<String> lastThree = names.stream()
                .skip(startIdx)
                .limit(numItemsToSave);

        System.out.println("-----------");
//        lastThree.forEach(System.out::println);

        System.out.println("2: -----------");
        List<String> lastThreeNamesList = lastThree.toList();
        for (String lastThreeName : lastThreeNamesList) {
            System.out.println(lastThreeName);
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>("Hej");
//        Box<Integer> intBox = new Box<>(5);
//
//        System.out.println(stringBox.getContent() + " då!");
//        System.out.println(intBox.getContent() + 19);
//
//
//        String[] stringList = {"Hej", "där"};
//        String first = ArrayUtils.getFirstOrDefault(stringList, "Hallå");
//        System.out.println(first);
//
//        Integer[] intList = {};
//        Integer firstInt = ArrayUtils.getFirstOrDefault(intList, 0);
//        System.out.println(firstInt);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Raw type (undvik detta!)
//        List numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add("two"); // Kompilerar, men kan leda till runtime error
//        Integer firstNumber = (Integer) numbers.get(0); // Explicit cast behövs
//        String secondNumber = (String) numbers.get(1); // OK
//        Integer thirdNumber = (Integer) numbers.get(1); // ClassCastException vid runtime
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Frekvensräkning av ord
//        String text = "to be or not to be that is the question";
//        Map<String, Integer> wordFrequency = new HashMap<>();
//
//        for (String word : text.split(" ")) {
//            Integer previousCount = wordFrequency.getOrDefault(word, 0);
//            wordFrequency.put(word, previousCount + 1);
//        }
//
//        System.out.println(wordFrequency);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        // Använd naturlig ordning
//        TreeMap<String, Integer> sortedAges = new TreeMap<>();
//        sortedAges.put("Alice", 30);
//        sortedAges.put("Bob", 25);
//        sortedAges.put("Charlie", 35);
//        sortedAges.put("Rasmus", 27);
//
//        // Iteration sker i nycklarnas sorterade ordning
//        for (String name : sortedAges.keySet()) {
//            System.out.println(name); // Alice, Bob, Charlie
//        }
//
//        // NavigableMap-funktionalitet
//        SortedMap<String, Integer> firstTwo = sortedAges.headMap("D");
//        System.out.println(firstTwo); // {Alice=30, Bob=25}
//
//        String nextKey = sortedAges.higherKey("B");
//        System.out.println(nextKey); // Charlie
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
//        people.put("John", 26);
//        people.put("Rasmus", 27);
//        people.put("Anna", 29);
//
//        for (String name : people.keySet()) {
//            System.out.println(name);
//        }
//
//        for (Integer age : people.values()) {
//            System.out.println(age);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Integer> people = new HashMap<>();
//        people.put("John", 26);
//        people.put("Rasmus", 27);
//        people.put("Anna", 29);
//
//        Integer johnAge = people.get("John");
//
//        for (String name : people.keySet()) {
//            System.out.println(name);
//        }
//
//        for (Integer age : people.values()) {
//            System.out.println(age);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Set<String> sortedNames = new TreeSet<>();
//
//        sortedNames.add("Charlie");
//        sortedNames.add("Alice");
//        sortedNames.add("Bob");
//
//        for (String name : sortedNames) {
//            System.out.println(name);
//        }
//
//        // Använd anpassad sortering (fallande ordning)
//        Set<String> reverseSorted = new TreeSet<>(Comparator.reverseOrder());
//        reverseSorted.addAll(sortedNames);
//
//        System.out.println("---");
//        for (String name : reverseSorted) {
//            System.out.println(name);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Set<String> users = new HashSet<>();
//        LinkedHashSet<String> sortedUsers = new LinkedHashSet<>();
//
//        users.add("User 1");
//        users.add("User 2");
//        users.add("User 3");
//        users.add("User 4");
//
//        for (String user : users) {
//            System.out.println(user);
//        }
//
//        System.out.println("-----");
//
//        sortedUsers.add("User 1");
//        sortedUsers.add("User 2");
//        sortedUsers.add("User 3");
//        sortedUsers.add("User 4");
//
//        for (String user : sortedUsers) {
//            System.out.println(user);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Set<String> users = new HashSet<>();
//        ArrayList<String> usersArray = new ArrayList<>();
//
//        usersArray.add("Rasmus");
//        usersArray.add("Anna");
//        usersArray.add("Pelle");
//
//        users.add("Rasmus");
//        users.add("Anna");
//        users.add("Rasmus");
//
//        System.out.println(usersArray.contains("Rasmus")); // O(n), n antal namn i listan
//        System.out.println(users.contains("Rasmus")); // O(1), n antal namn i setet
//    }
//}