package poo;

public class SFieldMapping {

	private String type;
	private String label;
	
	private String input = "input";
	private String picklist = "picklist";
	private String inputP = "input-Picklist";
	private String multiP = "multi-Pickist";
	
	public SFieldMapping(String sf_FieldName) {		
		if (returnRecord(sf_FieldName)[0] != null) {
			this.label = returnRecord(sf_FieldName)[0];
			this.type = returnRecord(sf_FieldName)[1];
		} else {
			System.out.println(sf_FieldName +" does not exist in the test class.");
		}
	}
	
	public SFieldMapping(String sf_FieldName, String sf_FieldType) {
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
	
	public String[] returnRecord(String sf_FieldName) {
		
		String[] sfRecord = new String[2];
		sfRecord[0] = null;
		sfRecord[1] = null;
		
		if (sf_FieldName != null || sf_FieldName != "") {			
			switch (sf_FieldName) {
				case "A": sfRecord[0] = input; sfRecord[1] = "Entro por A"; break;
				case "B": sfRecord[0] = picklist; sfRecord[1] = "Entro por B"; break;
				case "C": sfRecord[0] = inputP; sfRecord[1] = "Entro por C"; break;
				case "D": sfRecord[0] = multiP; sfRecord[1] = "Entro por D"; break;
			}			
		}
		
		return sfRecord;
	}
	
}
