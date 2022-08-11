import java.text.Format;
import java.util.Scanner;

public class Bee9 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nf;
        double nh, vh, s;
        nf = in.nextInt();
        nh = in.nextDouble();
        vh = in.nextDouble();
        s = nh*vh;
        String salario = String.format("%.2f",s);
        System.out.println("NUMBER = " + nf);
        System.out.println("SALARY = U$ " + salario);   
     }
}
