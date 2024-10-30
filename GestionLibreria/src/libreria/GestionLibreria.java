// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package libreria;
import dominio.Sistema;
import interfaz.*;

public class GestionLibreria {

    public static void main(String[] args) {
        Sistema sys = new Sistema();
        VentanaInicio vent = new VentanaInicio(sys);
        vent.setVisible(true);
    }
    
}
