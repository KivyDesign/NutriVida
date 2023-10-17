/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ComidaData;
import Controlador.Conexion;
import Modelo.Comida;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author javier
 */
public class ComidasForm extends javax.swing.JFrame {

    private ComidaData comData;
    // Creación de los bordes que utilizaremos en los TextFileds
    Border text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.YELLOW);
    Border text_border_disable = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
    Border text_border_rojo = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(232, 65, 24));

//    private CaloriasForm recibir;
    private boolean e = true;
    
    public static String caloriasR = "";
    private CaloriasForm caloriasR2;
    
    /**
     * Creates new form ComidasForm
     */
    public ComidasForm() {
        initComponents();
        
        caloriasR2 = new CaloriasForm();
        jtfCalorias.setText(caloriasR2.caloriasR2);
        
        comData = new ComidaData();

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

        // Set borders todos subrayados en amarillo a excepción del ID que es
        // blanco y de solo 1 pixel de grosor para indicar que no es editable
        jtfID.setBorder(text_border_disable);
        jtfNombre.setBorder(text_border);
        jtfDetalle.setBorder(text_border);
        jtfCalorias.setBorder(text_border);
        jbBuscar.setEnabled(false);
        jbNuevo.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtfNombre.addFocusListener(fl1);
        jtfDetalle.addFocusListener(fl2);
        jtfCalorias.addFocusListener(fl3);
//        focusListenerNombre();
//        focusListenerDetalle();
//        focusListenerCalorias();
        // Posiciono el foco en el nombre al iniciar el form
        jtfNombre.requestFocus();

        // Configuro el form calorias para recibir los datos del textField calorias
//        recibir = new CaloriasForm();
////        recibir.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jpConexion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jlID = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jlDetalle = new javax.swing.JLabel();
        jlCalorias = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDetalle = new javax.swing.JTextField();
        jtfCalorias = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbCalcularCalorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));
        jPanel2.setPreferredSize(new java.awt.Dimension(179, 105));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Comidas");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bienvenido Nuevamente");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 48));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Comida(int idComida, String nombre, String detalle, int calorias, boolean estado)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlMensajeSB)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(31, 75, 128));

        jbSalir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-32x32.png"))); // NOI18N
        jbSalir.setText(" Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

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
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jbNuevo)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jlID.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlID.setForeground(new java.awt.Color(255, 255, 255));
        jlID.setText("ID:");

        jlNombre.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre:");

        jcbEstado.setBackground(new java.awt.Color(21, 65, 118));
        jcbEstado.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jcbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jcbEstado.setText("Activo");

        jlDetalle.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlDetalle.setForeground(new java.awt.Color(255, 255, 255));
        jlDetalle.setText("Detalle:");

        jlCalorias.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlCalorias.setForeground(new java.awt.Color(255, 255, 255));
        jlCalorias.setText("Calorias:");

        jlEstado.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlEstado.setText("Estado:");

        jtfID.setEditable(false);
        jtfID.setBackground(new java.awt.Color(21, 65, 118));
        jtfID.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));

        jtfNombre.setBackground(new java.awt.Color(21, 65, 118));
        jtfNombre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        jtfDetalle.setBackground(new java.awt.Color(21, 65, 118));
        jtfDetalle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfDetalle.setForeground(new java.awt.Color(255, 255, 255));

        jtfCalorias.setBackground(new java.awt.Color(21, 65, 118));
        jtfCalorias.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtfCalorias.setForeground(new java.awt.Color(255, 255, 255));

        jbLimpiar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbLimpiar.setText("Limpiar Campos");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbCalcularCalorias.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbCalcularCalorias.setText("Calcular Calorias");
        jbCalcularCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularCaloriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDetalle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCalorias, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbEstado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCalcularCalorias))
                            .addComponent(jtfDetalle)
                            .addComponent(jtfNombre)
                            .addComponent(jtfID)))
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDetalle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCalorias)
                            .addComponent(jbCalcularCalorias))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbEstado)
                            .addComponent(jlEstado))
                        .addGap(15, 15, 15)
                        .addComponent(jbLimpiar))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // Instancio el form de menu y lo hago visible mientras oculto el
        // form con comidas
        NutriVidaForm nutvidForm = new NutriVidaForm();
        nutvidForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        if (jtfNombre.getText().equalsIgnoreCase("")) {
            jtfNombre.setBorder(text_border);
            jtfDetalle.requestFocus();
            jtfDetalle.selectAll();
            MensajeSB(2, "El campo Nombre debe llenarse");
        } else if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
            jtfNombre.setBorder(text_border_rojo);
            jtfNombre.requestFocus();
            jtfNombre.selectAll();
        } else if (PruebaDeCaracteres(jtfNombre.getText())) {
            jtfNombre.setBorder(text_border_disable);
        } else if (jtfDetalle.getText().equalsIgnoreCase("")) {
            jtfDetalle.setBorder(text_border);
            jtfDetalle.requestFocus();
            jtfDetalle.selectAll();
            MensajeSB(2, "El campo Detalle debe llenarse");
        } else {
            jtfDetalle.setBorder(text_border_disable);
        }
        if (jtfNombre.getBorder() == text_border_disable && jtfDetalle.getBorder() == text_border_disable) {
            try {
                Comida comida = new Comida(jtfNombre.getText(),
                        jtfDetalle.getText(),
                        Integer.parseInt(jtfCalorias.getText()),
                        true);
                comData.guardarComida(comida);
            } catch (NumberFormatException ex) {
                MensajeSB(2, "El campo Calorías debe llenarse con un número");
                jtfCalorias.setBorder(text_border_rojo);
                jtfCalorias.requestFocus();
                jtfCalorias.selectAll();
            }
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // buscarComidaPorNombre
        try {
            // Busco comida por nombre
            Comida comida = comData.buscarComidaPorNombre(jtfNombre.getText());
            // Busco si comida no esta vacio
            if (comida != null) {
                jtfID.setText(comida.getIdComida() + "");
                jtfNombre.setText(comida.getNombre());
                jtfDetalle.setText(comida.getDetalle());
                jtfCalorias.setText(comida.getCalorias() + "");
                jcbEstado.setEnabled(comida.isEstado());

                if (comida.isEstado() == true) {
                    jcbEstado.setSelected(true);
                    jbGuardar.setEnabled(true);
                    jbEliminar.setEnabled(true);
                    jbNuevo.setEnabled(false);
                    e=false;
                    MensajeSB(1, "Comida encontrada");
                } else {
                    MensajeSB(2, "El nombre no es de una Comida activa");
                }
            } else {
                MensajeSB(2, "El nombre no es de una Comida activa");
                jtfNombre.requestFocus();
                jtfNombre.selectAll();
            }
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            Comida com = comData.buscarComidaPorNombre(jtfNombre.getText());
            if (com != null) {
                comData.eliminarComida(com.getIdComida());
                jcbEstado.setSelected(false);
                MensajeSB(1, "Comida eliminada con exito! Busque por Nombre o cargue una nueva Comida");
                LimpiarCampos();
                jbNuevo.setEnabled(true);
            } else {
                MensajeSB(2, "La Comida no Existe");
            }
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbCalcularCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularCaloriasActionPerformed
        // Aquí cargo las calorías en el Form de Gestión de Calorías
////        CaloriasForm.jlTotalCalorias.setText(jtfCalorias.getText());
////        recibir.setVisible(true);
////        this.setVisible(false);

        caloriasR = jtfCalorias.getText();
        CaloriasForm caloForm = new CaloriasForm();
        caloForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCalcularCaloriasActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        jbBuscar.setEnabled(true);
    }//GEN-LAST:event_jtfNombreKeyReleased

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
            java.util.logging.Logger.getLogger(ComidasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComidasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComidasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComidasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComidasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCalcularCalorias;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JLabel jlCalorias;
    private javax.swing.JLabel jlDetalle;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlMensajeSB;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JPanel jpConexion;
    public static javax.swing.JTextField jtfCalorias;
    private javax.swing.JTextField jtfDetalle;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
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
            MensajeSB(2, "El campo Nombre debe completarse con letras");
            return false;
        } else {
            return true;
        }

    }

    public void LimpiarCampos() {
        jtfID.setText("");
        jtfNombre.setText("");
        jtfDetalle.setText("");
        jtfCalorias.setText("");
        jcbEstado.setSelected(false);
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbNuevo.setEnabled(false);
        e=true;
    }
    
    public void estadojbNuevo(){
        if(e==true){
        if((jtfNombre.getText().isEmpty() || jtfDetalle.getText().isEmpty() || jtfCalorias.getText().isEmpty())){
            jbNuevo.setEnabled(false);
        }else{
            jbNuevo.setEnabled(true);
        }
        }
    }
    
//ACA ARRANCA
    
        FocusListener fl1 = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                jtfDetalle.removeFocusListener(fl2);
                jtfCalorias.removeFocusListener(fl3);
//                jbBuscar.setEnabled(false);
//                jbNuevo.setEnabled(false);
//                jbGuardar.setEnabled(false);
//                jbEliminar.setEnabled(false);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (jtfNombre.getText().equalsIgnoreCase("")) {
                    jtfNombre.setBorder(text_border);
                    jtfNombre.requestFocus();
                    MensajeSB(2, "El campo Nombre debe llenarse");
                } else if (PruebaDeCaracteres(jtfNombre.getText()) == false) {
                    jtfNombre.setBorder(text_border_rojo);
                    jtfNombre.requestFocus();
                    jtfNombre.selectAll();
                    MensajeSB(2, "El campo Nombre debe llenarse solo con letras");
                } else {
                    jtfNombre.setBorder(text_border_disable);
                    estadojbNuevo();
                    jtfDetalle.addFocusListener(fl2);
                    jtfCalorias.addFocusListener(fl3);
                    jtfNombre.removeFocusListener(this);
                    
                }
            }
        };
    

        FocusListener fl2 = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                jtfNombre.removeFocusListener(fl1);
                jtfCalorias.removeFocusListener(fl3);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (jtfNombre.getText().equalsIgnoreCase("")) {
                    jtfNombre.setBorder(text_border);
                    jtfNombre.requestFocus();
                    MensajeSB(2, "El campo Nombre debe llenarse");
                } else {
                    if (jtfDetalle.getText().equalsIgnoreCase("")) {
                        jtfDetalle.setBorder(text_border);
                        jtfDetalle.requestFocus();
                        MensajeSB(2, "El campo Detalle debe llenarse");
                        jcbEstado.setEnabled(false);
                        jtfNombre.setDisabledTextColor(Color.white);
                        jtfCalorias.setDisabledTextColor(Color.white);
                    } else {
                        jtfDetalle.setBorder(text_border_disable);
                        estadojbNuevo();
                        jtfNombre.addFocusListener(fl1);
                        jtfCalorias.addFocusListener(fl3);
                        jtfDetalle.removeFocusListener(fl2);
                    }
                }
            }
        };

        FocusListener fl3 = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                jtfNombre.removeFocusListener(fl1);
                jtfDetalle.removeFocusListener(fl2);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (jtfCalorias.getText().equalsIgnoreCase("")) {
                    jtfCalorias.setBorder(text_border);
                    jtfCalorias.requestFocus();
                    MensajeSB(2, "El campo Calorias debe llenarse");
                } else {
                    try {
                        if (Integer.parseInt(jtfCalorias.getText()) < 0 || Integer.parseInt(jtfCalorias.getText()) > 5000) {
                            jtfCalorias.setBorder(text_border_rojo);
                            jtfCalorias.requestFocus();
                            jtfCalorias.selectAll();
                            MensajeSB(2, "El campo Calorias está fuera de rango(0-5000)");
                        } else {
                            jtfCalorias.setBorder(text_border_disable);
                            estadojbNuevo();
                            jtfNombre.addFocusListener(fl1);
                        jtfDetalle.addFocusListener(fl2);
                        jtfCalorias.removeFocusListener(fl3);
                        }
                    } catch (NumberFormatException ex) {
                        MensajeSB(2, "El campo Calorias debe llenarse con números");
                        jtfCalorias.setBorder(text_border_rojo);
                        jtfCalorias.requestFocus();
                        jtfCalorias.selectAll();
                    }
                }
            }
        };

}
