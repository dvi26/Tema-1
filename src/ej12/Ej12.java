package ej12;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		int edad;
		System.out.println("Indique su edad: ");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		boolean mayormenor = (edad >=18);
		System.out.println("¿Es usted mayor de edad?: " + mayormenor);
		sc.close();
		
		
		
		
		
			
	}

}
