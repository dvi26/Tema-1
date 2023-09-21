package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radio de la circunferencia: ");
		final double PI = Math.PI;
		double radio;
		radio = sc.nextDouble();
		double resultado5 = PI*2*radio;
		double resultado6 = PI*radio*radio;
		System.out.print("La longitud de la circunferencia es: " + resultado5 );
		System.out.print("El área de la circunferencia es:: " + resultado6 );
		sc.close();


	}

}
