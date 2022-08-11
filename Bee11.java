import java.util.Scanner;

public class Bee11 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  cod1, cod2, n1, n2;
        double v1, v2, t;

        cod1 = in.nextInt(); n1 = in.nextInt(); v1 = in.nextDouble();
        cod2 = in.nextInt(); n2 = in.nextInt(); v2 = in.nextDouble();
        t = n1*v1+n2*v2;

        String total  = String.format("%.2f",t);
        System.out.println("VALOR A PAGAR: R$ " + total);      
    }
}
