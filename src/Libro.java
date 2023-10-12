//Nelson De Abreu

//Escribir un programa en Java que modele la clase libro. 
//La clase debe incluir los métodos crear dos objetos y para 
//imprimir por pantalla los valores de los atributos.

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void imprimirInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }

    public static void main(String[] args) {
        // Crear dos objetos de la clase Libro
        Libro libro1 = new Libro("Fausto", "Johann Wolfgang von Goethe", 1832);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        // Imprimir la información de los libros por pantalla
        System.out.println("Información del Libro 1:");
        libro1.imprimirInformacion();

        System.out.println("\nInformación del Libro 2:");
        libro2.imprimirInformacion();
    }
}
