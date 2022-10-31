package org.tns.ifclass;

import java.util.Scanner;

public class Lights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hour");
		int hour=sc.nextInt();
		{
		if(hour>15)
		System.out.println("light is off");
		else
			System.out.println("light is on");
		}
		
		}

}

	

