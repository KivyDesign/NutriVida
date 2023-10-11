/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HistorialData;
import Controlador.PacienteData;
import Modelo.Historial;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author german
 */
public class HistorialView extends javax.swing.JFrame {

    private DietasForm historiaDieta;
    private LocalDate ahora;
    private PacienteData pacData;
    private HistorialData historialData;
    private DefaultTableModel modelo = new DefaultTableModel();
    ;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    Border text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.YELLOW);
    Border text_border_disable = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
    Border text_border_rojo = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(232, 65, 24));

    public HistorialView() {
        initComponents();
        //creo un DietasForm
        historiaDieta = new DietasForm();
        pacData = new PacienteData();
        historialData = new HistorialData();
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        //traigo de DietasForm
        jlPaciente.setText(historiaDieta.nombrePac);
        jlPesoIni.setText(historiaDieta.pesoIni);
        jlPesoFin.setText(historiaDieta.pesoFin);
        //Para convertir fecha actual en String
        ahora = LocalDate.now();

        String fechaFormato;
        fechaFormato = ahora.format(formatter);
        jlFechaActual.setText(fechaFormato);
        armarCabecera();
        cargarHistorial(historiaDieta.IdPac);
        jtPesoRegistrado.setBorder(text_border);
        jtPesoRegistrado.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlPaciente = new javax.swing.JLabel();
        jlPesoIni = new javax.swing.JLabel();
        jlPesoFin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbAtras = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtPesoRegistrado = new javax.swing.JTextField();
        jlFechaActual = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(21, 65, 118));

        jPanel1.setBackground(new java.awt.Color(31, 75, 128));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jtHistorial.setBackground(new java.awt.Color(31, 75, 128));
        jtHistorial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtHistorial.setForeground(new java.awt.Color(255, 255, 255));
        jtHistorial.setMinimumSize(new java.awt.Dimension(90, 160));
        jScrollPane1.setViewportView(jtHistorial);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultas anteriores");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Paciente:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso Inicial:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peso Final:");

        jlPaciente.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jlPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jlPaciente.setText("jLabel6");

        jlPesoIni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlPesoIni.setForeground(new java.awt.Color(255, 255, 255));
        jlPesoIni.setText("jLabel7");

        jlPesoFin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlPesoFin.setForeground(new java.awt.Color(255, 255, 255));
        jlPesoFin.setText("jLabel8");

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));

        jlMensajeSB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Complete con peso actual del paciente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlMensajeSB)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jbAtras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6-32x32.png"))); // NOI18N
        jbAtras.setText("Volver");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-32x32.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3-32x32.png"))); // NOI18N
        jbGuardar.setText(" Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(29, 29, 29)
                .addComponent(jbAtras)
                .addGap(33, 33, 33)
                .addComponent(jbSalir)
                .addGap(46, 46, 46))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Consulta:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso Registrado:");

        jtPesoRegistrado.setBackground(new java.awt.Color(21, 65, 118));
        jtPesoRegistrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtPesoRegistrado.setForeground(new java.awt.Color(255, 255, 255));

        jlFechaActual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        jlFechaActual.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlPesoIni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlPesoFin))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtPesoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jlFechaActual)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlPaciente)
                    .addComponent(jLabel4)
                    .addComponent(jlPesoIni)
                    .addComponent(jLabel5)
                    .addComponent(jlPesoFin))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlFechaActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtPesoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        NutriVidaForm nutvidForm = new NutriVidaForm();
        nutvidForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        DietasForm dietasForm = new DietasForm();
        dietasForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {
            if (Double.parseDouble(jtPesoRegistrado.getText()) <= 0.00
                    || Double.parseDouble(jtPesoRegistrado.getText()) >= 500.00) {
                MensajeSB(2, "El peso comprenderse entre 0 y 500");
                jtPesoRegistrado.requestFocus();
                jtPesoRegistrado.selectAll();

            } else {
                Historial hist = new Historial(pacData.buscarPacientePorId(historiaDieta.IdPac),
                        Double.parseDouble(jtPesoRegistrado.getText()), ahora);
                historialData.guardarHistorial(hist);
                MensajeSB(1, "Consulta guardada con exito");
            }
        } catch (NumberFormatException ex) {
            MensajeSB(2, "El peso debe ser un número entre 0 y 500");
            jtPesoRegistrado.requestFocus();
            jtPesoRegistrado.selectAll();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFechaActual;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JLabel jlPaciente;
    private javax.swing.JLabel jlPesoFin;
    private javax.swing.JLabel jlPesoIni;
    private javax.swing.JTable jtHistorial;
    private javax.swing.JTextField jtPesoRegistrado;
    // End of variables declaration//GEN-END:variables
public void MensajeSB(int color, String mensaje) {

        // Los valores pueden variar de 0 a 255
        if (color == 1) {
            // Si el color es igual a 1 entonces es = a verde
            // En este caso Red = 0, Green = 153, Blue = 102.
            jlMensajeSB.setForeground(new Color(255, 255, 255));
        } else if (color == 2) {
            // Si el color es igual a 2 entonces es = a rojo
            // Los valores pueden variar de 0 a 255. En este caso Red = 153, Green = 51, Blue = 0.
            jlMensajeSB.setForeground(new Color(255, 50, 0));
        } else if (color == 3) {
            // Usado al iniciar el Form para que no se vea el texto dummy 31, 75, 128
            jlMensajeSB.setForeground(new Color(31, 75, 128));
        }
        // Aquí cargo el texto del mensaje en el Label
        // Si el texto del mensaje esta vacio entonces no muestro texto en
        // el Label pero limpio el texto anterior que pueda haber quedado
        jlMensajeSB.setText(mensaje);
    }

    private void cargarHistorial(int idPaciente) {

        ArrayList<Historial> historial = (ArrayList<Historial>) historialData.obtenerHistorialXId(idPaciente);

        if (historial != null) {
            for (Historial hist : historial) {
                modelo.addRow(new Object[]{
                    hist.getIdHistorial(),
                    hist.getFechaConsulta().format(formatter),
                    hist.getPeso(),});
            }
        }
    }

    private void armarCabecera() {
        modelo.addColumn("N° de Consulta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Peso registrado");

        jtHistorial.setModel(modelo);
    }
}
