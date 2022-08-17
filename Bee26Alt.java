import java.util.Scanner;

public class Bee26Alt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nLinhas = in.nextInt();

        int[] cods = new int[nLinhas];
        int[] qtds = new int[nLinhas];
       
        for(int i = 0; i < nLinhas; i++){
            cods[i] = in.nextInt();
            qtds[i] = in.nextInt();
        }

        double[] valores = new double[] { 4.00, 4.50, 5.00, 2.00, 1.50 };      

        double pedido = 0;

        for (int i = 0; i < nLinhas; i++) {
            pedido += qtds[i] * valores[cods[i]-1];
        }

        String p = String.format("%.2f", pedido);

        System.out.println("Total: R$ " + p);

    }
}
