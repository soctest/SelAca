package practico6;

import java.util.Scanner;

public class EjerciciosConArreglos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] edades = new int[5];
		System.out.println("Datos del array");
		edades[2] = 19;
		edades[3] = 22;
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Ingrese una edad: ");
			edades[i] = input.nextInt();
		}
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("La posicion "+ i +" tiene "+ edades[i]);
		}
	}

}
