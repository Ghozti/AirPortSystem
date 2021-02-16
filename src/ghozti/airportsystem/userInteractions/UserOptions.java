package ghozti.airportsystem.userInteractions;

import ghozti.airportsystem.data.FlightData;
import ghozti.airportsystem.flights.Flight;
import ghozti.airportsystem.flights.FlightUtils;
import ghozti.airportsystem.passengers.Passenger;
import ghozti.airportsystem.passengers.PassengerCreator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOptions {

    /**
     * Menu
     */

    public static void Menu(){
        System.out.println("[1] ADD A PASSENGER\n" +
                "[2] REMOVE A PASSENGER\n" +
                "[3] PRINT PASSENGERS\n" +
                "[4] ADD A FLIGHT\n" +
                "[5] REMOVE A FLIGHT\n" +
                "[6] PRINT FLIGHTS (EXPLICIT)\n" +
                "[7] PRINT SPECIFIC FLIGHT\n" +
                "[8] PRINT FLIGHTS");
    }

    /**
     * Passenger Related
     */
    public static void addPassenger(){
        //gets the passenger object
        Passenger passenger = PassengerCreator.createNewPassenger();
        //gets the flight object
        Flight flight  = FlightData.getFlight(getFlightChoice(1));
        //adds the passenger to the flight
        FlightUtils.addPassenger(flight,passenger);
    }

    public static void removePassenger(){
        //FlightUtils.removePassenger(removePassengerFlightChoice(),);
    }

    public static void printPassengers(){}

    /**
     * Flight Related
     */

    public static void addFlight(){}

    public static void removeFlight(){}

    public static void printEFlights(){FlightData.printFlights();}

    public static void printSpecificFlight(){}

    public static void printFlights(){}

    /**
     * Utilities
     */

    //this method will get the index of the flight to add the passenger to

    private static int getFlightChoice(int mode){
        Scanner scanner = new Scanner(System.in);
        int choice;
        switch (mode) {
            case 1:
                System.out.println("Enter the flight to add this passenger to");
                break;
            case 2:
                System.out.println("Enter the flight to remove a passenger from");
                break;
        }

        try {
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***THIS S NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = getFlightChoice(mode);
        }
        return choice;
    }
}
