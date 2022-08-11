import java.util.Scanner;

public class Bee12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double pi = 3.14159d;
        double r = in.nextDouble();
        double v = (4.0 / 3.0) * pi * Math.pow(r, 3);
        String volume = String.format("%.3f", v);
        System.out.println("VOLUME = " + volume);
    }
}
