import java.util.Scanner;
import java.util.Arrays;

public class Bee32 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double[] ordem = new double[] { a, b, c };

        Arrays.sort(ordem);
        // Array após ordenado com o "Arrays.sort()" é só declarar as variáveis na ordem
        // que quero usar.
        // Usa-se o "for(){} para imprimir na tela para ficar mais fácil"

        a = ordem[ordem.length - 1];
        b = ordem[ordem.length - 2];
        c = ordem[ordem.length - 3];

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        double soma = b2 + c2;

        if (a >= b + c) {

            System.out.println("NAO FORMA TRIANGULO");

        } else{

            if (a2 == soma) {

                System.out.println("TRIANGULO RETANGULO");

            }

            if (a2 > soma) {

                System.out.println("TRIANGULO OBTUSANGULO");

            }

            if (a2 < soma) {

                System.out.println("TRIANGULO ACUTANGULO");

            }

            if (a == b && a == c) {

                System.out.println("TRIANGULO EQUILATERO");

            }

            if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {

                System.out.println("TRIANGULO ISOSCELES");

            }
        }

    }
}
