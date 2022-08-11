import java.util.Scanner;


public class Bee14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt(); b = in.nextInt(); c = in.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorBC = (maiorAB+c+Math.abs(maiorAB-c))/2;

        System.out.println(maiorBC + " eh o maior");
        
    }
}
