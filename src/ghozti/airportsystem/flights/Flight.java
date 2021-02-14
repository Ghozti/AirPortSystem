package ghozti.airportsystem.flights;

import ghozti.airportsystem.passengers.Passenger;
import java.util.ArrayList;

public class Flight {

    //this array list will contain passenger objects.
    protected ArrayList<Passenger> passengers = new ArrayList<>();

    //this number represents the amount of passengers the flight can have at maximum. This cannot be overwritten
    private final int maxPassengerCount;
    //the actual passenger count will be the amount of passenger objects from the array list
    private int actualPassengerCount = passengers.size();
    //this stuff also can't be overwritten
    private final String flightID, flightDestination, gate, arrival, departure;

    public Flight(int maxPassengerCount, String flightID, String flightDestination, String gate, String arrival, String departure){
        this.maxPassengerCount = maxPassengerCount;
        this.flightID = flightID;
        this.flightDestination = flightDestination;
        this.gate = gate;
        this.arrival = arrival;
        this.departure = departure;
    }

    /**
     * GETTERS
     */
    public int getMaxPassengerCount(){
        return maxPassengerCount;
    }

    public int getActualPassengerCount(){
        return actualPassengerCount;
    }

    public String getFlightID(){
        return flightID;
    }

    public String getFlightDestination(){
        return flightDestination;
    }

    public String getGate(){
        return gate;
    }

    public String getArrival(){
        return arrival;
    }

    public String getDeparture(){
        return departure;
    }
}
