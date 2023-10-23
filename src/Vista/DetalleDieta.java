/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ComidaData;
import Controlador.DietaComidaData;
import Controlador.DietaData;
import Modelo.Comida;
import Modelo.DietaComida;
import Modelo.Horario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author german
 */
public class DetalleDieta extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private ComidaData comData;
    private DietaComidaData dietaComidaData;
    private DietasForm dietasForm;
    private DietaData dietaData;
    private int nuevaPorcion;

    public DetalleDieta() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel() {
            // Clase Interna Anónima
            public boolean isCellEditable(int fila, int columna) {
                // Si retorno true las celdas son todas editables, con false
//             ninguna celda es editable
                if (columna == 1) {
                    return true;
                }
                return false;
            }
        };
        comData = new ComidaData();
        dietaComidaData = new DietaComidaData();
        dietasForm = new DietasForm();
        dietaData = new DietaData();
        jLNombre.setText(dietasForm.nombreDiet);
        borrarFilasTabla();
        armarCabecera();
        cargarContenido();
        cargarComidas();
        cargarHorarios();
//        listSelectionListener();

        // Al modelo de la jTable le agrego un ListModelListener que me permite
        // operar sobre los cambios realizados en una celda
        anadeListenerAlModelo();

        jbModificar.setEnabled(false);
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
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbComidas = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jCComidas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcHorario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtPorcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcontenido = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalles de la Dieta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Agregue nueva comida,modifique cantidad, si desea eliminar coloque cantidad 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jlMensajeSB)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Nombre: ");

        jLNombre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("jLabel3");

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jbAgregar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbComidas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-32x32.png"))); // NOI18N
        jbComidas.setText("Salir");
        jbComidas.setActionCommand(" Salir");
        jbComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComidasActionPerformed(evt);
            }
        });

        jbVolver.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6-32x32.png"))); // NOI18N
        jbVolver.setText(" Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbComidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horario");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Comida");

        jcHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcHorarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porcion en unidades o gramos:");

        jtPorcion.setBackground(new java.awt.Color(21, 65, 118));
        jtPorcion.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jtPorcion.setForeground(new java.awt.Color(255, 255, 255));

        jTcontenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTcontenido);

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contenido de la dieta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLNombre))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        DietasForm dietasForm = new DietasForm();
        dietasForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComidasActionPerformed
 NutriVidaForm nutvidForm = new NutriVidaForm();
        nutvidForm.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_jbComidasActionPerformed

    private void jcHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcHorarioActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            if (Integer.parseInt(jtPorcion.getText()) < 1 || Integer.parseInt(jtPorcion.getText()) > 1000) {
                MensajeSB(2, "La porcion debe ser un entero entre 1 y 1000");
                jtPorcion.requestFocus();
                jtPorcion.selectAll();
            } else {
                //armo y guardo nueva dietaComida
                dietaComidaData.guardarDietaComida(new DietaComida(
                        (Comida) jCComidas.getSelectedItem(),
                        dietaData.buscarDietaPorId(dietasForm.idDieta),
                        Integer.parseInt(jtPorcion.getText()),
                        (Horario) jcHorario.getSelectedItem()));
                borrarFilasTabla();
                cargarContenido();
                jtPorcion.setText(null);
                MensajeSB(1, "Comida agregada a Dieta exitosamente");
            }
        } catch (NumberFormatException e) {
            MensajeSB(2, "La porcion debe ser un entero entre 1 y 1000");
            jtPorcion.requestFocus();
            jtPorcion.selectAll();
        }


    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filas = jTcontenido.getRowCount();
        for (int fila = 0; fila < filas; fila++) {
            if (Integer.parseInt(jTcontenido.getValueAt(fila, 1).toString()) == 0) {
                dietaComidaData.eliminarDietaComida(Integer.parseInt(jTcontenido.getValueAt(fila, 0).toString()));
                MensajeSB(1, "Comida eliminada exitosamente");
            } else {
                dietaComidaData.modificarPorcion(Integer.parseInt(jTcontenido.getValueAt(fila, 0).toString()),
                        Integer.parseInt(jTcontenido.getValueAt(fila, 1).toString()));
                MensajeSB(1, "Unidades/gramos Actualizadas");
            }
    }//GEN-LAST:event_jbModificarActionPerformed
        jbModificar.setEnabled(false);
        borrarFilasTabla();
        cargarContenido();
    }

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
            java.util.logging.Logger.getLogger(DetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleDieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Comida> jCComidas;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTcontenido;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbComidas;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Horario> jcHorario;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JTextField jtPorcion;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Unid./gramos");
        modelo.addColumn("Comida");
        modelo.addColumn("Horario");

        jTcontenido.setModel(modelo);
        jTcontenido.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTcontenido.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTcontenido.getColumnModel().getColumn(2).setPreferredWidth(220);
        jTcontenido.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    private void cargarContenido() {
        ArrayList<DietaComida> dietaComida = (ArrayList<DietaComida>) dietaComidaData.listarDietaComidas(dietasForm.idDieta);
        if (dietaComida != null) {
            for (DietaComida cont : dietaComida) {
                modelo.addRow(new Object[]{
                    cont.getIdDietaComida(),
                    cont.getPorcion(),
                    cont.getComida().getNombre(),
                    cont.getHorario()});
            }
        } else {
            System.out.println("error dieta comida null");
        }
    }

    private void cargarComidas() {
        // Limpio el ComboBox
        jCComidas.removeAllItems();

        // Cargamos las comidas en el ComboBox
        for (Comida listar : comData.listarComidas()) {
            jCComidas.addItem(listar);
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

    public void cargarHorarios() {
        // Limpio el ComboBox
        jcHorario.removeAllItems();
        jcHorario.addItem(Horario.DESAYUNO);
        jcHorario.addItem(Horario.ALMUERZO);
        jcHorario.addItem(Horario.MERIENDA);
        jcHorario.addItem(Horario.CENA);
        jcHorario.addItem(Horario.SNACK);

    }

    public void anadeListenerAlModelo() {
        jTcontenido.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent evento) {
                cambioPorcion(evento);
            }
        });
    }

    public void cambioPorcion(TableModelEvent evento) {
        // Solo se trata el evento UPDATE, correspondiente al cambio de valor
        // de una celda.
        if (evento.getType() == TableModelEvent.UPDATE) {

            // Se obtiene el modelo de la tabla y la fila/columna que han cambiado.
            int fila = evento.getFirstRow();
            int columna = evento.getColumn();
            int c = 0;

            try {
                Object nueva = jTcontenido.getValueAt(fila, columna);
                int pars = Integer.parseInt(nueva.toString());
                if (pars >= 0 && pars <= 1000) {
                    c++;
                    nuevaPorcion = pars;
                    if (c == 1) {
                        jbModificar.setEnabled(true);
                    }
                } else {
                    MensajeSB(2, "El valor debe ser un entero entre 0 y 1000");
                    jTcontenido.setValueAt(nuevaPorcion, fila, columna);
                    jbModificar.setEnabled(false);
                }
            } catch (NumberFormatException e) {
                MensajeSB(2, "El valor debe ser un entero entre 0 y 1000");
                jTcontenido.setValueAt(nuevaPorcion, fila, columna);
                jbModificar.setEnabled(false);
            }
        }
    }

    public void listSelectionListener() {
        jTcontenido.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evento) {
                int filaSeleccionada = jTcontenido.getSelectedRow();
                int columnaSeleccionada = jTcontenido.getSelectedColumn();

                if (jTcontenido.isCellEditable(filaSeleccionada, columnaSeleccionada) && filaSeleccionada >= 0 && columnaSeleccionada >= 0) {
                    Object valor = jTcontenido.getValueAt(filaSeleccionada, columnaSeleccionada);
                    nuevaPorcion = Integer.parseInt(valor.toString());
                }
            }
        });
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
}
