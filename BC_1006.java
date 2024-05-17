import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    double a,b,c;
    Scanner sc = new Scanner(System.in);
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    double media = (a*2+b*3+c*5)/(2+3+5);
    System.out.printf("MEDIA = %.1f\n", media);
  }
}