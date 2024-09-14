import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Orkhan Gasanov on December 12, 2018
 */

public class SortComarisonJava7andJava8 {

    public static void main(String args[]) {

        List<Person> users = Arrays.asList(
                new Person("Al", "Pachino", 27),
                new Person("Ivan", "Petrov", 34),
                new Person("Saratov", "Englesov", 32),
                new Person("Alex", "Sidorov", 23),
                new Person("Nina", "Shapkina", 32),
                new Person("Pavel", "Dolgorukov", 19)
        );

        System.out.println("Java 7 approach");
        users.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        users.forEach(p-> System.out.println(p));

        Collections.shuffle(users);

        System.out.println("Java 8 approach");
        users.sort(Comparator.comparing(Person::getFirstName));
        users.forEach(p-> System.out.println(p));
    }

}