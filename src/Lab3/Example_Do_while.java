package Lab3;

import java.util.Scanner;

public class Example_Do_while {
    public static  void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = 1;
        do{
            System.out.print("Enter integer: ");
             num = sc.nextInt();
        }while (num != 0);
        System.out.println("End, Good Bye. ");


    }
}
