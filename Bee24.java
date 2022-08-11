import java.util.Scanner;

public class Bee24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a, b, c, r1, r2;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double x = Math.pow(b, 2) - (4 * a * c);

        if (a == 0 || x <= 0) {

            System.out.println("Impossivel calcular");

        } else {

            r1 = (-b + Math.sqrt(x)) / (2 * a);
            r2 = (-b - Math.sqrt(x)) / (2 * a);
            String raiz1 = String.format("%.5f", r1);
            String raiz2 = String.format("%.5f", r2);
            System.out.println("R1 = " + raiz1);
            System.out.println("R2 = " + raiz2);

        }

    }
}
