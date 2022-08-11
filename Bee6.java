import java.util.Scanner;

public class Bee6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, m, p1, p2;
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        p1 = 3.5;
        p2 = 7.5;
        m = (n1*p1+n2*p2)/(p1+p2);
    String media = String.format("%.5f", m);
        System.out.println("MEDIA = " + media );
    }
}
