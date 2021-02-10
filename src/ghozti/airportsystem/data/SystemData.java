package ghozti.airportsystem.data;

import java.util.ArrayList;

public class SystemData {

    public static ArrayList<String> cities = new ArrayList<>();
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<String> timeAM = new ArrayList<>();
    public static ArrayList<String>timePM = new ArrayList<>();

    public void setData(){
        setCities();
        setNames();
        setTimeAM();
        setTimePM();
    }

    private static void setCities(){
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Chicago");
        cities.add("Mexico City");
        cities.add("Detroit");
        cities.add("L.A");
        cities.add("Houston");
        cities.add("Delhi");
        cities.add("Dubai");
        cities.add("Beijing");
        cities.add("Shanghai");
        cities.add("Paris");
        cities.add("Toronto");
        cities.add("Guadalajara");
        cities.add("Moscow");
        cities.add("Manila");
        cities.add("Hong Kong");
        cities.add("Madrid");
        cities.add("Miami");
        cities.add("Alexandria");
    }

    private static void setNames(){
        names.add("John");
        names.add("Marcus");
        names.add("Porter");
        names.add("Kian");
        names.add("Leila");
        names.add("Barbara");
        names.add("Celia");
        names.add("Nikolas");
        names.add("Immanuel");
        names.add("Rhianna");
        names.add("Elisabeth");
        names.add("Hayden");
        names.add("Ezekiel");
        names.add("Seth");
        names.add("Alaina");
        names.add("Angelo");
        names.add("Elliot");
        names.add("Marcos");
        names.add("Russell");
        names.add("Wendy");
        names.add("Jessie");
        names.add("Josh");
        names.add("Ezekiel");
        names.add("Carson");
        names.add("Andy");
        names.add("Britney");
        names.add("Anthony");
        names.add("Yesi");
        names.add("Jhondavid");
        names.add("Angel");
        names.add("Jian Wei");
        names.add("Roman");
        names.add("Adison");
        names.add("Trace");
        names.add("Zain");
        names.add("Jason");
    }

    private void setTimeAM(){
        timeAM.add("1 AM");
        timeAM.add("2 AM");
        timeAM.add("3 AM");
        timeAM.add("4 AM");
        timeAM.add("5 AM");
        timeAM.add("6 AM");
        timeAM.add("7 AM");
        timeAM.add("8 AM");
        timeAM.add("9 AM");
        timeAM.add("10 AM");
        timeAM.add("11 AM");
        timeAM.add("12 AM");
    }

    private void setTimePM(){
        timePM.add("1 PM");
        timePM.add("2 PM");
        timePM.add("3 PM");
        timePM.add("4 PM");
        timePM.add("5 PM");
        timePM.add("6 PM");
        timePM.add("7 PM");
        timePM.add("8 PM");
        timePM.add("9 PM");
        timePM.add("10 PM");
        timePM.add("11 PM");
        timePM.add("12 PM");
    }
}
