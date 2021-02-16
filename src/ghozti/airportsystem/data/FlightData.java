package ghozti.airportsystem.data;

import ghozti.airportsystem.flights.Flight;
import java.util.ArrayList;

public class FlightData {
    private static ArrayList<Flight> flightData = new ArrayList<>();

    public static Flight getFlight(int index){
        return flightData.get(index);
    }

    public static void removeFlight(int index){
        flightData.remove(index);
    }

    public static void addFlight(Flight flight){
        flightData.add(flight);
    }

    public static void printFlights(boolean explicit){
        if (explicit) {
            for (int i = 0; i < flightData.size(); i++) {
                System.out.println("[ID] " + flightData.get(i).getFlightID() + "\n" +
                        "[Gate] " + flightData.get(i).getGate() + "\n" +
                        "[Destination] " + flightData.get(i).getFlightDestination() + "\n" +
                        "[Departure] " + flightData.get(i).getDeparture() + "\n" +
                        "[Arrival] " + flightData.get(i).getArrival() + "\n" +
                        "[Max Passenger Count] " + flightData.get(i).getMaxPassengerCount() + "\n" +
                        "[Actual Passenger Count] " + flightData.get(i).getActualPassengerCount() + "\n" +
                        "");
            }
        }else{
            for (int i = 0; i < flightData.size(); i++) {
                System.out.println("[ID] " + flightData.get(i).getFlightID());
            }
        }
    }

    public static void printFlight(int i, boolean explicit){
        if (explicit) {
            System.out.println("[ID] " + flightData.get(i).getFlightID() + "\n" +
                    "[Gate] " + flightData.get(i).getGate() + "\n" +
                    "[Destination] " + flightData.get(i).getFlightDestination() + "\n" +
                    "[Departure] " + flightData.get(i).getDeparture() + "\n" +
                    "[Arrival] " + flightData.get(i).getArrival() + "\n" +
                    "[Max Passenger Count] " + flightData.get(i).getMaxPassengerCount() + "\n" +
                    "[Actual Passenger Count] " + flightData.get(i).getActualPassengerCount() + "\n" +
                    "");
        }else {
            System.out.println("[ID] " + flightData.get(i).getFlightID());
        }
    }
}
