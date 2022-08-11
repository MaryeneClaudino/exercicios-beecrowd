import java.util.Scanner;

public class Bee21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int[] saida = new int[3];
        int[] ndias = new int[] { 365, 30, 1 };
        String[] nomes = new String[] {"ano(s)", "mes(es)", "dia(s)"};

        for (int i = 0, a = x; i < saida.length; i++) {

            saida[i] = a / ndias[i];
            a -= ndias[i] * saida[i];
            System.out.println(saida[i] + " " + nomes[i]);

        }

    }
}
