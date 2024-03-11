package Flowers;

import java.util.ArrayList;
import java.util.Random;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    private ArrayList<Flower> flowers = new ArrayList<>();
    private int Area = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        this.neededArea = neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

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
    public double growthChance(){
        chanceOfGrowth = 80;
        return chanceOfGrowth;
    }
    public double watering(){
        double f = chanceOfGrowth + 100;
        return chanceOfGrowth;
    }
    public int freeArea(){
        for (int i = 0; i < flowers; i++) {
           Area += flowers.get(i).neededArea;
        }
        return Area;
    }

    public void addFlower(){
        if (freeArea() < 100){
            addFlower();
        }
    }
    public void harvest(){
        flowers.clear();
    }
}
