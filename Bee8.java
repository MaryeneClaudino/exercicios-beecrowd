import java.util.Scanner;

public class Bee8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d, diferenca;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        diferenca = (a*b-c*d);
        System.out.println("DIFERENCA = " + diferenca);



    }
}