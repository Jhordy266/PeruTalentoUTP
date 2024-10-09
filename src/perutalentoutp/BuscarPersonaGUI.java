/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perutalentoutp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarPersonaGUI extends JFrame {

    // Componentes de la interfaz gráfica
    private JTextField nombreField;
    private JButton buscarButton;
    private JTextArea resultadoArea;

    // Configuración de la conexión a la base de datos
    private static final String DB_URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10735060";
    private static final String DB_USER = "sql10735060";
    private static final String DB_PASSWORD = "7aYJyJh5zI";

    public BuscarPersonaGUI() {
        // Configuración de la ventana
        setTitle("Buscar Persona");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el enunciado y campo de texto
        JLabel nombreLabel = new JLabel("Buscar persona:");
        nombreField = new JTextField(20);

        // Crear el botón de búsqueda
        buscarButton = new JButton("Buscar");

        // Crear un área para mostrar el resultado con salto de línea
        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);
        resultadoArea.setEditable(false);

        // Usar un JScrollPane para el JTextArea en caso el texto sea largo
        JScrollPane scrollPane = new JScrollPane(resultadoArea);

        // Crear el layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Colocar los componentes en el layout
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(nombreLabel)
                    .addComponent(nombreField))
                .addComponent(buscarButton)
                .addComponent(scrollPane)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField))
                .addComponent(buscarButton)
                .addComponent(scrollPane)
        );

        // Acción del botón de búsqueda
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreABuscar = nombreField.getText();
                buscarPersonaEnBaseDatos(nombreABuscar);
            }
        });
    }

    public void buscarPersonaEnBaseDatos(String nombre) {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establecer conexión a la base de datos
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Crear la consulta SQL
            /*String consulta = "SELECT nombre, universidad, direccion FROM DB_POSTULANTESVF3F WHERE nombre = ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, nombre);*/

            // [INICIO] Modificación para permitir coincidencias parciales
            // Crear la consulta SQL con LIKE para coincidencia parcial
            String consulta = "SELECT nombre, universidad, direccion FROM DB_POSTULANTESVF3F WHERE nombre LIKE ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, "%" + nombre + "%"); // Buscar coincidencias parciales
            // [FIN] Modificación para permitir coincidencias parciales

// Ejecutar la consulta
            rs = ps.executeQuery();

            // Limpiar el área de resultados antes de mostrar nuevos datos
            resultadoArea.setText("");

            // Mostrar los resultados
            if (rs.next()) {
                String nombreResultado = rs.getString("nombre");
                String universidad = rs.getString("universidad");
                String direccion = rs.getString("direccion");

                resultadoArea.append("Nombre: " + nombreResultado + "\n");
                resultadoArea.append("Universidad: " + universidad + "\n");
                resultadoArea.append("Dirección: " + direccion + "\n");
            } else {
                resultadoArea.setText("Persona no encontrada.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            resultadoArea.setText("Error al conectar con la base de datos.");
        } finally {
            // Cerrar conexiones y liberar recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscarPersonaGUI().setVisible(true);
            }
        });
    }
}
