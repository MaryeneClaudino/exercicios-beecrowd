import java.util.Scanner;
import java.util.zip.CRC32;

public class Bee23 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c, d;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        
        //Número positivo é maior ou igual a 0, número par tem resto da divisão por 2 == 0. 
        if (b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a % 2 == 0) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores nao aceitos");

        }
    }
}
