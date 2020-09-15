package poo;

public class MainProgram {
	
	public static void main(String[] args) {
		
		sf_returning();
	}

	public static void sf_returning() {
		
		SFieldMapping sf_FieldMapping = new SFieldMapping("B");
		
		String recordLabel = sf_FieldMapping.getType();
		String recordType = sf_FieldMapping.getLabel();
		
		System.out.println("El record Type es: "+ recordType);
		System.out.println("El record Label es: "+ recordLabel);
		
	}
}
