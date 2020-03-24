import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStream {

    public static void test1(){
        SimplePerson comparePerson = new SimplePerson("Женя",28);
        List<SimplePerson> personList = new ArrayList<>(Arrays.asList(
                new SimplePerson("Женя",28),
                new SimplePerson("Настя",25),
                new SimplePerson("Егор",15),
                new SimplePerson("Яшка",17),
                comparePerson,
                comparePerson
        ));


        //distinct различиные значения из стрима
        System.out.print("distinct count: " + personList.stream().distinct().peek(SimplePerson::print).count());

        //Количество по условию
        System.out.print("anyMatch count: " + personList.stream().anyMatch(comparePerson::equals));

    }
}
