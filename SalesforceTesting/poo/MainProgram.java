package poo;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sf_returning();
	}

	public static void sf_returning() {
		
		FieldMapping sf_FieldMapping = new FieldMapping("A");
		String recordType = sf_FieldMapping.getType();
		String recordLabel = sf_FieldMapping.getLabel();
		
		System.out.println(recordLabel);
		System.out.println("El record Type es: "+ recordType);
	}
}
