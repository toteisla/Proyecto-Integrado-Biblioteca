package biblioteca;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelInformesPrestamos extends javax.swing.JPanel {

    SQL sql = new SQL();
    Date hoy = new Date();
    private int nVigentes = 0;
    private int nRetrasados = 0;
    private int nCerrados = 0;
    public boolean abiertoSancion = false;

    public PanelInformesPrestamos() {
        initComponents();
        this.DevolverVigente.setText("Devolver");
        this.DevolverRetrasado.setText("Devolver");
        cargarTablas("select U.UserID, U.Nombre, U.Apellidos, L.Titulo, P.LoanID, P.Fecha_Prestamo, P.Fecha_Tope, P.Fecha_Devolucion "
                + "from Usuarios U, Libros L, Prestamos P, Copias_Libros CL  "
                + "where U.UserID = P.UserID AND CL.BookID = L.BookID AND CL.CopiaID = P.CopiaID ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuDevolLibrosVigentes = new javax.swing.JPopupMenu();
        DevolverVigente = new javax.swing.JMenuItem();
        pMenuDevolLibrosRetrasados = new javax.swing.JPopupMenu();
        DevolverRetrasado = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVigentes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRetrasados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCerrados = new javax.swing.JTable();
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

        DevolverVigente.setText("jMenuItem1");
        DevolverVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolverVigenteActionPerformed(evt);
            }
        });
        pMenuDevolLibrosVigentes.add(DevolverVigente);

        DevolverRetrasado.setText("jMenuItem1");
        DevolverRetrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolverRetrasadoActionPerformed(evt);
            }
        });
        pMenuDevolLibrosRetrasados.add(DevolverRetrasado);

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

        tablaRetrasados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaRetrasados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaRetrasadosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaRetrasados);
        tablaRetrasados.getColumnModel().getColumn(0).setMinWidth(0);
        tablaRetrasados.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaRetrasados.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaRetrasados.getColumnModel().getColumn(1).setMinWidth(75);
        tablaRetrasados.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaRetrasados.getColumnModel().getColumn(1).setMaxWidth(75);

        jTabbedPane1.addTab("Retrasados", jScrollPane2);

        tablaCerrados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaCerrados);
        tablaCerrados.getColumnModel().getColumn(0).setMinWidth(0);
        tablaCerrados.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaCerrados.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCerrados.getColumnModel().getColumn(1).setMinWidth(75);
        tablaCerrados.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaCerrados.getColumnModel().getColumn(1).setMaxWidth(75);

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
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
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(this.strFechaInicio.getText());
            String fHoy = sdf.format(hoy);
            if(d.getTime() > sdf.parse(fHoy).getTime()){
                this.strFechaInicio.setText("");
                JOptionPane.showMessageDialog(null, "La fecha debe ser menor o igual que hoy");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_strFechaInicioMouseClicked

    private void strFechaFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strFechaFinMouseClicked
        strFechaFin.setText(new DatePicker(this).setPickedDate());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fInicio = sdf.parse(this.strFechaInicio.getText());
            Date fFin = sdf.parse(this.strFechaFin.getText());
            if(fInicio.getTime() > fFin.getTime()){
                this.strFechaFin.setText("");
                JOptionPane.showMessageDialog(null, "La Fecha Fin debe ser mayor que la Fecha Inicio.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_strFechaFinMouseClicked

    private void tablaVigentesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVigentesMouseReleased
        pMenuDevolLibrosVigentes.show(this, evt.getX()+16, evt.getY()+184);
    }//GEN-LAST:event_tablaVigentesMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTablas("select U.UserID, U.Nombre, U.Apellidos, L.Titulo, P.LoanID, P.Fecha_Prestamo, P.Fecha_Tope, P.Fecha_Devolucion "
                + "from Usuarios U, Libros L, Prestamos P, Copias_Libros CL  "
                + "where U.UserID = P.UserID AND CL.BookID = L.BookID AND CL.CopiaID = P.CopiaID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND P.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND P.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaRetrasadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRetrasadosMouseReleased
        pMenuDevolLibrosRetrasados.show(this, evt.getX()+16, evt.getY()+184);
    }//GEN-LAST:event_tablaRetrasadosMouseReleased

    private void DevolverVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverVigenteActionPerformed
        if(sql.executeQuery("update Prestamos set Fecha_Devolucion = now() where LoanID = "+this.tablaVigentes.getValueAt(this.tablaVigentes.getSelectedRow(), 0)))
            if(sql.executeQuery("delete from Prestamos where LoanID = "+this.tablaVigentes.getValueAt(this.tablaVigentes.getSelectedRow(), 0))){
                cargarTablas("select U.UserID, U.Nombre, U.Apellidos, L.Titulo, P.LoanID, P.Fecha_Prestamo, P.Fecha_Tope, P.Fecha_Devolucion "
                + "from Usuarios U, Libros L, Prestamos P, Copias_Libros CL  "
                + "where U.UserID = P.UserID AND CL.BookID = L.BookID AND CL.CopiaID = P.CopiaID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND P.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND P.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
                JOptionPane.showMessageDialog(null, "Petición realizada con éxito");
            }
    }//GEN-LAST:event_DevolverVigenteActionPerformed

    private void DevolverRetrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverRetrasadoActionPerformed
        if(sql.executeQuery("update Prestamos set Fecha_Devolucion = now() where LoanID = "+this.tablaRetrasados.getValueAt(this.tablaRetrasados.getSelectedRow(), 0)))
            if(sql.executeQuery("delete from Prestamos where LoanID = "+this.tablaRetrasados.getValueAt(this.tablaRetrasados.getSelectedRow(), 0))){

                int result = JOptionPane.showConfirmDialog(null, "¿Desea añadir una sanción a"
                + " \"" + this.tablaRetrasados.getValueAt(this.tablaRetrasados.getSelectedRow(), 2) + "\" por incumplir el plazo de entrega?");
                
                if(result == 0 && !abiertoSancion){
                    abiertoSancion = true;
                    FrameAñadirSancion fas = new FrameAñadirSancion(this, this.tablaRetrasados.getValueAt(this.tablaRetrasados.getSelectedRow(), 0));
                }
                
                cargarTablas("select U.UserID, U.Nombre, U.Apellidos, L.Titulo, P.LoanID, P.Fecha_Prestamo, P.Fecha_Tope, P.Fecha_Devolucion "
                + "from Usuarios U, Libros L, Prestamos P, Copias_Libros CL  "
                + "where U.UserID = P.UserID AND CL.BookID = L.BookID AND CL.CopiaID = P.CopiaID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND P.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND P.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
            }    
    }//GEN-LAST:event_DevolverRetrasadoActionPerformed

    private void cargarTablas(String strQuery){
        jTabbedPane1.setTitleAt(0, "Vigentes(" + nVigentes + ")");
        jTabbedPane1.setTitleAt(1, "Retrasados(" + nRetrasados + ")");
        jTabbedPane1.setTitleAt(2, "Cerrados(" + nCerrados + ")");
        ResultSet filasPrestamos = sql.getResultSet(strQuery);
        try{
            System.out.println(strQuery);
            DefaultTableModel modeloT = (DefaultTableModel) tablaVigentes.getModel();
            DefaultTableModel modeloR = (DefaultTableModel) tablaRetrasados.getModel();
            DefaultTableModel modeloC = (DefaultTableModel) tablaCerrados.getModel();
            modeloT.setRowCount(0);
            modeloR.setRowCount(0);
            modeloC.setRowCount(0);
            Object fila[] = new Object[7];
            filasPrestamos.beforeFirst();
            while(filasPrestamos.next()){
                if((filasPrestamos.getDate("Fecha_Tope").getTime() > hoy.getTime() && filasPrestamos.getString("Fecha_Devolucion") == null)){
                    fila[0] = filasPrestamos.getString("LoanID");
                    fila[1] = filasPrestamos.getString("UserID");
                    fila[2] = filasPrestamos.getString("Nombre") + " " + filasPrestamos.getString("Apellidos");
                    fila[3] = filasPrestamos.getString("Titulo");
                    fila[4] = filasPrestamos.getString("Fecha_Prestamo");
                    fila[5] = filasPrestamos.getString("Fecha_Tope");
                    fila[6] = "Vigente";
                    modeloT.addRow(fila);
                    jTabbedPane1.setTitleAt(0, "Vigentes(" + ++nVigentes + ")");
                }else if(filasPrestamos.getDate("Fecha_Tope").getTime() < hoy.getTime() && filasPrestamos.getString("Fecha_Devolucion") == null){
                    fila[0] = filasPrestamos.getString("LoanID");
                    fila[1] = filasPrestamos.getString("UserID");
                    fila[2] = filasPrestamos.getString("Nombre") + " " + filasPrestamos.getString("Apellidos");
                    fila[3] = filasPrestamos.getString("Titulo");
                    fila[4] = filasPrestamos.getString("Fecha_Prestamo");
                    fila[5] = filasPrestamos.getString("Fecha_Tope");
                    fila[6] = "Retrasado";
                    modeloR.addRow(fila);
                    jTabbedPane1.setTitleAt(1, "Retrasados(" + ++nRetrasados + ")");
                }

            }
            ResultSet filasCerrados = sql.getResultSet("select U.UserID, U.Nombre, U.Apellidos, L.Titulo, HP.LoanID, HP.Fecha_Prestamo, HP.Fecha_Tope, HP.Fecha_Devolucion "
                + "from Usuarios U, Libros L, Historial_Prestamos HP, Copias_Libros CL  "
                + "where U.UserID = HP.UserID AND CL.BookID = L.BookID AND CL.CopiaID = HP.CopiaID "
                + (!this.strUserNum.getText().equals("") ? "AND U.UserID = '" +this.strUserNum.getText()+"'" : "")
                + (!this.strFechaInicio.getText().equals("") ? "AND HP.Fecha_Prestamo >= '"+this.strFechaInicio.getText()+"'" : "")
                + (!this.strFechaFin.getText().equals("") ? "AND HP.Fecha_Tope <= '"+this.strFechaFin.getText()+"'" : ""));
            filasCerrados.beforeFirst();
            while(filasCerrados.next()){
                fila[0] = filasCerrados.getString("LoanID");
                fila[1] = filasCerrados.getString("UserID");
                fila[2] = filasCerrados.getString("Nombre") + " " + filasCerrados.getString("Apellidos");
                fila[3] = filasCerrados.getString("Titulo");
                fila[4] = filasCerrados.getString("Fecha_Prestamo");
                fila[5] = filasCerrados.getString("Fecha_Tope");
                fila[6] = "Cerrado";
                modeloC.addRow(fila);
                jTabbedPane1.setTitleAt(2, "Cerrados(" + ++nCerrados + ")");   
            }
            nVigentes=0;
            nRetrasados=0;
            nCerrados=0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DevolverRetrasado;
    private javax.swing.JMenuItem DevolverVigente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPopupMenu pMenuDevolLibrosRetrasados;
    private javax.swing.JPopupMenu pMenuDevolLibrosVigentes;
    private javax.swing.JTextField strFechaFin;
    private javax.swing.JTextField strFechaInicio;
    private javax.swing.JTextField strUserNum;
    private javax.swing.JTable tablaCerrados;
    private javax.swing.JTable tablaRetrasados;
    private javax.swing.JTable tablaVigentes;
    // End of variables declaration//GEN-END:variables

}
