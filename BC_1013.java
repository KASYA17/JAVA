import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max1 = Math.max(num1,num2);
        int max2 = Math.max(max1,num3);
        System.out.println(max2 + " eh o maior");
    }
}