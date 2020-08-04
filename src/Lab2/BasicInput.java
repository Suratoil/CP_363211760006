package Lab2;

import java.util.Scanner;

public class BasicInput{

    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("What is your major? : ");
        String major = scanner.nextLine();
        System.out.println("your major is"+major);

        System.out.print("What is your age? : ");
        String age = scanner.nextLine();
        System.out.println("your age is"+age);

        System.out.print("What is your email? :");
        String email = scanner.nextLine();
        System.out.println("your email is"+email);

        //major
        //age
        //email

    }//main







    } //main
