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
public class Car {
    private String make;
    private int year;
    private String model;
    private int price;
    private String color; 
    private CarType type;
    private Engine engine; 
    private Interior interior;
    private Trunk trunk; 
    private Option[] options;
    private int miles;
    
    public Car (String make, int year, String model, int price,
            String color, int miles, CarType type){
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
        options = new Option[3];
        this.miles = miles;
    }
    public Car (String make, int year, String model, int price,
            String color, int miles, CarType type, Engine engine,
            Interior interior, Trunk trunk){
        
    }
    public void SetEngine(Engine engine){
        
    }
    public void SetInterior(Interior interior){
        
    }
    public void SetTrunk(Trunk trunk){}
    public void AddOption(Option option){
        /*for(){
            if(){
                =;
                break;
            }
        }*/
    }
    public String OpenTrunk(){return null;}
    public String CheckEngine(){
        return "";
    }
    public String CheckInterior(){return null;}
    public String ShowOptions(){return null;}
    public String toString(){
        
        return color+ " " + year + " " +make;
        
    }
    public String CompareTo (Car otherCar){
        String result = "";
        
        return result;
    }
}

enum CarType {Sedan, SUV, CrossOver, Truck}
