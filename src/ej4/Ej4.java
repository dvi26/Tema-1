package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		nota1= sc.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		double resultado3 = nota1+nota2;
		double resultado4 = resultado3/2;
		System.out.println("Su media es: " + resultado4 );
		
		sc.close();

	}

}
