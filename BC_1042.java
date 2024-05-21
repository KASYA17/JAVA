
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int[] arr = {num1,num2,num3};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}