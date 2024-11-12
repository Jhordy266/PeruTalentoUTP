package perutalentoutp;
//importamos lo que se usara en el formulario de busqueda
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

  // Conexion a la base de datos server con mysql y nuestra base de datos
    private static final String DB_URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10742223";
    private static final String DB_USER = "sql10742223";
    private static final String DB_PASSWORD = "6SlGmkPLxr";   
    
   
    public BUSCADOR_TABLA() {
        initComponents();
         this.setLocationRelativeTo(null); // centra el Jframe
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        LblMinimizar = new javax.swing.JLabel();
        LblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(7, 6, 6));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 44, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCADOR TALENTO PERÚ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 400, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORMACION ACADEMICA : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONOCIMIENTOS: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARRERAS :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IDIOMAS: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EXPERIENCIA LABORAL:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CURSOS : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jbBuscar.setBackground(new java.awt.Color(65, 170, 174));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        jbBuscar.setText("BUSCAR TALENTO");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.setPreferredSize(new java.awt.Dimension(91, 36));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARTALENTO(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 160, -1));

        jbRegresar.setBackground(new java.awt.Color(255, 51, 51));
        jbRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jbRegresar.setText("REGRESAR");
        jbRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRegresar.setMaximumSize(new java.awt.Dimension(137, 36));
        jbRegresar.setMinimumSize(new java.awt.Dimension(137, 36));
        jbRegresar.setPreferredSize(new java.awt.Dimension(91, 36));
        jbRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegresarMouseClicked(evt);
            }
        });
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 160, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/talentoPeruu-removebg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 250, 300));

        cbDerecho.setBackground(new java.awt.Color(33, 44, 62));
        cbDerecho.setForeground(new java.awt.Color(255, 255, 255));
        cbDerecho.setText("DERECHO");
        cbDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDerechoActionPerformed(evt);
            }
        });
        jPanel1.add(cbDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        cbIngenieria.setBackground(new java.awt.Color(33, 44, 62));
        cbIngenieria.setForeground(new java.awt.Color(255, 255, 255));
        cbIngenieria.setText("INGENIERIA");
        cbIngenieria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIngenieriaActionPerformed(evt);
            }
        });
        jPanel1.add(cbIngenieria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        cbPsicologia.setBackground(new java.awt.Color(33, 44, 62));
        cbPsicologia.setForeground(new java.awt.Color(255, 255, 255));
        cbPsicologia.setText("PSICOLOGIA");
        jPanel1.add(cbPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        cbAdministracion.setBackground(new java.awt.Color(33, 44, 62));
        cbAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        cbAdministracion.setText("ADMINISTRACION");
        jPanel1.add(cbAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        cbMedicina.setBackground(new java.awt.Color(33, 44, 62));
        cbMedicina.setForeground(new java.awt.Color(255, 255, 255));
        cbMedicina.setText("MEDICINA");
        jPanel1.add(cbMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        cbEducacion.setBackground(new java.awt.Color(33, 44, 62));
        cbEducacion.setForeground(new java.awt.Color(255, 255, 255));
        cbEducacion.setText("EDUCACIÓN");
        jPanel1.add(cbEducacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        cbEconomia.setBackground(new java.awt.Color(33, 44, 62));
        cbEconomia.setForeground(new java.awt.Color(255, 255, 255));
        cbEconomia.setText("ECONOMIA");
        jPanel1.add(cbEconomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        cbContabilidad.setBackground(new java.awt.Color(33, 44, 62));
        cbContabilidad.setForeground(new java.awt.Color(255, 255, 255));
        cbContabilidad.setText("CONTABILIDAD");
        jPanel1.add(cbContabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        cbFormacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO UNIVERSITARIO", "BACHILLER", "TITULO TECNICO", "EGRESADO TECNICO", "ESTUDIANTE UNIVERSITARIO", " " }));
        cbFormacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormacionActionPerformed(evt);
            }
        });
        jPanel1.add(cbFormacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        cbmba.setBackground(new java.awt.Color(33, 44, 62));
        cbmba.setForeground(new java.awt.Color(255, 255, 255));
        cbmba.setText("MBA");
        jPanel1.add(cbmba, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        cbMagister.setBackground(new java.awt.Color(33, 44, 62));
        cbMagister.setForeground(new java.awt.Color(255, 255, 255));
        cbMagister.setText("MAGISTER");
        cbMagister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMagisterActionPerformed(evt);
            }
        });
        jPanel1.add(cbMagister, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        cbDiplomado.setBackground(new java.awt.Color(33, 44, 62));
        cbDiplomado.setForeground(new java.awt.Color(255, 255, 255));
        cbDiplomado.setText("DIPLOMADO");
        jPanel1.add(cbDiplomado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        cbExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Año", "2 Años", "3 Años", "4 Años", "5 Años", "6 Años", "7 Años", "8 Años", "9 Años", "10 Años", " " }));
        jPanel1.add(cbExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cbOfimatica.setBackground(new java.awt.Color(33, 44, 62));
        cbOfimatica.setForeground(new java.awt.Color(255, 255, 255));
        cbOfimatica.setText("OFIMATICA");
        jPanel1.add(cbOfimatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        cbComputacion.setBackground(new java.awt.Color(33, 44, 62));
        cbComputacion.setForeground(new java.awt.Color(255, 255, 255));
        cbComputacion.setText("COMPUTACION");
        jPanel1.add(cbComputacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        cbIngles.setBackground(new java.awt.Color(33, 44, 62));
        cbIngles.setForeground(new java.awt.Color(255, 255, 255));
        cbIngles.setText("INGLES");
        jPanel1.add(cbIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        cbChino.setBackground(new java.awt.Color(33, 44, 62));
        cbChino.setForeground(new java.awt.Color(255, 255, 255));
        cbChino.setText("CHINO");
        jPanel1.add(cbChino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        cbFrances.setBackground(new java.awt.Color(33, 44, 62));
        cbFrances.setForeground(new java.awt.Color(255, 255, 255));
        cbFrances.setText("FRANCES");
        jPanel1.add(cbFrances, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        cbPortugues.setBackground(new java.awt.Color(33, 44, 62));
        cbPortugues.setForeground(new java.awt.Color(255, 255, 255));
        cbPortugues.setText("PORTUGUES");
        cbPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortuguesActionPerformed(evt);
            }
        });
        jPanel1.add(cbPortugues, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar (1).png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUSCARTALENTO(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARTALENTO
    
// indicamos las consultas que hara nuestro programa en nuestra BD
     StringBuilder query = new StringBuilder("SELECT * FROM postulantes WHERE 1=1");
//tomamos desiciones de acuerdo a las consultas de los items que tenemos como discriminante
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
//usamos try para identificar a los que cumplen con la condicion y pedimos que nos brinde los datos que queremos de la BD y los guarde en arreglos
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
//mandamos a nuuestra ventana de salida
        ResultadoFormulario resultadoForm = new ResultadoFormulario(results);
        resultadoForm.setVisible(true);
//si es que ocurre una desconexion con la BD alertamos con mensaje        
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

    private void jbRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegresarMouseClicked
        // TODO add your handling code here:
        
         // INICIO
        
        // Crea y muestra el siguiente formulario
        MenuPrincipal regresar = new MenuPrincipal(); // Reemplaza con tu clase de formulario
        regresar.setVisible(true);
        
        // Cierra el formulario actual
        this.dispose();
        
        // FIN
        
        
        
        
    }//GEN-LAST:event_jbRegresarMouseClicked

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
  //cogido para preguntar si se desea salir o no del programa 
        int respuesta = JOptionPane.showConfirmDialog(
                    BUSCADOR_TABLA.this, 
                    "¿Deseas realmente salir?", 
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    dispose(); // Cierra la ventana y libera los recursos
                    System.exit(0); // Termina la aplicación
                }
         
    }//GEN-LAST:event_LblCerrarMouseClicked
//damos la accion al boton de regresar
       public  void main(String args[]) {
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCADOR_TABLA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblMinimizar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbRegresar;
    // End of variables declaration//GEN-END:variables
}
