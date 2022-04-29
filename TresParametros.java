import java.util.Scanner;

public class TresParametros {
    public static void main(String[] args) {
        int a, b ,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite os 3 parametros para soma:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();


        System.out.println(soma(a,b,c));
    }
    static String soma(int a, int b, int c) {
        return "a soma foi: "+ (a+b+c);


    }
}


