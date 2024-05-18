import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double km,h;
        Scanner sc = new Scanner(System.in);

        km = sc.nextDouble();
        h = sc.nextDouble();
        
        double l = ((km*h)/12);

        System.out.printf("%.3f\n", l);
    }
}