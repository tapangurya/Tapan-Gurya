package Problem_2;

import java.util.Scanner;

public class Program_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int count = 0, num = 1;
        while (count < a) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
        sc.close();
    } 

}
