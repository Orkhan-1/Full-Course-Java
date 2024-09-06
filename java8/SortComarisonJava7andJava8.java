import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Orkhan Gasanov on December 12, 2018
 */

public class SortComarisonJava7andJava8 {

    public static void main(String args[]) {

        List<User> users = Arrays.asList(
                new User("Al", "Pachino", 27),
                new User("Ivan", "Petrov", 34),
                new User("Saratov", "Englesov", 32),
                new User("Alex", "Sidorov", 23),
                new User("Nina", "Shapkina", 32),
                new User("Pavel", "Dolgorukov", 19)
        );

        System.out.println("Java 7 approach");
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        users.forEach(p-> System.out.println(p));

        Collections.shuffle(users);

        System.out.println("Java 8 approach");
        users.sort(Comparator.comparing(User::getFirstName));
        users.forEach(p-> System.out.println(p));
    }

}