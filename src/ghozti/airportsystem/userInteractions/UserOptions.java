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
            //will check if the index does not match any flight index in the flight data class
            System.out.println("***INDEX DOES NOT MATCH ANY FLIGHT WITHIN DATA***");
            removeFlight();
        }
    }

    public static void printFlights(){
        FlightData.printFlights(printDetails());
    }

    public static void inspectFlights(){
        inspectMenu();
    }

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
    private static boolean printDetails(){
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

    /*
     * After the suer chooses to inspect flight this menu will be called.
     */
    private static void inspectMenu(){
        System.out.println("[1] Add passenger\n" +
                "[2] Remove passenger\n" +
                "[3] Print Flight");
    }

    /**
     *The mode parameter will work similarly like the method above. I will use:
     * [1] for the main menu
     * [2] for the flight menu
     */
    private int getMenuOptions(int mode){
        Scanner scanner = new Scanner(System.in);
        int choice;
        //by default the minimum value will be 1 and the max value will be 4 (these are the min max values for the main menu
        int min = 1,max = 4;

        //we know what this does
        try {
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getMenuOptions(mode);
        }
        //if the mode is equals to 2, then the max value will be changed to 3 (for the flight menu)
        switch (mode){
            case 2:
                max = 3;
                break;
        }
        //will check for valid inputs
        if (choice < min || choice > max) {
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getMenuOptions(mode);
        }
        return choice;
    }
}
