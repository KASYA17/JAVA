import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    double A, B, C;
    Scanner sc = new Scanner(System.in);
    
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    
    double areaTriangle = (A * C) / 2;
    double areaCircle = 3.14159 * Math.pow(C, 2);
    double areaTrapezium = ((A + B) * C) / 2;
    double areaSquare = B * B;
    double areaRectangle = A * B;
    
    System.out.printf("TRIANGULO: %.3f\n", areaTriangle);
    System.out.printf("CIRCULO: %.3f\n", areaCircle);
    System.out.printf("TRAPEZIO: %.3f\n", areaTrapezium);
    System.out.printf("QUADRADO: %.3f\n", areaSquare);
    System.out.printf("RETANGULO: %.3f\n", areaRectangle);
  }
}