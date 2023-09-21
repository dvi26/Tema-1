package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		sc.close();

	}

}
