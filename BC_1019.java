import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        int hour = num/3600;
        int hou = num%3600;
        int minute = hou/60;
        int secund = hou%60;
        System.out.println(hour+":"+minute+":"+secund);
    }
}