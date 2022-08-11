       // 100 porque são 2 casas, 10 é uma casa, 1000 é 3 casa;
        // 684.54593 * 100 = 68454.593
        // Math.floor(68454.593) = 68454
        // 68454 / 100 = 684.54
       // String total = Double.valueOf(Math.floor(t * 100d) / 100d).toString();

       //import java.text.DecimalFormat;
        //DecimalFormat df = new DecimalFormat("#.##");
        //df.setRoundingMode(RoundingMode.HALF_EVEN);
        //String total = (df.format(t));


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bee10 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        double salario, vendas, t;
        
        nome = in.nextLine();
        salario = in.nextDouble();
        vendas = in.nextDouble();
        t = salario + vendas*0.15;
        BigDecimal bd = new BigDecimal(t).setScale(2, RoundingMode.HALF_EVEN);
        String total = bd.toString();
        System.out.println("TOTAL = R$ " + total);
    }
}
