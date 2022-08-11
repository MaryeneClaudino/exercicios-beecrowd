import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Bee22 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double rs = in.nextDouble();
        double[] dinheiro = new double[] { 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
        int[] valores = new int[12];

        double a = rs;
        for (int i = 0; i < valores.length; i++) {

            // Para imprimir um texto em uma posição especifica uma única vez.
            if (i == 0) {
                System.out.println("NOTAS:");
            }

            if (i == 6) {
                System.out.println("MOEDAS:");
            }
            // Para selecionar o que é moeda e o que é nota

            // Condicional em linha:
            //String tipo = i < 6 ? "nota(s)" : "moeda(s)";
            // //Condicional (if/else)
            String tipo;
             if (i < 6) {
            tipo = "nota(s)";
            } else {
            tipo = "moeda(s)";
            }

            BigDecimal bd = new BigDecimal(a / dinheiro[i]).setScale(2, RoundingMode.UP);

            valores[i] = bd.intValue();
            a -= dinheiro[i] * valores[i];

            String din = String.format("%.2f", dinheiro[i]);

            System.out.println(valores[i] + " " + tipo + " de R$ " + din);
        }
    }
}
