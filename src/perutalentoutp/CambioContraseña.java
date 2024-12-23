
package perutalentoutp;

import java.sql.Connection; //utiliza para establecer una conexión con una base de datos.
import java.sql.DriverManager; //Es gestionar y registrar los controladores JDBC para conectar Java con una base de datos.
import java.sql.PreparedStatement;//acilita la ejecución de consultas parametrizadas (como SELECT, INSERT, UPDATE),
import java.sql.ResultSet; //Se utiliza para manejar el conjunto de resultados devueltos por una consulta SQL. Almacena y permite acceder a los datos devueltos por sentencias como SELECT.
import java.sql.SQLException; //Permite manejar errores y excepciones cuando se trabaja con operaciones de base de datos.
import javax.swing.JOptionPane;
     // JAVAX: PERMITE PARA LIBRERIAS SUPLEMENTARIAS QUE NO FORMAN COMO PARTE DEL NUCLE DE JAVA (INTERF GRAF, ETC)
     //SWING: para crear interfaces gráficas de usuario
     // JOptionPane: Sirve para mostrar cuadros de diálogo en una aplicación gráfica.
public class CambioContraseña extends javax.swing.JFrame {
                                
    /*** Creates new form CambioContraseña */ 
    public CambioContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);  /*CENTRAR EL JFRAME AUTOMATICAMENTE El sistema calculará automáticamente las coordenadas para centrar la ventana en la pantalla principal.*/
        this.ocultar.setVisible(false);
        this.ocultar1.setVisible(false);
        this.ocultar2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblUsuario = new javax.swing.JLabel();
        LblUsuario1 = new javax.swing.JLabel();
        LblUsuario2 = new javax.swing.JLabel();
        LblUsuario3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtContraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        TxtUsuario = new javax.swing.JTextField();
        TxtNContraseña1 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        TxtNContraseña2 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        BtnAceptar = new javax.swing.JButton();
        BtnAceptar1 = new javax.swing.JButton();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        ver1 = new javax.swing.JLabel();
        ocultar1 = new javax.swing.JLabel();
        ver2 = new javax.swing.JLabel();
        ocultar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(33, 44, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("REPETIR CONTRASEÑA");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 33));

        LblUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario1.setText("USUARIO");
        jPanel1.add(LblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 90, 33));

        LblUsuario2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario2.setText("CONTRASEÑA ACTUAL");
        jPanel1.add(LblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 210, 33));

        LblUsuario3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario3.setText("NUEVA CONTRASEÑA");
        jPanel1.add(LblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 200, 33));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 230, 10));

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
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 227, 27));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 230, 10));

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
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 227, 27));

        TxtNContraseña1.setBackground(new java.awt.Color(33, 44, 62));
        TxtNContraseña1.setForeground(new java.awt.Color(204, 204, 255));
        TxtNContraseña1.setText("*****");
        TxtNContraseña1.setBorder(null);
        TxtNContraseña1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNContraseña1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNContraseña1FocusLost(evt);
            }
        });
        TxtNContraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtNContraseña1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNContraseña1MousePressed(evt);
            }
        });
        TxtNContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNContraseña1KeyPressed(evt);
            }
        });
        jPanel1.add(TxtNContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 227, 27));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 230, 10));

        TxtNContraseña2.setBackground(new java.awt.Color(33, 44, 62));
        TxtNContraseña2.setForeground(new java.awt.Color(204, 204, 255));
        TxtNContraseña2.setText("*****");
        TxtNContraseña2.setBorder(null);
        TxtNContraseña2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNContraseña2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNContraseña2FocusLost(evt);
            }
        });
        TxtNContraseña2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtNContraseña2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNContraseña2MousePressed(evt);
            }
        });
        TxtNContraseña2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNContraseña2KeyPressed(evt);
            }
        });
        jPanel1.add(TxtNContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 227, 27));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 230, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sinfondo2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 90, 100));

        jPanel2.setBackground(new java.awt.Color(65, 170, 174));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAMBIAR CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 380, 53));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 70));

        jPanel3.setBackground(new java.awt.Color(65, 170, 174));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(65, 170, 174));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 450));

        jPanel5.setBackground(new java.awt.Color(65, 170, 174));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(65, 170, 174));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 450));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 10, 450));

        jPanel7.setBackground(new java.awt.Color(65, 170, 174));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(65, 170, 174));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 450));

        jPanel9.setBackground(new java.awt.Color(65, 170, 174));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(65, 170, 174));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 450));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 10, 450));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 10, 450));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 30, 430));

        BtnAceptar.setBackground(new java.awt.Color(0, 108, 108));
        BtnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegresarEV.png"))); // NOI18N
        BtnAceptar.setText("REGRESAR");
        BtnAceptar.setToolTipText("");
        BtnAceptar.setBorder(null);
        BtnAceptar.setBorderPainted(false);
        BtnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAceptarMouseClicked(evt);
            }
        });
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 110, 40));

        BtnAceptar1.setBackground(new java.awt.Color(0, 108, 108));
        BtnAceptar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AceptarEV.png"))); // NOI18N
        BtnAceptar1.setText("ACEPTAR");
        BtnAceptar1.setToolTipText("");
        BtnAceptar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAceptar1.setBorderPainted(false);
        BtnAceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAceptar1MouseClicked(evt);
            }
        });
        BtnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 110, 40));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver1MouseClicked(evt);
            }
        });
        jPanel1.add(ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        ocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar1MouseClicked(evt);
            }
        });
        jPanel1.add(ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        ver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver.png"))); // NOI18N
        ver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver2MouseClicked(evt);
            }
        });
        jPanel1.add(ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        ocultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar.png"))); // NOI18N
        ocultar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultar2MouseClicked(evt);
            }
        });
        jPanel1.add(ocultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

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

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked

        /* Ir al formulario Login2*/
        Login2 retornologin = new Login2();
        retornologin.setVisible(true);
        /*CIERRA EL FORMULARIO ACTUAL*/
        this.dispose(); // finaliza el  jframe pero no cierra el programa por completo 

    }//GEN-LAST:event_BtnAceptarMouseClicked

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnAceptar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptar1MouseClicked
        // TODO add your handling code here:

        CambioContrasena(); // llamada a un método CAMBIOCONTRASEÑA

    }//GEN-LAST:event_BtnAceptar1MouseClicked

    private void BtnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAceptar1ActionPerformed

    private void TxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusGained
     //Usé el método FocusGained porque permite limpiar el texto predeterminado del campo cuando el usuario interactúa con él. Es una solución práctica para guiar al usuario y facilitar la entrada de datos.
        
        if (TxtContraseña.getText().equals("*****")) { 
            TxtContraseña.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtContraseñaFocusGained

    private void TxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusLost
        // ESTE EVENTO ES CUANDO EL FOCO DEJA EL CUADRO DE TEXTO
        if (TxtContraseña.getText().isEmpty()) {  // Si el campo de la contraseña está vacío
            TxtContraseña.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }
    }//GEN-LAST:event_TxtContraseñaFocusLost

    private void TxtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaMouseClicked

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void TxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyPressed

    }//GEN-LAST:event_TxtContraseñaKeyPressed

    private void TxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusGained
       //evento cuando el usuario hace clic en él o lo selecciona de alguna otra manera.
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

    private void TxtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioMouseClicked

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed


    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtNContraseña1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña1FocusGained
       //evento cuando el usuario hace clic en él o lo selecciona de alguna otra manera.
        if (TxtNContraseña1.getText().equals("*****")) {
            TxtNContraseña1.setText(""); // Borra el texto por defecto al hacer clic
        }
    }//GEN-LAST:event_TxtNContraseña1FocusGained

    private void TxtNContraseña1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña1FocusLost
        //evento cuando el usuario hace clic en él o lo selecciona de alguna otra manera.
        if (TxtNContraseña1.getText().isEmpty()) { // si esta vacio
            TxtNContraseña1.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }
    }//GEN-LAST:event_TxtNContraseña1FocusLost

    private void TxtNContraseña1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNContraseña1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña1MouseClicked

    private void TxtNContraseña1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNContraseña1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña1MousePressed

    private void TxtNContraseña1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNContraseña1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña1KeyPressed

    private void TxtNContraseña2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña2FocusGained
        // TODO add your handling code here:
        if (TxtNContraseña2.getText().equals("*****")) {
            TxtNContraseña2.setText(""); // Borra el texto por defecto al hacer clic
        }

    }//GEN-LAST:event_TxtNContraseña2FocusGained

    private void TxtNContraseña2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNContraseña2FocusLost
        // TODO add your handling code here:

        if (TxtNContraseña2.getText().isEmpty()) {
            TxtNContraseña2.setText("*****"); // Reestablece el texto por defecto si está vacío       
        }

    }//GEN-LAST:event_TxtNContraseña2FocusLost

    private void TxtNContraseña2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNContraseña2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña2MouseClicked

    private void TxtNContraseña2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNContraseña2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña2MousePressed

    private void TxtNContraseña2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNContraseña2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNContraseña2KeyPressed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        ocultar.setVisible(true);
        TxtContraseña.setEchoChar((char) 0);
        //se usa para hacer que no se muestre ningún carácter de eco (como *) en el campo de contraseña,
        
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        // setEchoChar se utiliza para establecer un carácter de "eco" en un JPasswordField

        TxtContraseña.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver.setVisible(true);
        ocultar.setVisible(false);

    }//GEN-LAST:event_ocultarMouseClicked

    private void ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver1MouseClicked
        // TODO add your handling code here:

        ver1.setVisible(false);
        ocultar1.setVisible(true);
        TxtNContraseña1.setEchoChar((char) 0);

    }//GEN-LAST:event_ver1MouseClicked

    private void ocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar1MouseClicked
        TxtNContraseña1.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver1.setVisible(true);
        ocultar1.setVisible(false);
    }//GEN-LAST:event_ocultar1MouseClicked

    private void ocultar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultar2MouseClicked
        // TODO add your handling code here:
         TxtNContraseña2.setEchoChar('*'); // para poner la contraseña de nuevo en caracter
        ver2.setVisible(true);
        ocultar2.setVisible(false);
    }//GEN-LAST:event_ocultar2MouseClicked

    private void ver2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver2MouseClicked
        // TODO add your handling code here:
          ver2.setVisible(false);
        ocultar2.setVisible(true);
        TxtNContraseña2.setEchoChar((char) 0);
        
    }//GEN-LAST:event_ver2MouseClicked

    // METODO VALIDAR INGRESO - INICIO
    private void CambioContrasena() {

        String usuario = TxtUsuario.getText();
        String contrasena = new String(TxtContraseña.getPassword());
        String ncontrasena1 = new String(TxtNContraseña1.getPassword());
        String ncontrasena2 = new String(TxtNContraseña2.getPassword());
        String contrasenactual;

        if (usuario.equals("Ingrese su nombre de usuario") || contrasena.equals("*****") || ncontrasena1.equals("*****") || ncontrasena2.equals("*****")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;
        }

        if (usuario.equals("") || contrasena.equals("") || ncontrasena1.equals("") || ncontrasena2.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sus datos.");
            return;
        }
        /*INICIO - COMPROBAR IGUALDAD DE LAS NUEVAS CONTRASEÑAS*/
        if (ncontrasena1.equals(ncontrasena2)) {
            contrasenactual = ncontrasena1;

        } else {
            JOptionPane.showMessageDialog(this, "Contraseñas no coinciden");
            TxtNContraseña1.setText("");
            TxtNContraseña2.setText("");
            return;
        }
        /* FIN - IGUALDAD DE LAS NUEVAS CONTRASEÑAS*/

        // Conectarse a la base de datos y verificar credenciales
        try {
            // Parámetros de conexión
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10742054";
            //JDBC actúa como un puente entre una aplicación Java y una base de datos relacional.
            String dbUser = "sql10742054";
            String dbPassword = "c2HfX6vUVE";

            // Conexión a la base de datos
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            //devuelve la conexion con la base de datos a travez de esa variable 

            // Consulta SQL para verificar las credenciales
            String query = "SELECT * FROM sql10742054.usuarios WHERE NombreUsuario = ? AND contrasena = ?";
            //los ? son marcadores de posicion que los datos se reemplazaran dinamicamente que se remplazaran                   con el uuario y contraseña cuando se hace la ejecucion 
                // preguntar lo que tiene la base de datos
            PreparedStatement statement = connection.prepareStatement(query);
      // atajo directo a la consulta (precompilar)   statement/variable) --- preparando la conexion con la que se tiene
            statement.setString(1, usuario);
     // statement es una clase utilizada en JDBC para ejecutar consultas SQL directamente en una base de datos.
     //asigna el valor de la variable usuario al primer ? de la consulta SQL preparada.
            statement.setString(2, contrasena);
            //asigna el valor de la variable contraseña al segundo ? de la consulta SQL preparada.
            ResultSet resultSet = statement.executeQuery();
            //executeQuery(): Ejecuta la consulta SQL preparada.
                //ResultSet: Contiene las filas (datos) devueltas por la consulta.
            if (resultSet.next()) {

                String queryUpdate = "UPDATE sql10742054.usuarios SET contrasena = ? WHERE NombreUsuario = ? AND contrasena = ?";
                 //Si se encuentra una fila con el NombreUsuario y contrasena especificados, la contraseña                       se actualiza.
                    //Si no coincide ninguna fila, no se realiza la actualización.
                PreparedStatement statement2 = connection.prepareStatement(queryUpdate);
                statement2.setString(1, contrasenactual);
                statement2.setString(2, usuario);
                statement2.setString(3, contrasena);

                int filasActualizadas = statement2.executeUpdate();
         //Devuelve un número entero que indica cuántas filas de la base de datos fueron afectadas por la consulta.
                if (filasActualizadas > 0) {
         //Verifica si al menos una fila fue afectada.
         //Si es verdadero, significa que la consulta se ejecutó correctamente y se modificó al menos una fila.
             JOptionPane.showMessageDialog(this, "La contraseña se actualizó correctamente.");

                    /* Ir al formulario Login2*/
                    Login2 retornologin = new Login2();
                    retornologin.setVisible(true);
                    /*CIERRA EL FORMULARIO ACTUAL*/
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar la contraseña.");
                }

                /* JOptionPane.showMessageDialog(this, "¡Se actualizó la contraseña!");
            // Cierra la ventana de login*/
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar la contraseña por datos incorrectos");
                TxtUsuario.setText("Ingrese su nombre de usuario");
                TxtContraseña.setText("*****");
                TxtNContraseña1.setText("*****");
                TxtNContraseña2.setText("*****");

                return;
            }

            // Cerrar la conexión y recursos
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            //Se lanza cuando ocurre un error al interactuar con una base de datos mediante JDBC
            //(E) A través de e, puedes obtener información detallada del error, como el mensaje, código de                 error, o estado SQL.
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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnAceptar1;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuario1;
    private javax.swing.JLabel LblUsuario2;
    private javax.swing.JLabel LblUsuario3;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JPasswordField TxtNContraseña1;
    private javax.swing.JPasswordField TxtNContraseña2;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel ocultar1;
    private javax.swing.JLabel ocultar2;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver1;
    private javax.swing.JLabel ver2;
    // End of variables declaration//GEN-END:variables
}
