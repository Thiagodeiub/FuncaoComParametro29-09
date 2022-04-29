import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("digite 0(negativo) ou 1(positivo):");
        a = scan.nextInt();
        while (a !=0 && a !=1) {
            System.out.println("digite 0 ou 1");
            a = scan.nextInt();
        }
        System.out.println(POuN(a));
    }
    static char POuN(int x) {
        if (x==1) {
            return 'P';
        }else {
            return 'N';
        }
    }

}
