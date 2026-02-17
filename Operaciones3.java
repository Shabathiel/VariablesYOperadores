package VariablesyOperadores;

import java.util.Scanner;

public class Operaciones3{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.print("Ingrese un numero: ");
		num1 = sc.nextFloat();
		System.out.print("Ingrese otro numero: ");
		num2 = sc.nextFloat();
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("El producto es: " + (num1 * num2));
		System.out.println("El cociente es: " + (num1 / num2));
		
		sc.close();
	}
}