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

    // Lo que vamos a usar en la interfaz
    private JTextField nombreField;
    private JButton buscarButton;
    private JTextArea resultadoArea;

    // Conexion a la base de datos server con mysql
    private static final String DB_URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10735060";
    private static final String DB_USER = "sql10735060";
    private static final String DB_PASSWORD = "7aYJyJh5zI";

    public BuscarPersonaGUI() {
        // ajustamos ventanita de programa
        setTitle("Buscar Talento");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Colocamos el texto de etiqueta
        JLabel nombreLabel = new JLabel("Buscar persona:");
        nombreField = new JTextField(20);

        // boton de busqueda
        buscarButton = new JButton("Buscar");

        // area de resultado y que salte linea por cada resultado
        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);
        resultadoArea.setEditable(false);

        // le metemos su scroll si es que hay muchas coincidencias
        JScrollPane scrollPane = new JScrollPane(resultadoArea);

        // Creamos el layout
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

        // le damos la funcion al boton de busqueda
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
              // Conexion a la base de datos server con mysql
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Crear la consulta SQL con LIKE para coincidencia parcial esto lo uso Jhordy y le agragamos mas datos de resultado
            String consulta = "SELECT nombre, universidad, direccion, telefono , Ultimotrabajo  FROM DB_POSTULANTESVF3F WHERE nombre LIKE ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, "%" + nombre + "%"); // Buscar coincidencias parciales que tengan similitud en todo el nombre 

            // Ejecutar la consulta dentro de la BD
            rs = ps.executeQuery();

            // Limpiamos resultados antes de mostrar nuevos resultados
            resultadoArea.setText("");

            // Procesar los resultados con los pedidos que tenemos
            int contador = 1;  // Para numerar las personas encontradas
            while (rs.next()) {
                String nombreResultado = rs.getString("nombre");
                String universidad = rs.getString("universidad");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String Ultimotrabajo = rs.getString("Ultimotrabajo");
               

                // Agregar cada linea a los resultado de la busqueda que le hicimos
                resultadoArea.append(contador + ".\n");
                resultadoArea.append("Nombre de Postulante: " + nombreResultado + "\n");
                resultadoArea.append("Carrera Profesional: " + universidad + "\n");
                resultadoArea.append("Dirección: " + direccion + "\n");
                resultadoArea.append("Telefono de Contacto: " + telefono + "\n");
                resultadoArea.append("Ultimo Lugar de Trabajo: " + Ultimotrabajo + "\n\n");

                contador++; // Incrementamos el contador 
            }

            // Si no hay resultados
            if (contador == 1) {
                resultadoArea.setText("Persona no encontrada.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            resultadoArea.setText("Error al conectar con la base de datos.");
        } finally {
            // dejamos de buscar y cerramos consulta
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
            // llamamos a la clase
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscarPersonaGUI().setVisible(true);
            }
        });
    }
}

