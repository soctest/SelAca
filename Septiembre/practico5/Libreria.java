package practico5;

public class Libreria {

	public static void main(String[] args) {
		returnLibro();
	}

	public static void returnLibro() {
		
		Libro libro1 = new Libro();
		System.out.println(libro1);
		
		Libro libro2 = new Libro(33358, "Aprendiendo POO", "", 30);
		System.out.println(libro2);
	}
}
