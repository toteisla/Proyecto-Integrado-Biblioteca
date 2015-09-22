
package biblioteca;

import java.io.File;

public class FiltroArchivos extends javax.swing.filechooser.FileFilter{
    @Override
    public boolean accept(File file) {
        // Permitir navegar por carpetas y sólo archivos con extension .png
        return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
    }
    @Override
    public String getDescription() {
        //Descripcion del combobox de seleccion de formato
        return "Archivo de imagen (*.png)";
    }
}
