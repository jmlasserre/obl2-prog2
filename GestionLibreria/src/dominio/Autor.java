package dominio;
import dominio.Genero;
import java.util.*;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private ArrayList<String> generos = new ArrayList<>();


    public Autor(String nombre, String nacionalidad, ArrayList<String> generos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.generos = generos;
    }

    public Boolean escribeEnGenero(String gen){
        Boolean b = false;
        for (String g : this.generos){
            if (gen.trim().equalsIgnoreCase(g)){
                b = true;
            }
        }
        return b;
    }
    
    public void setGeneros(ArrayList<String> listaGeneros){
        this.generos = listaGeneros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
