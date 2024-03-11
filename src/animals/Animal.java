package animals;

import java.util.ArrayList;

public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    private ArrayList<Animal> barn = new ArrayList<>();
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
    
}
