package org.tns.ifclass;
import java.util.Scanner;

import oopsconcept_package.Dress;
public class Gallon {

	public static void main(String[] args) {
	try (Scanner in = new Scanner(System.in))
	{
		int gallon = in.nextInt();
		if (gallon<=45)
		{
			System.out.println("No Tax");
			
		}
		else if((gallon>45)&&(gallon<=75))
		{
			System.out.println("Tax Amount 475");
		}
		else if((gallon>75)&&(gallon<=125))
		{
			System.out.println("Tax Amount 750");
		}
		else if((gallon>125)&&(gallon<=200))
		{
			System.out.println("Tax Amount 1225");
		}
		else if((gallon>200)&&(gallon<=350))
		{
			System.out.println("Tax Amount 1650");
		}
		else 
		{
			System.out.println("Tax Amount 2000");
		}
	}
			
			

	}

}
