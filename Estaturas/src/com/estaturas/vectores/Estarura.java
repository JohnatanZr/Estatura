package com.estaturas.vectores;

import java.util.Scanner;

/*Programa Java para leer la altura de N personas y calcular la altura media.
 *Calcular cuántas personas tienen una altura superior a la media y 
 *cuántas tienen una altura inferior a la media. 
 *El valor de N se pide por teclado y debe ser entero positivo.*/
public class Estarura {

	public static void main(String[] args) {
		double contador = 0, estaMayor = 0;
		Scanner tc = new Scanner(System.in);
		System.out.print("Ingrese el número de personas: ");
		int n = tc.nextInt();
		double estatura[] = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese la estatura de la persona: " + (i + 1));
			estatura[i] = tc.nextDouble();
			contador += estatura[i];
		}
		double estaMenor = (contador / n);
		System.out.println("Las estaturas a evaluar son: ");
		for (int j = 0; j < n; j++) {
			if (estaMenor > estatura[j]) {
				estaMenor = estatura[j];
			} else {
				estaMayor = estatura[j];
			}
			System.out.print(estatura[j] + " ");
		}
		System.out.println();
		System.out.println("La menor estatura es: " + estaMenor);
		System.out.print("La mayor estatura es: " + estaMayor);

	}
}
