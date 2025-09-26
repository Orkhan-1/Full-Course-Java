package shorts.video_1;

public class RecursionDepthTest {
    static int counter = 0;

    public static void recurse() {
        counter++;
        recurse();
    }

    public static void main(String[] args) {
        try {
            recurse();
        } catch (StackOverflowError e) {
            System.out.println("Max recursion depth: " + counter);
        }
    }
}

