package Dealership;

import java.util.HashMap;
import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What car model are you looking for?");

        String carModel = input.nextLine();

        HashMap<String,String> car = new HashMap<>();

        car.put("Civic", "Honda");
        car.put("Cruze", "Chevy");
        car.put("Corolla", "Toyota");
        car.put("F150", "Ford");

        if(car.containsKey(carModel)){
            System.out.println("Our selection is right over here.");
        } else {
            System.out.println("Unfortunately we don't have that model.");
        }
    }
}
