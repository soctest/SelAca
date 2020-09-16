package poo;

public class MainProgram {
	
	private static String recordField = null;
	public static void main(String[] args) {
		
		sf_returning();
	}

	public static void sf_returning() {
		
		//DESDE UN EXCEL VOY A TOMAR UN VALOR DE UN CAMPO EL CUAL VA A SER PASADO POR PARAMETRO AL CONSTRUCTOR SFieldMapping(CAMPO)
		recordField = "A";
		SFieldMapping sf_FieldMapping1 = new SFieldMapping(recordField);
		
		if (sf_FieldMapping1.getType() != null) {
			System.out.println("El record Type es: "+ sf_FieldMapping1.getType());
			System.out.println("El record Label es: "+ sf_FieldMapping1.getLabel());
		}else {
			System.out.println("'"+ recordField +"' does not exist in the sfFieldMapping class. Please check the fetching data is correct!");
		}
		
		System.out.println("\n*******");
		recordField = "Z";
		SFieldMapping sf_FieldMapping2 = new SFieldMapping(recordField);
		
		if (sf_FieldMapping2.getType() != null) {
			System.out.println("El record Type es: "+ sf_FieldMapping2.getType());
			System.out.println("El record Label es: "+ sf_FieldMapping2.getLabel());
		}else {
			System.out.println("'"+ recordField +"' does not exist in the sfFieldMapping class. Please check the fetching data is correct!");
		}
	}
}
