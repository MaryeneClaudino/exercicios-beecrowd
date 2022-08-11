import java.util.Scanner;

public class Bee20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();

        int a = s;
        int h = a/3600; //hora
        a -= h*3600; //segundos
        int min = a/60; //minutos
        a -= min*60;
        int seg = a; //segundos
        System.out.println(h + ":" + min + ":" + seg);
    }
}

