package ej10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		final double IVA;
		IVA= 21;
		double precio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Precio del producto: ");
		precio = sc.nextDouble();
		double precioIVA= precio*IVA;
		double preciofinal = precioIVA/100;
		double precioconIVA= preciofinal+precio;
		System.out.println("El precio final con IVA será: " + precioconIVA + "€" );
		
		sc.close();

	}

}
