import java.util.Scanner;

public class Bee29 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < b && a < c) {

            System.out.println(a);

        } else if (b < a && b < c) {

            System.out.println(b);

        } else if (c < a && c < b) {

            System.out.println(c);

        }

        if (a > b && a < c || a > c && a < b) {

            System.out.println(a);

        } else if (b > a && b < c || b > c && b < a) {

            System.out.println(b);

        } else if (c > a && c < b || c > b && c < a) {

            System.out.println(c);

        }

        if (a > b && a > c) {

            System.out.println(a);

        } else if (b > a && b > c) {

            System.out.println(b);

        } else if (c > a && c > b) {

            System.out.println(c);

        }

        System.out.print("\n");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
