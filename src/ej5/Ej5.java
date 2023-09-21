package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		double radio;
		Scanner sc = new Scanner(System.in);
		System.out.print("Radio de la circunferencia: ");
		radio = sc.nextDouble();
		double resultado5 = PI*2*radio;
		double resultado6 = PI*radio*radio;
		System.out.print("La longitud de la circunferencia es: " + resultado5 );
		System.out.print("El área de la circunferencia es:: " + resultado6 );
		
		sc.close();

	}

}
