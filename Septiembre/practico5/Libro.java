package practico5;

public class Libro {
	
	private int iSBN;
	private String titulo;
	private String autor;
	private int nroPaginas;
	
	public Libro() {
	this.iSBN = 0;
		this.titulo = "Sin Titulo";
		this.autor = "";
		this.nroPaginas = 0;
	}

	public Libro(int unISBN, String unTitulo, String unAutor, int nroPaginas) {
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
	
	private boolean autorVacio() {
		if (this.autor != "") {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		
		String retorno = "El libro '"+ this.titulo +"' con ISBN '"+ this.iSBN +"'";
		
		if (autorVacio()) {
			retorno = retorno  +" por el autor 'desconocido' tiene '"+ this.nroPaginas +"' paginas.";
		} else {
			retorno = retorno  +" por el autor '"+ this.autor +"' tiene '"+ this.nroPaginas +"' paginas.";
		}
	
		return retorno;
	}

}
