import java.util.Scanner;


public class Main{

  public static void main(String[] args) {

    int R;
    Scanner sc = new Scanner(System.in);
    R = sc.nextInt();


    double sphere = (4/3.0)*3.14159*Math.pow(R,3);
    System.out.printf("VOLUME = %.3f\n", sphere);


  }

}