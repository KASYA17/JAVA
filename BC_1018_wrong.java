import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        
        int notas100 = 0, notas50 = 0, notas20 = 0, 
        notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;

        notas100 = num / 100;
        num = num % 100;
        notas50 = num / 50;
        num = num % 50;
        notas20 = num / 20;
        num = num % 20;
        notas10 = num / 10;
        num = num % 10;
        notas5 = num / 5;
        num = num % 5;
        notas2 = num / 2;
        num = num % 2;
        notas1 = num;

        System.out.println(num);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}
