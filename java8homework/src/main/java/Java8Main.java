import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java8Main {
    public static void main(String[] args) {
        // 1.
        List<Person> listOfPeople = Calculations.personList();
        System.out.println(ColorInLife.ANSI_YELLOW + "Exercise 1: List of persons \n" + ColorInLife.ANSI_RESET + listOfPeople);

        // 2.
        System.out.println(ColorInLife.ANSI_CYAN + "Exercise 2: Filtering persons " + ColorInLife.ANSI_RESET);
        Set<Person> personSet = Calculations.personFilter(listOfPeople);

        // 3.
        Person lastPlace = Calculations.findLoser(listOfPeople);
        System.out.println(ColorInLife.ANSI_GREEN + "Exercise 3: Who's the loser? \n" + ColorInLife.ANSI_RESET + lastPlace);

        // 4.
        Set<String> randomStringSet = Calculations.randomStringGetter(5);
        String max = Calculations.maxString(randomStringSet);
        System.out.println(ColorInLife.ANSI_PURPLE + "Exercise 4: Max String of 5 \n" + ColorInLife.ANSI_RESET + max + "\n");

        // 5.
        System.out.println(ColorInLife.ANSI_BLUE + "Exercise 5: Random INTEGERS" + ColorInLife.ANSI_RESET);
        Calculations.randomInts();

        // 6.
        System.out.println(ColorInLife.ANSI_RED + "Exercise 6: How many players got over 5000 points?" + ColorInLife.ANSI_RESET);
        Map<String, Integer> topRanking = Calculations.topRanking(listOfPeople, 5000);

        // 7.
        System.out.println(ColorInLife.ANSI_GREEN + "Exercise 7: Reversing order of string from ascendent to descendent\n "
                + ColorInLife.ANSI_RESET + Calculations.reversingOrder(randomStringSet) + "\n");

        // 8.
        System.out.println(ColorInLife.ANSI_PURPLE + "Exercise 8: Sorting players by age \n"
                + ColorInLife.ANSI_RESET + Calculations.ageSorting(listOfPeople) + "\n");

        // 9.
        System.out.println(ColorInLife.ANSI_CYAN + "Exercise 9: Is there any player with the score above 10.000 points?\n"
                + "The answer is: " + ColorInLife.ANSI_GREEN + Calculations.scoreConditionValidation(listOfPeople, 10000) + "!\n");

        // 10.
        System.out.println(ColorInLife.ANSI_YELLOW + "Exercise 10: Optional example");
        Calculations.representingOptional(lastPlace, new ArrayList<>());

        // 11.
        System.out.println(ColorInLife.ANSI_BLUE + "Exercise 11: The sorthest String is:\n"
                + Calculations.minString(randomStringSet));
    }
}
