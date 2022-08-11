import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Bee22Alt {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        float rs = in.nextFloat();
        int[] cedulas = new int[] { 100, 50, 20, 10, 5, 2 };
        int[] quant = new int[6];

        System.out.println("NOTAS:");

        float a = rs;

        for (int i = 0; i < quant.length; i++) {

            BigDecimal bd = new BigDecimal(a / cedulas[i]).setScale(2, RoundingMode.UP);
            quant[i] = bd.intValue();
            a -= quant[i] * cedulas[i];
            System.out.println(quant[i] + " nota(s) de R$ " + cedulas[i] + ".00");
        }

        float[] moedas = new float[] { 1.00f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f };
        int[] numero = new int[6];

        System.out.println("MOEDAS:");

        float x = a;

        for (int i = 0; i < numero.length; i++) {

            BigDecimal bd = new BigDecimal(x / moedas[i]).setScale(2, RoundingMode.UP);
            numero[i] = bd.intValue();
            x -= numero[i] * moedas[i];

            String m = String.format("%.2f", moedas[i]);
            System.out.println(numero[i] + " moeda(s) de R$ " + m);
        }

    }
}
