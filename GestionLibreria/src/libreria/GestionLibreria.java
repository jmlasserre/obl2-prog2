// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package libreria;
import interfaz.*;

public class GestionLibreria {

    public static void main(String[] args) {
        Sistema sys = new Sistema();
        sys.inicio();
        VentanaMenu vent = new VentanaMenu();
        vent.setVisible(true);
    }
    
}
