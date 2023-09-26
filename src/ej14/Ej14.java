package ej14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		boolean salir;
		boolean biblioteca;
		boolean tareas;
		boolean lluvia;
		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		// Abrimos el scanner
		System.out.println("¿Está lloviendo? :");
		lluvia = sc.nextBoolean();
		// Preguntamos y leemos la respuesta con el scanner
		System.out.println("¿Tienes que ir a la biblioteca? :");
		biblioteca = sc.nextBoolean();
		// Preguntamos y leemos la respuesta con el scanner
		System.out.println("¿Has finalizado las tareas? :");
		tareas = sc.nextBoolean();	
		// Preguntamos y leemos la respuesta con el scanner
		salir = biblioteca || ( tareas && !lluvia);
		// Condicional que sostiene la pregunta del ejercicio
		System.out.println("¿Puedes salir? :  " + salir);
		// Declaramos la respuesta del condicionante
		sc.close();


	}

}
