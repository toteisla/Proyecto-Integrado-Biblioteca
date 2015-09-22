package biblioteca;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelBuscaLibro extends javax.swing.JPanel {

    SQL sql = new SQL();
    boolean selTemaAbierto = false;
    boolean cederLibroAbierto = false;
    boolean reservarLibroAbierto = false;
    String datosUser[];
    Object idTemas[] = new Object[5];
    public PanelBuscaLibro(String[] datos) {
        datosUser = datos;
        initComponents();
        compruebaAdmin();
        cargaTabla();
        Prestar.setText("Ceder");
        Reservar.setText("Reservar");
        Añadir.setText("Añadir");
        Quitar.setText("Quitar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuAccionesLibro = new javax.swing.JPopupMenu();
        Prestar = new javax.swing.JMenuItem();
        Reservar = new javax.swing.JMenuItem();
        rdGrupo = new javax.swing.ButtonGroup();
        pMenuAccionesTema = new javax.swing.JPopupMenu();
        Añadir = new javax.swing.JMenuItem();
        Quitar = new javax.swing.JMenuItem();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JTable();
        rdExclusivo = new javax.swing.JRadioButton();
        rdSuperpuesto = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();

        Prestar.setText("jMenuItem1");
        Prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarActionPerformed(evt);
            }
        });
        pMenuAccionesLibro.add(Prestar);

        Reservar.setText("jMenuItem2");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        pMenuAccionesLibro.add(Reservar);

        Añadir.setText("jMenuItem1");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        pMenuAccionesTema.add(Añadir);

        Quitar.setText("jMenuItem2");
        Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarActionPerformed(evt);
            }
        });
        pMenuAccionesTema.add(Quitar);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro"));

        lblTemas.setText("Tema/s:");

        lblEditor.setText("Editorial:");

        lblAutor.setText("Autor:");

        strEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strEditorKeyReleased(evt);
            }
        });

        strAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strAutorKeyReleased(evt);
            }
        });

        lblTitle.setText("Título:");

        strTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strTitleKeyReleased(evt);
            }
        });

        lblPags.setText("Páginas:");

        strPags.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strPagsKeyReleased(evt);
            }
        });

        lblISBN.setText("ISBN:");

        strISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                strISBNKeyReleased(evt);
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
        listaTemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaTemasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaTemas);
        listaTemas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        rdGrupo.add(rdExclusivo);
        rdExclusivo.setSelected(true);
        rdExclusivo.setText("Exclusivo");
        rdExclusivo.setToolTipText("Muestra los libros que contienen información todos los temas seleccionados.");
        rdExclusivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdExclusivoActionPerformed(evt);
            }
        });

        rdGrupo.add(rdSuperpuesto);
        rdSuperpuesto.setText("Superpuesto");
        rdSuperpuesto.setToolTipText("Muestra todos los libros de todos los temas seleccionados.");
        rdSuperpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSuperpuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTemas)
                        .addComponent(lblEditor)
                        .addComponent(lblAutor)
                        .addComponent(lblTitle)
                        .addComponent(lblPags)
                        .addComponent(lblISBN)
                        .addComponent(rdSuperpuesto))
                    .addComponent(rdExclusivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(strISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(strPags, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(strEditor)
                        .addComponent(strAutor)
                        .addComponent(strTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTemas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdExclusivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdSuperpuesto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPags)
                    .addComponent(strPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(strISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Libros"));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Título", "Autor", "Editorial", "Páginas", "ISBN", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLibros);
        tablaLibros.getColumnModel().getColumn(0).setMinWidth(0);
        tablaLibros.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaLibros.getColumnModel().getColumn(0).setMaxWidth(0);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void strTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strTitleKeyReleased
        if(this.strTitle.getText().length() > 0)
            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_strTitleKeyReleased

    private void strAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strAutorKeyReleased
        if(this.strAutor.getText().length() > 0)
            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_strAutorKeyReleased

    private void strEditorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strEditorKeyReleased
        if(this.strEditor.getText().length() > 0)
            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_strEditorKeyReleased

    private void strPagsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strPagsKeyReleased
        if(this.strPags.getText().length() > 0)
            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_strPagsKeyReleased

    private void strISBNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strISBNKeyReleased
        if(this.strISBN.getText().length() > 0)
            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_strISBNKeyReleased

    private void listaTemasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTemasMouseReleased
        if(!selTemaAbierto){
            pMenuAccionesTema.show(this, evt.getX()+155, evt.getY()+80);
        }
    }//GEN-LAST:event_listaTemasMouseReleased

    private void tablaLibrosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseReleased
        int row = tablaLibros.rowAtPoint( evt.getPoint() );
        int column = tablaLibros.columnAtPoint( evt.getPoint() );

        if (tablaLibros.isRowSelected(row)){
            if(tablaLibros.getValueAt(row, 6).equals("Prestado") || tablaLibros.getValueAt(row, 6).equals("Reservado"))
                this.Prestar.setEnabled(false);
            else
                this.Prestar.setEnabled(true);

            if(!sql.booleanQuery("select WarnID from Sanciones S, Prestamos P, Usuarios U "
                + "where U.UserID = P.UserID "
                + "AND P.LoanID = S.LoanID "
                + "AND U.UserID = " + datosUser[0] + " AND S.Fecha_Fin > now()")){
                this.Reservar.setEnabled(true);
            }else{
                this.Reservar.setEnabled(false);
            }
        }
            pMenuAccionesLibro.show(this, evt.getX()+408, evt.getY()+5);
    }//GEN-LAST:event_tablaLibrosMouseReleased

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if(this.listaTemas.getSelectedRow() >= 0){
            FrameSeleccionBuscaTema fsbt = new FrameSeleccionBuscaTema(this,this.listaTemas.getSelectedRow());
            this.selTemaAbierto = true;
        }
    }//GEN-LAST:event_AñadirActionPerformed

    private void QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.listaTemas.getModel();
        idTemas[this.listaTemas.getSelectedRow()] = "-1";
        modelo.setValueAt(" ", this.listaTemas.getSelectedRow(), this.listaTemas.getSelectedColumn());
        construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_QuitarActionPerformed

    private void PrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarActionPerformed
        if(!cederLibroAbierto){
            JFrameCederLibro fcl = new JFrameCederLibro((Integer)this.tablaLibros.getValueAt(this.tablaLibros.getSelectedRow(), 0), this);
            cederLibroAbierto = true;
        }
    }//GEN-LAST:event_PrestarActionPerformed

    private void rdSuperpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSuperpuestoActionPerformed
        construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_rdSuperpuestoActionPerformed

    private void rdExclusivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdExclusivoActionPerformed
        construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                    (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                    (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                    (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                    (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
    }//GEN-LAST:event_rdExclusivoActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        int result;
        ResultSet maxFecha = sql.getResultSet("select ifnull(max(Fecha_Fin)+interval 1 day,now()) 'fecha' from Reservas R, Copias_Libros CL "
                + "where R.CopiaID = CL.CopiaID AND R.CopiaID = " + this.tablaLibros.getValueAt(this.tablaLibros.getSelectedRow(), 0));

        try {
            maxFecha.last();
            if(maxFecha.getRow() > 0){
                maxFecha.beforeFirst();
                if(maxFecha.next()){
                    result = JOptionPane.showConfirmDialog(null, "¿Desea reservar este libro para el dia: " + maxFecha.getString("fecha") + "?");
                    if(result == 0){
                        if(sql.executeQuery("insert into Reservas values(null,"+datosUser[0]+","
                                + this.tablaLibros.getValueAt(this.tablaLibros.getSelectedRow(), 0)+",'"+maxFecha.getString("fecha")+"','"+ maxFecha.getString("fecha") +"' + interval 15 day)")){
                            JOptionPane.showMessageDialog(null, "Reserva realizada con éxito.");
                            construirConsulta((this.strTitle.getText().length() > 0) ? this.strTitle.getText() : "",
                                (this.strAutor.getText().length() > 0) ? this.strAutor.getText() : "",
                                (this.strEditor.getText().length() > 0) ? this.strEditor.getText() : "",
                                (this.strPags.getText().length() > 0) ? Integer.parseInt(this.strPags.getText()) : 0,
                                (this.strISBN.getText().length() > 0) ? this.strISBN.getText() : "");
                        }
                    }
                }              
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ReservarActionPerformed


    public void construirConsulta(String tit, String aut, String edi, int pag, String isbn){
        int nTemas = 0;
        String andTemasIn = "AND T.Tema in(";
        String temas ="";
        if(rdSuperpuesto.isSelected()){
            for(int i=0 ; i<5 ; i++){
               if(!listaTemas.getValueAt(i, 0).equals("") && !listaTemas.getValueAt(i, 0).equals(" ")){
                   temas += "'"+listaTemas.getValueAt(i, 0).toString() + "',";
                   nTemas++;
               }
            }
            if(temas.length() > 0)
                temas = temas.substring(0,temas.length()-1);
        }else if(rdExclusivo.isSelected()){   
            temas += "AND (";
            for(int i=0 ; i<5 ; i++){
               if(!listaTemas.getValueAt(i, 0).equals("") && !listaTemas.getValueAt(i, 0).equals(" ")){
                   temas += "T.Tema = '"+listaTemas.getValueAt(i, 0).toString() + "' OR ";
                   nTemas++;
               }
            }
            if(temas.substring(0,temas.length()).equals("AND (")){
                temas = temas.substring(0, temas.length()-5);
            }else{
                temas = temas.substring(0, temas.length()-3);
                temas += ") ";
            }
            
        }

        String cadena = "select CL.CopiaID, Titulo, Autor, Editorial, Paginas, ISBN from Libros L ";
        cadena += "inner join Copias_Libros CL on CL.BookID = L.BookID ";
        cadena += (!temas.equals("") ? "inner join Temas_Libros LT on LT.BookID = L.BookID " : "");
        cadena += (!temas.equals("") ? "inner join Temas T on T.TemaID = LT.TemaID " : "");
        cadena += (!temas.equals("") && rdSuperpuesto.isSelected() ? andTemasIn + temas + ")" : "");
        cadena += (!temas.equals("") && rdExclusivo.isSelected() ? temas : "");
        cadena += "where L.Especial=0 AND "
            + ((!tit.equals("")) ? "Titulo LIKE '%"+tit+"%' AND " : "")
            + ((!aut.equals("")) ? "Autor LIKE '%"+aut+"%' AND " : "")
            + ((!edi.equals("")) ? "Editorial LIKE '%"+edi+"%' AND " : "")
            + ((!String.valueOf(pag).equals("") && pag > 0 && String.valueOf(pag) != null) ? "Paginas BETWEEN(" + (pag-100) + ") and (" + (pag+100) +") AND " : "")
            + ((!isbn.equals("")) ? "ISBN LIKE '%"+isbn+"%' AND " : "");
        if(cadena.substring(cadena.indexOf("where")).length() > 6)
            cadena = cadena.substring(0,cadena.length()-4) + " ";
        else
            cadena = cadena.substring(0,cadena.length()-6) + " ";
        
        cadena += (!temas.equals("") && !temas.equals(" ") && rdExclusivo.isSelected() ? "group by CL.CopiaID " : " ");
        cadena += (!temas.equals("") && !temas.equals(" ") && rdExclusivo.isSelected() ? "having count(CL.CopiaID) = " + nTemas : " ");
        System.out.println(temas);
        System.out.println(cadena);

        ResultSet resultado = sql.getResultSet(cadena);
        this.mostrarResultado(resultado);
    }

    private void mostrarResultado(ResultSet resultado){
        DefaultTableModel modelo = (DefaultTableModel) this.tablaLibros.getModel();
        Date hoy = new Date();
        modelo.setRowCount(0);
        Object fila[] = new Object[7];
        try{
            resultado.beforeFirst();
            while(resultado.next()){
                int CopiaID = resultado.getInt("CopiaID");
                ResultSet filaPrestado = sql.getResultSet("select LoanID, Fecha_Tope from Prestamos P, Libros L, Copias_Libros CL "
                        + "where CL.CopiaID = P.CopiaID AND L.BookID = CL.BookID AND P.CopiaID = "+CopiaID);

                ResultSet filaReservado = sql.getResultSet("select ReserveID, Fecha_Fin from Reservas R, Libros L, Copias_Libros CL "
                        + "where CL.CopiaID = R.CopiaID AND L.BookID = CL.BookID AND R.CopiaID = "+CopiaID);

                fila[6] = "Disponible";
                filaPrestado.beforeFirst();

                filaReservado.beforeFirst();
                while(filaReservado.next()){
                    if(filaReservado.getDate("Fecha_Fin").getTime() >= hoy.getTime())
                        fila[6] = "Reservado";
                }
                while(filaPrestado.next()){
                    if(filaPrestado.getDate("Fecha_Tope").getTime() >= hoy.getTime())
                        fila[6] = "Prestado";
                }
                fila[0] = resultado.getInt("CopiaID");
                fila[1] = resultado.getString("Titulo");
                fila[2] = resultado.getString("Autor");
                fila[3] = resultado.getString("Editorial");
                fila[4] = resultado.getString("Paginas");
                fila[5] = resultado.getString("ISBN");
                modelo.addRow(fila);      
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void cargaTabla(){
        DefaultTableModel modelo = (DefaultTableModel) this.listaTemas.getModel();
        for(int i=0 ; i<5 ; i++){
            modelo.setValueAt(" ", i, 0);
        }
    }

    private void compruebaAdmin(){
        if(!sql.booleanQuery("select * from Administradores where UserID = '" + this.datosUser[0] + "'")){
            this.Prestar.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Añadir;
    public javax.swing.JMenuItem Prestar;
    private javax.swing.JMenuItem Quitar;
    private javax.swing.JMenuItem Reservar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditor;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblPags;
    public javax.swing.JLabel lblTemas;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JTable listaTemas;
    private javax.swing.JPopupMenu pMenuAccionesLibro;
    private javax.swing.JPopupMenu pMenuAccionesTema;
    private javax.swing.JRadioButton rdExclusivo;
    private javax.swing.ButtonGroup rdGrupo;
    private javax.swing.JRadioButton rdSuperpuesto;
    public javax.swing.JTextField strAutor;
    public javax.swing.JTextField strEditor;
    public javax.swing.JTextField strISBN;
    public javax.swing.JTextField strPags;
    public javax.swing.JTextField strTitle;
    private javax.swing.JTable tablaLibros;
    // End of variables declaration//GEN-END:variables

}
