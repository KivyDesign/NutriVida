/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DietaData;
import Controlador.PacienteData;
import Modelo.Dieta;
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
public class DietasForm extends javax.swing.JFrame {

    // Creación de los bordes que utilizaremos en los TextFileds
    Border text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.YELLOW);
    Border text_border_disable = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
    Border text_border_rojo = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(232, 65, 24));
    private DietaData dietadata;
    private PacienteData pacienteData;
    private PacientesForm numId;
    private LocalDate ahora;

    /**
     * Creates new form DietasForm
     */
    public DietasForm() {
        initComponents();
        dietadata = new DietaData();
        pacienteData = new PacienteData();
        //creo objeto clase PacientesForm
        numId = new PacientesForm();
        // Display the pacientes form in the center of the screen
        this.setLocationRelativeTo(null);
        ahora = LocalDate.now();

        //busco dieta cuyo id esta asociado al id paciente de PacientesForm
        Dieta dieta = dietadata.buscarDietaporIdPaciente(numId.nroId);
        //si no es nula cargo formularioPacientesForm numId = new PacientesForm();

        if (dieta
                != null) {
            jbNuevo.setEnabled(false);
            jtfID.setText(dieta.getIdDieta() + "");
            jtfID.setEnabled(false);
            jtfNombre.setText(dieta.getNombre());
            jtfPaciente.setText(dieta.getPaciente().getNombre());
            jtfPaciente.setEnabled(false);
            jtfPesoInicial.setText(dieta.getPesoInicial() + "");
            jtfPesoFinal.setText(dieta.getPesoFinal() + "");
            jDateChooser1.setDate(Date.from(dieta.getFechaInicial().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
            jDateChooser2.setDate(Date.from(dieta.getFechaFinal().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
            if (dieta.getFechaFinal().compareTo(ahora) <= 0) {
                MensajeSB(2, "La fecha de culminacion de la dieta se venció");

            }
            jCheckBox1.setSelected(dieta.isEstado());
            jCheckBox1.setEnabled(false);
        } else {

            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbSeguimiento.setEnabled(false);
            jbGuardar.setEnabled(false);
            jtfID.setEnabled(false);
            jbDetalleDieta.setEnabled(false);
            jtfPaciente.setText(numId.nombreP);
            jtfPaciente.setEditable(false);
            jCheckBox1.setEnabled(false);
            // Set borders todos subrayados en amarillo a excepción del ID que es
            // blanco y de solo 1 pixel de grosor para indicar que no es editable
            jtfID.setBorder(text_border_disable);
            jtfNombre.setBorder(text_border);
//            jtfPaciente.setBorder(text_border);
            jtfPesoInicial.setBorder(text_border);
            jtfPesoFinal.setBorder(text_border);
            MensajeSB(7, "No se encontro dieta para este Paciente cree una nueva");
        }

    }
    public static String nombrePac = "";
    public static String pesoIni = "";
    public static String pesoFin = "";
    public static int IdPac;
    public static int idDieta;
    public static String nombreDiet = "";

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
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbVolver = new javax.swing.JButton();
        jbSeguimiento = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbDetalleDieta = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfPaciente = new javax.swing.JTextField();
        jtfPesoInicial = new javax.swing.JTextField();
        jtfPesoFinal = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dieta Personal");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bienvenido Nuevamente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 48));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Puede modificar o eliminar dieta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlMensajeSB)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Paciente:");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso Inicial:");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso Final:");

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha Inicial:");

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Final:");

        jLabel10.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado:");

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jbVolver.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6-32x32.png"))); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jbSeguimiento.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbSeguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1-32x32.png"))); // NOI18N
        jbSeguimiento.setText("Seguimiento");
        jbSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeguimientoActionPerformed(evt);
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
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbDetalleDieta.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbDetalleDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7-32x32.png"))); // NOI18N
        jbDetalleDieta.setText(" Detalle Dieta");
        jbDetalleDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalleDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbDetalleDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSeguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jbDetalleDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSeguimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbVolver)
                .addContainerGap())
        );

        jtfID.setEditable(false);
        jtfID.setBackground(new java.awt.Color(21, 65, 118));
        jtfID.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));

        jtfNombre.setBackground(new java.awt.Color(21, 65, 118));
        jtfNombre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));

        jtfPaciente.setBackground(new java.awt.Color(21, 65, 118));
        jtfPaciente.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfPaciente.setForeground(new java.awt.Color(255, 255, 255));

        jtfPesoInicial.setBackground(new java.awt.Color(21, 65, 118));
        jtfPesoInicial.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfPesoInicial.setForeground(new java.awt.Color(255, 255, 255));

        jtfPesoFinal.setBackground(new java.awt.Color(21, 65, 118));
        jtfPesoFinal.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfPesoFinal.setForeground(new java.awt.Color(255, 255, 255));

        jDateChooser1.setBackground(new java.awt.Color(21, 65, 118));
        jDateChooser1.setMaxSelectableDate(new java.util.Date(1735704116000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(1672545716000L));

        jDateChooser2.setBackground(new java.awt.Color(21, 65, 118));
        jDateChooser2.setMaxSelectableDate(new java.util.Date(1735704116000L));
        jDateChooser2.setMinSelectableDate(new java.util.Date(1672545716000L));

        jCheckBox1.setBackground(new java.awt.Color(21, 65, 118));
        jCheckBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Activo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPaciente)
                                .addComponent(jtfPesoInicial)
                                .addComponent(jtfPesoFinal)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfID)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtfPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // Por ahora solo cierro este form. Ampliar para ocultar el form actual
        // y mostrar el form del menu en su lugar
//        this.dispose();

        // Instancio el form de menu y lo hago visible mientras oculto el
        // form con dietas
        PacientesForm pacientesForm = new PacientesForm();
        pacientesForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            MensajeSB(2, "Falta completar Fechas");
        } else if (jDateChooser1.getDate().compareTo(jDateChooser2.getDate()) >= 0) {
            MensajeSB(2, "la fecha inicial debe ser menor que la final");
        } else if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
            jtfNombre.requestFocus();
            jtfNombre.selectAll();
            jtfNombre.setBorder(text_border_rojo);
            // Posiciono el foco en el nombre al iniciar el form
        } else {
            try {
                if (Double.parseDouble(jtfPesoInicial.getText()) <= 0.00
                        || Double.parseDouble(jtfPesoInicial.getText()) >= 500.00) {
                    MensajeSB(2, "El peso inicial debe comprenderse entre 0 y 500");
                    jtfPesoInicial.requestFocus();
                    jtfPesoInicial.selectAll();
                    jtfPesoInicial.setBorder(text_border_rojo);
                } else if (Double.parseDouble(jtfPesoFinal.getText()) <= 0.00
                        || Double.parseDouble(jtfPesoFinal.getText()) >= 500.00) {
                    MensajeSB(2, "El peso final debe comprenderse entre 0 y 500");
                    jtfPesoFinal.requestFocus();
                    jtfPesoFinal.selectAll();
                    jtfPesoFinal.setBorder(text_border_rojo);
                } else {

                    Dieta dieta = new Dieta(jtfNombre.getText(), pacienteData.buscarPacientePorId(numId.nroId), Double.parseDouble(jtfPesoInicial.getText()),
                            Double.parseDouble(jtfPesoFinal.getText()),
                            jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                            jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                            true);
                    dietadata.guardarDieta(dieta);
                    jtfID.setText(dieta.getIdDieta() + "");
                    MensajeSB(1, "Dieta guardada con exito");
                    jCheckBox1.setSelected(true);
                    jbNuevo.setEnabled(false);
                    jbEliminar.setEnabled(true);
                    jbGuardar.setEnabled(true);
                    jbSeguimiento.setEnabled(true);
                    jbDetalleDieta.setEnabled(true);
                }
            } catch (NumberFormatException ex) {
                MensajeSB(2, "los pesos deben comprenderse entre 0 y 500");
            }
        }


    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            MensajeSB(2, "Falta completar Fechas");
        } else if (jDateChooser1.getDate().compareTo(jDateChooser2.getDate()) >= 0) {
            MensajeSB(2, "la fecha inicial debe ser menor que la final");
        } else if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
            jtfNombre.requestFocus();
            jtfNombre.selectAll();
            // Posiciono el foco en el nombre al iniciar el form
        } else {
            try {
                if (Double.parseDouble(jtfPesoInicial.getText()) <= 0.00
                        || Double.parseDouble(jtfPesoInicial.getText()) >= 500.00
                        || Double.parseDouble(jtfPesoFinal.getText()) <= 0.00
                        || Double.parseDouble(jtfPesoFinal.getText()) >= 500.00) {
                    MensajeSB(2, "los pesos deben comprenderse entre 0 y 500");
                } else {
                    jtfPaciente.setText(numId.nombreP);
                    jtfPaciente.setEditable(false);
                    Dieta dieta = new Dieta(Integer.parseInt(jtfID.getText()), jtfNombre.getText(), pacienteData.buscarPacientePorId(numId.nroId), Double.parseDouble(jtfPesoInicial.getText()),
                            Double.parseDouble(jtfPesoFinal.getText()),
                            jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                            jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                            true);
                    dietadata.modificarDieta(dieta);
                    MensajeSB(1, "Modificacion guardada con exito");
                }
            } catch (NumberFormatException ex) {
                MensajeSB(2, "los pesos deben comprenderse entre 0 y 500");
            }
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        dietadata.eliminarDietaPorId(Integer.parseInt(jtfID.getText()));
        MensajeSB(1, "Dieta eliminada con exito. Ahora puede asignar una nueva");
        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbSeguimiento.setEnabled(false);
        jbGuardar.setEnabled(false);
        jtfID.setEnabled(false);
        jtfPaciente.setText(numId.nombreP);
        jtfPaciente.setEditable(false);
        jtfID.setText(null);
        jtfNombre.setText(null);
        jtfPesoInicial.setText(null);
        jtfPesoFinal.setText(null);
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);
        jtfID.setBorder(text_border_disable);
        jtfNombre.setBorder(text_border);
//            jtfPaciente.setBorder(text_border);
        jtfPesoInicial.setBorder(text_border);
        jtfPesoFinal.setBorder(text_border);
        jbNuevo.setEnabled(true);
        jbDetalleDieta.setEnabled(false);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeguimientoActionPerformed
        nombrePac = jtfPaciente.getText();
        pesoIni = jtfPesoInicial.getText();
        pesoFin = jtfPesoFinal.getText();
        IdPac = numId.nroId;
        HistorialView historialView = new HistorialView();
        historialView.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbSeguimientoActionPerformed

    private void jbDetalleDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleDietaActionPerformed

        idDieta = Integer.parseInt(jtfID.getText());
        nombreDiet = jtfNombre.getText();
        DetalleDieta detalleDieta = new DetalleDieta();
        detalleDieta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbDetalleDietaActionPerformed

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
            java.util.logging.Logger.getLogger(DietasForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietasForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietasForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietasForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton jbDetalleDieta;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSeguimiento;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPaciente;
    private javax.swing.JTextField jtfPesoFinal;
    private javax.swing.JTextField jtfPesoInicial;
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

    public boolean PruebaDeCaracteres(String texto) {
        // Busco si los caracteres ingresados son letras
        int b = 0;
        int i = 0;
        for (i = 0; i < texto.length(); i++) {
            if (!(texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') && !(texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') && texto.charAt(i) != ' ') {
                b++;
            }
        }
        if (b > 0 || texto.isEmpty()) {
            MensajeSB(2, "Los campos Nombre de Dieta debe completarse con letras");
            return false;
        } else {
            return true;
        }
    }

}
