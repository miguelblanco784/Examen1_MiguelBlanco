package examen1_miguelblancoo;

import java.util.ArrayList;
import java.util.Date;

public class Inventario {

    ArrayList<Libro> libros = new ArrayList();

    public Inventario() {
        libros.add(new Libro("Aprende a ser Feliz", "Felicidad", "Español", new Date(), "1000-0001-5555-8881", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz2", "Felicidad", "Español", new Date(), "1000-0001-5555-8882", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz3", "Felicidad", "Español", new Date(), "1000-0001-5555-8883", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz4", "Felicidad", "Español", new Date(), "1000-0001-5555-8884", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz5", "Felicidad", "Español", new Date(), "1000-0001-5555-8885", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz6", "Felicidad", "Español", new Date(), "1000-0001-5555-8886", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz7", "Felicidad", "Español", new Date(), "1000-0001-5555-8887", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz8", "Felicidad", "Español", new Date(), "1000-0001-5555-8888", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz9", "Felicidad", "Español", new Date(), "1000-0001-5555-8889", "Tomado", "11811020"));
        libros.add(new Libro("Aprende a ser Feliz10", "Felicidad", "Español", new Date(), "1000-0001-5555-88810", "Tomado", "11811020"));
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Inventario{" + "libros=" + libros + '}';
    }

}
