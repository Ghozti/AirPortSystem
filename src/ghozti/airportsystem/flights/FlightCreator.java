package ghozti.airportsystem.flights;

import ghozti.airportsystem.data.SystemData;
import java.util.Random;

public class FlightCreator {

    //this method will return a string array containing all the string parameters in order needed for the Flight constructor.
    private static String[] createStringFlightParams(){
        Random r = new Random();
        String id = (char)(r.nextInt(26) + 'A') + "" + (int) (Math.random() * (1000 - 0));//flight ID
        String destination = SystemData.cities.get(r.nextInt(SystemData.cities.size()));//flight destination
        String gate = (char)(r.nextInt(26) + 'A') + "" + (int) (Math.random() * (0 - 20));//flight gate
        String arrival = (int) (Math.random() * (2 + 1) + 1) == 1 ? SystemData.timeAM.get(r.nextInt(SystemData.timeAM.size())) : SystemData.timePM.get(r.nextInt(SystemData.timePM.size()));
        String departure = (int) (Math.random() * (2 + 1) + 1) == 1 ? SystemData.timeAM.get(r.nextInt(SystemData.timeAM.size())) : SystemData.timePM.get(r.nextInt(SystemData.timePM.size()));
        /*
         * stuff like the gate, ID, arrival , departure, and destination all rely on a randomizer. Whatever number is called will be the index called from the SystemData array lists.
         */
        return new String[] {id,destination,gate,arrival,departure};
    }

    public static Flight createFlight(){
        Random r = new Random();
        String[] params = createStringFlightParams();//keeps the array created in memory

        return new Flight(r.nextInt(171-50) + 50, params[0],params[1],params[2],params[3],params[4]);//returns the flight object
    }
}
