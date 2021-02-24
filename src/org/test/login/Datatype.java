package org.test.login;

import java.util.Scanner;

public class Datatype {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//age
		System.out.println("Enter the age....");
		byte age=s.nextByte();
		System.out.println("My age is"+age);
		//atm pin
		System.out.println("Enter the atm pin...");
		short atmpin=s.nextShort();
		System.out.println("My atmpin is"+atmpin);
		//pincode
		System.out.println("My pincode is...");
		int pincode=s.nextInt();
		System.out.println("My pin code is"+pincode);
		//salary
		System.out.println("My salary is...");
		float salary=s.nextFloat();
		System.out.println("My salary is"+salary);
		//double
		System.out.println("Enter the double...");
		double d=s.nextDouble();
		System.out.println("My double value is"+d);
		//boolean
		System.out.println("Enter the result");
		boolean result=s.nextBoolean();
		System.out.println("My result is"+result);
		//name 
		System.out.println("Enter the name...");
		String name=s.next();
		System.out.println("My name is"+name);
		s.nextLine();
		String name1=s.nextLine();
		System.out.println("My name is"+name1);
		//gender 
		System.out.println("Enter gender...");
		char gender=s.next().charAt(0);
				
	}

}
