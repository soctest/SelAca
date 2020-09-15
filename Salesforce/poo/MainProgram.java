package poo;

public class MainProgram {
	
	public static void main(String[] args) {
		
		sf_returning();
	}

	public static void sf_returning() {
		
		SFieldMapping sf_FieldMapping = new SFieldMapping("A");
		String recordType = sf_FieldMapping.getType();
		String recordLabel = sf_FieldMapping.getLabel();
		
		System.out.println(recordLabel);
		System.out.println("El record Type es: "+ recordType);
	}
}
