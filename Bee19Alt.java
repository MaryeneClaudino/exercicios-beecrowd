import java.util.Scanner;

public class Bee19Alt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] notas = new int[7];
        int[] valores = new int[] { 100, 50, 20, 10, 5, 2, 1 };

        System.out.println(n);
        
        for (int i = 0, a = n; i < notas.length; i++) {
            notas[i] = a / valores[i];
            a -= notas[i] * valores[i];
        
            String v =  valores[i] + ",00";
           
            System.out.println(notas[i] + " nota(s) de R$ "  + v);
        }
    }
}
