package com.poo;

public class MainProgram {
	
	private static String recordField = null;
	public static void main(String[] args) {
		
		sf_returning();
	}

	public static void sf_returning() {
		
		//LA IDEA ES QUE DESDE UN EXCEL VOY A TOMAR UN VALOR DE UN CAMPO EQUIS EL CUAL VA A SER PASADO POR PARAMETRO Y VALIDADO EN LA CLASE 'SalesforceRepository' USANDO HERENCIA DE CLASES;
		recordField = "A";//acá tengo que validar cuando me traiga del excel si me tira o no una exception por null del excel. Por ahora defino el valor a mano para probar como funciona.
		
		try {
			SFieldMapping sf_Field = new SFieldMapping(recordField);
			System.out.println("**** EN ESTE CASO EL CAMPO 'SI EXISTE' EN NUESTRA CLASE ***");
			System.out.println("El record Type es: "+ sf_Field.getType());
			System.out.println("El record Label es: "+ sf_Field.getLabel());
		} catch (Exception NullPointerException) {
			System.out.println("**** EN ESTE CASO EL CAMPO 'NO EXISTE' EN NUESTRA CLASE  ***");
			System.out.println("'"+ recordField +"' does not exist in the -'SalesforceRepository'- class. Please check the fetching data is correct!");
		}
	}
}
