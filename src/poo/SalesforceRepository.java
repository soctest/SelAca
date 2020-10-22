package poo;

public class SalesforceRepository{

	protected int xPos = 0;
	protected int yPos = 1;
	private int arraySize = 2;

	private String[] sfRecord = new String[arraySize];
	
	private String input = "input";
	private String picklist = "picklist";
	private String inputP = "input-Picklist";
	private String multiP = "multi-Pickist";
	
	public String[] returnRecord(String sf_FieldName) {
		switch (sf_FieldName) {
			case "A": sfRecord[xPos] = input; sfRecord[yPos] = "Entro por A"; break; //este mensaje es solo para debuggear antes el flujo.
			case "B": sfRecord[xPos] = picklist; sfRecord[yPos] = "Entro por B"; break; //este mensaje es solo para debuggear antes el flujo.
			case "C": sfRecord[xPos] = inputP; sfRecord[yPos] = "Entro por C"; break; //este mensaje es solo para debuggear antes el flujo.
			case "D": sfRecord[xPos] = multiP; sfRecord[yPos] = "Entro por D"; break; //este mensaje es solo para debuggear antes el flujo.
			default: return null;
		}
		
		return sfRecord;
	}
}
