/*Vincent Tran
  vtran1205@gmail.com
 */

import java.util.*;
public class FahToCel {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int fahrenheit, celcius;
		System.out.println(
			"Please type in Fahrenheit to convert to Celcius");
		fahrenheit=s.nextInt();
		FahCelConver conver= new FahCelConver(fahrenheit);
		celcius= conver.getConver();
		System.out.println("Your current temperature is " 
							+fahrenheit+ " in degrees Fahrenheit. It is converted as " 
							+ celcius + " in degrees Celcius");
	}

}

