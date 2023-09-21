package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int añoA;
		int añoN;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el año actual: ");
		añoA= sc.nextInt();
		System.out.print("Introduzca su año de nacimiento: ");
		añoN = sc.nextInt();
		int resultado2 = añoA-añoN;
		System.out.println("Tienes " + resultado2 + " años");
		
		sc.close();

	}

}
