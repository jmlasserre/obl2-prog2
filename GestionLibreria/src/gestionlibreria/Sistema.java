// Leandro Chiurchiu (286847) y Juan Mart��n Lasserre (289139)
// M2B
package gestionlibreria;
import javax.swing.*;

public class Sistema {
    
    public void inicio(){
        int ini = JOptionPane.showConfirmDialog(null, "Bienvenido. �Desea utilizar los datos cargados anteriormente?", "�Bienvenido!",
                JOptionPane.YES_NO_OPTION);
        if (ini == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Se cargar�n los datos generados previamente.", "Inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se cargar�n los datos generados previamente.", "Inicio", 
                    JOptionPane.INFORMATION_MESSAGE); // pregunta para el profe: �qu� pasa si se elige no? �Se borran los datos? Capaz que se puede poner otro confirm x las dudas
        }
            
    }
    
    public void registrarEditorial(){
        // WIP
    }
    
}
