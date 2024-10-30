// Leandro Chiurchiu (286847) y Juan Mart��n Lasserre (289139)
// M2B
package dominio;


public class Editorial {
    private String nombre;
    private String pais;
    
    public Editorial(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
