package ghozti.airportsystem.flights;

import java.util.Random;

public class FlightCreator {

    private String[] createStringFlightParams(){
        Random r = new Random();
        String id = (char)(r.nextInt(26) + 'a') + (int) (Math.random() * (0 - 10000)) + 10000 + "";
        //destination
        String gate = (char)(r.nextInt(26) + 'a') + "" + (int) (Math.random() * (0 - 20)) + 20;
        //arrival

        return new String[] {};
    }

    //public Flight createFlight(){
        //return new Flight();
    //}
}
