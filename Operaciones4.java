package VariablesyOperadores;

import java.util.Scanner;

public class Operaciones4{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		short num1;
		short num2;
		
		System.out.print("Ingrese un numero: ");
		num1 = sc.nextShort();
		System.out.print("Ingrese otro numero: ");
		num2 = sc.nextShort();
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("El producto es: " + (num1 * num2));
		System.out.println("El cociente es: " + (num1 / num2));
		
		sc.close();
	}
}