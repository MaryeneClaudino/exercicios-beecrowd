import java.util.Scanner;

public class Bee30 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float perimetro, area;

        if (a + b > c && a + c > b && b + c > a) {

            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);

        } else {

            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);

        }
    }
}
