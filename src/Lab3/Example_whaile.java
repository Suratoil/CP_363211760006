package Lab3;

import java.util.Scanner;

public class Example_whaile {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num !=0){
            System.out.print("Enter integer : ");
            num = sc.nextInt();
        }
        System.out.println("End.Good Bye.");
    }
}
