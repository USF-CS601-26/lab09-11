package coherence;

// TODO: Analyze if cohesion of this class is high or low, explain why
public class Utility {
    public static int add(int a, int b) { return a + b; }
    public static double areaOfCircle(double r) { return Math.PI * r * r; }
    public static void sendEmail(String to, String msg) {
        // Pretend it sends an email
        /* ... */
    }
    public static void saveFile(String path, String content) {
        // Pretend we save content to a file
        /* ... */
    }
}