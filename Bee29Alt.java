import java.util.Scanner;
import java.util.Arrays;

public class Bee29Alt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Quando for definir o tamanho do ARRAY:
        // (para qualquer tipo que for usar)float[] nomeDaVariável = new float[ NÚMERO
        // que identifica o TAMANHO ]
        // Forma alternativa de definir um ARRAY (NÃO PODE SER USADO PARA DEFINIR
        // TAMANHO DO ARRAY):
        // (para qualquer tipo que for usar)int[] nomeDaVariável = { ELEMENTOS DO ARRAY
        // }

        int[] ordem = new int[] { a, b, c };

        // Usado para ordenar arrays em ordem CRESCENTE:

        Arrays.sort(ordem);

        for (int num : ordem) {

            System.out.println(num);

        }

        System.out.println();

        // Usado para ordenar arrays em ordem DECRESCENTE:

        Arrays.sort(ordem);

        // Usa-se o "ordem.length - 1" para definir o fim do ARRAY como início do contador
        for (int i = ordem.length - 1; i >= 0; i--) {

            System.out.println(ordem[i]);

        }

    }
}
