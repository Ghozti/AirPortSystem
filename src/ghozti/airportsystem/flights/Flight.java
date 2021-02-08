package ghozti.airportsystem.flights;

import java.lang.management.GarbageCollectorMXBean;

public class Flight {

    private final int maxPassengerCount;
    private int actualPassengerCount;
    private final String flightID, flightDestination, gate, arrival, departure;

    public Flight(int maxPassengerCount, int actualPassengerCount, String flightID, String flightDestination, String gate, String arrival, String departure){
        this.maxPassengerCount = maxPassengerCount;
        this.actualPassengerCount = actualPassengerCount;
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
