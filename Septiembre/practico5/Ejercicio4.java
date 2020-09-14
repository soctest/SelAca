package practico5;

public class Ejercicio4 {
	
	private int iSBN;
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	public Ejercicio4() {
		this.iSBN = 77652;
		this.titulo = "Ejercicio4";
		this.autor = "sebastian couto";
		this.nroPaginas = 97;
	}

	public Ejercicio4(int unISBN, String unTitulo, String unAutor, int nroPaginas) {
		this.iSBN = unISBN;
		this.titulo = unTitulo;
		this.autor = unAutor;
		this.nroPaginas = nroPaginas;
	}

	public void setISBN(int unISBN) {
		this.iSBN = unISBN;
	}
	
	public int getISBN() {
		return this.iSBN;
				
	}
	
	public void setTitulo(String unTitulo) {
		this.titulo = unTitulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAuthor(String unAutor) {
		this.autor = unAutor;
	}
	
	public String getAuthor() {
		return this.autor;
	}
	
	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public int getNroPaginas() {
		return this.nroPaginas;
	}
	
	public String toString() {
		return "El libro: "+ this.titulo +" con codigo: "+ this.iSBN +" del autor: "+ this.autor +", tiene '"+ this.nroPaginas +"' paginas";
	}
}
