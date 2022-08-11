import java.util.Scanner;

public class Bee7 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double[] notas = new double[3];
double[] pesos = new double[] {2d,3d,5d};

double numerador = 0;
double denominador = 0;

for (int i = 0; i < pesos.length; i++) {
notas[i] = in.nextDouble();
numerador += pesos[i]*notas[i];
denominador += pesos[i];

}

double m = numerador/denominador;
String media = String.format("%.1f", m);
System.out.println("MEDIA = " + media);

}
}
