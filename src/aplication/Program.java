package aplication;

import java.util.Scanner;
import java.util.Locale;

import etities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.println("Area = " + rectangle.area());
		System.out.println("Perimeter = " + rectangle.perimeter());
		System.out.println("Diagonal = " + rectangle.diagonal());
		
		
		
		
		
		sc.close();

	}

}
