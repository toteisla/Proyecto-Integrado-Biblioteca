package biblioteca;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelInformesSanciones extends javax.swing.JPanel {

    SQL sql = new SQL();
    Date hoy = new Date();
    private int nVigentes = 0;
    private int nCerrados = 0;
    public boolean abiertoSancion = false;

    public PanelInformesSanciones() {
        initComponents();
        this.Eliminar.setText("Eliminar");
        cargarTablas("select U.UserID, U.Nombre, U.Apellidos, P.LoanID, S.Fecha_Inicio, S.Fecha_Fin,S.Descripcion "
                + "from Usuarios U, Prestamos P, Sanciones S "
                + "where U.UserID = P.UserID AND P.LoanID = S.LoanID ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuSancionesVigentes = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVigentes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCerradas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        strFechaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        strFechaFin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        strUserNum = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        Eliminar.setText("jMenuItem1");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        pMenuSancionesVigentes.add(Eliminar);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informes de Préstamos");

        tablaVigentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LoanID", "Nº Usuario", "Nombre del Socio", "Título del Libro", "Fecha Préstamo", "Fecha Máxima", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVigentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaVigentesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVigentes);
        tablaVigentes.getColumnModel().getColumn(0).setMinWidth(0);
        tablaVigentes.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaVigentes.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaVigentes.getColumnModel().getColumn(1).setMinWidth(75);
        tablaVigentes.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaVigentes.getColumnModel().getColumn(1).setMaxWidth(75);

        jTabbedPane1.addTab("Vigentes", jScrollPane1);

        tablaCerradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LoanID", "Nº Usuario", "Nombre del Socio", "Título del Libro", "Fecha Préstamo", "Fecha Máxima", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCerradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaCerradasMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCerradas);
        tablaCerradas.getColumnModel().getColumn(0).setMinWidth(0);
        tablaCerradas.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaCerradas.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCerradas.getColumnModel().getColumn(1).setMinWidth(75);
        tablaCerradas.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaCerradas.getColumnModel().getColumn(1).setMaxWidth(75);

        jTabbedPane1.addTab("Cerrados", jScrollPane3);

        jLabel2.setText("Fecha Inicio:");

        strFechaInicio.setEditable(false);
        strFechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strFechaInicioMouseClicked(evt);
            }
        });

        jLabel3.setText("Fecha Fin:");

        strFechaFin.setEditable(false);
        strFechaFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strFechaFinMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("Nº Usuario:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strUserNum, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(strUserNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(strFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(strFechaFin, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void strFechaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strFechaInicioMouseClicked
        strFechaInicio.setText(new DatePicker(this).setPickedDate());
    }//GEN-LAST:event_strFechaInicioMouseClicked

    private void strFechaFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strFechaFinMouseClicked
        strFechaFin.setText(new DatePicker(this).setPickedDate());
    }//GEN-LAST:event_strFechaFinMouseClicked

    private void tablaVigentesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVigentesMouseReleased
        pMenuSancionesVigentes.show(this, evt.getX()+16, evt.getY()+184);
    }//GEN-LAST:event_tablaVigentesMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTablas("select U.UserID, U.Nombre, U.Apellidos, P.LoanID, S.Fecha_Inicio, S.Fecha_Fin,S.Descripcion "
                + "from Usuarios U, Prestamos P, Sanciones S "
                + "where U.UserID = P.UserID AND P.LoanID = S.LoanID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND P.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND P.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if(sql.executeQuery("update Prestamos set Fecha_Devolucion = now() where LoanID = "+this.tablaVigentes.getValueAt(this.tablaVigentes.getSelectedRow(), 0)))
            if(sql.executeQuery("delete from Prestamos where LoanID = "+this.tablaVigentes.getValueAt(this.tablaVigentes.getSelectedRow(), 0))){
                cargarTablas("select U.UserID, U.Nombre, U.Apellidos, P.LoanID, S.Fecha_Inicio, S.Fecha_Fin,S.Descripcion "
                + "from Usuarios U, Prestamos P, Sanciones S "
                + "where U.UserID = P.UserID AND P.LoanID = S.LoanID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND P.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND P.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
                JOptionPane.showMessageDialog(null, "Petición realizada con éxito");
            }
    }//GEN-LAST:event_EliminarActionPerformed

    private void tablaCerradasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCerradasMouseReleased
        // TODO add your handling code here:
}//GEN-LAST:event_tablaCerradasMouseReleased

    private void cargarTablas(String strQuery){
        jTabbedPane1.setTitleAt(0, "Vigentes(" + nVigentes + ")");
        ResultSet filasPrestamos = sql.getResultSet(strQuery);
        try{
            System.out.println(strQuery);
            DefaultTableModel modeloT = (DefaultTableModel) tablaVigentes.getModel();
            DefaultTableModel modeloC = (DefaultTableModel) tablaCerradas.getModel();
            modeloT.setRowCount(0);
            modeloC.setRowCount(0);
            Object fila[] = new Object[7];
            filasPrestamos.beforeFirst();
            while(filasPrestamos.next()){
                if(filasPrestamos.getDate("Fecha_Fin").getTime() > hoy.getTime()){
                    fila[0] = filasPrestamos.getString("LoanID");
                    fila[1] = filasPrestamos.getString("UserID");
                    fila[2] = filasPrestamos.getString("Nombre") + " " + filasPrestamos.getString("Apellidos");
                    fila[3] = filasPrestamos.getString("Descripcion");
                    fila[4] = filasPrestamos.getString("Fecha_Inicio");
                    fila[5] = filasPrestamos.getString("Fecha_Fin");
                    fila[6] = "Vigente";
                    modeloT.addRow(fila);
                    jTabbedPane1.setTitleAt(0, "Vigentes(" + ++nVigentes + ")");
                }else if(filasPrestamos.getDate("Fecha_Fin").getTime() < hoy.getTime()){
                    fila[0] = filasPrestamos.getString("LoanID");
                    fila[1] = filasPrestamos.getString("UserID");
                    fila[2] = filasPrestamos.getString("Nombre") + " " + filasPrestamos.getString("Apellidos");
                    fila[3] = filasPrestamos.getString("Descripcion");
                    fila[4] = filasPrestamos.getString("Fecha_Inicio");
                    fila[5] = filasPrestamos.getString("Fecha_Fin");
                    fila[6] = "Cerrado";
                    modeloC.addRow(fila);
                    jTabbedPane1.setTitleAt(1, "Cerrados(" + ++nCerrados + ")");
                }

            }
            nVigentes=0;
            nCerrados=0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPopupMenu pMenuSancionesVigentes;
    private javax.swing.JTextField strFechaFin;
    private javax.swing.JTextField strFechaInicio;
    private javax.swing.JTextField strUserNum;
    private javax.swing.JTable tablaCerradas;
    private javax.swing.JTable tablaVigentes;
    // End of variables declaration//GEN-END:variables

}
