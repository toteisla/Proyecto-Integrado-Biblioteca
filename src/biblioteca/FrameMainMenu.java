package biblioteca;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;

public class FrameMainMenu extends javax.swing.JFrame {
    private final int ANCHO = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int ALTO = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    SQL sql = new SQL();
    String datosUser[];
    PanelBienvenida pb;

    public FrameMainMenu(String[] datos) {
        datosUser = datos;
        initComponents();
        jLayeredPane1.setLayout(new BorderLayout());
        pb = new PanelBienvenida(datosUser);
        jLayeredPane1.add(pb,"Center");
        jLayeredPane1.setLayer(pb, 0);
        //jLayeredPane1.add(pbu);
        this.setTitle("Biblioteca Virtual");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setName("FrameMainMenu");
        //this.setSize(ANCHO,ALTO);
        this.setVisible(false);
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/libros3.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuGoInicio = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuBuscarLibro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuLogout = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuMisPrestamos = new javax.swing.JMenuItem();
        menuMisReservas = new javax.swing.JMenuItem();
        menuMisSanciones = new javax.swing.JMenuItem();
        menuAdministracion = new javax.swing.JMenu();
        MenuAltaUsuario = new javax.swing.JMenuItem();
        MenuEdicionUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuAltaLibro = new javax.swing.JMenuItem();
        menuBajaLibro = new javax.swing.JMenuItem();
        menuEdicionLibro = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuLibrosPrestados = new javax.swing.JMenuItem();
        MenuInformeSanciones = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAyudaI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuInicio.setText("Inicio");
        menuInicio.add(jSeparator3);

        menuGoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        menuGoInicio.setText("Ir al Inicio");
        menuGoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuGoInicioMouseReleased(evt);
            }
        });
        menuInicio.add(menuGoInicio);
        menuInicio.add(jSeparator4);

        menuBuscarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarLibro.png"))); // NOI18N
        menuBuscarLibro.setText("Buscar Libro");
        menuBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuBuscarLibroMouseReleased(evt);
            }
        });
        menuInicio.add(menuBuscarLibro);
        menuInicio.add(jSeparator2);

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        menuLogout.setText("Desconectar");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuLogoutMouseReleased(evt);
            }
        });
        menuInicio.add(menuLogout);

        jMenuBar1.add(menuInicio);

        menuConsultas.setText("Consultas");

        menuMisPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamos.png"))); // NOI18N
        menuMisPrestamos.setText("Mis Préstamos");
        menuConsultas.add(menuMisPrestamos);

        menuMisReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservas.png"))); // NOI18N
        menuMisReservas.setText("Mis Reservas");
        menuConsultas.add(menuMisReservas);

        menuMisSanciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sanciones.png"))); // NOI18N
        menuMisSanciones.setText("Mis Sanciones");
        menuConsultas.add(menuMisSanciones);

        jMenuBar1.add(menuConsultas);

        menuAdministracion.setText("Administracion");

        MenuAltaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addUser.png"))); // NOI18N
        MenuAltaUsuario.setText("Alta Usuario");
        MenuAltaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuAltaUsuarioMouseReleased(evt);
            }
        });
        menuAdministracion.add(MenuAltaUsuario);

        MenuEdicionUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modUser.png"))); // NOI18N
        MenuEdicionUsuario.setText("Modificar Usuario");
        MenuEdicionUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuEdicionUsuarioMouseReleased(evt);
            }
        });
        menuAdministracion.add(MenuEdicionUsuario);
        menuAdministracion.add(jSeparator1);

        MenuAltaLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addBook2.png"))); // NOI18N
        MenuAltaLibro.setText("Alta Libro");
        MenuAltaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuAltaLibroMouseReleased(evt);
            }
        });
        menuAdministracion.add(MenuAltaLibro);

        menuBajaLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dropBook.png"))); // NOI18N
        menuBajaLibro.setText("Baja Libro");
        menuBajaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuBajaLibroMouseReleased(evt);
            }
        });
        menuAdministracion.add(menuBajaLibro);

        menuEdicionLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modBook.png"))); // NOI18N
        menuEdicionLibro.setText("Modificar Libro");
        menuAdministracion.add(menuEdicionLibro);
        menuAdministracion.add(jSeparator5);

        menuLibrosPrestados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamos.png"))); // NOI18N
        menuLibrosPrestados.setText("Informes Préstamos");
        menuLibrosPrestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuLibrosPrestadosMouseReleased(evt);
            }
        });
        menuAdministracion.add(menuLibrosPrestados);

        MenuInformeSanciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sanciones.png"))); // NOI18N
        MenuInformeSanciones.setText("Informes Sanciones");
        MenuInformeSanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuInformeSancionesMouseReleased(evt);
            }
        });
        menuAdministracion.add(MenuInformeSanciones);

        jMenuBar1.add(menuAdministracion);

        menuAyuda.setText("Ayuda");

        menuAyudaI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        menuAyudaI.setText("About...");
        menuAyuda.add(menuAyudaI);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuEdicionUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEdicionUsuarioMouseReleased
        removeCurrentPanel("PEU");
    }//GEN-LAST:event_MenuEdicionUsuarioMouseReleased

    private void MenuAltaUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAltaUsuarioMouseReleased
        removeCurrentPanel("PAU");
}//GEN-LAST:event_MenuAltaUsuarioMouseReleased

    private void MenuAltaLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAltaLibroMouseReleased
        removeCurrentPanel("PAL");
    }//GEN-LAST:event_MenuAltaLibroMouseReleased

    private void menuGoInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGoInicioMouseReleased
        removeCurrentPanel("PB");
    }//GEN-LAST:event_menuGoInicioMouseReleased

    private void menuBuscarLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBuscarLibroMouseReleased
        removeCurrentPanel("PBL");
    }//GEN-LAST:event_menuBuscarLibroMouseReleased

    private void menuLibrosPrestadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLibrosPrestadosMouseReleased
        removeCurrentPanel("PIL");
    }//GEN-LAST:event_menuLibrosPrestadosMouseReleased

    private void menuLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseReleased
        LoginFrame lm = new LoginFrame();
        sql.executeQuery("update Usuarios set bolLogged = 0 where UserID = " + datosUser[0]);
        this.dispose();
    }//GEN-LAST:event_menuLogoutMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sql.executeQuery("update Usuarios set bolLogged = 0 where UserID = " + datosUser[0]);
    }//GEN-LAST:event_formWindowClosing

    private void MenuInformeSancionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInformeSancionesMouseReleased
        removeCurrentPanel("PIS");
    }//GEN-LAST:event_MenuInformeSancionesMouseReleased

    private void menuBajaLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBajaLibroMouseReleased
        removeCurrentPanel("PBOL");
    }//GEN-LAST:event_menuBajaLibroMouseReleased

    public void removeCurrentPanel(String panel){
        Component comp[] = new Component[jLayeredPane1.getComponentsInLayer(0).length];
        comp = jLayeredPane1.getComponentsInLayer(0);
        for(int i=0 ; i<comp.length ; i++){
            jLayeredPane1.remove(comp[i]);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PAU")){
            PanelAltaUsuario pau = new PanelAltaUsuario(datosUser);
            jLayeredPane1.add(pau,"Center");
            jLayeredPane1.setLayer(pau, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PEU")){
            PanelEdicionUsuario peu = new PanelEdicionUsuario();
            jLayeredPane1.add(peu,"Center");
            jLayeredPane1.setLayer(peu, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PAL")){
            PanelAltaLibro pal = new PanelAltaLibro(this);
            jLayeredPane1.add(pal,"Center");
            jLayeredPane1.setLayer(pal, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PB")){
            jLayeredPane1.add(pb,"Center");
            jLayeredPane1.setLayer(pb, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PBL")){
            PanelBuscaLibro pbl = new PanelBuscaLibro(datosUser);
            jLayeredPane1.add(pbl,"Center");
            jLayeredPane1.setLayer(pbl, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PBOL")){
            PanelBorrarLibro pbol = new PanelBorrarLibro();
            jLayeredPane1.add(pbol,"Center");
            jLayeredPane1.setLayer(pbol, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PIL")){
            PanelInformesPrestamos pil = new PanelInformesPrestamos();
            jLayeredPane1.add(pil,"Center");
            jLayeredPane1.setLayer(pil, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
        if(panel.equals("PIS")){
            PanelInformesSanciones pis = new PanelInformesSanciones();
            jLayeredPane1.add(pis,"Center");
            jLayeredPane1.setLayer(pis, 0);
            jLayeredPane1.repaint();
            jLayeredPane1.revalidate();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public void compruebaAdmin(){
        if(!sql.booleanQuery("select * from Administradores where UserID = '" + this.datosUser[0] + "'")){
            this.menuAdministracion.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAltaLibro;
    private javax.swing.JMenuItem MenuAltaUsuario;
    private javax.swing.JMenuItem MenuEdicionUsuario;
    private javax.swing.JMenuItem MenuInformeSanciones;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuAyudaI;
    private javax.swing.JMenuItem menuBajaLibro;
    private javax.swing.JMenuItem menuBuscarLibro;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuEdicionLibro;
    private javax.swing.JMenuItem menuGoInicio;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuLibrosPrestados;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuMisPrestamos;
    private javax.swing.JMenuItem menuMisReservas;
    private javax.swing.JMenuItem menuMisSanciones;
    // End of variables declaration//GEN-END:variables

}
