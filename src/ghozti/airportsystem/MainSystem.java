package ghozti.airportsystem;

import ghozti.airportsystem.data.SystemData;

public class MainSystem {

    public MainSystem(){
        start();
    }

    private void start(){
        SystemData.setData();
    }
}
