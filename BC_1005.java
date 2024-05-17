import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    double a,b;
    Scanner sc = new Scanner(System.in);
    a=sc.nextDouble();
    b=sc.nextDouble();
    double media = (a*3.5+b*7.5)/(3.5+7.5);
    System.out.printf("MEDIA = %.5f\n", media);
  }
}