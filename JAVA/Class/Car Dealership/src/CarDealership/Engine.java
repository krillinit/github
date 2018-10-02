/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealership;

/**
 *
 * @author msalehan
 */
public class Engine {
    private FuelType fuelType;
    private int noOfCylinders;
    private int capacity;
    private int horsePower;
    private float mpg;
    public Engine (FuelType fuelType, int noOfCylinders, int capacity, int horsePower, float mpg){
        
    }
    public int getHorsePower () {return 0;}
    public float getMpg(){ return 0;}
    public FuelType getFuelType(){ return null;}
    public int getCapacity() {return 0;}
    public int getNoOfCylinders(){ return 0;}
    public String toString(){
        //TODO
        return "Implement me!";
    }
    
}

enum FuelType{Gas, Electric, Hybrid, Diesel}