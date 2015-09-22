package biblioteca;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class PanelAltaLibro extends javax.swing.JPanel {
    SQL sql = new SQL();
    FrameMainMenu frame;
    boolean comprobante[] = {false,false,false,false,false,false,true};
    Object idTemas[];

    JFileChooser selArchivos;
    public PanelAltaLibro(FrameMainMenu mframe) {
        frame = mframe;
        initComponents();
        Component comps[] = new Component[this.errPanel.getComponents().length];
        comps = this.errPanel.getComponents();
        for(int i=0 ; i<comps.length ; i++){
            comps[i].setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTemas = new javax.swing.JLabel();
        lblEditor = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        strEditor = new javax.swing.JTextField();
        strAutor = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        strTitle = new javax.swing.JTextField();
        lblPags = new javax.swing.JLabel();
        strPags = new javax.swing.JTextField();
        lblISBN = new javax.swing.JLabel();
        strISBN = new javax.swing.JTextField();
        chkEspecial = new javax.swing.JCheckBox();
        btnTema = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JTable();
        panelPortada = new javax.swing.JPanel();
        jtfRutaEntrada = new javax.swing.JTextField();
        jbExaminar = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnBorrarImagen = new javax.swing.JButton();
        errPanel = new javax.swing.JPanel();
        errTitle = new javax.swing.JLabel();
        errAutor = new javax.swing.JLabel();
        errEditor = new javax.swing.JLabel();
        errTema = new javax.swing.JLabel();
        errISBN = new javax.swing.JLabel();
        errPags = new javax.swing.JLabel();
        errImagen = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        btnAñadir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMenos = new javax.swing.JButton();
        nCopias = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alta Libro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro"));

        lblTemas.setText("Tema/s:");

        lblEditor.setText("Editorial:");

        lblAutor.setText("Autor:");

        strEditor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strEditorFocusLost(evt);
            }
        });

        strAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strAutorFocusLost(evt);
            }
        });

        lblTitle.setText("Título:");

        strTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strTitleFocusLost(evt);
            }
        });

        lblPags.setText("Páginas:");

        strPags.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strPagsFocusLost(evt);
            }
        });

        lblISBN.setText("ISBN:");

        strISBN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strISBNFocusLost(evt);
            }
        });

        chkEspecial.setText("Categoria especial");

        btnTema.setText("Agregar");
        btnTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaActionPerformed(evt);
            }
        });

        listaTemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tema"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaTemas.setColumnSelectionAllowed(true);
        listaTemas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaTemas);
        listaTemas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkEspecial))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTemas)
                            .addComponent(lblEditor)
                            .addComponent(lblAutor)
                            .addComponent(lblTitle)
                            .addComponent(lblPags)
                            .addComponent(lblISBN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(strISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(strPags, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(strEditor)
                                .addComponent(strAutor)
                                .addComponent(strTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTema)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(strAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditor)
                    .addComponent(strEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTemas)
                        .addComponent(btnTema))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPags)
                    .addComponent(strPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(strISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkEspecial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPortada.setBorder(javax.swing.BorderFactory.createTitledBorder("Portada"));

        jtfRutaEntrada.setEditable(false);

        jbExaminar.setText("...");
        jbExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExaminarActionPerformed(evt);
            }
        });

        btnBorrarImagen.setText("Borrar");
        btnBorrarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPortadaLayout = new javax.swing.GroupLayout(panelPortada);
        panelPortada.setLayout(panelPortadaLayout);
        panelPortadaLayout.setHorizontalGroup(
            panelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPortadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(panelPortadaLayout.createSequentialGroup()
                        .addComponent(jtfRutaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExaminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarImagen)))
                .addContainerGap())
        );
        panelPortadaLayout.setVerticalGroup(
            panelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPortadaLayout.createSequentialGroup()
                .addGroup(panelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRutaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExaminar)
                    .addComponent(btnBorrarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        errPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores"));

        errTitle.setForeground(new java.awt.Color(255, 0, 0));
        errTitle.setText("· El Título es no puede estar en blanco.");

        errAutor.setForeground(new java.awt.Color(255, 0, 0));
        errAutor.setText("· El autor no puede estar en blanco.");

        errEditor.setForeground(new java.awt.Color(255, 0, 0));
        errEditor.setText("· La editorial no puede estar en blanco.");

        errTema.setForeground(new java.awt.Color(255, 0, 0));
        errTema.setText("· Elige almenos 1 tema para el libro.");

        errISBN.setForeground(new java.awt.Color(255, 0, 0));
        errISBN.setText("· El ISBN no puede estar en blanco.");

        errPags.setForeground(new java.awt.Color(255, 0, 0));
        errPags.setText("· El número de  páginas no puede estar en blanco.");

        errImagen.setForeground(new java.awt.Color(255, 0, 0));
        errImagen.setText("· La imagen no puede pesar más de 64Kbs");

        javax.swing.GroupLayout errPanelLayout = new javax.swing.GroupLayout(errPanel);
        errPanel.setLayout(errPanelLayout);
        errPanelLayout.setHorizontalGroup(
            errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(errPanelLayout.createSequentialGroup()
                        .addComponent(errTema)
                        .addContainerGap(849, Short.MAX_VALUE))
                    .addGroup(errPanelLayout.createSequentialGroup()
                        .addComponent(errTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                        .addComponent(errImagen)
                        .addGap(84, 84, 84))
                    .addComponent(errAutor)
                    .addComponent(errEditor)
                    .addGroup(errPanelLayout.createSequentialGroup()
                        .addComponent(errPags)
                        .addContainerGap(755, Short.MAX_VALUE))
                    .addGroup(errPanelLayout.createSequentialGroup()
                        .addComponent(errISBN)
                        .addContainerGap(853, Short.MAX_VALUE))))
        );
        errPanelLayout.setVerticalGroup(
            errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errPanelLayout.createSequentialGroup()
                .addGroup(errPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errTitle)
                    .addComponent(errImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errEditor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errPags)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errISBN)
                .addContainerGap())
        );

        jSplitPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jSplitPane1.setTopComponent(btnAñadir);

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(jButton3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Copias"));

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        nCopias.setText("1");

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnMenos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMas)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenos)
                    .addComponent(nCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(panelPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExaminarActionPerformed
        this.selArchivos = new JFileChooser();
        this.selArchivos.setFileFilter(new FiltroArchivos());
        this.selArchivos.setAcceptAllFileFilterUsed(false);
        int returnVal = this.selArchivos.showOpenDialog(new JFrame());
        if(returnVal == this.selArchivos.APPROVE_OPTION){
            File filaImagen = this.selArchivos.getSelectedFile();
            if(filaImagen.length() > 65535){
                comprobante[6] = false;
                this.errImagen.setVisible(true);
                panelPortada.setBorder(new TitledBorder(null, "Portada", 0, 0, null, Color.red));
                this.jtfRutaEntrada.setText(null);
                this.lblImage.setIcon(null);
            }else{
                comprobante[6] = true;
                this.errImagen.setVisible(false);
                panelPortada.setBorder(new TitledBorder(null, "Portada", 0, 0, null, Color.green));
                this.jtfRutaEntrada.setText(filaImagen.toString());
                lblImage.setIcon(new ImageIcon (new ImageIcon(this.jtfRutaEntrada.getText()).getImage().getScaledInstance(300, -1, Image.SCALE_DEFAULT)));
            }
        }
    }//GEN-LAST:event_jbExaminarActionPerformed

    private void strTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strTitleFocusLost
        if(this.strTitle.getText().length() < 1){
            comprobante[0] = false;
            this.lblTitle.setForeground(Color.red);
            this.errTitle.setVisible(true);
        }else{
            comprobante[0] = true;
            this.lblTitle.setForeground(Color.green);
            this.errTitle.setVisible(false);
        }
    }//GEN-LAST:event_strTitleFocusLost

    private void btnBorrarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarImagenActionPerformed
        jtfRutaEntrada.setText("");
        lblImage.setIcon(null);
    }//GEN-LAST:event_btnBorrarImagenActionPerformed

    private void strAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strAutorFocusLost
        if(this.strAutor.getText().length() < 1){
            comprobante[1] = false;
            this.lblAutor.setForeground(Color.red);
            this.errAutor.setVisible(true);
        }else{
            comprobante[1] = true;
            this.lblAutor.setForeground(Color.green);
            this.errAutor.setVisible(false);
        }
    }//GEN-LAST:event_strAutorFocusLost

    private void strEditorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strEditorFocusLost
        if(this.strEditor.getText().length() < 1){
            comprobante[2] = false;
            this.lblEditor.setForeground(Color.red);
            this.errEditor.setVisible(true);
        }else{
            comprobante[2] = true;
            this.lblEditor.setForeground(Color.green);
            this.errEditor.setVisible(false);
        }
    }//GEN-LAST:event_strEditorFocusLost

    private void btnTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaActionPerformed
        FrameSeleccionTema fst = new FrameSeleccionTema(this);
        btnTema.setEnabled(false);
    }//GEN-LAST:event_btnTemaActionPerformed

    private void strPagsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strPagsFocusLost
        if(this.strPags.getText().length() < 1){
            comprobante[4] = false;
            this.lblPags.setForeground(Color.red);
            this.errPags.setVisible(true);
        }else{
            comprobante[4] = true;
            this.lblPags.setForeground(Color.green);
            this.errPags.setVisible(false);
        }
    }//GEN-LAST:event_strPagsFocusLost

    private void strISBNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strISBNFocusLost
        if(this.strISBN.getText().length() < 1){
            comprobante[5] = false;
            this.lblISBN.setForeground(Color.red);
            this.errISBN.setVisible(true);
        }else{
            comprobante[5] = true;
            this.lblISBN.setForeground(Color.green);
            this.errISBN.setVisible(false);
        }
    }//GEN-LAST:event_strISBNFocusLost

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        if(!compruebaFormulario()){
            JOptionPane.showMessageDialog(null, "Hay campos incorrectos.");
        }else{
            if(jtfRutaEntrada.getText().length() > 1){
                sql.executeBinaryQuery("insert into Libros values (null,'"
                        + this.strTitle.getText() +"','"
                        + this.strISBN.getText() +"','"
                        + this.strAutor.getText() +"','"
                        + this.strEditor.getText() +"',"
                        + Integer.parseInt(this.strPags.getText())+","
                        + ((this.chkEspecial.isSelected()) ? 1 : 0)+",?,1)" , this.jtfRutaEntrada.getText());

                int bookID = this.getLastID();

                for(int i=0 ; i<Integer.parseInt(this.nCopias.getText()) ; i++){
                    sql.executeQuery("insert into Copias_Libros values(null,"+bookID+")");
                    ResultSet CopiaID = sql.getResultSet("select Max(CopiaID) 'id' from Copias_Libros");
                    try {
                        CopiaID.beforeFirst();
                        while(CopiaID.next()){
                            imprimir(CopiaID.getInt("id"));
                        }
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
                for(int i=0 ; i<idTemas.length ; i++){
                    sql.executeQuery("insert into Temas_Libros values(null,'"
                            + bookID +"','"
                            + idTemas[i]+"')");
                }
                frame.removeCurrentPanel("PAL");
            }else{
                sql.executeQuery("insert into Libros values (null,'"
                        + this.strTitle.getText() +"','"
                        + this.strISBN.getText() +"','"
                        + this.strAutor.getText() +"','"
                        + this.strEditor.getText() +"',"
                        + Integer.parseInt(this.strPags.getText())+","
                        + ((this.chkEspecial.isSelected()) ? 1 : 0)+",null,1)");
                int bookID = this.getLastID();
                
                for(int i=0 ; i<Integer.parseInt(this.nCopias.getText()) ; i++){
                    sql.executeQuery("insert into Copias_Libros values(null,"+bookID+")");
                    ResultSet CopiaID = sql.getResultSet("select Max(CopiaID) 'id' from Copias_Libros");
                    try {
                        CopiaID.beforeFirst();
                        while(CopiaID.next()){
                            imprimir(CopiaID.getInt("id"));
                        }
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                for(int i=0 ; i<idTemas.length ; i++){
                    sql.executeQuery("insert into Temas_Libros values(null,'"
                            + bookID +"','"
                            + idTemas[i]+"')");
                }
                frame.removeCurrentPanel("PAL");
            }//cierra else
        }//cierra else
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.strTitle.setText("");
        this.strEditor.setText("");
        this.strISBN.setText("");
        this.strPags.setText("");
        this.strAutor.setText("");
        DefaultTableModel modelo = (DefaultTableModel)this.listaTemas.getModel();
        modelo.setRowCount(0);
        for(int i=0 ; i<comprobante.length ; i++){
            comprobante[i] = false;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        this.nCopias.setText(String.valueOf(Integer.parseInt(this.nCopias.getText())+1));
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(Integer.parseInt(this.nCopias.getText()) > 1)
            this.nCopias.setText(String.valueOf(Integer.parseInt(this.nCopias.getText())-1));
    }//GEN-LAST:event_btnMenosActionPerformed

    private int getLastID(){
        ResultSet resultLastID = sql.getResultSet("select max(BookID)'BookID' from Libros");
        int lastID = -1;
        try{
            resultLastID.beforeFirst();
            while(resultLastID.next()){
                 lastID = resultLastID.getInt("BookID");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lastID;
    }

    private boolean compruebaFormulario(){
        for(int i=0 ; i<comprobante.length ; i++){
            if(comprobante[i] == false)
                return false;
        }
        return true;
    }

    private void imprimir(int CopiaID) throws SQLException {
        final Map parameters = new HashMap();
        parameters.put("CopiaID", CopiaID);
        try {
            JasperReport jr = JasperCompileManager.compileReport("ticketLibro.jrxml");
            //JasperReport jr = (JasperReport) JRLoader.loadObject(new File("/home/tote/NetBeansProjects/Biblioteca/ticketUsuario.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters,sql.conexion());
            JasperViewer.viewReport(jp, false);
            //JasperPrintManager.printReport(jp, false);
        } catch (JRException e1) {
            System.out.println(e1.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBorrarImagen;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    public javax.swing.JButton btnTema;
    private javax.swing.JCheckBox chkEspecial;
    private javax.swing.JLabel errAutor;
    private javax.swing.JLabel errEditor;
    private javax.swing.JLabel errISBN;
    private javax.swing.JLabel errImagen;
    private javax.swing.JLabel errPags;
    private javax.swing.JPanel errPanel;
    public javax.swing.JLabel errTema;
    private javax.swing.JLabel errTitle;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JButton jbExaminar;
    public javax.swing.JTextField jtfRutaEntrada;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditor;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPags;
    public javax.swing.JLabel lblTemas;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JTable listaTemas;
    private javax.swing.JTextField nCopias;
    private javax.swing.JPanel panelPortada;
    private javax.swing.JTextField strAutor;
    private javax.swing.JTextField strEditor;
    private javax.swing.JTextField strISBN;
    private javax.swing.JTextField strPags;
    private javax.swing.JTextField strTitle;
    // End of variables declaration//GEN-END:variables

}
