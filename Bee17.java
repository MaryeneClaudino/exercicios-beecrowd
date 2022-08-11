import java.util.Scanner;

public class Bee17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int km = in.nextInt(); // km
        final int x = 60; // km/h
        final int y = 90; // km/h

        //Inverte a unidade km/h para h/km (convertendo as entradas de int para float), multiplica-se
        //pelo dado de entrada (dado em km), e por 60 minutos para obter a resposta em minutos.
        // float t = (float) ((1.0 / (y - x)) * km) * 60;
        //Converte novamente o número obtido de float para inteiro utilizando o  (int) antes do nome da
        //variável em float.
        // int t1 = (int) t;

        // 60/(y-x)=> tem a unidade min/km; multiplicando por km (unidade do dado de
        // entrada),
        // se obtém a resposta em minutos.
        int t = (60 / (y - x)) * km; 

        System.out.println(t + " minutos");
    }
}