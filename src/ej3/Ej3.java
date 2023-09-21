package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		int edad;
		int suma = 1;
		edad =  sc.nextInt();
		int resultado= edad+suma;
		System.out.println("Su edad en un año será: " + resultado );
		sc.close();

	}

}
