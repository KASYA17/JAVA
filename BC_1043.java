import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if ((a + b > c) && (b + c > a) && (a + c > b)){
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        }
        else{
            System.out.printf("Area = %.1f\n", (1.0/2) * (a + b) * c);
        }

    }
}