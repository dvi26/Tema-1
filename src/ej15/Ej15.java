package ej15;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double notaEx;
		double media;
		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		// Abrimos el scanner
		System.out.println("Nota primer trimestre:");
		nota1 = sc.nextDouble();
		// Preguntamos por la nota1
		System.out.println("Nota segundo trimestre:");
		nota2 = sc.nextDouble();
		// Preguntamos por la nota2
		System.out.println("Nota tercer trimestre:");
		nota3 = sc.nextDouble();
		// Preguntamos por la nota3
		media = (nota1 + nota2 + nota3)/3;
		notaEx = media;
		// Hacemos la media con decimales
		System.out.println("Nota expediente académico: " +  notaEx);
		// Declaramos la nota con decimales
		int entera1 = (int) nota1;
		int entera2 = (int) nota2;
		int entera3 = (int) nota3;
		// Convertimos de double a int para sacar la parte entera solo de las notas.
		int mediaentera = (entera1 + entera2 + entera3)/3;
		// Hacemos la media con las notas enteras
		System.out.println("Nota boletín: " +  mediaentera);
		// Declaramos la nota sin decimales
		sc.close();
		// Cerramos el scanner
		
		
		
		

	}

}
