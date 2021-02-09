package ghozti.airportsystem.flights;

import ghozti.airportsystem.passengers.Passengers;

public class FlightUtils {

    public static void removePassenger(Flight flight,Passengers passengers){
        flight.passengers.remove(passengers);
    }

    public static void removePassenger(Flight flight, int index){
        flight.passengers.remove(index);
    }

    public static void addPassenger(Flight flight,Passengers passengers){
        flight.passengers.add(passengers);
    }
}
