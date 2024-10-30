// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package dominio;
import java.util.*;

public class Genero {
    private String nombre;
    private String desc;
    
    public Genero(String nombre, String desc){
        this.nombre = nombre;
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
