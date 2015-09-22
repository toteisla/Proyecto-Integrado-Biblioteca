package biblioteca;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tote
 */
public class JFrameCederLibro extends javax.swing.JFrame {
    private int CopiaID;
    PanelBuscaLibro pbl;
    SQL sql = new SQL();
    Date hoy = new Date();

    public JFrameCederLibro(int nCopiaID, PanelBuscaLibro panel) {
        CopiaID = nCopiaID;
        pbl = panel;
        initComponents();
        this.btnCeder.setEnabled(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        strUserNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rNombre = new javax.swing.JLabel();
        rDni = new javax.swing.JLabel();
        rDireccion = new javax.swing.JLabel();
        rEmail = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelFoto = new javax.swing.JPanel();
        rFoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rUserNum = new javax.swing.JLabel();
        panelSanciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSanciones = new javax.swing.JTable();
        btnCeder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ceder Libro");

        jLabel2.setText("Nº Usuario: ");

        strUserNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strUserNumKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel4.setText("Dni:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel6.setText("Email:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        panelFoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        rFoto.setText("Foto");

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabel7.setText("Nº Usuario: ");

        panelSanciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Sanciones"));

        tablaSanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Sanción", "Fecha Inicio", "Fecha Fin", "Estado", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSanciones);
        tablaSanciones.getColumnModel().getColumn(0).setMinWidth(1);
        tablaSanciones.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaSanciones.getColumnModel().getColumn(0).setMaxWidth(100);
        tablaSanciones.getColumnModel().getColumn(1).setMinWidth(1);
        tablaSanciones.getColumnModel().getColumn(1).setPreferredWidth(85);
        tablaSanciones.getColumnModel().getColumn(1).setMaxWidth(85);
        tablaSanciones.getColumnModel().getColumn(2).setMinWidth(1);
        tablaSanciones.getColumnModel().getColumn(2).setPreferredWidth(85);
        tablaSanciones.getColumnModel().getColumn(2).setMaxWidth(85);
        tablaSanciones.getColumnModel().getColumn(3).setMinWidth(1);
        tablaSanciones.getColumnModel().getColumn(3).setPreferredWidth(75);
        tablaSanciones.getColumnModel().getColumn(3).setMaxWidth(75);
        tablaSanciones.getColumnModel().getColumn(4).setMinWidth(1);

        javax.swing.GroupLayout panelSancionesLayout = new javax.swing.GroupLayout(panelSanciones);
        panelSanciones.setLayout(panelSancionesLayout);
        panelSancionesLayout.setHorizontalGroup(
            panelSancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSancionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSancionesLayout.setVerticalGroup(
            panelSancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSancionesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCeder.setText("Ceder Libro");
        btnCeder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rUserNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strUserNum, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(btnCeder)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(rDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(rNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(rDni, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(334, 334, 334)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strUserNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(jLabel2)
                            .addComponent(btnCeder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(rNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rDni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rDireccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(rEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(panelSanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(rUserNum, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        rellenaFormulario();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void strUserNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strUserNumKeyReleased
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (evt.getKeyCode() == 37)
                || (evt.getKeyCode() == 39) || (evt.getKeyCode() == 8))){
            if((evt.getKeyCode() == 10)){
                rellenaFormulario();
            }
            try{
               Robot rob = new Robot();
               rob.keyPress(KeyEvent.VK_BACK_SPACE);
               rob.keyRelease(KeyEvent.VK_BACK_SPACE);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_strUserNumKeyReleased

    private void btnCederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCederActionPerformed
        if(sql.executeQuery("insert into Prestamos values(null,"
                + Integer.parseInt(this.rUserNum.getText()) + ","
                + CopiaID + ","
                + "now(),"
                + "now() + interval 15 day,"
                + "null)")){
            JOptionPane.showMessageDialog(null, "Pŕestamo registrado correctamente.");
            this.dispose();
        }

    }//GEN-LAST:event_btnCederActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        pbl.construirConsulta((pbl.strTitle.getText().length() > 0) ? pbl.strTitle.getText() : "",
                    (pbl.strAutor.getText().length() > 0) ? pbl.strAutor.getText() : "",
                    (pbl.strEditor.getText().length() > 0) ? pbl.strEditor.getText() : "",
                    (pbl.strPags.getText().length() > 0) ? Integer.parseInt(pbl.strPags.getText()) : 0,
                    (pbl.strISBN.getText().length() > 0) ? pbl.strISBN.getText() : "");
    }//GEN-LAST:event_formWindowClosed

    private void rellenaFormulario(){
        boolean sancionado = false;
        if(this.strUserNum.getText().length() > 0){
            ResultSet filaUsuario = sql.getResultSet("select UserID, Nombre, Apellidos, Direccion, Email, Dni from Usuarios"
                    + " where UserID = "+Integer.parseInt(this.strUserNum.getText()) + " AND Active = 1");
            ResultSet filaSanciones = sql.getResultSet("select P.LoanID, S.WarnID,S.Fecha_Inicio, S.Fecha_Fin, S.Descripcion from Usuarios U, Prestamos P, Sanciones S "
                    + "where U.UserID = P.UserID AND P.LoanID = S.LoanID AND U.UserID = "+Integer.parseInt(this.strUserNum.getText()));
            try{
                filaUsuario.last();
                if(filaUsuario.getRow() > 0){
                    filaUsuario.beforeFirst();
                    while(filaUsuario.next()){
                       this.rNombre.setText(filaUsuario.getString("Nombre") + " " +filaUsuario.getString("Apellidos"));
                       this.rDni.setText(filaUsuario.getString("Dni"));
                       this.rDireccion.setText(filaUsuario.getString("Direccion"));
                       this.rUserNum.setText(filaUsuario.getString("UserID"));
                       this.rEmail.setText(filaUsuario.getString("Email"));
                    }
                    filaSanciones.last();
                    if(filaSanciones.getRow() > 0){
                        DefaultTableModel modelo = (DefaultTableModel) tablaSanciones.getModel();
                        modelo.setRowCount(0);
                        Object fila[] = new Object[5];
                        filaSanciones.beforeFirst();
                        while(filaSanciones.next()){
                            fila[0] = filaSanciones.getString("WarnID");
                            fila[1] = filaSanciones.getDate("Fecha_Inicio");
                            fila[2] = filaSanciones.getDate("Fecha_Fin");
                            fila[3] = (filaSanciones.getDate("Fecha_fin").getTime() <= hoy.getTime() ? "Expirada" : "Vigente");
                            if(fila[3].equals("Vigente"))
                                sancionado = true;
                            fila[4] = filaSanciones.getString("Descripcion");
                            modelo.addRow(fila);
                        }
                        if(sancionado){
                            this.btnCeder.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Este usuario tiene una sanción vigente.");
                        }
                    }else{
                        this.btnCeder.setEnabled(true);
                        this.jScrollPane1.setVisible(false);
                        this.tablaSanciones.setVisible(false);
                        this.panelSanciones.setVisible(false);
                    }
                }else{
                    rUserNum.setText("Usuario no existe o no está activo.");
                }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCeder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JPanel panelSanciones;
    private javax.swing.JLabel rDireccion;
    private javax.swing.JLabel rDni;
    private javax.swing.JLabel rEmail;
    private javax.swing.JLabel rFoto;
    private javax.swing.JLabel rNombre;
    private javax.swing.JLabel rUserNum;
    private javax.swing.JTextField strUserNum;
    private javax.swing.JTable tablaSanciones;
    // End of variables declaration//GEN-END:variables

}
