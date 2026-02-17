package VariablesyOperadores;

import java.util.Scanner;

public class Edad{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 60) {
			System.out.println("Usted es un adulto mayor.");
		} else if (edad >= 18) {
			System.out.println("Usted es un adulto.");
		} else if (edad >= 12) {
			System.out.println("Usted es un adolescente.");
		} else {
			System.out.println("Eres un niño.");
		}
		
		sc.close();
	}
}