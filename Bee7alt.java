//Para adicionar mais um número na variável i as 3 formas são iguais.
//Para subtrair é só troca por -.
//i++;
//i = i+1;
//i +=1;
// for (declarar contador do começo da sequência; condição que vai rodar; 
// incremento do contador(mudar valor contador))
//EX:   for (int i = 0; i < pesos.length; i++) System.out.println(pesos[i]);
//x = 5;
//x += 5;  resulta em 10
//assim como
//x = 5;
//x = x + 5;

import java.util.Scanner;

public class Bee7alt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero de notas do bimestre: ");
        int numeroDeNotas = in.nextInt();

        double[] notas = new double[numeroDeNotas];
        double[] pesos = new double[numeroDeNotas];

        double cima = 0;
        double baixo = 0;
        // Leia-se ENQUANTO i < que o comprimento do array pesos; i=0 posição inicial;
        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota "+(i+1)+": ");
            notas[i] = in.nextDouble();
            System.out.print("Digite o peso "+(i+1)+": ");
            pesos[i] = in.nextDouble();

            cima += notas[i] * pesos[i];
            baixo += pesos[i];
        }

        double m = cima / baixo;

        String media = String.format("%.1f", m);
        System.out.println("MEDIA = " + media);

    }
}
