package ghozti.airportsystem.passengers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PassengerCreator {

    /**
     *THE FOLLOWING METHODS:
     * will be used to create a new passenger object with valid values for the attributes.
     * the user will be the one inputing these values
     */

    private static String setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passenger's name: ");
        return scanner.nextLine();
    }

    private static String setGender(){
        Scanner scanner = new Scanner(System.in);
        String gender;
        System.out.println("Enter the passenger's gender: ");

        gender = scanner.nextLine();

        if (!gender.equals("male") || !gender.equals("female")) System.out.println("***enter a valid gender or a gender in lowercase***"); gender = setGender();

        return gender;
    }

    private static int setAge(){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter the passenger's age: ");

        try {
            age = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***This is not a valid input***");
            age = setAge();
        }
        return age;
    }

    private static boolean setCitizen(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean citizen;
        System.out.println("Is the passenger a citizen? \n" +
                "[y]\n" +
                "[n]");

        choice = scanner.nextLine();

        if (!choice.equals("y") || !choice.equals("n")) System.out.println("***This is not a valid input***"); citizen = setCitizen();

        if (choice.equals("y")) citizen = true;

        return citizen;
    }

    public static Passenger createNewPassenger(){
        return new Passenger(setName(),setGender(),setAge(),setCitizen());
    }
}
