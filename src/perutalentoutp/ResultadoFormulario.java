package perutalentoutp;
//importamos lo que se usara en el formulario de salida
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author Franco RM
 */


public class ResultadoFormulario extends javax.swing.JFrame {

// Declaramos Jtable para usarlo en la salida de datos de nuestra busqueda    
private JTable table;

    public ResultadoFormulario(ArrayList<String[]> resultados) {
        //configuramos el titulo y forma de la tabla
        setTitle("Resultados de la Búsqueda");
        setSize(1100, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Configuramos la tabla para indicar que se mostrara
        String[] columnNames = {"Nombres","Apellido Paterno","Apellido Materno","Edad", "Carrera", "Formación", "Curso", "Conocimiento", "Experiencia", "Idioma", "WhatsApp", "Telefono", "Perfil Linkedln"};
        
        // Creamos el modelo de la tabla con una clase anónima para que no sea editable
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer todas las celdas no editables
            }
        };
    
        table = new JTable(model);
               
          // Agregar datos a la tabla de la BD
        for (String[] row : resultados) {
            model.addRow(row);
        }

        // Agregar la tabla al formulario de salida
        add(new JScrollPane(table));
        setVisible(true);
        
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Método main
     public static void main(String args[]) {
       //usamos los arreglos de array para que imprima y guarde la busqueda  
       ArrayList<String[]> resultados = new ArrayList<>();
                        
         java.awt.EventQueue.invokeLater(() -> {
            new ResultadoFormulario(resultados).setVisible(true);
         });
    }
}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
