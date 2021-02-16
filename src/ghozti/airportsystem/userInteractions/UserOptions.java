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
        System.out.println("[1] Add a flight\n" +
                "[2] Remove flight\n" +
                "[3] Print flights\n" +
                "[4] Inspect Flights");
    }

    public static void addFlight(){}

    public static void removeFlight(){}

    public static void printFlights(){}

    public static void inspectFlights(){}
}
