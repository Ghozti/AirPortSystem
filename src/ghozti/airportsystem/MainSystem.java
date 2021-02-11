package ghozti.airportsystem;

import ghozti.airportsystem.data.SystemData;
import ghozti.airportsystem.data.*;
import ghozti.airportsystem.flights.Flight;
import ghozti.airportsystem.flights.FlightCreator;

import java.util.Random;

public class MainSystem {

    public MainSystem(){
        start();
    }

    private void start(){
        SystemData.setData();
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            FlightData.addFlight(FlightCreator.createFlight());
        }
        FlightData.printFlights();
    }
}
