import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x,y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x==0 && y==0){
            System.out.println("Origem");
        } else if (y==0){
            System.out.println("Eixo X");
        } else if (x==0){
            System.out.println("Eixo Y");
        } else if (x<0 && y<0){
            System.out.println("Q3");
        } else if (x<0 && y>0){
            System.out.println("Q2");
        } else if (x>0 && y<0){
            System.out.println("Q4");
        } else if (x>0 && y>0){
            System.out.println("Q1");
        }
    }
}