package Utils;

public abstract class MathUtils {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
