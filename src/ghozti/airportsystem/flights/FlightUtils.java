package ghozti.airportsystem.flights;

import ghozti.airportsystem.passengers.Passenger;

public class FlightUtils {

    public static void removePassenger(Flight flight, Passenger passengers){
        flight.passengers.remove(passengers);
    }

    public static void removePassenger(Flight flight, int index){
        flight.passengers.remove(index);
    }

    public static void addPassenger(Flight flight, Passenger passengers){
        flight.passengers.add(passengers);
    }

    public static boolean checkForCapacityOverflow(int maxCapacity,int currentCapacity){
        if(maxCapacity < currentCapacity){
            return true;
        }
        return false;
    }
}
