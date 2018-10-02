/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealership;

import java.util.Scanner;

/**
 *
 * @author msalehan
 */
public class CISCDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Cal Poly Pomona Car Dealership!\n" +
"To view a list of commands, enter ‘help’");
        Scanner scanner = new Scanner(System.in);
        Dealership dealership = new Dealership();
        while(true){
            String userEntry = scanner.nextLine();
            switch(userEntry.toLowerCase()){
                case "help":
                    System.out.println("List: lists the inventory of cars\n" +
                            "Compare [n1] [n2]: compares two cars\n" +
                            "Select [n]: selects car No. n and shows the details\n" +
                            "Engine: shows the details of the engine of the selected car\n" +
                            "Interior: Show the details of the interior of the selected car\n" +
                            "Trunk: Show the items in the trunk of the selected car\n" +
                            "Options: show the details of options installed on the selected car\n" +
                            "Quit: terminate the program");
                    break;
                case "list":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Compare":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Select":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Engine":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Interior":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Trunk":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Options":
                    System.out.println(dealership.ListAllCars());
                    break;
                case "Quit":
                    System.out.println("This session has now ended");
                    break;
            }
        }
    }
    
}
