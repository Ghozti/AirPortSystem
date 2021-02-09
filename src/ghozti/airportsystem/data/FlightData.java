package ghozti.airportsystem.data;

import ghozti.airportsystem.flights.Flight;
import java.util.ArrayList;

public class FlightData {
    private ArrayList<Flight> flightData = new ArrayList<>();

    public Flight getFlight(int index){
        return flightData.get(index);
    }

    public void removeFlight(int index){
        flightData.remove(index);
    }

    public void addFlight(Flight flight){
        flightData.add(flight);
    }

    public void printFlights(){
        for (int i = 0; i < flightData.size(); i ++){
            System.out.println("[ID] " + flightData.get(i).getFlightID() + "\n" +
                    "[Gate] " + flightData.get(i).getGate() + "\n" +
                    "[Destination] " + flightData.get(i).getFlightDestination() + "\n" +
                    "[Departure] " + flightData.get(i).getDeparture() + "\n" +
                    "[Arrival] " + flightData.get(i).getArrival() + "\n" +
                    "[Max Passenger Count] " + flightData.get(i).getMaxPassengerCount() + "\n" +
                    "[Actual Passenger Count] " + flightData.get(i).getActualPassengerCount() + "\n" +
                    "");
        }
    }

    public void printFlight(int i){
        System.out.println("[ID] " + flightData.get(i).getFlightID() + "\n" +
                "[Gate] " + flightData.get(i).getGate() + "\n" +
                "[Destination] " + flightData.get(i).getFlightDestination() + "\n" +
                "[Departure] " + flightData.get(i).getDeparture() + "\n" +
                "[Arrival] " + flightData.get(i).getArrival() + "\n" +
                "[Max Passenger Count] " + flightData.get(i).getMaxPassengerCount() + "\n" +
                "[Actual Passenger Count] " + flightData.get(i).getActualPassengerCount() + "\n" +
                "");
    }
}
