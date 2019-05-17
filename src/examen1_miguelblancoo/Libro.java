package examen1_miguelblancoo;

import java.util.ArrayList;
import java.util.Date;

public class Libro {

    ArrayList autores = new ArrayList();
    String titulo;
    String genero;
    ArrayList editoriales = new ArrayList();
    String idioma;
    Date fecha;
    String isbn;
    Date ingreso = new Date();
    String estado;
    String numcuenta;

    public Libro() {
    }

    public Libro(String titulo, String genero, String idioma, Date fecha, String isbn, String estado, String numcuenta) {
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.fecha = fecha;
        this.isbn = isbn;
        this.estado = estado;
        this.numcuenta = numcuenta;
    }

    public ArrayList getAutores() {
        return autores;
    }

    public void setAutores(ArrayList autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList editoriales) {
        this.editoriales = editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    @Override
    public String toString() {
        return "Libro{" + "autores=" + autores + ", titulo=" + titulo + ", genero=" + genero + ", editoriales=" + editoriales + ", idioma=" + idioma + ", fecha=" + fecha + ", isbn=" + isbn + ", ingreso=" + ingreso + ", estado=" + estado + ", numcuenta=" + numcuenta + '}';
    }

}
