// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package dominio;
import java.util.*;
import javax.swing.*;

public class Sistema {
    private ArrayList<Genero> listaGeneros = new ArrayList<>();
    private ArrayList<Editorial> listaEditoriales = new ArrayList<>();
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private ArrayList<Venta> listaVentas = new ArrayList<>();
    private ArrayList<Autor> listaAutores = new ArrayList<>();
    
    private HashMap<String, String> gens = new HashMap();
    private HashMap<String, String> autores = new HashMap();
    
    // separar en dos packages, uno para las ventanas y otro para las clases individuales
    // tres packages también: uno para el main, otro para las ventanas y el último para las clases del UML
    public void registrarEditorial(String nombre, String pais){
        Editorial ed = new Editorial(nombre, pais);
        this.listaEditoriales.add(ed);
    }
    
    public ArrayList<String> getNombresEditorial(){
        ArrayList<String> listaNombresEditoriales = new ArrayList<>();
        for (Editorial edit: this.listaEditoriales){
            listaNombresEditoriales.add(edit.getNombre());
        }
        return listaNombresEditoriales;
    }
    
    public ArrayList<Editorial> getEditorial(){
        return listaEditoriales;
    }
    
    public void registrarAutor(String nombre, String nacionalidad, ArrayList<String> listaGeneros){
        autores.put(nombre, nacionalidad);
        Autor aut = new Autor(nombre, nacionalidad, listaGeneros);
        this.listaAutores.add(aut);
    }
    
    public void GeneroXAutor(String nombre){
        
    }
    
    public Boolean autorEsUnico(String nombre){
        Boolean b = true;
        for (Autor aut : this.listaAutores){
            if (aut.getNombre().trim().equalsIgnoreCase(nombre)){
                b = false;
            }
        }
        return b;
    }
    
     public ArrayList<String> getNombresAutor(){
        return new ArrayList<String>(autores.keySet());
    }
    
    public ArrayList<String> getNacionAutor(){
        return new ArrayList<String>(autores.values());
    }
   
    public Boolean esUnicaEditorial(String nombre){
        Boolean b = true;
        for (Editorial editorial : this.listaEditoriales){
            if (editorial.getNombre().trim().equalsIgnoreCase(nombre)){
                b = false;
            }
        }
        return b;
    }
      
    public void agregarGenero(String nombre, String desc){
        gens.put(nombre, desc);
        Genero gen = new Genero(nombre, desc);
        this.listaGeneros.add(gen);
    }
      
    public Boolean generoEsUnico(String nombre){
        Boolean b = true;
        for (Genero g : this.listaGeneros){
            if (g.getNombre().trim().equalsIgnoreCase(nombre)){
                b = false;
            }
        }
        return b;
    }
    
    public ArrayList<String> getNombresGenero(){
        return new ArrayList<String>(gens.keySet());
    }
    
    public ArrayList<String> getDescsGenero(){
        return new ArrayList<String>(gens.values());
    }
    
}
