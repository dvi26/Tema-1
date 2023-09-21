package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		double nota1;
		nota1= sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2;
		nota2 = sc.nextDouble();
		double resultado3 = nota1+nota2;
		double resultado4 = resultado3/2;
		System.out.println("Su media es: " + resultado4 );
		sc.close();

	}

}
