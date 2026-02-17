package VariablesyOperadores;

import java.util.Scanner;

public class Operaciones5{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		byte num1;
		byte num2;
		
		System.out.print("Ingrese un numero: ");
		num1 = sc.nextByte();
		System.out.print("Ingrese otro numero: ");
		num2 = sc.nextByte();
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("El producto es: " + (num1 * num2));
		System.out.println("El cociente es: " + (num1 / num2));
		
		sc.close();
	}
}