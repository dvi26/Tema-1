package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int edad;
		int suma = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		edad =  sc.nextInt();
		int resultado= edad+suma;
		System.out.println("Su edad en un año será: " + resultado );
		
		sc.close();
	}

}
