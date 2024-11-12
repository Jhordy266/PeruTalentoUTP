/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perutalentoutp;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charly Cimino
 */
public class Login extends javax.swing.JFrame {

    public Login() {
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
        BtnSalir = new javax.swing.JButton();
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
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 227, 27));

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
        jPanel1.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 159, 40));

        BtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 110, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 230, 10));

        TxtContraseña.setBackground(new java.awt.Color(33, 44, 62));
        TxtContraseña.setForeground(new java.awt.Color(204, 204, 255));
        TxtContraseña.setText("*****");
        TxtContraseña.setBorder(null);
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaMousePressed(evt);
            }
        });
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 227, 27));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 40, 40));

        LblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setText("CONTRASEÑA");
        jPanel1.add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 150, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contraseña.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("USUARIO");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 184, 33));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 229, 53));

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

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked

        this.dispose();
        /*CIERRA EL PROGRAMA POR COMPLETO*/
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed
        // TODO add your handling code here:

        if (String.valueOf(TxtContraseña.getPassword()).equals("*****")) {
            TxtContraseña.setText("");
            TxtContraseña.setForeground(Color.white);
        }
        if (TxtUsuario.getText().isEmpty()) {
            TxtUsuario.setText("Ingrese su nombre de usuario");
            TxtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        // TODO add your handling code here:  fffffffffff

        String usuario, contrasena;

        usuario = TxtUsuario.getText();

        contrasena = TxtContraseña.getText();

        if (usuario.equals("") || contrasena.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario o Contraseña");
             // LOS TEXTOS VOLVERAN A APARECER POR DEFECTO PARA PEDIR LOS DATOS
            TxtUsuario.setText("Ingrese su nombre de usuario");
            TxtUsuario.setForeground(Color.gray);
            TxtContraseña.setText("*****");
            TxtContraseña.setForeground(Color.gray);
            return; // POGRAMA INICIARA DE NUEVO
        }
        if (usuario.equals("admin") && contrasena.equals("12345")) {
            JOptionPane.showMessageDialog(null, "Acceso Correcto");

            MenuPrincipal nuevoFormulario = new MenuPrincipal();
            nuevoFormulario.setVisible(true);
            dispose(); //CIERRA EL FORMULARIO ACTUAL
        } else {

            intentos++; //Incrementar el contador de intentos fallidos declarados
            JOptionPane.showMessageDialog(null, "Datos incorrectos. Intento " + intentos + " de 3.");

            // LOS TEXTOS VOLVERAN A APARECER POR DEFECTO PARA PEDIR LOS DATOS
            TxtUsuario.setText("Ingrese su nombre de usuario");
            TxtUsuario.setForeground(Color.gray);
            TxtContraseña.setText("*****");
            TxtContraseña.setForeground(Color.gray);

            //Cerrar el formulario después de 3 intentos incorrectos
            if (intentos >= 3) {
                JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. El programa se cerrará.");
                System.exit(0);//Cierra el Programa completo
            }
        }

    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        // TODO add your handling code here:
        if (TxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            TxtUsuario.setText("");   //para que al hacer click se borre el placeholder del texto
            TxtUsuario.setForeground(Color.white);
        }
        if (String.valueOf(TxtContraseña.getPassword()).isEmpty()) {
            TxtContraseña.setText("*****");
            TxtContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  //´PARA CAMBIAR AL SIGUIENTE TEXFIELD MEDIANTE EL ENTER
            TxtContraseña.requestFocus();
            TxtContraseña.setText("");
        }

    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtContraseñaKeyPressed

    private int intentos = 0;

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
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
