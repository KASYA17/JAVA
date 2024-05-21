import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour1 =sc.nextInt();
        int hour2 =sc.nextInt();
        int temp;
        if (hour1 < hour2){
            temp = hour2 - hour1;
        } else{
            temp = (24 - hour1) + hour2;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", temp);
    }
}