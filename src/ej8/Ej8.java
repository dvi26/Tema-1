package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		final String NOMBRE2;
		final int EDAD2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		NOMBRE2 = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		EDAD2 = sc.nextInt();
		System.out.println("Hola, " + NOMBRE2 + " tienes " + EDAD2 + " años, ¡qué mayor eres!" );
		
		sc.close();

	}

}
