package ghozti.airportsystem.flights;

import ghozti.airportsystem.data.SystemData;

import java.util.Random;

public class FlightCreator {

    //this method will return a string array containing all the string parameters in order needed for the Flight constructor.
    private String[] createStringFlightParams(){
        Random r = new Random();
        String id = (char)(r.nextInt(26) + 'a') + (int) (Math.random() * (0 - 10000)) + 10000 + "";//flight ID
        String destination = SystemData.cities.get((int) (Math.random() * (0 - SystemData.cities.size())) + SystemData.cities.size());//flight destination
        String gate = (char)(r.nextInt(26) + 'a') + "" + (int) (Math.random() * (0 - 20)) + 20;//flight gate
        String arrival = (int) (Math.random() * (1 - 2)) + 2 == 1 ? SystemData.timeAM.get((int) (Math.random() * (0 - SystemData.timeAM.size())) + SystemData.timeAM.size()) : SystemData.timePM.get((int) (Math.random() * (0 - SystemData.timePM.size())) + SystemData.timePM.size());
        String departure = (int) (Math.random() * (1 - 2)) + 2 == 1 ? SystemData.timeAM.get((int) (Math.random() * (0 - SystemData.timeAM.size())) + SystemData.timeAM.size()) : SystemData.timePM.get((int) (Math.random() * (0 - SystemData.timePM.size())) + SystemData.timePM.size());
        /**
         * stuff like the gate, ID, arrival , departure, and destination all rely on a randomizer. Whatever number is called will be the index called from the SystemData array lists.
         */
        return new String[] {id,destination,gate,arrival,departure};
    }

    public Flight createFlight(){
        String[] params = createStringFlightParams();//keeps the array created in memory

        return new Flight((int) (Math.random() * (50 - 168)) + 168, params[0],params[1],params[2],params[3],params[4]);//returns the flight object
    }
}
