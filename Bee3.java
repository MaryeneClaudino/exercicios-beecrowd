import java.util.Locale;
import java.util.Scanner;

public class Bee3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r, n, a;

        n = 3.14159;
        r = in.nextDouble();
        a = (n*Math.pow(r,2.0));

        //String.format corrige a saída para o local English, usado pelo srvidor Beecrowd
    
        String resposta = String.format(Locale.ENGLISH, "%.4f", a);
        
        System.out.println("A=" + resposta);
    }
}