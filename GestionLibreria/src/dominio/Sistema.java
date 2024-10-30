// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package dominio;
import java.util.*;
import javax.swing.*;

public class Sistema {
    ArrayList<Genero> listaGeneros = new ArrayList<>();
    ArrayList<Editorial> listaEditoriales = new ArrayList<>();
    ArrayList<Libro> listaLibros = new ArrayList<>();
    ArrayList<Venta> listaVentas = new ArrayList<>();
    ArrayList<Autor> listaAutores = new ArrayList<>();
    
    // separar en dos packages, uno para las ventanas y otro para las clases individuales
    // tres packages también: uno para el main, otro para las ventanas y el último para las clases del UML
    public void registrarEditorial(){
        // WIP
    }
    
    public void agregarGenero(Genero gen){
        listaGeneros.add(gen);
    }
    
    public void agregarAutor (Autor aut){
        listaAutores.add(aut);
    }
    
    
    
}
