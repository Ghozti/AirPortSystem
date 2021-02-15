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
                "[6] PRINT FLIGHTS");
    }

    /**
     * Passenger Related
     */
    public static void addPassenger(){
        //gets the passenger object
        Passenger passenger = PassengerCreator.createNewPassenger();
        //gets the flight object
        Flight flight  = FlightData.getFlight(addPassengerFlightChoice());
        //adds the passenger to the flight
        FlightUtils.addPassenger(flight,passenger);
    }

    public static void removePassenger(){}

    public static void printPassengers(){}

    /**
     * Flight Related
     */

    public static void addFlight(){}

    public static void removeFlight(){}

    public static void printFlights(){}

    /**
     * Utilities
     */

    //this method will get the index of the flight to add the passenger to
    private static int addPassengerFlightChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Enter the flight to add this passenger to");

        try {
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("***THIS S NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = addPassengerFlightChoice();
        }
        return choice;
    }
}
