package biblioteca;

import java.awt.*;
import javax.swing.*;

public class PanelFondoLogin extends javax.swing.JPanel {

    /** Creates new form PanelFondo */
    public PanelFondoLogin() {
        initComponents();
        this.setSize(573,506);
    }

    @Override
    public void paintComponent(Graphics g){
        Dimension tamaño = this.getSize();
        ImageIcon imagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen_Login.png")).getImage());
        g.drawImage(imagenFondo.getImage(), 0, 0, tamaño.height, tamaño.width, this);
        this.setOpaque(false);
        super.paintComponent(g);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
