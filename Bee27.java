import java.util.Scanner;

public class Bee27 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float n1, n2, n3, n4;

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();
        n4 = in.nextFloat();

        int[] pesos = new int[] { 2, 3, 4, 1 };
        float[] notas = new float[] { n1, n2, n3, n4 };
        float cima = 0;
        float baixo = 0;
        float novamedia = 0;
        float nex = 0;

        for (int i = 0; i < pesos.length; i++) {

            cima += (notas[i] * pesos[i]);
            baixo += pesos[i];

        }

        float m = cima / baixo;
        String media = String.format("%.1f", m);
        System.out.println("Media: " + media);

        if (m >= 7.0) {

            System.out.println("Aluno aprovado.");

        } else if (m < 5) {

            System.out.println("Aluno reprovado.");

        } else if (m >= 5 && m <= 6.9) {

            System.out.println("Aluno em exame.");
            nex = in.nextFloat();
            System.out.println("Nota do exame: " + nex);
            novamedia = (m + nex) / 2;

            if (novamedia >= 5) {

                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + novamedia);

            } else if (novamedia <= 4.9) {

                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + novamedia);

            }
                    
        }
    }
}
