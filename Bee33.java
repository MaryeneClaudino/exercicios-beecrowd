import java.util.Scanner;

public class Bee33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inicio = in.nextInt();
        int fim = in.nextInt();

        if (inicio < fim) {

            int horasDeJogo = fim - inicio;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horasDeJogo);

        } else if (inicio >= fim) {

            int horasDeJogo = 24 - (inicio - fim);
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horasDeJogo);

        }
    }
}