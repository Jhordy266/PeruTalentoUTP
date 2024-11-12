/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perutalentoutp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Charly Cimino
 */
public class Login2 extends javax.swing.JFrame {

    public Login2() {
        initComponents();
        this.setLocationRelativeTo(null);
        /*CENTRAR EL JFRAME AUTOMATICAMENTE*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JTextField();
        BtnIngresar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TxtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LblMinimizar = new javax.swing.JLabel();
        LblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 44, 62));
        setLocation(new java.awt.Point(280, 180));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 44, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUsuario.setBackground(new java.awt.Color(33, 44, 62));
        TxtUsuario.setForeground(new java.awt.Color(204, 204, 255));
        TxtUsuario.setText("Ingrese su nombre de usuario");
        TxtUsuario.setBorder(null);
        TxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusLost(evt);
            }
        });
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioMousePressed(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 227, 27));

        BtnIngresar.setBackground(new java.awt.Color(65, 170, 174));
        BtnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar.png"))); // NOI18N
        BtnIngresar.setText(" INICIAR SESION");
        BtnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 310, 190, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 230, 10));

        TxtContraseña.setBackground(new java.awt.Color(33, 44, 62));
        TxtContraseña.setForeground(new java.awt.Color(204, 204, 255));
        TxtContraseña.setText("*****");
        TxtContraseña.setBorder(null);
        TxtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusLost(evt);
            }
        });
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaMousePressed(evt);
            }
        });
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 227, 27));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 40, 40));

        LblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setText("CONTRASEÑA");
        jPanel1.add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contraseña.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("USUARIO");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 184, 33));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 229, 53));

        jPanel2.setBackground(new java.awt.Color(65, 170, 174));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgInicioSesion.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        jButton1.setBackground(new java.awt.Color(65, 170, 174));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CambiarContraseña.png"))); // NOI18N
        jButton1.setText("CAMBIAR CONTRASEÑA");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 190, 40));

        LblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos.png"))); // NOI18N
        LblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(LblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, 20));

        LblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar (1).png"))); // NOI18N
        LblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(LblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        // TODO add your handling code here:  fffffffffff
        validarIngreso();
    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
        // TODO add your handling code here:

// Verificar si se presionó la tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Verificar si el campo de texto está vacío
            if (TxtUsuario.getText().trim().isEmpty()) {
                // Mostrar mensaje si el campo está vacío
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su usuario antes de continuar.");
                TxtUsuario.requestFocus();  // Enfocar nuevamente en el campo TxtUsuario
            } else {
                // Si hay texto, cambiar al siguiente campo de texto
                TxtContraseña.requestFocus();

            }
        }

    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyPressed
        // TODO add your handling code here:

        // Verificar si se presionó la tecla Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Verificar si el campo de texto está vacío
            if (TxtContraseña.getText().trim().isEmpty()) {
                // Mostrar mensaje si el campo está vacío
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su contraseña antes de continuar.");
                TxtContraseña.requestFocus();  // Enfocar nuevamente en el campo TxtUsuario
            } else {
                // Si hay texto llamar a validar ingreso
                validarIngreso();
            }
        }
    }//GEN-LAST:event_TxtContraseñaKeyPressed

    private void TxtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtContraseñaMouseClicked

    private void TxtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioMouseClicked

    private void TxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusGained
        // TODO add your handling code here:
        if (TxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            TxtUsuario.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtUsuarioFocusGained

    private void TxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusLost
        // TODO add your handling code here:
        if (TxtUsuario.getText().isEmpty()) {
            TxtUsuario.setText("Ingrese su nombre de usuario"); // Reestablece el texto por defecto si está vacío
        }
    }//GEN-LAST:event_TxtUsuarioFocusLost

    private void TxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusGained
        // TODO add your handling code here:
        if (TxtContraseña.getText().equals("*****")) {
            TxtContraseña.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtContraseñaFocusGained

    private void TxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusLost
        // TODO add your handling code here:
        if (TxtContraseña.getText().isEmpty()) {
            TxtContraseña.setText("*****"); // Reestablece el texto por defecto si está vacío
        }
    }//GEN-LAST:event_TxtContraseñaFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        // Ir al formulario MenuPrincipal
        CambioContraseña nuevoFormulario = new CambioContraseña();
        nuevoFormulario.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButton1MouseClicked

    private void LblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCerrarMouseClicked
        //cogido para preguntar si se desea salir o no del programa 
        int respuesta = JOptionPane.showConfirmDialog(
         Login2.this,
         "¿Deseas realmente salir?",
         "Confirmación",
         JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            dispose(); // Cierra la ventana y libera los recursos
            System.exit(0); // Termina la aplicación
        }


    }//GEN-LAST:event_LblCerrarMouseClicked

    private void LblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinimizarMouseClicked
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED); // PARA MINIMIZAR EL PROGRAMA
    }//GEN-LAST:event_LblMinimizarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private int intentos = 0; //Variable para controlar el intentos de accesos incorrectos

// METODO VALIDAR INGRESO - INICIO
    private void validarIngreso() {
        String usuario = TxtUsuario.getText();
        String contrasena = new String(TxtContraseña.getPassword());

        if (usuario.equals("Ingrese su nombre de usuario") || contrasena.equals("*****")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;
        }

        if (usuario.equals("") || contrasena.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;
        }

        // Conectarse a la base de datos y verificar credenciales
        try {
            // Parámetros de conexión
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10742054";
            String dbUser = "sql10742054";
            String dbPassword = "c2HfX6vUVE";

            // Conexión a la base de datos
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            //JOptionPane.showMessageDialog(this, "Conexión a la base de datos exitosa."); // Mensaje si la conexión es exitosa

            // Consulta SQL para verificar las credenciales
            String query = "SELECT * FROM sql10742054.usuarios WHERE NombreUsuario = ? AND contrasena = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "¡Acceso correcto!");
                intentos = 0; // Reinicia el contador de intentos

                // Ir al formulario MenuPrincipal
                MenuPrincipal nuevoFormulario = new MenuPrincipal();
                nuevoFormulario.setVisible(true);
                this.dispose(); // Cierra la ventana de login
            } else {
                intentos++;
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                TxtUsuario.setText("Ingrese su nombre de usuario");
                TxtContraseña.setText("*****");

                if (intentos >= 3) {
                    JOptionPane.showMessageDialog(this, "Demasiados intentos fallidos. El sistema se cerrará.");
                    System.exit(0); // Cierra la aplicación tras 3 intentos fallidos
                }
            }

            // Cerrar la conexión y recursos
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage());
        }
    }
// METODO VALIDAR INGRESO - FIN

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LblCerrar;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblMinimizar;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
