package Exersice;

import java.util.ArrayList;
import java.util.Scanner;

public class MysuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> mycar = new ArrayList<SuperCar>();
        Scanner SC = new Scanner(System.in);
        System.out.println("My super Car?: ");
        int num_car = SC.nextInt();
        //input data
        mycar = inputdata(mycar, num_car);
        //display data
        displayData(mycar);


    }//main

    private static void displayData(ArrayList<SuperCar> myStd) {
        System.out.println("Data object below:");
        for (SuperCar std : myStd) {
            System.out.println(std.toString());
        }

    }

    private static ArrayList<SuperCar> inputdata(ArrayList<SuperCar> mycar, int num_std) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please, enter student info below: ");
        for (int i = 0; i < num_std; i++) {
            System.out.println("Enter CarBrand: ");
            String CarBrand = Sc.nextLine();
            System.out.println("Enter CarColor: ");
            String CarColor = Sc.nextLine();
            System.out.println("Enter CarEngineSize: ");
            String CarEngineSize = Sc.nextLine();
            System.out.println("Enter MaxSpeed: ");
            String MaxSpeed = Sc.nextLine();
            System.out.println("Enter CountryOfOrigin: ");
            String CountryOfOrigin = Sc.nextLine();
            mycar.add(new SuperCar(CarBrand, CarColor, Integer.parseInt(MaxSpeed),Integer.parseInt(CarEngineSize), CountryOfOrigin));
        }
        return mycar;
    }




}//class
