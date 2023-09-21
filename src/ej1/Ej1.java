package ej1;

import java.util.Scanner;

public class Ej1 {
	

	public static void main(String[] args) {
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		int número;
		número = sc.nextInt();
				System.out.println("Su número es: " + número);
				
				System.out.print("Introduzca su edad: ");
				int edad;
				int suma = 1;
		edad =  sc.nextInt();
		int resultado= edad+suma;
		System.out.println("Su edad en un año será: " + resultado );
		
		System.out.print("Introduzca el año actual: ");
		int añoA;
		añoA= sc.nextInt();
		System.out.print("Introduzca su año de nacimiento: ");
		int añoN;
		añoN = sc.nextInt();
		int resultado2 = añoA-añoN;
		System.out.println("Tienes " + resultado2 + " años");
		
		System.out.print("Nota 1: ");
		double nota1;
		nota1= sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2;
		nota2 = sc.nextDouble();
		double resultado3 = nota1+nota2;
		double resultado4 = resultado3/2;
		System.out.print("Su media es: " + resultado4 );
		
		System.out.print("Radio de la circunferencia: ");
		final double PI = Math.PI;
		double radio;
		radio = sc.nextDouble();
		double resultado5 = PI*2*radio;
		double resultado6 = PI*radio*radio;
		System.out.print("La longitud de la circunferencia es: " + resultado5 );
		System.out.print("El área de la circunferencia es:: " + resultado6 );
		

		
		/* 1. Declaración e inicialización de variables
		 * 2. Instrucciones (códigi)
		 * 3. Close scanner
		 */
		
	

	

	}

}
