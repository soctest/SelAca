package practico5;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sf_returning();
		returnLibro();
	}

	public static void sf_returning() {
		
		SFieldMapping sf_FieldMapping = new SFieldMapping("A");
		String recordType = sf_FieldMapping.getType();
		String recordLabel = sf_FieldMapping.getLabel();
		
		System.out.println(recordLabel);
		System.out.println("El record Type es: "+ recordType);
	}
	
	
	public static void returnLibro() {
		
		Ejercicio4 libro1 = new Ejercicio4();
		System.out.println(libro1);
		
		Ejercicio4 libro2 = new Ejercicio4(33358, "Aprendiendo POO", "Sebastian couto", 30);
		System.out.println(libro2);
	}
}
