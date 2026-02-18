package VariablesyOperadores;

import java.util.Scanner;

public class Login{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String Usuario, Contrasenia;
		
		System.out.print("Ingrese su usario: ");
		Usuario = sc.nextLine();
		System.out.print("Ingrese su contraseña: ");
		Contrasenia = sc.nextLine();
		
		switch (Usuario) {
		case "admin":
			if (Contrasenia.equals("123123")) {
				System.out.println("Acceso concedido. ");
			} else  {
				System.out.println("Contraseña incorrecta. ");
			}
			break;
		case "Jhon17":
			if (Contrasenia.equals("HumanityFY")) {
				System.out.println("Acceso concedido. ");
			} else  {
				System.out.println("Contraseña incorrecta. ");
			}
			break;
		case "Sam Altman":
			if (Contrasenia.equals("ChatUPT")) {
				System.out.println("Acceso concedido. ");
			} else  {
				System.out.println("Contraseña incorrecta. ");
			}
			break;
		default:
			System.out.print("Usuario no registrado. ");
		}
		
		
		sc.close();
	}
}