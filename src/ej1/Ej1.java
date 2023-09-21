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
		System.out.println("Su media es: " + resultado4 );
		
		System.out.print("Radio de la circunferencia: ");
		final double PI = Math.PI;
		double radio;
		radio = sc.nextDouble();
		double resultado5 = PI*2*radio;
		double resultado6 = PI*radio*radio;
		System.out.print("La longitud de la circunferencia es: " + resultado5 );
		System.out.print("El área de la circunferencia es:: " + resultado6 );
		
		double n1;
		double n2;
		System.out.println("Seleccione un primer número: ");
		n1 = sc.nextDouble();
		System.out.println("Seleccione un segundo número: ");
		n2 = sc.nextDouble();
		double resultado7 = n1+n2;
		double resultado8 = n1*n2;
		double resultado9 = n1/n2;
		double resultado10 = n1-n2;
		System.out.println("La suma de ambos números es: " + resultado7 );
		System.out.println("La multiplicación de ambos números es: " + resultado8 );
		System.out.println("La división de ambos números es: " + resultado9 );
		System.out.print("La resta de ambos números es: " + resultado10 );
		
		final String NOMBRE;
		final String DIRECCIÓN;
		final int TELÉFONO;
		System.out.println("Escriba su nombre: ");
		NOMBRE = sc.nextLine();
		System.out.println("Escriba su dirección: ");
		DIRECCIÓN = sc.nextLine();
		System.out.println("Escriba su número de teléfono: ");
		TELÉFONO = sc.nextInt();
		System.out.println("Nombre: " + NOMBRE );
		System.out.println("Dirección: " + DIRECCIÓN );
		System.out.println("Teléfono: " + TELÉFONO );
		
		final String NOMBRE2;
		final int EDAD2;
		System.out.println("Introduzca su nombre: ");
		NOMBRE2 = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		EDAD2 = sc.nextInt();
		System.out.println("Hola, " + NOMBRE2 + " tienes " + EDAD2 + " años, ¡qué mayor eres!" );
		
		double pesetas;
		double euro;
		System.out.println("Introduzca el valor en pesetas: ");
		pesetas = sc.nextDouble();
		euro = pesetas/166;
		System.out.println("En euros son: " + euro + "€" );
		
		final double IVA;
		IVA= 21;
		double precio;
		double preciosumar;
		System.out.println("Precio del producto: ");
		precio = sc.nextDouble();
		preciosumar= 100*
		
		/*Para pasar a git
		 * Click derecho en el proyecto, Tean y share. 
		 */
		
		
		
	}
		
	
		
	
		
		/* 1. Declaración e inicialización de variables
		 * 2. Instrucciones (código)
		 * 3. Close scanner
		 */
		
	

	

	}

}
