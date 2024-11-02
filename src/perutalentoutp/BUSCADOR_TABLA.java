package perutalentoutp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BUSCADOR_TABLA extends javax.swing.JFrame {

  // Conexion a la base de datos server con mysql
    private static final String DB_URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10742223";
    private static final String DB_USER = "sql10742223";
    private static final String DB_PASSWORD = "6SlGmkPLxr";   
    
    /**
     * Creates new form BUSCADOR_TABLA
     */
    public BUSCADOR_TABLA() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbDerecho = new javax.swing.JCheckBox();
        cbIngenieria = new javax.swing.JCheckBox();
        cbPsicologia = new javax.swing.JCheckBox();
        cbAdministracion = new javax.swing.JCheckBox();
        cbMedicina = new javax.swing.JCheckBox();
        cbEducacion = new javax.swing.JCheckBox();
        cbEconomia = new javax.swing.JCheckBox();
        cbContabilidad = new javax.swing.JCheckBox();
        cbFormacion = new javax.swing.JComboBox<>();
        cbmba = new javax.swing.JCheckBox();
        cbMagister = new javax.swing.JCheckBox();
        cbDiplomado = new javax.swing.JCheckBox();
        cbExperiencia = new javax.swing.JComboBox<>();
        cbOfimatica = new javax.swing.JCheckBox();
        cbComputacion = new javax.swing.JCheckBox();
        cbIngles = new javax.swing.JCheckBox();
        cbChino = new javax.swing.JCheckBox();
        cbFrances = new javax.swing.JCheckBox();
        cbPortugues = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(7, 6, 6));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setText("BUSCADOR TALENTO PERÚ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 400, 30));

        jLabel2.setText("FORMACION ACADEMICA : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel5.setText("CONOCIMIENTOS: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jLabel6.setText("CARRERAS :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setText("IDIOMAS: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel9.setText("EXPERIENCIA LABORAL:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel11.setText("CURSOS : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jbBuscar.setText("BUSCAR TALENTO");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARTALENTO(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 150, 30));

        jbRegresar.setText("REGRESAR");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PeruTalento1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 260, 260));

        cbDerecho.setText("DERECHO");
        cbDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDerechoActionPerformed(evt);
            }
        });
        getContentPane().add(cbDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        cbIngenieria.setText("INGENIERIA");
        cbIngenieria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIngenieriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbIngenieria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        cbPsicologia.setText("PSICOLOGIA");
        getContentPane().add(cbPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        cbAdministracion.setText("ADMINISTRACION");
        getContentPane().add(cbAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        cbMedicina.setText("MEDICINA");
        getContentPane().add(cbMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        cbEducacion.setText("EDUCACIÓN");
        getContentPane().add(cbEducacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        cbEconomia.setText("ECONOMIA");
        getContentPane().add(cbEconomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        cbContabilidad.setText("CONTABILIDAD");
        getContentPane().add(cbContabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        cbFormacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO UNIVERSITARIO", "BACHILLER", "TITULO TECNICO", "EGRESADO TECNICO", "ESTUDIANTE UNIVERSITARIO", " " }));
        cbFormacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormacionActionPerformed(evt);
            }
        });
        getContentPane().add(cbFormacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        cbmba.setText("MBA");
        getContentPane().add(cbmba, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        cbMagister.setText("MAGISTER");
        cbMagister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMagisterActionPerformed(evt);
            }
        });
        getContentPane().add(cbMagister, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        cbDiplomado.setText("DIPLOMADO");
        getContentPane().add(cbDiplomado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        cbExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Año", "2 Años", "3 Años", "4 Años", "5 Años", "6 Años", "7 Años", "8 Años", "9 Años", "10 Años", " " }));
        getContentPane().add(cbExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cbOfimatica.setText("OFIMATICA");
        getContentPane().add(cbOfimatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        cbComputacion.setText("COMPUTACION");
        getContentPane().add(cbComputacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        cbIngles.setText("INGLES");
        getContentPane().add(cbIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        cbChino.setText("CHINO");
        getContentPane().add(cbChino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        cbFrances.setText("FRANCES");
        getContentPane().add(cbFrances, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        cbPortugues.setText("PORTUGUES");
        cbPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortuguesActionPerformed(evt);
            }
        });
        getContentPane().add(cbPortugues, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUSCARTALENTO(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARTALENTO
    
// Crear una lista para almacenar los criterios seleccionados
     StringBuilder query = new StringBuilder("SELECT * FROM postulantes WHERE 1=1");

    if (cbDerecho.isSelected()) query.append(" AND CARRERAS LIKE '%DERECHO%'");
    if (cbIngenieria.isSelected()) query.append(" AND CARRERAS LIKE '%INGENIERIA%'");
    if (cbPsicologia.isSelected()) query.append(" AND CARRERAS LIKE '%PSICOLOGIA%'");
    if (cbAdministracion.isSelected()) query.append(" AND CARRERAS LIKE '%ADMINISTRACION%'");
    if (cbMedicina.isSelected()) query.append(" AND CARRERAS LIKE '%MEDICINA%'");
    if (cbEducacion.isSelected()) query.append(" AND CARRERAS LIKE '%EDUCACIÓN%'");
    if (cbEconomia.isSelected()) query.append(" AND CARRERAS LIKE '%ECONOMIA%'");
    if (cbContabilidad.isSelected()) query.append(" AND CARRERAS LIKE '%CONTABILIDAD%'");

    String formacion = cbFormacion.getSelectedItem().toString();
    query.append(" AND FORMACION = '").append(formacion).append("'");

    if (cbmba.isSelected()) query.append(" AND CURSOS LIKE '%MBA%'");
    if (cbMagister.isSelected()) query.append(" AND CURSOS LIKE '%MAGISTER%'");
    if (cbDiplomado.isSelected()) query.append(" AND CURSOS LIKE '%DIPLOMADO%'");

    String experiencia = cbExperiencia.getSelectedItem().toString();
    query.append(" AND EXPERIENCIA = '").append(experiencia).append("'");

    if (cbOfimatica.isSelected()) query.append(" AND CONOCIMIENTOS LIKE '%OFIMATICA%'");
    if (cbComputacion.isSelected()) query.append(" AND CONOCIMIENTOS LIKE '%COMPUTACION%'");

    if (cbIngles.isSelected()) query.append(" AND IDIOMAS LIKE '%INGLES%'");
    if (cbChino.isSelected()) query.append(" AND IDIOMAS LIKE '%CHINO%'");
    if (cbFrances.isSelected()) query.append(" AND IDIOMAS LIKE '%FRANCES%'");
    if (cbPortugues.isSelected()) query.append(" AND IDIOMAS LIKE '%PORTUGUES%'");

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement pstmt = conn.prepareStatement(query.toString());
         ResultSet rs = pstmt.executeQuery()) {

        ArrayList<String[]> results = new ArrayList<>();
        while (rs.next()) {
            String[] row = {
                rs.getString("NOMBRES"),
                rs.getString("CARRERAS"),
                rs.getString("FORMACION"),
                rs.getString("CURSOS"),
                rs.getString("EXPERIENCIA"),
                rs.getString("CONOCIMIENTOS"),
                rs.getString("IDIOMAS")
            };
            results.add(row);
        }

        ResultadoFormulario resultadoForm = new ResultadoFormulario(results);
        resultadoForm.setVisible(true);
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error en la consulta: " + e.getMessage());
    }
        
        
    }//GEN-LAST:event_BUSCARTALENTO

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void cbDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDerechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDerechoActionPerformed

    private void cbMagisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMagisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMagisterActionPerformed

    private void cbPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortuguesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPortuguesActionPerformed

    private void cbIngenieriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIngenieriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIngenieriaActionPerformed

    private void cbFormacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFormacionActionPerformed

       public  void main(String args[]) {
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCADOR_TABLA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAdministracion;
    private javax.swing.JCheckBox cbChino;
    private javax.swing.JCheckBox cbComputacion;
    private javax.swing.JCheckBox cbContabilidad;
    private javax.swing.JCheckBox cbDerecho;
    private javax.swing.JCheckBox cbDiplomado;
    private javax.swing.JCheckBox cbEconomia;
    private javax.swing.JCheckBox cbEducacion;
    private javax.swing.JComboBox<String> cbExperiencia;
    private javax.swing.JComboBox<String> cbFormacion;
    private javax.swing.JCheckBox cbFrances;
    private javax.swing.JCheckBox cbIngenieria;
    private javax.swing.JCheckBox cbIngles;
    private javax.swing.JCheckBox cbMagister;
    private javax.swing.JCheckBox cbMedicina;
    private javax.swing.JCheckBox cbOfimatica;
    private javax.swing.JCheckBox cbPortugues;
    private javax.swing.JCheckBox cbPsicologia;
    private javax.swing.JCheckBox cbmba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbRegresar;
    // End of variables declaration//GEN-END:variables
}
