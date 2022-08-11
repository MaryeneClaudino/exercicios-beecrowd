import java.util.Scanner;

public class Bee18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int h, vm, dp;
        final int rend = 12; //km/h

        h = in.nextInt();
        vm = in.nextInt();
        
        dp = vm*h; //km
        float l = (float) (1.0/rend)*dp; //L

        String litros = String.format("%.3f", l);
        System.out.println(litros);
    }
}
