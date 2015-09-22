package biblioteca;

import java.awt.Color;
import java.awt.Component;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



public class PanelAltaUsuario extends javax.swing.JPanel {
    SQL sql = new SQL();
    Encriptado enc = new Encriptado();
    EnviarEmail email = new EnviarEmail();
    String datosUser[];
    boolean comprobante[] = {false,false,false,false,false,false,false,false};

    public PanelAltaUsuario(String[] datos) {
        datosUser = datos;
        initComponents();
        this.setName("PanelAltaUsuario");
        Component comps[] = new Component[this.errPanel.getComponents().length];
        comps = this.errPanel.getComponents();
        for(int i=0 ; i<comps.length ; i++){
            comps[i].setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassRep = new javax.swing.JLabel();
        strEmail = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        strUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAddres = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        strAddress = new javax.swing.JTextField();
        strName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        strLastName = new javax.swing.JTextField();
        chkAdmin = new javax.swing.JCheckBox();
        errPanel = new javax.swing.JPanel();
        statusName = new javax.swing.JLabel();
        statusLastName = new javax.swing.JLabel();
        statusDNI = new javax.swing.JLabel();
        statusAddres = new javax.swing.JLabel();
        statusUser = new javax.swing.JLabel();
        statusPass = new javax.swing.JLabel();
        statusPassRep = new javax.swing.JLabel();
        statusMail = new javax.swing.JLabel();
        statusUser2 = new javax.swing.JLabel();
        strDni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        strPass = new javax.swing.JPasswordField();
        strPassRep = new javax.swing.JPasswordField();

        lblPassRep.setText("Repetir Contraseña:");

        strEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strEmailFocusLost(evt);
            }
        });

        lblMail.setText("Email:");

        strUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strUserFocusLost(evt);
            }
        });

        lblUser.setText("Usuario:");

        lblPass.setText("Contraseña:");

        jLabel5.setText("Datos Personales");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alta Usuario");

        lblAddres.setText("Direccion:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        strAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strAddressFocusLost(evt);
            }
        });

        strName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strNameFocusLost(evt);
            }
        });

        lblLastName.setText("Apellidos:");

        lblName.setText("Nombre:");

        lblDNI.setText("DNI:");

        strLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strLastNameFocusLost(evt);
            }
        });

        chkAdmin.setText("Administrador");

        errPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores:"));

        statusName.setForeground(new java.awt.Color(255, 0, 0));
        statusName.setText("· El nombre debe tener entre 4 y 20 carácteres.");

        statusLastName.setForeground(new java.awt.Color(255, 0, 0));
        statusLastName.setText("· Los apellidos deben tener entre 4 y 60 carácteres,");

        statusDNI.setForeground(new java.awt.Color(255, 0, 0));
        statusDNI.setText("· El DNI debe contener 8 números y 1 letra.");

        statusAddres.setForeground(new java.awt.Color(255, 0, 0));
        statusAddres.setText("· La dirección no puede estar vacía.");

        statusUser.setForeground(new java.awt.Color(255, 0, 0));
        statusUser.setText("· El nombre de Usuario debe tener mas de 4 carácteres.");

        statusPass.setForeground(new java.awt.Color(255, 0, 0));
        statusPass.setText("· La contraseña debe tener 6 carácteres.");

        statusPassRep.setForeground(new java.awt.Color(255, 0, 0));
        statusPassRep.setText("· Las contraseñas no coinciden.");

        statusMail.setForeground(new java.awt.Color(255, 0, 0));
        statusMail.setText("· Email inválido.");

        statusUser2.setForeground(new java.awt.Color(255, 0, 0));
        statusUser2.setText("· El nombre de Usuario ya existe.");

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
                    .addComponent(statusMail)
                    .addComponent(statusUser)
                    .addComponent(statusPassRep)
                    .addComponent(statusPass)
                    .addComponent(statusUser2))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        errPanelLayout.setVerticalGroup(
            errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errPanelLayout.createSequentialGroup()
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusName)
                    .addComponent(statusUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLastName)
                    .addComponent(statusUser2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusDNI)
                    .addComponent(statusPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusAddres)
                    .addComponent(statusPassRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusMail)
                .addContainerGap(64, Short.MAX_VALUE))
        );

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

        jLabel11.setText("Datos Usuario:");

        strPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strPassFocusLost(evt);
            }
        });

        strPassRep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strPassRepFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(btnRegistrar)
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLastName)
                        .addComponent(lblAddres)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblDNI))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(strDni, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(strLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(strName, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(strAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPass)
                    .addComponent(lblUser)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMail)
                        .addGap(15, 15, 15))
                    .addComponent(lblPassRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAdmin)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(strPassRep, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strPass)
                        .addComponent(strEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(strLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI)
                            .addComponent(lblPassRep)
                            .addComponent(strDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strPassRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(strUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPass)
                            .addComponent(strPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddres)
                    .addComponent(strAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addGap(12, 12, 12)
                .addComponent(chkAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        System.out.println("insert into Usuarios values(null,"
                + "'" + this.strUser.getText() + "',"
                + "'" + enc.getStringMessageDigest(this.strPass.getText(), "SHA-1") + "',"
                + "'" + this.strName.getText() +"',"
                + "'" + this.strLastName.getText() +"',"
                + "'" + this.strDni.getText() + "',"
                + "'" + this.strAddress.getText() +"',"
                + "'" + this.strEmail.getText() +"',"
                + "null,1,0,"+datosUser[0]+");");
        if(todoOk(this.comprobante)){
            if(sql.executeQuery("insert into Usuarios values(null,"
                + "'" + this.strUser.getText() + "',"
                + "'" + enc.getStringMessageDigest(this.strPass.getText(), "SHA-1") + "',"
                + "'" + this.strName.getText() +"',"
                + "'" + this.strLastName.getText() +"',"
                + "'" + this.strDni.getText() + "',"
                + "'" + this.strAddress.getText() +"',"
                + "'" + this.strEmail.getText() +"',"
                + "null,1,0,"+datosUser[0]+");")){

                if(this.chkAdmin.isSelected()){
                int UserID = 0;
                ResultSet filas = sql.getResultSet("select UserID from Usuarios where Username = '"
                    + this.strUser.getText() +"'");
                try{
                    filas.beforeFirst();
                    while(filas.next()){
                        UserID = filas.getInt("UserID");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                    sql.executeQuery("insert into Administradores values(null,"+UserID+");");
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario registrado satisfactoriamente.");
            String mensaje = "\t Estimado Sr/Sra: " + this.strName.getText() + " " + this.strLastName.getText() + "\n";
            mensaje += "Le informamos de que su cuenta en la Biblioteca Virtual ha sido correctamente registrada. Para acceder son: \n";
            mensaje += "Username: " + this.strName.getText() + "\n";
            mensaje += "Password: " + this.strPass.getText() + "\n";
            mensaje += "\n\n\n Esperamos que disfrute de nuestro servicio.";
            if(!email.EnviadorMail(this.strEmail.getText(), "Bienvenido a la Biblioteca Virtual", mensaje))
                JOptionPane.showMessageDialog(null, "Ha habido un problema al mandar el correo electrónico.");
            int UserID = 0;
                ResultSet filas = sql.getResultSet("select UserID from Usuarios where Username = '"
                    + this.strUser.getText() +"'");
                try{
                    filas.beforeFirst();
                    while(filas.next()){
                        UserID = filas.getInt("UserID");
                        imprimir(UserID);
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }else{
            JOptionPane.showMessageDialog(null, "Hay campos incorrectos");
        }
}//GEN-LAST:event_btnRegistrarActionPerformed

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

    private void strAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strAddressFocusLost
        if(this.strAddress.getText().length() > 0 && this.strAddress.getText().length() <= 100 ){
            this.comprobante[3] = true;
            this.lblAddres.setForeground(Color.GREEN);
            this.statusAddres.setVisible(false);
        }else{
            this.comprobante[3] = false;
            this.lblAddres.setForeground(Color.red);
            this.statusAddres.setVisible(true);
        }
    }//GEN-LAST:event_strAddressFocusLost

    private void strUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strUserFocusLost
        if(this.strUser.getText().length() < 4 || this.strUser.getText().length() > 15){
            this.comprobante[4] = false;
            this.lblUser.setForeground(Color.red);
            this.statusUser.setVisible(true);
        }else{
            this.comprobante[4] = true;
            this.lblUser.setForeground(Color.GREEN);
            this.statusUser.setVisible(false);
        }

        if(!sql.booleanQuery("select Username from Usuarios where Username = '" + this.strUser.getText() + "'")){
            this.comprobante[4] = true;
            //this.lblUser.setForeground(Color.GREEN);
            this.statusUser2.setVisible(false);
        }else{
            this.comprobante[4] = false;
            this.lblUser.setForeground(Color.red);
            this.statusUser2.setVisible(true);
        }      
    }//GEN-LAST:event_strUserFocusLost

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

    private boolean todoOk(boolean[] comprobante){
        for(int i=0 ; i<comprobante.length ; i++){
            if(comprobante[i] == false)
                return false;
        }
        return true;
    }

    private char calculaLetra(String cadena){
        int dni = Integer.parseInt(cadena);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo= dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        return letra;
    }

    private void imprimir(int UserID) throws SQLException {
        final Map parameters = new HashMap();
        parameters.put("UserID", UserID);
        try {
            //JasperReport jr = JasperCompileManager.compileReport("/home/tote/NetBeansProjects/Biblioteca/ticketUsuario.jrxml");
            JasperReport jr = (JasperReport) JRLoader.loadObject(new File("ticketUsuario.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters,sql.conexion());
            JasperViewer.viewReport(jp, false);
            //JasperPrintManager.printReport(jp, false);
        } catch (JRException e1) {
            System.out.println(e1.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
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
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel statusAddres;
    private javax.swing.JLabel statusDNI;
    private javax.swing.JLabel statusLastName;
    private javax.swing.JLabel statusMail;
    private javax.swing.JLabel statusName;
    private javax.swing.JLabel statusPass;
    private javax.swing.JLabel statusPassRep;
    private javax.swing.JLabel statusUser;
    private javax.swing.JLabel statusUser2;
    private javax.swing.JTextField strAddress;
    private javax.swing.JTextField strDni;
    private javax.swing.JTextField strEmail;
    private javax.swing.JTextField strLastName;
    private javax.swing.JTextField strName;
    private javax.swing.JPasswordField strPass;
    private javax.swing.JPasswordField strPassRep;
    private javax.swing.JTextField strUser;
    // End of variables declaration//GEN-END:variables

}
