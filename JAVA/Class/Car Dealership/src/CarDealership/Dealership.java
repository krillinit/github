/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealership;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author msalehan
 */
public class Dealership {
    private Car[] cars;
    private Car selectedCar = null;
    
    public Dealership(){
        cars = new Car[2];
        //White 2006 Hyundai Sonata for $2500
        Car car = new Car("Hyundai", 2006, "Sonata", 2500, "White", 120000, CarType.Sedan);
        cars[0] = car;
        car = new Car("Infiniti", 2016, "QX50", 38000, "Black", 32987, CarType.CrossOver);
        cars[1] = car;
        
    }
    
    public String ListAllCars(){
        String list = "";
        for(int i=0; i < cars.length; i++){
            list += cars[i].toString() + "\n";
        }
        return list;
    }
    public String SelectCar (int index){
        return "";
    }
    public String OpenTrunk(){return null;}
    public String CheckEngine(){
       return "";
    }
    public String CheckInterior(){return null;}
    public String Compare (int firstCarIndex, int secondCarIndex){
        return "";}
    public String ShowOptions(){return null;}

    
}
