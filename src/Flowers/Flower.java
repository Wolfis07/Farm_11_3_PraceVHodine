package Flowers;

import java.util.Random;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
    Random ran = new Random();
    protected double GrowthChance(){
        chanceOfGrowth = 1/ ran.nextInt(10);
        return chanceOfGrowth;
    }
    protected double Watering(){
        double f = chanceOfGrowth + 0.6;
        return chanceOfGrowth;
    }
}
