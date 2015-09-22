package biblioteca;

import java.awt.Color;
import java.awt.Component;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class PanelEdicionUsuario extends javax.swing.JPanel {
    SQL sql = new SQL();
    EnviarEmail email = new EnviarEmail();
    boolean comprobante[] = {true,true,true,true,true,true,true,true};
    private ResultSet filas;
    public PanelEdicionUsuario() {
        initComponents();
        this.setName("PanelEdicionUsuario");
        //this.selUser.getSelectedIndex();
        Component comps[] = new Component[this.errPanel.getComponents().length];
        comps = this.errPanel.getComponents();
        for(int i=0 ; i<comps.length ; i++){
            comps[i].setVisible(false);
        }
        this.cargaSelUsuarios();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        selUser = new javax.swing.JComboBox();
        chkActiveUser = new javax.swing.JCheckBox();
        chkAdmin = new javax.swing.JCheckBox();
        errPanel = new javax.swing.JPanel();
        statusName = new javax.swing.JLabel();
        statusLastName = new javax.swing.JLabel();
        statusDNI = new javax.swing.JLabel();
        statusAddres = new javax.swing.JLabel();
        statusPass = new javax.swing.JLabel();
        statusPassRep = new javax.swing.JLabel();
        statusMail = new javax.swing.JLabel();
        strAddress = new javax.swing.JTextField();
        lblAddres = new javax.swing.JLabel();
        strName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        strLastName = new javax.swing.JTextField();
        strDni = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblPassRep = new javax.swing.JLabel();
        strEmail = new javax.swing.JTextField();
        strPassRep = new javax.swing.JTextField();
        strPass = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        lblRegistered = new javax.swing.JLabel();

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar Usuario");

        jLabel5.setText("Datos Personales:");

        jLabel11.setText("Datos Usuario:");

        selUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Usuario." }));
        selUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selUserItemStateChanged(evt);
            }
        });

        chkActiveUser.setText("Activar Usuario");
        chkActiveUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chkActiveUserMousePressed(evt);
            }
        });

        chkAdmin.setText("Administrador");
        chkAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chkAdminMousePressed(evt);
            }
        });

        errPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores:"));

        statusName.setForeground(new java.awt.Color(255, 0, 0));
        statusName.setText("· El nombre debe tener entre 4 y 20 carácteres.");

        statusLastName.setForeground(new java.awt.Color(255, 0, 0));
        statusLastName.setText("· El apellido debe tener entre 4 y 60 carácteres,");

        statusDNI.setForeground(new java.awt.Color(255, 0, 0));
        statusDNI.setText("· El DNI debe contener 8 números y 1 letra.");

        statusAddres.setForeground(new java.awt.Color(255, 0, 0));
        statusAddres.setText("· La dirección debe tener entre 1 y 100 carácteres.");

        statusPass.setForeground(new java.awt.Color(255, 0, 0));
        statusPass.setText("· La contraseña debe tener más de 6 carácteres.");

        statusPassRep.setForeground(new java.awt.Color(255, 0, 0));
        statusPassRep.setText("· Las contraseñas no coinciden.");

        statusMail.setForeground(new java.awt.Color(255, 0, 0));
        statusMail.setText("· Email inválido.");

        javax.swing.GroupLayout errPanelLayout = new javax.swing.GroupLayout(errPanel);
        errPanel.setLayout(errPanelLayout);
        errPanelLayout.setHorizontalGroup(
            errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusName)
                    .addComponent(statusLastName)
                    .addComponent(statusDNI)
                    .addComponent(statusAddres))
                .addGap(164, 164, 164)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusPass)
                    .addComponent(statusPassRep)
                    .addComponent(statusMail))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        errPanelLayout.setVerticalGroup(
            errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errPanelLayout.createSequentialGroup()
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusName)
                    .addComponent(statusPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLastName)
                    .addComponent(statusPassRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusDNI)
                    .addComponent(statusMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAddres)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        strAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strAddressFocusLost(evt);
            }
        });

        lblAddres.setText("Direccion:");

        strName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strNameFocusLost(evt);
            }
        });

        lblName.setText("Nombre:");

        lblLastName.setText("Apellidos:");

        strLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strLastNameFocusLost(evt);
            }
        });

        strDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strDniFocusLost(evt);
            }
        });
        strDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strDniKeyReleased(evt);
            }
        });

        lblDNI.setText("DNI:");

        lblPass.setText("Contraseña:");

        lblPassRep.setText("Repetir Contraseña:");

        strEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strEmailFocusLost(evt);
            }
        });

        strPassRep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strPassRepFocusLost(evt);
            }
        });

        strPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strPassFocusLost(evt);
            }
        });

        lblMail.setText("Email:");

        lblRegistered.setText("Registrado Por: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(lblLastName)
                    .addComponent(lblDNI)
                    .addComponent(lblAddres))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(strName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strDni, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMail)
                        .addGap(15, 15, 15))
                    .addComponent(lblPassRep)
                    .addComponent(lblPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strPassRep, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(strEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(strPass, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(chkAdmin))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selUser, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRegistered))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate)
                        .addComponent(chkActiveUser)))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistered))
                        .addGap(4, 4, 4)
                        .addComponent(chkActiveUser)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(strName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(strLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPassRep)
                                        .addComponent(strPassRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(strPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPass))
                                        .addGap(37, 37, 37)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(strEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMail)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI)
                            .addComponent(strDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddres)
                        .addComponent(strAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkAdmin))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(errPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Encriptado enc = new Encriptado();
        if(!this.selUser.getSelectedItem().equals("Seleccione Usuario.")){
            if(compruebaFormulario()){
                if(sql.executeQuery("update Usuarios set "
                        + ((!this.strPass.getText().equals("") && this.strPass.getText().length() > 0) ? "Password ="+ "'" + enc.getStringMessageDigest(this.strPass.getText(), "SHA-1") + "'," : "" )
                        + "Nombre ="
                        + "'" + this.strName.getText() +"',"
                        + "Apellidos ="
                        + "'" + this.strLastName.getText() +"',"
                        + "Direccion ="
                        + "'" + this.strAddress.getText() +"',"
                        + "Dni ="
                        + "'" + this.strDni.getText() +"',"
                        + "Email = "
                        + "'" + this.strEmail.getText() +"' "
                        + "where Username ="
                        + "'"+ this.selUser.getSelectedItem() + "';")){
                    JOptionPane.showMessageDialog(null, "Usuario modificado satisfactoriamente.");

                    String mensaje = "\t Estimado Sr/Sra: " + this.strName.getText() + " " + this.strLastName.getText() + "\n";
                    mensaje += "Le informamos de que su cuenta en la Biblioteca Virtual ha sido modifcada. sus nuevos datos son: \n";

                    if(sql.booleanQuery("select Password "
                            + "from Usuarios "
                            + "where Username = '" + this.selUser.getSelectedItem() + "'"
                            + " and Password = '" + enc.getStringMessageDigest(this.strPass.getText(), "SHA-1") + "'")){
                        mensaje += "Password: " + this.strPass.getText() + "\n";
                    }
                    
                    mensaje += "DNI: " + this.strDni.getText() + "\n";
                    mensaje += "Direccion: " + this.strAddress.getText() + "\n";
                    mensaje += "\n\n\n Esperamos que disfrute de nuestro servicio.";
                    if(!email.EnviadorMail(this.strEmail.getText(), "Bienvenido a la Biblioteca Virtual", mensaje))
                        JOptionPane.showMessageDialog(null, "Ha habido un problema al mandar el correo electrónico.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Hay campos incorrectos.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario válido.");
        }
}//GEN-LAST:event_btnUpdateActionPerformed

    private void selUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selUserItemStateChanged
        if(!selUser.getSelectedItem().equals("Seleccione Usuario.")){
            filas = sql.getResultSet("select * from Usuarios where Username='"+this.selUser.getSelectedItem()+"';");
            try{
                filas.beforeFirst();
                while(filas.next()){
                    this.strName.setText(filas.getString("Nombre"));
                    this.strLastName.setText(filas.getString("Apellidos"));
                    this.strDni.setText(filas.getString("Dni"));
                    this.strAddress.setText(filas.getString("Direccion"));
                    this.strEmail.setText(filas.getString("Email"));

                    ResultSet registrador = sql.getResultSet("select Username from Usuarios where UserID = " + filas.getString("RegistradoPor"));
                    registrador.beforeFirst();
                    while(registrador.next()){
                        this.lblRegistered.setText("Registrado por: " + registrador.getString("Username"));
                    }
                    
                    if(filas.getInt("Active") == 0){
                        this.chkActiveUser.setSelected(false);
                    }else{
                        this.chkActiveUser.setSelected(true);
                    }

                    if(sql.booleanQuery("select * from Administradores where UserID ="+filas.getString("UserID")+""))
                        this.chkAdmin.setSelected(true);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            this.strName.setText("");
            this.strLastName.setText("");
            this.strDni.setText("");
            this.strAddress.setText("");
            this.strEmail.setText("");
            this.chkAdmin.setSelected(false);
        }
    }//GEN-LAST:event_selUserItemStateChanged

    private void chkAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAdminMousePressed
        int UserID = -1;
        String Username = "";
        if(!this.selUser.getSelectedItem().equals("Seleccione Usuario.")){
            try{
                filas.beforeFirst();
                while(filas.next()){
                    UserID = this.filas.getInt("UserID");
                    Username = this.filas.getString("Username");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(!this.chkAdmin.isSelected()){
                if(sql.executeQuery("insert into Administradores values(null,'"+UserID+"')"))
                    JOptionPane.showMessageDialog(null, "El usuario \""+Username+"\" ahora es Administrador.");
            }else{
                if(sql.executeQuery("delete from Administradores where UserID='"+UserID+"'"))
                    JOptionPane.showMessageDialog(null, "El usuario \""+Username+"\" ha dejado de ser Administrador.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario válido");
            return;
        }
    }//GEN-LAST:event_chkAdminMousePressed

    private void strAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strAddressFocusLost
        if(this.strAddress.getText().length() > 0){
            this.comprobante[3] = true;
            this.lblAddres.setForeground(Color.GREEN);
            this.statusAddres.setVisible(false);
        }else{
            this.comprobante[3] = false;
            this.lblAddres.setForeground(Color.red);
            this.statusAddres.setVisible(true);
        }
}//GEN-LAST:event_strAddressFocusLost

    private void strNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strNameFocusLost
        if(strName.getText().length() < 4 || strName.getText().length() > 20){
            this.comprobante[0] = false;
            this.lblName.setForeground(Color.red);
            this.statusName.setVisible(true);
        }else{
            this.comprobante[0] = true;
            lblName.setForeground(Color.green);
            this.statusName.setVisible(false);
        }
}//GEN-LAST:event_strNameFocusLost

    private void strLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strLastNameFocusLost
        if(strLastName.getText().length() < 4 || strLastName.getText().length() > 60){
            this.comprobante[1] = false;
            this.lblLastName.setForeground(Color.red);
            this.statusLastName.setVisible(true);
        }else{
            this.comprobante[1] = true;
            lblLastName.setForeground(Color.green);
            this.statusLastName.setVisible(false);
        }
}//GEN-LAST:event_strLastNameFocusLost

    private void strDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strDniFocusLost
        if(this.strDni.getText().length() == 9){
            this.comprobante[2] = true;
            this.lblDNI.setForeground(Color.green);
            this.statusDNI.setVisible(false);
        }else{
            this.comprobante[2] = false;
            this.lblDNI.setForeground(Color.red);
            this.statusDNI.setVisible(true);
        }
}//GEN-LAST:event_strDniFocusLost

    private void strDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strDniKeyReleased
        if(evt.getKeyCode() != 8){
            if(this.strDni.getText().length() > 9){
                try {
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_BACK_SPACE);
                    r.keyRelease(KeyEvent.VK_BACK_SPACE);
                } catch (Exception e) {
                    System.out.println("No se pudo hacer la pulsación automática");
                }
                this.comprobante[2] = false;
                this.lblDNI.setForeground(Color.red);
                this.statusDNI.setVisible(true);
            }
            if(!Character.isDigit(evt.getKeyChar())){
                try {
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_BACK_SPACE);
                    r.keyRelease(KeyEvent.VK_BACK_SPACE);
                } catch (Exception e) {
                    System.out.println("No se pudo hacer la pulsación automática");
                }
            }
            if(this.strDni.getText().length() == 8){
                this.strDni.setText(this.strDni.getText() + calculaLetra(this.strDni.getText()));
                this.comprobante[2] = true;
                this.lblDNI.setForeground(Color.green);
                this.statusDNI.setVisible(false);
            }
        }
}//GEN-LAST:event_strDniKeyReleased

    private void strEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strEmailFocusLost
        if(!compruebaCorreo(this.strEmail.getText())){
            this.comprobante[7] = false;
            this.lblMail.setForeground(Color.red);
            this.statusMail.setVisible(true);
        }else{
            this.comprobante[7] = true;
            this.lblMail.setForeground(Color.green);
            this.statusMail.setVisible(false);
        }
}//GEN-LAST:event_strEmailFocusLost

    private void strPassRepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strPassRepFocusLost
        if(!this.strPass.getText().equals(this.strPassRep.getText())){
            this.comprobante[6] = false;
            this.lblPassRep.setForeground(Color.red);
            this.statusPassRep.setVisible(true);
        }else{
            this.comprobante[6] = true;
            this.lblPassRep.setForeground(Color.green);
            this.statusPassRep.setVisible(false);
        }
}//GEN-LAST:event_strPassRepFocusLost

    private void strPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strPassFocusLost
        if(this.strPass.getText().length() < 6){
            this.comprobante[5] = false;
            this.lblPass.setForeground(Color.red);
            this.statusPass.setVisible(true);
        }else{
            this.comprobante[5] = true;
            this.lblPass.setForeground(Color.green);
            this.statusPass.setVisible(false);
        }
}//GEN-LAST:event_strPassFocusLost

    private void chkActiveUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkActiveUserMousePressed
        int UserID = -1;
        String Username = "";
        if(!this.selUser.getSelectedItem().equals("Seleccione Usuario.")){
            try{
                filas.beforeFirst();
                while(filas.next()){
                    UserID = this.filas.getInt("UserID");
                    Username = this.filas.getString("Username");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(!this.chkActiveUser.isSelected()){
                if(sql.executeQuery("update Usuarios set Active = 1 where UserID = '"+UserID+"'"))

                    JOptionPane.showMessageDialog(null, "El usuario \""+Username+"\" ha sido dado nuevamente de alta.");
            }else{
                if(sql.executeQuery("update Usuarios set Active = 0 where UserID = '"+UserID+"'"))
                    JOptionPane.showMessageDialog(null, "El usuario \""+Username+"\" ha sido dado de baja.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario válido");
            if(this.chkActiveUser.isSelected())
                this.chkActiveUser.setSelected(false);
            else
                this.chkActiveUser.setSelected(true);
            return;
        }
    }//GEN-LAST:event_chkActiveUserMousePressed

    public boolean compruebaCorreo(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }
    }
    private char calculaLetra(String cadena)
    {
        int dni = Integer.parseInt(cadena);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo= dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        return letra;
    }

    private void cargaSelUsuarios(){
        filas = sql.getResultSet("select Username from Usuarios;");
        try{
            filas.beforeFirst();
            while(filas.next()){
                selUser.addItem(filas.getString("Username"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private boolean compruebaFormulario(){
        for(int i=0 ; i<comprobante.length ; i++)
            if(!comprobante[i])
                return false;
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkActiveUser;
    private javax.swing.JCheckBox chkAdmin;
    private javax.swing.JPanel errPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAddres;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassRep;
    private javax.swing.JLabel lblRegistered;
    private javax.swing.JComboBox selUser;
    private javax.swing.JLabel statusAddres;
    private javax.swing.JLabel statusDNI;
    private javax.swing.JLabel statusLastName;
    private javax.swing.JLabel statusMail;
    private javax.swing.JLabel statusName;
    private javax.swing.JLabel statusPass;
    private javax.swing.JLabel statusPassRep;
    private javax.swing.JTextField strAddress;
    private javax.swing.JTextField strDni;
    private javax.swing.JTextField strEmail;
    private javax.swing.JTextField strLastName;
    private javax.swing.JTextField strName;
    private javax.swing.JTextField strPass;
    private javax.swing.JTextField strPassRep;
    // End of variables declaration//GEN-END:variables

}
