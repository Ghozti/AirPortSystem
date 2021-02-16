package ghozti.airportsystem.userInteractions;

import ghozti.airportsystem.data.FlightData;
import ghozti.airportsystem.flights.FlightCreator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOptions {

    /**
     * Menu
     */

    public static void Menu(){
        System.out.println("[1] Add a flight\n" +
                "[2] Remove flight\n" +
                "[3] Print flights\n" +
                "[4] Inspect Flight");
    }

    public static void addFlight(){FlightData.addFlight(FlightCreator.createFlight());}

    public static void removeFlight(){
        try {
            FlightData.removeFlight(getFlightIndex(1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("***INDEX DOES NOT MATCH ANY FLIGHT WITHIN DATA***");
            removeFlight();
        }
    }

    public static void printFlights(){

    }

    public static void inspectFlights(){}

    /**
     * UTILITIES
     */

    /**
     *  Mode- depending on the method's use i will enter an int for the mode
     *  mode [1] remove flight
     *  mode [2] print specific flight
     *  mode [3] inspect flight
     */
    private static int getFlightIndex(int mode){
        Scanner scanner = new Scanner(System.in);
        int index;
        switch (mode){
            case 1:
                System.out.println("Enter the flight index to be removed: ");
                break;
            case 2:
                System.out.println("Enter the flight index to print: ");
                break;
            case 3:
                System.out.println("Enter the flight index to inspect: ");
                break;
        }

        try {
            index = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT***");
            index = getFlightIndex(mode);
        }
        return index;
    }

    //this method will be used for the print flights and print flight methods
    private boolean printDetails(){
        boolean printDetails = false;
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Print Details?\n" +
                "[1] yes\n" +
                "[2] no");

        try {
            choice = scanner.nextInt();

            if (choice == 1) return true;
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT***");
            printDetails = printDetails();
        }
        return false;
    }
}
