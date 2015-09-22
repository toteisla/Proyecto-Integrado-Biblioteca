package biblioteca;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameSeleccionBuscaTema extends javax.swing.JFrame {
    PanelBuscaLibro pbl;
    int fila;
    SQL sql = new SQL();

    public FrameSeleccionBuscaTema(PanelBuscaLibro Vpbl, int filaSel) {
        pbl = Vpbl;
        fila = filaSel;
        initComponents();
        cargarTabla();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista.setColumnSelectionAllowed(true);
        lista.getTableHeader().setReorderingAllowed(false);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lista);
        lista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.getColumnModel().getColumn(0).setMinWidth(0);
        lista.getColumnModel().getColumn(0).setPreferredWidth(0);
        lista.getColumnModel().getColumn(0).setMaxWidth(0);
        lista.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        pbl.selTemaAbierto = false;
    }//GEN-LAST:event_formWindowClosed

    private void listaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseReleased
        DefaultTableModel modelo = (DefaultTableModel)pbl.listaTemas.getModel();
        pbl.idTemas[fila] = lista.getValueAt(this.lista.getSelectedRow(), 0);
        Object valor = lista.getValueAt(this.lista.getSelectedRow(), this.lista.getSelectedColumn());
        modelo.setValueAt(valor, fila, 0);
        JOptionPane.showMessageDialog(null, pbl.idTemas);
        pbl.construirConsulta((pbl.strTitle.getText().length() > 0) ? pbl.strTitle.getText() : "",
                    (pbl.strAutor.getText().length() > 0) ? pbl.strAutor.getText() : "",
                    (pbl.strEditor.getText().length() > 0) ? pbl.strEditor.getText() : "",
                    (pbl.strPags.getText().length() > 0) ? Integer.parseInt(pbl.strPags.getText()) : 0,
                    (pbl.strISBN.getText().length() > 0) ? pbl.strISBN.getText() : "");
        this.dispose();
    }//GEN-LAST:event_listaMouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    private void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)lista.getModel();
        modelo.setRowCount(0);
        String obj[] = new String[2];
        String ids = "";
        for(int i=0 ; i<pbl.idTemas.length ; i++){
            if(i != pbl.idTemas.length-1 && pbl.idTemas[i] != null)
                ids += pbl.idTemas[i] + ",";
            else if(i != pbl.idTemas.length-1 && pbl.idTemas[i] == null)
                ids += "-1,";
            else if(i == pbl.idTemas.length-1 && pbl.idTemas[i] != null)
                ids += pbl.idTemas[i];
            else if(i == pbl.idTemas.length-1 && pbl.idTemas[i] == null)
                ids += "-1";
        }
        System.out.println("select TemaID, Tema from Temas where TemaID not in("+ids+") order by Tema");
        ResultSet temas = sql.getResultSet("select TemaID, Tema from Temas where TemaID not in("+ids+") order by Tema");
        try{
            temas.beforeFirst();
            while(temas.next()){
                obj[0] = temas.getString("TemaID");
                obj[1] = temas.getString("Tema");
                modelo.addRow(obj);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    // End of variables declaration//GEN-END:variables

}
