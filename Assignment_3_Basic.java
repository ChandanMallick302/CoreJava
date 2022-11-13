package Assisnments;//(Print the Pattern)

import java.util.Scanner;

public class Assignment_3_Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther Circle Diameter");
		int d=sc.nextInt();
		
		//finding radius
		int radius = d / 2;
		System.out.println("The Circle Radius is:-"+radius);
		
		//Finding Area
		final float pi = 3.14f;
		double area=pi*((int)Math.pow(radius,2));
		System.out.println("The Circle Area is:-"+area);
		sc.close();
	}
}