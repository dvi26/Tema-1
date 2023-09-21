package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el año actual: ");
		int añoA;
		añoA= sc.nextInt();
		System.out.print("Introduzca su año de nacimiento: ");
		int añoN;
		añoN = sc.nextInt();
		int resultado2 = añoA-añoN;
		System.out.println("Tienes " + resultado2 + " años");
		sc.close();

	}

}
