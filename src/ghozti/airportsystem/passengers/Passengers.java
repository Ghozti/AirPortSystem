package ghozti.airportsystem.passengers;

public class Passengers {

    private final String name, gender;
    private int age;
    private final boolean citizen;

    public Passengers(String name, String gender, int age, boolean citizen){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.citizen = citizen;
    }

    /**
    *GETTERS
     */
    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public boolean getCitizen(){
        return citizen;
    }
}
