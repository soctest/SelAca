package poo;

public class SFieldMapping extends SalesforceRepository{

	private String type;
	private String label;
	
	//TODOS LOS TIPOS DE CAMPOS QUE NECESITO TRABAJAR
	public SFieldMapping(String sf_FieldName) {
		this.type = returnRecord(sf_FieldName)[this.xPos];//Type
		this.label = returnRecord(sf_FieldName)[this.yPos];//Label
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
	
}
