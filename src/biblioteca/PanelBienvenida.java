package biblioteca;

import java.sql.ResultSet;

public class PanelBienvenida extends javax.swing.JPanel {
    String datosUser[];
    SQL sql = new SQL();

    public PanelBienvenida(String[] datos) {
        datosUser = datos;
        initComponents();
        this.lblSancion.setVisible(false);
        this.rFechaSancion.setVisible(false);
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rNombre = new javax.swing.JLabel();
        rEmail = new javax.swing.JLabel();
        rFecha = new javax.swing.JLabel();
        lblSancion = new javax.swing.JLabel();
        rFechaSancion = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a la Biblioteca Virtual");

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Email: ");

        jLabel5.setText("Miembro desde:");

        lblSancion.setForeground(new java.awt.Color(255, 0, 0));
        lblSancion.setText("Tienes una sanción vigente hasta: ");

        rFechaSancion.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(498, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rFechaSancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSancion, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(605, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rFecha)
                .addGap(18, 18, 18)
                .addComponent(lblSancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rFechaSancion)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatos(){
        //System.out.println("select Nombre, Apellidos, Fecha_Registro from Usuarios where UserID = " + datosUser[0]);
        ResultSet fila = sql.getResultSet("select Nombre, Apellidos, Email, Fecha_Registro from Usuarios where UserID = " + datosUser[0]);
        try{
            fila.beforeFirst();
            while(fila.next()){
                this.rNombre.setText(fila.getString("Nombre") + " " + fila.getString("Apellidos"));
                this.rEmail.setText(fila.getString("Email"));
                this.rFecha.setText(fila.getString("Fecha_Registro"));
            }
            ResultSet filaSancion = sql.getResultSet("select S.WarnID, S.Fecha_Fin from Sanciones S, Prestamos P, Usuarios U "
                + "where U.UserID = P.UserID "
                + "AND P.LoanID = S.LoanID "
                + "AND U.UserID = " + datosUser[0] + " AND S.Fecha_Fin > now()");
            filaSancion.last();
            if(filaSancion.getRow() > 0){
                filaSancion.beforeFirst();
                while(filaSancion.next()){
                    this.rFechaSancion.setText(filaSancion.getString("Fecha_Fin"));
                    this.lblSancion.setVisible(true);
                    this.rFechaSancion.setVisible(true);
                }
            }
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSancion;
    private javax.swing.JLabel rEmail;
    private javax.swing.JLabel rFecha;
    private javax.swing.JLabel rFechaSancion;
    private javax.swing.JLabel rNombre;
    // End of variables declaration//GEN-END:variables

}
