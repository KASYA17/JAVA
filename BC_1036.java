import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c;
        
        Scanner sc = new Scanner(System.in);

        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        
        double sq = Math.sqrt(b*b-4*a*c);
        double un = 2*a;
        if (Double.isNaN(sq) || un<=0){
            System.out.println("Impossivel calcular");
        } else{
            double x1 = ((-1*b)+sq)/un;
            double x2 = ((-1*b)-sq)/un;

            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }
    }
}