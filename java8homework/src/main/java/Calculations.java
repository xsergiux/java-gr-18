import java.util.*;
import java.util.stream.Collectors;

public class Calculations {

    /**
     * 1. Write 5 different instances of that object.
     * Add the instances to a list.
     */
    public static List<Person> personList() {
        List<Person> tennisPlayer = new ArrayList<>();

        tennisPlayer.add(new Person("Novak Djokovic", "Serbia", 10220, 32));
        tennisPlayer.add(new Person("Matteo Berrettini", "Italy", 2860, 24));
        tennisPlayer.add(new Person("Rafael Nadal", "Spain", 9850, 33));
        tennisPlayer.add(new Person("Mannarino Adrian", "France", 1191, 31));
        tennisPlayer.add(new Person("Daniil Medvedev", "Russia", 5890, 24));

        return tennisPlayer;
    }

    /**
     * 2. Find the elements containing the letter "a" that start with "M" and print them out.
     * Add the instances to a set.
     */
    public static Set<Person> personFilter(List<Person> someList) {
        Set<Person> personFiltering = someList.stream()
                .filter(person -> person.getName().startsWith("M") && person.getName().contains("a"))
                .collect(Collectors.toSet());

        personFiltering.forEach(System.out::println);
        return personFiltering;
    }

    /**
     * 3. Find the "min" using a custom comparing criteria of choice
     */
    public static Person findLoser(List<Person> someList) {
        Optional<Person> person = someList.stream()
                .min(Comparator.comparing(Person::getTennisScore));

        return person.orElse(null);
    }

    /**
     * 4. Generate 5 random Strings and add them to a Set. Find the "max"
     * (while explaining as Javadoc how comparing Strings works)
     * <p>
     * The comparing procedure works on alphabetic order comparing the first element from all Strings.
     * If we can't get a conclusion from comparing the first element (because of equality) then the same
     * process applies to the second element and so on.
     */
    public static Set<String> randomStringGetter(int amount) {
        Set<String> randomString = new HashSet<>();

        for (int i = 0; i < amount; i++) {
            randomString.add(RandomGenerator.generator(10));
        }
        return randomString;
    }

    public static String maxString(Set<String> insertSet) {
        Optional<String> max = insertSet.stream()
                .max((Comparator.comparing((String x) -> x)));

        return max.orElse(null);
    }

    /**
     * 5. Generate a random number of Integers and then count them. "Map" the exponential to the numbers and then print them out.
     */
    public static void randomInts() {
        List<Integer> randomInts = new Random().ints(new Random().nextInt(100), 1, 10)
                .boxed().collect(Collectors.toList());

        randomInts.stream().mapToInt(x -> (int) Math.pow(x, x)).forEach(System.out::println);
        System.out.println(ColorInLife.ANSI_BLUE + "Total number of integers: " + randomInts.size() + "\n");
    }

    /**
     * 6. Create a map of "n" (K,V) elements and print "how many" elements have value over 10 (the key is of your choice)
     */
    public static Map<String, Integer> topRanking(List<Person> listOfPerson, int score) {
        Map<String, Integer> mappingKV = listOfPerson.stream()
                .collect(Collectors.toMap(Person::getName, Person::getTennisScore));

        System.out.println("Number of players who obtained over " + score + " points is: " + mappingKV.values().stream()
                .filter(x -> x > score)
                .count() + "\n");

        return mappingKV;
    }

    /**
     * 7. Sort the above Set<String> (used for max) in reverse order
     */
    public static Set<String> reversingOrder(Set<String> randomStrings) {
        return new TreeSet<>(randomStrings).descendingSet();
    }

    /**
     * 8. Sort the above List of custom objects (used for filter) in an order you consider
     */
    public static List<Person> ageSorting(List<Person> someList) {
        return someList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
    }

    /**
     * 9. Check if any of your instances "match" a condition based on an Integer field (of your choice).
     * What does it return ? Print it out.
     */
    public static boolean scoreConditionValidation(List<Person> someList, int score) {
        return someList.stream().anyMatch(Person -> Person.getTennisScore() > score);
    }

    /**
     * 10. What does Optional represent ? Explain through an example on your custom object
     * a) Wrap an existing instance
     * b) Wrap a null
     * c) Check value using ifPresent or isPresent
     * <p>
     * Optional is a container object used to contain not-null objects. Optional object is used to represent null with
     * absent value. This class has various utility methods to facilitate code to handle values as ‘available’ or
     * ‘not available’ instead of checking null values
     */
    public static void representingOptional(Person tennisMan, List<String> emptyList) {
        Optional<Person> thePerson = Optional.of(tennisMan); // a)

        Optional<String> wrapped = emptyList.stream() // b)
                .min((String::compareTo));

        // c)
        thePerson.ifPresent(p -> System.out.println(tennisMan));

        if (thePerson.isPresent()) {
            System.out.println("The person exists\n");
        } else {
            System.out.println("No person exists\n");
        }
    }

    /**
     * 11. Fastest way to find the shortest String in a List
     * (take the 5 random Strings generated above and find the shortest one).
     */
    public static String minString(Set<String> insertSet) {
        Optional<String> min = insertSet.stream()
                .min((String::compareTo));

        return min.orElse(null);
    }
}

