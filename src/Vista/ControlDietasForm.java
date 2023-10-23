package Vista;

import Controlador.Conexion;
import Controlador.DietaData;
import Modelo.Dieta;
import java.awt.Color;
import java.sql.Connection;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControlDietasForm extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DietaData dietaData;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public ControlDietasForm() {
        initComponents();

        // =====================================================================
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            this.setTitle("Sistema de Gestión NutriVida - Estado: Conectado");
            // Configuro de color verde el panel del titulo principal
            jpConexion.setBackground(new Color(0, 153, 102));
        } else {
            this.setTitle("Sistema de Gestión NutriVida - Estado: Error");
            // Configuro de color rojo el panel del titulo principal
            jpConexion.setBackground(new Color(255, 50, 0));
        }
        
        // Display the pacientes form in the center of the screen
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        dietaData = new DietaData();
        armarCabecera();
        cargarDietas();
        jBVolver.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpConexion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDieta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jBVolver = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBTerminadasNLogradas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));
        jPanel2.setPreferredSize(new java.awt.Dimension(366, 97));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de Dietas");

        jpConexion.setBackground(new java.awt.Color(21, 65, 118));
        jpConexion.setPreferredSize(new java.awt.Dimension(16, 100));

        javax.swing.GroupLayout jpConexionLayout = new javax.swing.GroupLayout(jpConexion);
        jpConexion.setLayout(jpConexionLayout);
        jpConexionLayout.setHorizontalGroup(
            jpConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jpConexionLayout.setVerticalGroup(
            jpConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Bienvenido Nuevamente");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Figuran solo pacientes Activos, ordenadas por fecha de finalizacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlMensajeSB)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTDieta);

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jBVolver.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jBVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6-32x32.png"))); // NOI18N
        jBVolver.setText(" Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-32x32.png"))); // NOI18N
        jBSalir.setText(" Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBTerminadasNLogradas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jBTerminadasNLogradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12-32x32.png"))); // NOI18N
        jBTerminadasNLogradas.setText(" Sin Lograr");
        jBTerminadasNLogradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTerminadasNLogradasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTerminadasNLogradas, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jBTerminadasNLogradas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jBVolver)
                .addGap(29, 29, 29)
                .addComponent(jBSalir)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dietas terminadas y vigentes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTerminadasNLogradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTerminadasNLogradasActionPerformed
        borrarFilasTabla();
        cargarDietasNoCumplidas();
        jBVolver.setEnabled(true);
        MensajeSB(1, "Listado de dietas finalizadas que no se llego al peso requerido");
    }//GEN-LAST:event_jBTerminadasNLogradasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        NutriVidaForm nutvidForm = new NutriVidaForm();
        nutvidForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        borrarFilasTabla();
        cargarDietas();
        jBVolver.setEnabled(false);
        MensajeSB(1, "Figuran solo Pacientes Activos, ordenados por fecha de finalización");
    }//GEN-LAST:event_jBVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ControlDietasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlDietasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlDietasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlDietasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlDietasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBTerminadasNLogradas;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDieta;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JPanel jpConexion;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        // modelo.addColumn("ID");
        modelo.addColumn("Nombre Paciente");
        modelo.addColumn("D.N.I.");
        modelo.addColumn("P. buscado");
        modelo.addColumn("P. llegado");
        modelo.addColumn("Fecha Final");

        jTDieta.setModel(modelo);
        // jTDieta.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTDieta.getColumnModel().getColumn(0).setPreferredWidth(220);
        jTDieta.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTDieta.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTDieta.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTDieta.getColumnModel().getColumn(4).setPreferredWidth(120);
    }

    private void cargarDietas() {

        ArrayList<Dieta> dietas = (ArrayList<Dieta>) dietaData.listarDietas();

        if (dietas != null) {
            for (Dieta dieta : dietas) {
                modelo.addRow(new Object[]{
                    //   dieta.getPaciente().getIdPaciente(),
                    dieta.getPaciente().getNombre(),
                    dieta.getPaciente().getDni(),
                    dieta.getPesoFinal(),
                    dieta.getPaciente().getPesoActual(),
                    dieta.getFechaFinal().format(formatter),});
            }
        }
    }

    public void borrarFilasTabla() {
        // Con este metodo puedo borrar una fila especifica al recorrer el modelo
        // Controlar que no este vacio o cargarlo desde el comienzo
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            if (modelo.getRowCount() > 0) {
                for (int i = a; i >= 0; i--) {
                    modelo.removeRow(i);
                }
            }
        }
    }

    private void cargarDietasNoCumplidas() {

        ArrayList<Dieta> dietas = (ArrayList<Dieta>) dietaData.listarDietasNoCumplidas();

        if (dietas != null) {
            for (Dieta dieta : dietas) {
                modelo.addRow(new Object[]{
                    //    dieta.getPaciente().getIdPaciente(),
                    dieta.getPaciente().getNombre(),
                    dieta.getPaciente().getDni(),
                    dieta.getPesoFinal(),
                    dieta.getPaciente().getPesoActual(),
                    dieta.getFechaFinal().format(formatter),});
            }
        }
    }

    public void MensajeSB(int color, String mensaje) {

        if (color == 1) {
            jlMensajeSB.setForeground(new Color(255, 255, 255));
        } else if (color == 2) {
            jlMensajeSB.setForeground(new Color(255, 50, 0));
        } else if (color == 3) {

            jlMensajeSB.setForeground(new Color(31, 75, 128));
        }

        jlMensajeSB.setText(mensaje);
    }
}
