import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,y;
        
        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        if (x==1){
            System.out.printf("Total: R$ %.2f\n", y*4.00);
        } else if (x==2){
            System.out.printf("Total: R$ %.2f\n", y*4.50);
        } else if (x==3){
            System.out.printf("Total: R$ %.2f\n", y*5.00);
        } else if (x==4){
            System.out.printf("Total: R$ %.2f\n", y*2.00);
        } else if (x==5){
            System.out.printf("Total: R$ %.2f\n", y*1.50);
        }
    }
}