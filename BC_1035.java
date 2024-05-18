        import java.util.*;

        public class Main {
            public static void main(String args[]){
                Scanner sc=new Scanner(System.in);

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int cd = c + d;
                int ab = a + b;

                if(b > c && d > a && cd > ab && c > 0 && d > 0 && a % 2 == 0){
                    System.out.println("Valores aceitos");
                }
                else{
                    System.out.println("Valores nao aceitos");
                }
            }
        }