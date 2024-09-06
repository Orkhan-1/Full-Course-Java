import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Created by Orkhan Gasanov on December 11, 2018
 */
public class AnnotationDemo {

    public static void main(String[] args) {
        User user = new User();
        Annotation [] annotations = user.getClass().getAnnotations();

        Arrays.stream(annotations).forEach(a-> {
            if (a.annotationType()==Athlete.class) {
                Athlete annotation = (Athlete) a;
                System.out.println(annotation.sportType() + " player with the ranking of " + annotation.ranking());
            }
        });
    }
}
