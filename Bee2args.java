public class Bee2args {
    public static void main(String[] args) {
        if(args.length >= 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a + b;
            System.out.println("X = " + c);
        }else{
            System.out.println("Informe dois parametros para somar");
        }
     }
}