package ej11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		double ventasm;
		double ventasp;
		double manzanas = 2.35;
		double peras = 1.95;
		System.out.println("Ventas manzanas (kg): ");
		Scanner sc = new Scanner(System.in);
		ventasm = sc.nextDouble();
		System.out.println("Ventas peras (kg): ");
		ventasp = sc.nextDouble();
		double manzanasventas = ventasm*manzanas;
		double perasventas = ventasp*peras;
		double importe = manzanasventas+perasventas;
		System.out.println("Importe total: " + importe + "€" );
		
		sc.close();

	
		
	}

}
