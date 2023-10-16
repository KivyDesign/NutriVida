/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PacienteData;
import Modelo.Paciente;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author javier
 */
public class PacientesForm extends javax.swing.JFrame {

    // Creación de los bordes que utilizaremos en los TextFileds
    Border text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.YELLOW);
    Border text_border_disable = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
    Border text_border_rojo = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(232, 65, 24));
    private PacienteData pacData;

    /**
     * Creates new form PacientesForm
     */
    public PacientesForm() {
        initComponents();
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        pacData = new PacienteData();
        // Display the pacientes form in the center of the screen
        this.setLocationRelativeTo(null);
        jbDietaPersonal.setEnabled(false);
        // Set borders todos subrayados en amarillo a excepción del ID que es
        // blanco y de solo 1 pixel de grosor para indicar que no es editable
        jtfID.setBorder(text_border_disable);
        jtfNombre.setBorder(text_border);
        jtfDNI.setBorder(text_border);
        jtfDomicilio.setBorder(text_border);
        jtfTelefono.setBorder(text_border);
        jtfPesoActual.setBorder(text_border);

        // Posiciono el foco en el nombre al iniciar el form
        jtfNombre.requestFocus();

    }
    public static int nroId = -1;
    public static String nombreP = "";

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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jbDietaPersonal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfPesoActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Pacientes");

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Pacientes");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bienvenido Nuevamente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI:");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domicilio:");

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono:");
        jLabel8.setMaximumSize(new java.awt.Dimension(66, 17));
        jLabel8.setMinimumSize(new java.awt.Dimension(66, 17));

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");

        jcbEstado.setBackground(new java.awt.Color(21, 65, 118));
        jcbEstado.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcbEstado.setText("Activo");

        jtfID.setEditable(false);
        jtfID.setBackground(new java.awt.Color(21, 65, 118));
        jtfID.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));

        jtfNombre.setBackground(new java.awt.Color(21, 65, 118));
        jtfNombre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));

        jtfDNI.setBackground(new java.awt.Color(21, 65, 118));
        jtfDNI.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfDNI.setForeground(new java.awt.Color(255, 255, 255));

        jtfDomicilio.setBackground(new java.awt.Color(21, 65, 118));
        jtfDomicilio.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfDomicilio.setForeground(new java.awt.Color(255, 255, 255));

        jtfTelefono.setBackground(new java.awt.Color(21, 65, 118));
        jtfTelefono.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfTelefono.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));

        jbBuscar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1-32x32.png"))); // NOI18N
        jbBuscar.setText(" Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2-32x32.png"))); // NOI18N
        jbNuevo.setText(" Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
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

        jbEliminar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4-32x32.png"))); // NOI18N
        jbEliminar.setText(" Eliminar");

        jbSalir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-32x32.png"))); // NOI18N
        jbSalir.setText(" Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jbNuevo)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Paciente(int idPaciente, int dni, String nombre, String domicilio, String telefono, boolean estado)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlMensajeSB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbDietaPersonal.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbDietaPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8-32x32.png"))); // NOI18N
        jbDietaPersonal.setText(" Area Personal");
        jbDietaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDietaPersonalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Peso Actual:");
        jLabel3.setMaximumSize(new java.awt.Dimension(66, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(66, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(66, 19));

        jtfPesoActual.setBackground(new java.awt.Color(21, 65, 118));
        jtfPesoActual.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jtfPesoActual.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDNI)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jtfID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPesoActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addComponent(jbDietaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcbEstado))
                        .addGap(18, 18, 18)
                        .addComponent(jbDietaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // Por ahora solo cierro este form. Ampliar para ocultar el form actual
        // y mostrar el form del menu en su lugar
//        this.dispose();

        // Instancio el form de menu y lo hago visible mientras oculto el
        // form con pacientes
        NutriVidaForm nutvidForm = new NutriVidaForm();
        nutvidForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbDietaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDietaPersonalActionPerformed
        nroId = Integer.parseInt(jtfID.getText());
        nombreP = jtfNombre.getText();
        DietasForm dietForm = new DietasForm();
        dietForm.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbDietaPersonalActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            if (jtfDNI.getText().length() != 8) {
                MensajeSB(2, "Debe ser un DNI valido 8 Digitos");
                jtfDNI.requestFocus();
                jtfDNI.setBorder(text_border_rojo);
                jtfDNI.selectAll();
            } else {
                // Busco alumno por DNI
                Paciente paciente = pacData.buscarPacientePorDni(Integer.parseInt(jtfDNI.getText()));
                // Busco si el alumno no esta vacio
                if (paciente != null) {
                    jtfID.setText(paciente.getIdPaciente() + "");
                    jtfDomicilio.setText(paciente.getDomicilio());
                    jtfNombre.setText(paciente.getNombre());
                    jtfTelefono.setText(paciente.getTelefono());
                    jtfPesoActual.setText(paciente.getPesoActual() + "");
                    if (paciente.isEstado() == true) {
                        jcbEstado.setSelected(true);
                        jbGuardar.setEnabled(true);
                        jbEliminar.setEnabled(true);
                        jbNuevo.setEnabled(false);
                        MensajeSB(1, "Paciente encontrado");
                        jbDietaPersonal.setEnabled(true);
                    } else {
                        MensajeSB(2, "El DNI no es de un Paciente activo");
                        jbGuardar.setEnabled(true);
                        jtfDNI.setBorder(text_border_rojo);
                    }
                } else {
                    MensajeSB(2, "El DNI no es de un Paciente activo");
                    jtfDNI.requestFocus();
                    jtfDNI.selectAll();
                    jtfDNI.setBorder(text_border_rojo);
                }
            }
        } catch (NumberFormatException e) {
            MensajeSB(2, "El DNI debe ser un número");
            jtfDNI.requestFocus();
            jtfDNI.selectAll();
            jtfDNI.setBorder(text_border_rojo);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
            jtfNombre.requestFocus();
            jtfNombre.selectAll();

        } else if (jtfDNI.getText().length() != 8) {
            MensajeSB(2, "Debe ser un DNI valido de 8 digitos");
            jtfDNI.requestFocus();
            jtfDNI.selectAll();
            jtfDNI.setBorder(text_border_rojo);
        } else if (pacData.buscarPacientePorDni(Integer.parseInt(jtfDNI.getText())) != null) {
            MensajeSB(2, "El DNI ya esta utilizado en otro paciente");
            jtfDNI.requestFocus();
            jtfDNI.selectAll();
            jtfDNI.setBorder(text_border_rojo);
        } else if (jtfDomicilio.getText().isEmpty()) {
            MensajeSB(2, "Debe Agregar un domicilio");
            jtfDomicilio.requestFocus();
            jtfDomicilio.selectAll();
            jtfDomicilio.setBorder(text_border_rojo);
        } else if (jtfTelefono.getText().isEmpty()) {
            MensajeSB(2, "Debe Agregar un Telefono");
            jtfTelefono.requestFocus();
            jtfTelefono.selectAll();
            jtfTelefono.setBorder(text_border_rojo);
        } else if (!jtfTelefono.getText().matches("[0-9-]+")) {
            MensajeSB(2, "El telefono tiene que tener solo numeros y guiones medios (-)");
            jtfTelefono.requestFocus();
            jtfTelefono.selectAll();
            jtfTelefono.setBorder(text_border_rojo);
        } else if (jtfPesoActual.getText().isEmpty() || Double.parseDouble(jtfPesoActual.getText()) < 1
                || Double.parseDouble(jtfPesoActual.getText()) > 501) {
            MensajeSB(2, "Debe Agregar un peso valido entre 1 y 500");
            jtfPesoActual.requestFocus();
            jtfPesoActual.selectAll();
            jtfPesoActual.setBorder(text_border_rojo);
        } else {

            try {

                Paciente paciente = new Paciente(
                        Integer.parseInt(jtfDNI.getText()),
                        jtfNombre.getText(),
                        jtfDomicilio.getText(),
                        jtfTelefono.getText(),
                        Double.parseDouble(jtfPesoActual.getText()),
                        true);

                // Primero busco si existe para no agregarlo repetido y lo
                // inserto al paciente
                pacData.guardarPaciente(paciente);
                jtfID.setText(paciente.getIdPaciente() + "");
                jcbEstado.setSelected(true);
                // Si lo agregue con exito no es null y se lo informo al DataEntry
                if (pacData.buscarPacientePorDni(Integer.parseInt(jtfDNI.getText())) != null) {
                    MensajeSB(1, "Paciente agregado con exito! Busque por DNI o cargue un nuevo Paciente");
//                    LimpiarCampos();//no los limpio porque me sirven para cargar nueva dieta
                    jbDietaPersonal.setEnabled(true);
                    jbNuevo.setEnabled(false);
                    jbEliminar.setEnabled(true);
                    jbGuardar.setEnabled(true);
                    jbBuscar.setEnabled(false);
                    // Set borders todos subrayados en amarillo a excepción del ID que es
                    // blanco y de solo 1 pixel de grosor para indicar que no es editable
                    jtfID.setBorder(text_border_disable);
                    jtfNombre.setBorder(text_border);
                    jtfDNI.setBorder(text_border);
                    jtfDomicilio.setBorder(text_border);
                    jtfTelefono.setBorder(text_border);
                    jtfPesoActual.setBorder(text_border);

                    // Posiciono el foco en el nombre al iniciar el form
                    jtfNombre.requestFocus();

                } else {
                    MensajeSB(2, "ERROR: El paciente no se pudo agregar");
                }
            } catch (NumberFormatException e) {
                MensajeSB(2, "El peso debe ser un número");
                jtfPesoActual.requestFocus();
                jtfPesoActual.selectAll();
                jtfPesoActual.setBorder(text_border_rojo);
            }
    }//GEN-LAST:event_jbNuevoActionPerformed
    }
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        // Desabilito RadioButon porque el sistema utiliza borrado lógico
        jcbEstado.setEnabled(false);
        try {
            if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
                jtfNombre.requestFocus();
                jtfNombre.selectAll();

            } else if (jtfDNI.getText().length() != 8) {
                MensajeSB(2, "Debe ser un DNI valido de 8 digitos");
                jtfDNI.requestFocus();
                jtfDNI.selectAll();
                jtfDNI.setBorder(text_border_rojo);
//        } else if (pacData.buscarPacientePorDni(Integer.parseInt(jtfDNI.getText())) != null) {
//            MensajeSB(2, "El DNI ya esta utilizado en otro paciente");
//            jtfDNI.requestFocus();
//            jtfDNI.selectAll();
//            jtfDNI.setBorder(text_border_rojo);
            } else if (jtfDomicilio.getText().isEmpty()) {
                MensajeSB(2, "Debe Agregar un domicilio");
                jtfDomicilio.requestFocus();
                jtfDomicilio.selectAll();
                jtfDomicilio.setBorder(text_border_rojo);
            } else if (jtfTelefono.getText().isEmpty()) {
                MensajeSB(2, "Debe Agregar un Telefono");
                jtfTelefono.requestFocus();
                jtfTelefono.selectAll();
                jtfTelefono.setBorder(text_border_rojo);
            } else if (!jtfTelefono.getText().matches("[0-9-]+")) {
                MensajeSB(2, "El telefono tiene que tener solo numeros y guiones medios (-)");
                jtfTelefono.requestFocus();
                jtfTelefono.selectAll();
                jtfTelefono.setBorder(text_border_rojo);
            } else if (jtfPesoActual.getText().isEmpty()) {
                MensajeSB(2, "Debe Agregar un peso valido");
                jtfPesoActual.requestFocus();
                jtfPesoActual.selectAll();
                jtfPesoActual.setBorder(text_border_rojo);
            }
        } catch (NumberFormatException e) {
            MensajeSB(2, "El peso debe ser un número");
            jtfPesoActual.requestFocus();
            jtfPesoActual.selectAll();
            jtfPesoActual.setBorder(text_border_rojo);

        }
    }

    {


    }//GEN-LAST:event_jbGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(PacientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacientesForm().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbDietaPersonal;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPesoActual;
    private javax.swing.JTextField jtfTelefono;
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

    public void LimpiarCampos() {
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfDomicilio.setText("");
        jtfTelefono.setText("");
        jtfPesoActual.setText("");
        jcbEstado.setSelected(false);
        jtfID.setText("");
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }

    public boolean PruebaDeCaracteres(String texto) {
        // Verifico si el texto contiene solo letras y espacios
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!(Character.isLetter(c) || c == ' ')) {
                MensajeSB(2, "El campo Nombre deben completarse con letras y espacios");
                jtfNombre.requestFocus();
                jtfNombre.selectAll();
                jtfNombre.setBorder(text_border_rojo);
                return false;
            }
        }

        // Verifico si el texto está vacío
        if (texto.isEmpty()) {
            MensajeSB(2, "El campo Nombre no puede estar vacío");
            jtfNombre.requestFocus();
            jtfNombre.selectAll();
            jtfNombre.setBorder(text_border_rojo);
            return false;
        }

        // Verificar si el texto comienza o termina con un espacio
        if (texto.startsWith(" ") || texto.endsWith(" ")) {
            MensajeSB(2, "El campo Nombre no puede comenzar o terminar con un espacio");
            jtfNombre.requestFocus();
            jtfNombre.selectAll();

            return false;
        }

        return true;
    }

}
