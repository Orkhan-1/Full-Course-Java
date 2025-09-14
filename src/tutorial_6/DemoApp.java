package tutorial_6;

import org.apache.commons.lang3.StringUtils;

public class DemoApp {
    public static void main(String[] args) {
        String name = "hello world from apache commons lang3";
        String capitalized = StringUtils.capitalize(name);
        System.out.println("Capitalized: " + capitalized);
    }
}

// javac -cp "lib/commons-lang3-3.18.0.jar" DemoApp.java -d bin
// java -cp "bin:lib/commons-lang3-3.18.0.jar" tutorial_6.DemoApp

