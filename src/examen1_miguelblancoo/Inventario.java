package examen1_miguelblancoo;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Libro> libros = new ArrayList();

    public Inventario() {
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
