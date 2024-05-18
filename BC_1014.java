import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kmm = sc.nextInt();
        double lit = sc.nextDouble();
        double average = kmm/lit;
        System.out.printf("%.3f km/l\n", average);
    }
}