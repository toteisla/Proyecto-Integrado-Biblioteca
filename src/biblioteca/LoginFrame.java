package biblioteca;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;

public class LoginFrame extends javax.swing.JFrame {
    Login login = new Login();
    Encriptado enc = new Encriptado();
    SQL sql = new SQL();
    PanelFondoLogin panelConfondo = new PanelFondoLogin();
    FrameMainMenu mainMenu;
    String datosUser[] = new String[2];
    /** Creates new form Frame */
    public LoginFrame() {
        initComponents();
        this.strPass.setText("855858");
        this.strUser.setText("toteisla");
        this.setLocationRelativeTo(null);
        this.add(panelConfondo,BorderLayout.CENTER);
        jPanel1.setOpaque(false);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/libros3.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        strUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statusLogin = new javax.swing.JLabel();
        strPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso a Biblioteca Virtual");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        strUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strUserFocusLost(evt);
            }
        });
        strUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                strUserKeyPressed(evt);
            }
        });

        jLabel3.setText("Bienvenido a ");

        jLabel4.setText("La Biblioteca Virtual");

        statusLogin.setText("Introduzca sus datos.");

        strPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                strPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(strPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addComponent(statusLogin))
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(strPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4)
                    .addGap(170, 170, 170)
                    .addComponent(statusLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strUserKeyPressed
        if(evt.getKeyCode() == 10){
            if(login.compruebaLogin(strUser.getText(), enc.getStringMessageDigest(strPass.getText(),"SHA-1"), this)){
                statusLogin.setText("Login correcto.");
                permitirAcceso();
            }
            else
                statusLogin.setText("Login incorrecto.");
        }
    }//GEN-LAST:event_strUserKeyPressed

    private void strUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strUserFocusLost
        if(!login.compruebaTamaño(strUser.getText()))
            statusLogin.setText("Usuario demasiado corto.");
}//GEN-LAST:event_strUserFocusLost

    private void strPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strPassKeyPressed
        if(evt.getKeyCode() == 10){
            if(!login.compruebaTamaño(strUser.getText())){
                statusLogin.setText("Usuario demasiado corto.");
                return;
            }
            if(!login.compruebaTamaño(strPass.getText())){
                statusLogin.setText("Contraseña demasiado corta.");
                return;
            }
            if(login.compruebaLogin(strUser.getText(), enc.getStringMessageDigest(strPass.getText(),"SHA-1"), this)){
                statusLogin.setText("Login correcto.");
                permitirAcceso();
            } else
                statusLogin.setText("Login incorrecto.");
        }
    }//GEN-LAST:event_strPassKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    private void permitirAcceso(){
        panelConfondo.setVisible(false);
        Component[] compPanelFondo = panelConfondo.getComponents();
        for(int i=0 ; i<compPanelFondo.length ; i++){
            this.remove(compPanelFondo[i]);
        }
        this.remove(jPanel1);
        this.setVisible(false);
        this.remove(this);
        sql.executeQuery("update Usuarios set bolLogged = 1 where UserID = " + datosUser[0]);
        mainMenu = new FrameMainMenu(datosUser);
        mainMenu.compruebaAdmin();
        mainMenu.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel statusLogin;
    private javax.swing.JPasswordField strPass;
    private javax.swing.JTextField strUser;
    // End of variables declaration//GEN-END:variables

}
