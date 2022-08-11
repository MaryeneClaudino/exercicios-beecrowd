import java.util.Scanner;

public class Bee15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d = in.nextInt();
        double c = in.nextDouble();
        double ef = d/c ;

        String kmL = String.format("%.3f", ef);
        System.out.println(kmL + " km/l");
    }
}
