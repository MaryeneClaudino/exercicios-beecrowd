import java.util.Scanner;

public class Bee26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quant, cod;
        double cq, xs, xb, ts, r, pedido;

        cq = 0;
        xs = 0;
        xb = 0;
        ts = 0;
        r = 0;

        cod = in.nextInt();
        quant = in.nextInt();
      
        if (cod == 1) {

            cq = 4.00;

        } else if (cod == 2) {

            xs = 4.50;

        } else if (cod == 3) {

            xb = 5.00;

        } else if (cod == 4) {

            ts = 2.00;

        } else if (cod == 5) {

            r = 1.50;
        }

        pedido = cq * quant + xs * quant + xb * quant + ts * quant + r * quant;

        String p = String.format("%.2f", pedido);

        System.out.println("Total: R$ "  + p);

    }
}
