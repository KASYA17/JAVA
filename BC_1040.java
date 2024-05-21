import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float n1,n2,n3,n4,n5,recalaverage;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        float media = ((n1 * 2)+(n2 * 3)+(n3 * 4)+(n4 * 1))/10;

        
        if (media>=7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media<5.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {

            System.out.printf("Media: %.1f\n",media);
            System.out.print("Aluno em exame.\n");
            n5= sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",n5);
            recalaverage =(media + n5) / 2;

            if (recalaverage >= 5.0) {
                System.out.print("Aluno aprovado.\n");

            }else {
                System.out.print("Aluno reprovado.\n");

            }

            System.out.printf("Media final: %.1f\n",recalaverage);

        }
    }
}