package poo;

public class FieldMapping {

	private String type;
	private String label;
	
	private String input = "input";
	private String picklist = "picklist";
	private String inputP = "input-Picklist";
	private String multiP = "multi-Pickist";
	
	public FieldMapping(String sf_FieldName) {		
		this.label = returnLabel(sf_FieldName);
		this.type = returnType(sf_FieldName);
	}
	
	public FieldMapping(String sf_FieldName, String sf_FieldType) {
		this.type = sf_FieldType;
		this.label = sf_FieldName;
	}
	
	public void setLabel(String sf_FieldName) {
		this.label = sf_FieldName;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void setType(String sf_FieldType) {
		this.type = sf_FieldType;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String returnType(String sf_FieldName) {
		String type = "";
		
		switch (sf_FieldName) {
			case "A": type = input;	 break;
			case "B": type = picklist; break;
			case "C": type = inputP; break;
			case "D": type = multiP; break;
		}

		return type;
	}
	
//	hay alguna forma de traernos desde la app todos los labels y field types desde salesforce?
//	de ser posible habría que crear una clase aparte que tenga la lista de todos los campos de salesForce y nos ayudaría a mantener la clase actuailizada a tiempo
	public String returnLabel(String sf_FieldName) {
		String label = "";
		
		switch (sf_FieldName) {
			case "A": label = "Entro por A"; break;
			case "B": label = "Entro por B"; break;
			case "C": label = "Entro por C"; break;
			case "D": label = "Entro por D"; break;
		}
		
		if (label != "") {
			return label;
		} else {
			System.out.println("FIELD does not EXIST!!");
			return "";
		}
	}
}
