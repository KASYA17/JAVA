import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int num,hour;
    double salary;
    Scanner sc = new Scanner(System.in);
    num=sc.nextInt();
    hour=sc.nextInt();
    salary = sc.nextDouble();
    System.out.println("NUMBER = " + num);
    System.out.printf("SALARY = U$ %.2f\n", hour*salary);    
  }
}