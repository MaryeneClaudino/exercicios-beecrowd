import java.util.Scanner;

public class Bee16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x1, y1, x2, y2, d;

        x1 = in.nextFloat(); y1 = in.nextFloat();
        x2 = in.nextFloat(); y2 = in.nextFloat();

        //Conversão de double para float => Usa-se o (float)
        d = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        String distancia = String.format("%.4f", d);
        
        System.out.println(distancia);
    }
}
