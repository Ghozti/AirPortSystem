package ghozti.airportsystem.flights;

import ghozti.airportsystem.data.SystemData;

import java.util.Random;

public class FlightCreator {

    private String[] createStringFlightParams(){
        Random r = new Random();
        String id = (char)(r.nextInt(26) + 'a') + (int) (Math.random() * (0 - 10000)) + 10000 + "";
        String destination = SystemData.cities.get((int) (Math.random() * (0 - SystemData.cities.size())) + SystemData.cities.size());
        String gate = (char)(r.nextInt(26) + 'a') + "" + (int) (Math.random() * (0 - 20)) + 20;
        String arrival = (int) (Math.random() * (1 - 2)) + 2 == 1 ? SystemData.timeAM.get((int) (Math.random() * (0 - SystemData.timeAM.size())) + SystemData.timeAM.size()) : SystemData.timePM.get((int) (Math.random() * (0 - SystemData.timePM.size())) + SystemData.timePM.size());
        String departure = (int) (Math.random() * (1 - 2)) + 2 == 1 ? SystemData.timeAM.get((int) (Math.random() * (0 - SystemData.timeAM.size())) + SystemData.timeAM.size()) : SystemData.timePM.get((int) (Math.random() * (0 - SystemData.timePM.size())) + SystemData.timePM.size());
        return new String[] {id,destination,gate,arrival,departure};
    }

    public Flight createFlight(){
        String[] params = createStringFlightParams();

        return new Flight((int) (Math.random() * (50 - 168)) + 168, params[0],params[1],params[2],params[3],params[4]);
    }
}
