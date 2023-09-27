package ej11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		double ventasm;
		double ventasp;
		// Declaro las variables
		final double MANZANAS = 2.35;
		final double PERAS = 1.95;
		// Declaro las constantes
		System.out.println("Ventas manzanas (kg): ");
		// Pregunto por los kilos de manzanas
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		ventasm = sc.nextDouble();
		// Leo los kilos de manzanas con el scanner
		System.out.println("Ventas peras (kg): ");
		// Pregunto por los kilos de peras
		ventasp = sc.nextDouble();
		// Leo los kilos de peras con el scanner
		double manzanasventas = ventasm*MANZANAS;
		// Variable para el precio de manzanas
		double perasventas = ventasp*PERAS;
		// Variable para el precio de peras
		double importe = manzanasventas+perasventas;
		// Variable para el importe total de manzanas y peras
		System.out.println("Importe total: " + importe + "€" );
		// Declaro el importe total
		sc.close();
		// Cierro el scanner

		//ctrl shift o (importa el scanner automaticamente)
	
		
	}

}
