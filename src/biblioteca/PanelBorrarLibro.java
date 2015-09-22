/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelBorrarLibro.java
 *
 * Created on 15-jun-2012, 3:14:07
 */

package biblioteca;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PanelBorrarLibro extends javax.swing.JPanel {

    SQL sql = new SQL();

    public PanelBorrarLibro() {
        initComponents();
        this.setName("PanelBajaUsuario");
        cargaSelLibros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selLibro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar Libro");

        selLibro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione libro."}));

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(selLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(565, 565, 565))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(339, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(!this.selLibro.getSelectedItem().equals("Seleccione libro.")){
           if((!sql.booleanQuery("select ReserveID "
                   + "from Reservas R, Copias_Libros CL, Libros L "
                   + "where R.CopiaID = CL.CopiaID AND CL.BookID = L.BookID AND L.Titulo = '" + this.selLibro.getSelectedItem() + "'"))
                   &&
               !sql.booleanQuery("select LoanID "
                   + "from Prestamos P, Copias_Libros CL, Libros L "
                   + "where P.CopiaID = CL.CopiaID AND CL.BookID = L.BookID AND L.Titulo = '" + this.selLibro.getSelectedItem() + "'")){
            sql.executeQuery("delete from Libros where Titulo='"+this.selLibro.getSelectedItem()+"'");
            JOptionPane.showMessageDialog(null, "Libro borrado y todos sus ejemplares");
            this.selLibro.removeAllItems();
            this.selLibro.addItem("Seleccione libro.");
            cargaSelLibros();
           }else
               JOptionPane.showMessageDialog(null, "El libro seleccionado tiene préstamos o reservas activas.");
        }else
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargaSelLibros(){
        ResultSet filas = sql.getResultSet("select Titulo from Libros;");
        try{
            filas.beforeFirst();
            while(filas.next()){
                this.selLibro.addItem(filas.getString("Titulo"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox selLibro;
    // End of variables declaration//GEN-END:variables

}
