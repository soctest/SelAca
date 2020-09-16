package poo;

public class SFieldMapping {

	private String type;
	private String label;
	
	private String input = "input";
	private String picklist = "picklist";
	private String inputP = "input-Picklist";
	private String multiP = "multi-Pickist";
	
	String[] sfRecord = new String[2];
	
	//TODOS LOS TIPOS DE CAMPOS QUE NECESITO TRABAJAR
	public SFieldMapping(String sf_FieldName) {		
		this.type = returnRecord(sf_FieldName)[0];//Type
		this.label = returnRecord(sf_FieldName)[1];//Label
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

		switch (sf_FieldName) {
			case "A": sfRecord[0] = input; sfRecord[1] = "Entro por A"; break;
			case "B": sfRecord[0] = picklist; sfRecord[1] = "Entro por B"; break;
			case "C": sfRecord[0] = inputP; sfRecord[1] = "Entro por C"; break;
			case "D": sfRecord[0] = multiP; sfRecord[1] = "Entro por D"; break;
			//AGREGAR LOS CAMPOS QUE SE VAN A ESTAR CUBRIENDO EN ESTE METODO
		}
		
		return sfRecord;		
	}

}
