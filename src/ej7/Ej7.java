package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		final String NOMBRE;
		final String DIRECCIÓN;
		final int TELÉFONO;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nombre: ");
		NOMBRE = sc.nextLine();
		System.out.println("Escriba su dirección: ");
		DIRECCIÓN = sc.nextLine();
		System.out.println("Escriba su número de teléfono: ");
		TELÉFONO = sc.nextInt();
		System.out.println("Nombre: " + NOMBRE );
		System.out.println("Dirección: " + DIRECCIÓN );
		System.out.println("Teléfono: " + TELÉFONO );
	
		sc.close();

	}

}
