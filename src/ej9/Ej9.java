package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		double pesetas;
		double euro;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor en pesetas: ");
		pesetas = sc.nextDouble();
		euro = pesetas/166;
		System.out.println("En euros son: " + euro + "€" );
		
		sc.close();

	}

}
