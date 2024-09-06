import java.lang.annotation.*;

/**
 * Created by Orkhan Gasanov on December 11, 2018
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Athlete {

    String sportType () default "soccer";
    int ranking () default 10;
}
