import java.util.Scanner;

public class Bee31 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (b % a == 0 || a % b == 0) {

            System.out.println("Sao Multiplos");

        } else {

            System.out.println("Nao sao Multiplos");

        }
    }
}
