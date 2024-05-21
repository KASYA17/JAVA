import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        int temp = num;
        int notas100,notas50,notas20,notas10,notas5, notas2, notas1;

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

        System.out.println(temp);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}