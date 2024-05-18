import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        int year = num/365;
        int year2 = num%365;
        int month = year2/30;
        int day = year2%30;
        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");
    }
}