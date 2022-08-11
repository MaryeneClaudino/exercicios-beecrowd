import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bee13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, at, ac, aq, ar, atra;
        final double pi = 3.14159d;

        a = in.nextDouble(); b = in.nextDouble(); c = in.nextDouble();
        at = (a * c) / 2;
        ac = pi * Math.pow(c, 2);
        atra = ((a+b)*c)/2;
        aq = Math.pow(b, 2);
        ar = a * b;
        BigDecimal bd = new BigDecimal(at).setScale(3, RoundingMode.HALF_EVEN);
        String triangulo = bd.toString();
        BigDecimal be = new BigDecimal(ac).setScale(3, RoundingMode.HALF_EVEN);
        String circulo = be.toString();
        BigDecimal bf = new BigDecimal(atra).setScale(3, RoundingMode.HALF_EVEN);
        String trapezio = bf.toString();
        BigDecimal bg = new BigDecimal(aq).setScale(3, RoundingMode.HALF_EVEN);
        String quadrado = bg.toString();
        BigDecimal bh = new BigDecimal(ar).setScale(3, RoundingMode.HALF_EVEN);
        String retangulo = bh.toString();
        System.out.println("TRIANGULO: " + triangulo);
        System.out.println("CIRCULO: " + circulo);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);
    }
}
