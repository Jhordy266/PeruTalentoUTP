package perutalentoutp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author Franco RM
 */


public class ResultadoFormulario extends javax.swing.JFrame {

    
  private JTable table;

    public ResultadoFormulario(ArrayList<String[]> resultados) {
        initComponents();
        setTitle("Resultados de la Búsqueda");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Configurar la tabla
        String[] columnNames = {"Nombre", "Carrera", "Formación", "Curso", "Experiencia", "Conocimiento", "Idioma"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
               
          // Agregar datos a la tabla
        for (String[] row : resultados) {
            model.addRow(row);
        }

        // Agregar la tabla al formulario
        add(new JScrollPane(table));
        
        
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
         
       // ArrayList<String[]> resultados = new ArrayList<>();
        //resultados.add(new String[]{"Juan Pérez", "Ingeniería", "Licenciatura", "Java", "5 años", "SQL", "Inglés"});
       // resultados.add(new String[]{"Ana Gómez", "Medicina", "Máster", "Biología", "3 años", "Ninguno", "Francés"});

                  
        ArrayList<String[]> resultados = new ArrayList<>();
                   
         java.awt.EventQueue.invokeLater(() -> {
            new ResultadoFormulario(resultados).setVisible(true);
         });
    }
}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
