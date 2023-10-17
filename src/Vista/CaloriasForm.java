/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CaloriasData;
import Controlador.Conexion;
import Modelo.Calorias;
//import static Vista.ComidasForm.jtfCalorias;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class CaloriasForm extends javax.swing.JFrame {
    
    // Declaro los atributos para acceder a los metodos que necesito
    // Para caloria
    private CaloriasData calData;

    // Para el modelo de la tabla
    private DefaultTableModel modelo;
    private DefaultTableModel modeloGrupoAlimenticio;

    private ArrayList<Calorias> listarCalorias;

    private int seleccionFilaEnLaTabla;

    private int idGrupoAlimenticio = 1;

    private int totalDeCalorias = 0;
    private int limitoCincoRegistros = 0;
    
    public static String caloriasB = "";
    private ComidasForm caloriasA1;

    /**
     * Creates new form CaloriasForm
     */
    public CaloriasForm() {
        initComponents();
        
        caloriasA1 = new ComidasForm();
        jlTotalCalorias.setText(caloriasA1.caloriasA);

        // Aqui los conecto a los metodos
        modelo = (DefaultTableModel) jtCalorias.getModel();
        modeloGrupoAlimenticio = (DefaultTableModel) jtCaloriasSeleccion.getModel();
        calData = new CaloriasData();
        listarCalorias = calData.listarCalorias();

        // =====================================================================
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            this.setTitle("Sistema de Gestión NutriVida - Estado: Conectado");
            jpConexion.setBackground(new Color(0, 153, 102));
        } else {
            this.setTitle("Sistema de Gestión NutriVida - Estado: Error");
            jpConexion.setBackground(new Color(255, 50, 0));
        }

        // Centro la ventana en la pantalla
        this.setLocationRelativeTo(this);

        // =====================================================================
        mensajeSB(3, "");

        // Cargar calorias en el ComboBox
        cargarCaloriasEnComboBox();

        // Armo la cabecera de la tabla Calorias
        armarCabeceraDeLaTabla();

        // Armo la cabecera de la tabla Grupo Alimenticio
        armarCabeceraDeLaTablaGrupoAlimenticio();

        // Cargar calorias en la tabla
        idGrupoAlimenticio = 1;
        cargarTabla(idGrupoAlimenticio);
    }

    public void cargarCaloriasEnComboBox() {
        // Remuevo todos los items del comboBox
        jcbCargarGrupoAlimenticio.removeAllItems();

        // Creo la lista de Grupo Alimenticio y voy agregando cada item en el ComboBox
        jcbCargarGrupoAlimenticio.addItem(1 + " - " + "Aceites y grasas");
        jcbCargarGrupoAlimenticio.addItem(2 + " - " + "Azúcares y dulces");
        jcbCargarGrupoAlimenticio.addItem(3 + " - " + "Bebidas");
        jcbCargarGrupoAlimenticio.addItem(4 + " - " + "Carnes, aves y embutidos");
        jcbCargarGrupoAlimenticio.addItem(5 + " - " + "Cereales");
        jcbCargarGrupoAlimenticio.addItem(6 + " - " + "Frutas");
        jcbCargarGrupoAlimenticio.addItem(7 + " - " + "Frutos secos");
        jcbCargarGrupoAlimenticio.addItem(8 + " - " + "Huevos");
        jcbCargarGrupoAlimenticio.addItem(9 + " - " + "Lácteos y derivados");
        jcbCargarGrupoAlimenticio.addItem(10 + " - " + "Legumbres");
        jcbCargarGrupoAlimenticio.addItem(11 + " - " + "Pastelería");
        jcbCargarGrupoAlimenticio.addItem(12 + " - " + "Pescados, mariscos y crustáceos");
        jcbCargarGrupoAlimenticio.addItem(13 + " - " + "Salsas y condimentos");
        jcbCargarGrupoAlimenticio.addItem(14 + " - " + "Verduras y hortalizas");
    }

    public void armarCabeceraDeLaTabla() {
        // =====================================================================
        // Creación del metodo para modificar las caracteristicas de la Tabla
        // =====================================================================

        // Al modelo le agregamos las siguientes columnas:
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calorías");
        modelo.addColumn("Proteinas");
        modelo.addColumn("Grasa");
        modelo.addColumn("Carbohidratos");
        modelo.addColumn("Fibra");
        modelo.addColumn("Colesterol");

        // Y a nuestra Tabla le seteamos el modelo
        jtCalorias.setModel(modelo);

        // Ajusto el tamaño de las columnas de la tabla
        jtCalorias.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtCalorias.getColumnModel().getColumn(1).setPreferredWidth(250);
        jtCalorias.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtCalorias.getColumnModel().getColumn(3).setPreferredWidth(50);
        jtCalorias.getColumnModel().getColumn(4).setPreferredWidth(50);
        jtCalorias.getColumnModel().getColumn(5).setPreferredWidth(50);
        jtCalorias.getColumnModel().getColumn(6).setPreferredWidth(50);
        jtCalorias.getColumnModel().getColumn(7).setPreferredWidth(50);
    }

    public void armarCabeceraDeLaTablaGrupoAlimenticio() {
        // =====================================================================
        // Creación del metodo para modificar las caracteristicas de la Tabla
        // =====================================================================

        // Al modelo le agregamos las siguientes columnas:
        modeloGrupoAlimenticio.addColumn("ID");
        modeloGrupoAlimenticio.addColumn("Nombre");
        modeloGrupoAlimenticio.addColumn("Calorías");
        modeloGrupoAlimenticio.addColumn("Proteinas");
        modeloGrupoAlimenticio.addColumn("Grasa");
        modeloGrupoAlimenticio.addColumn("Carbohidratos");
        modeloGrupoAlimenticio.addColumn("Fibra");
        modeloGrupoAlimenticio.addColumn("Colesterol");

        // Y a nuestra Tabla le seteamos el modelo
        jtCaloriasSeleccion.setModel(modeloGrupoAlimenticio);

        // Ajusto el tamaño de las columnas de la tabla
        jtCaloriasSeleccion.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtCaloriasSeleccion.getColumnModel().getColumn(1).setPreferredWidth(250);
        jtCaloriasSeleccion.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtCaloriasSeleccion.getColumnModel().getColumn(3).setPreferredWidth(50);
        jtCaloriasSeleccion.getColumnModel().getColumn(4).setPreferredWidth(50);
        jtCaloriasSeleccion.getColumnModel().getColumn(5).setPreferredWidth(50);
        jtCaloriasSeleccion.getColumnModel().getColumn(6).setPreferredWidth(50);
        jtCaloriasSeleccion.getColumnModel().getColumn(7).setPreferredWidth(50);
    }

    public void cargarTabla(int idGrupoAlimenticio) {
        borrarFilasTabla();
        calData.listarCaloriasPorGrupoalimenticio(idGrupoAlimenticio).forEach(calorias -> {
            modelo.addRow(new Object[]{
                // calorias.getIdCalorias(),
                calorias.getIdGrupoAlimenticio(),
                calorias.getNombre(),
                calorias.getCalorias(),
                calorias.getProteinas(),
                calorias.getGrasa(),
                calorias.getCarbohidratos(),
                calorias.getFibra(),
                calorias.getColesterol()
//                calorias.getEstado()
            });
        });
    }

    public void cargarCalorias() {
        // ---------------------------------------------------------------------
        // Busco el ID en la cadena de texto
        // https://es.stackoverflow.com/questions/123704/c%C3%B3mo-extraer-parte-de-una-cadena-seg%C3%BAn-un-patr%C3%B3n
        // 
//        System.out.println("String seleccionada: " + jcbCargarGrupoAlimenticio.getSelectedItem());

        // En tu código sería:
        //     String cadena = JTextField.getText();
        // Pero como ejemplo, lo asignamos a:
        String cadena = jcbCargarGrupoAlimenticio.getSelectedItem().toString();

        // Compilamos el regex y el matcher al texto, ignorando mayúsculas/minúsculas (esto es estándar)
        Pattern pattern = Pattern.compile("([0-9]+) - ", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);

        // Ahora sí, vemos si coincide el patrón con el texto
        if (matcher.find()) {
            // Coincidió => obtener el valor del grupo 1
            String idGrupoAlimenticio = matcher.group(1);
//            System.out.println("idGrupoAlimenticio: " + idGrupoAlimenticio);
            // Aqui intento buscar y cargar los datos segun lo que se seleccione
            // en el ComboBox
            cargarTabla(Integer.parseInt(idGrupoAlimenticio));
        } else {
            // No coincidió
            System.out.println("No encontre el idGrupoAlimenticio");
        }
    }

    public void cargarCaloriaTF() {
//        // Aqui según lo que encuentre, llamo al metodo con el DNI para que
//        // busque y actualice los TextFields
//        
//        // Busco la caloria por el DNI
//        Calorias caloria = calData.buscarCaloriaPorDni(Integer.parseInt(jtfDNI.getText()));
//
//        // Busco si el caloria no esta vacio
//        jtfApellido.setText(caloria.getApellido());
//        jtfNombre.setText(caloria.getNombre());
//        jdcFechaNacimiento.setDate(Date.from(caloria.getFechaNacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
//        if (caloria.isEstado() == true) {
//            jrbEstado.setSelected(true);
//            // Existen otras formas tanto de colocar el texto en un RadioButton
//            // como de configurar si este estará seleccionado por defecto
//            // o el color del texto
//            jrbEstado.setText("Activo");
//            jrbEstado.setForeground(Color.white);
//        } else if (caloria.isEstado() == false) {
//            jrbEstado.setSelected(false);
//            jrbEstado.setText("Inactivo");
//            jrbEstado.setForeground(Color.gray);
//        }
//        seleccionarItemComboBox(Integer.parseInt(jtfDNI.getText()));
//        
//        // Prueba de concepto StatusBar ----------------------------------------
//        mensajeSB(1, "El DNI del Caloria se ha podido cargar con exito");
//        // ---------------------------------------------------------------------
    }

    public void cargarCamposjtCaloriasSeleccion(int obtengoID) {
//        // Busco la caloria por el Grupo alimenticio que es el ID que recibi
//        // y cargo la tabla
//        Calorias calorias = calData.buscarCaloriasPorId(obtengoID);
//
//        // Verifico si caloria no esta vacio
//        if (calorias != null) {
////            jtfDNI.setText(String.valueOf(calorias.getDni()));
////            jtfNombre.setText(calorias.getNombre());
//        }
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

    public void borrarFilasTablaGrupoSeleccionado() {
        // Con este metodo puedo borrar una fila especifica al recorrer el modelo
        // Controlar que no este vacio o cargarlo desde el comienzo
        if (modeloGrupoAlimenticio != null) {
            int a = modeloGrupoAlimenticio.getRowCount() - 1;

            if (modeloGrupoAlimenticio.getRowCount() > 0) {
                for (int i = a; i >= 0; i--) {
                    modeloGrupoAlimenticio.removeRow(i);
                }
            }
        }
    }

    public void mensajeSB(int color, String mensaje) {
        // Los valores pueden variar de 0 a 255
        if (color == 1) {
            // Si el color es igual a 1 entonces es = a verde
            // En este caso Red = 0, Green = 153, Blue = 102.
            jlMensajeSB.setForeground(new Color(0, 153, 102));
        } else if (color == 2) {
            // Si el color es igual a 2 entonces es = a rojo
            // Los valores pueden variar de 0 a 255. En este caso Red = 153, Green = 51, Blue = 0.
            jlMensajeSB.setForeground(new Color(255, 50, 0));
        } else if (color == 3) {
            // Usado al iniciar el Form para que no se vea el texto dummy 45,65,88
            jlMensajeSB.setForeground(new Color(45, 65, 88));
        }
        // Aquí cargo el texto del mensaje en el Label
        // Si el texto del mensaje esta vacio entonces no muestro texto en
        // el Label pero limpio el texto anterior que pueda haber quedado
        jlMensajeSB.setText(mensaje);
    }

    public void seleccionarItemComboBox(int DNI) {
//        // Aqui recibo un DNI, lo busco en la lista de calorias agregados al
//        // ComboBox y averigua su numero de item para marcarlo como
//        // seleccionado
//        System.out.println("DNI: " + DNI);
//
//        // Cuantos items hay en el ComboBox?
////        int itemsEnElComboBox = jcbCargarGrupoAlimenticio.getItemCount();
////        System.out.println("Items en el ComboBox: " + itemsEnElComboBox);
//        // Recorro la lista de calorias y voy leyendo cada item en el ComboBox
//        calData.listarCalorias().forEach(item -> {
//            if (DNI == item.getDni()) {
////                int obtengoID = item.getIdCaloria();
////                System.out.println(item.getIdCaloria());
//                // Aqui intento buscar y cargar los datos segun lo que se
//                // seleccione en el ComboBox
////                cargarCampos(obtengoID);
//
//                // ERROR: getSelectedIndex() solo devuelve la opcion que este
//                // seleccionada
//                seleccionFilaEnLaTabla = jcbCargarGrupoAlimenticio.getSelectedIndex();
////                return;
//            }
//        });
//
//        // Pero como ejemplo, lo asignamos a:
//        jcbCargarGrupoAlimenticio.setSelectedIndex(seleccionFilaEnLaTabla);
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
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlMensajeSB = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlTotalCalorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCalorias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCaloriasSeleccion = new javax.swing.JTable();
        jcbCargarGrupoAlimenticio = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jbSeleccionar = new javax.swing.JButton();
        jbLimpiarSeleccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbCargarCalorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 65, 118));

        jPanel2.setBackground(new java.awt.Color(31, 75, 128));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Calorías");

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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-header.png"))); // NOI18N

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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpConexion, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(31, 75, 128));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 48));

        jlMensajeSB.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jlMensajeSB.setForeground(new java.awt.Color(255, 255, 255));
        jlMensajeSB.setText("Mensaje inicial");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMensajeSB)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(31, 75, 128));
        jPanel5.setPreferredSize(new java.awt.Dimension(8, 40));

        jlTotalCalorias.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jlTotalCalorias.setForeground(new java.awt.Color(255, 255, 255));
        jlTotalCalorias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTotalCalorias.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTotalCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTotalCalorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtCalorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtCalorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCaloriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCalorias);

        jtCaloriasSeleccion.setBackground(new java.awt.Color(21, 65, 118));
        jtCaloriasSeleccion.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jtCaloriasSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        jtCaloriasSeleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtCaloriasSeleccion.setName(""); // NOI18N
        jScrollPane2.setViewportView(jtCaloriasSeleccion);

        jcbCargarGrupoAlimenticio.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jcbCargarGrupoAlimenticio.setForeground(new java.awt.Color(255, 255, 255));
        jcbCargarGrupoAlimenticio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceites y grasas", "Azúcares y dulces", "Bebidas", "Carnes, aves y embutidos", "Cereales", "Frutas", "Frutos secos", "Huevos", "Lácteos y derivados", "Legumbres", "Pastelería", "Pescados, mariscos y crustáceos", "Salsas y condimentos", "Verduras y hortalizas" }));
        jcbCargarGrupoAlimenticio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCargarGrupoAlimenticioItemStateChanged(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(31, 75, 128));
        jPanel6.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione el Grupo Alimenticio de su interés");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jbSeleccionar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        jbLimpiarSeleccion.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbLimpiarSeleccion.setText("Limpiar Selección");
        jbLimpiarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarSeleccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total de Calorias:");

        jbCargarCalorias.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jbCargarCalorias.setText("Cargar Calorias");
        jbCargarCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarCaloriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbCargarGrupoAlimenticio, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jbLimpiarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jbCargarCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCargarGrupoAlimenticio)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSeleccionar)
                    .addComponent(jbLimpiarSeleccion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCargarCalorias)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargarGrupoAlimenticioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCargarGrupoAlimenticioItemStateChanged
        // Verifico que no sea null para evitar conflictos en la carga del Form
        if (jcbCargarGrupoAlimenticio.getSelectedItem() != null) {
            cargarCalorias();
        }
    }//GEN-LAST:event_jcbCargarGrupoAlimenticioItemStateChanged

    private void jtCaloriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCaloriasMouseClicked
        // Obtenemos el número de fila seleccionada al realizar un click en la tabla
        seleccionFilaEnLaTabla = jtCalorias.rowAtPoint(evt.getPoint());
        System.out.println("Seleccion Fila En La Tabla: " + seleccionFilaEnLaTabla);

        // Lo convierto de Object a int
        int valorID = (Integer) jtCalorias.getValueAt(seleccionFilaEnLaTabla, 0);
        System.out.println("Valor ID: " + valorID);

        // Aquí intento buscar y cargar los datos según lo que se seleccione
        // en la tabla
        cargarCamposjtCaloriasSeleccion(valorID);

        // Tratare de hacer que se deseleccione la fila de la tabla o en el
        // mejor de los casos que quede resaltada la fila que corresponda
        // según cambien los datos con el ComboBox o el botón Buscar
//        jtCalorias.setSelectionForeground(Color.black);
//        jtCalorias.setSelectionBackground(Color.white);
        // Pero como ejemplo, lo asignamos a: jtCaloriasSeleccion
//        jcbCargarAlumnos.setSelectedIndex(seleccionFilaEnLaTabla);
    }//GEN-LAST:event_jtCaloriasMouseClicked

    private void jbLimpiarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarSeleccionActionPerformed
        borrarFilasTablaGrupoSeleccionado();
        totalDeCalorias = 0;
        limitoCincoRegistros = 0;
        jlTotalCalorias.setText(String.valueOf(totalDeCalorias));
        mensajeSB(3, "");
    }//GEN-LAST:event_jbLimpiarSeleccionActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        int pos = jtCalorias.getSelectedRow();
        if (pos != -1) {
            String ID, nombre, calorias, proteinas, grasa, carbohidrados, fibra, colesterol;
            ID = jtCalorias.getValueAt(pos, 0).toString();
            nombre = jtCalorias.getValueAt(pos, 1).toString();
            calorias = jtCalorias.getValueAt(pos, 2).toString();
            proteinas = jtCalorias.getValueAt(pos, 3).toString();
            grasa = jtCalorias.getValueAt(pos, 4).toString();
            carbohidrados = jtCalorias.getValueAt(pos, 5).toString();
            fibra = jtCalorias.getValueAt(pos, 6).toString();
            colesterol = jtCalorias.getValueAt(pos, 7).toString();

            String datos[] = {ID, nombre, calorias, proteinas, grasa, carbohidrados, fibra, colesterol};

            // Valido primero que no pueda ingresarse 2 veces el mismo alimento
            Boolean resultado = validarTabla(nombre);
            if (resultado) {
                mensajeSB(2, "No puede agregarse 2 veces el mismo alimento");
            } else {
                if (limitoCincoRegistros < 5) {
                    // DefaultTableModel modeloGrupoAlimenticio = (DefaultTableModel) jtCaloriasSeleccion.getModel();
                    modeloGrupoAlimenticio.addRow(datos);

                    // Actualizo el total de calorías
                    totalDeCalorias = totalDeCalorias + Integer.parseInt(calorias.toString());
                    jlTotalCalorias.setText(String.valueOf(totalDeCalorias));
                    limitoCincoRegistros++;
                } else {
                    mensajeSB(2, "Solo puede ingresar hasta 5 alimentos");
                }
            }
        } else {
            mensajeSB(2, "Debe seleccionar un alimento para sumarlo a la lista");
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jbCargarCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarCaloriasActionPerformed
        // Aquí cargo las calorías en el Form de Gestión de Comidas
//        ComidasForm.jtfCalorias.setText(jlTotalCalorias.getText());
//        enviar.setVisible(true);
//        this.setVisible(false);

        caloriasB = jlTotalCalorias.getText();
        ComidasForm comiForm = new ComidasForm();
        comiForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCargarCaloriasActionPerformed

    private Boolean validarTabla(String nombre) {
        // Válido que no se pueda ingresar 2 veces el mismo alimento
        DefaultTableModel modeloGrupoAlimenticio = (DefaultTableModel) jtCaloriasSeleccion.getModel();
        for (int i = 0; i < modeloGrupoAlimenticio.getRowCount(); i++) {
            String name = modeloGrupoAlimenticio.getValueAt(i, 1).toString();
            if (name.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(CaloriasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaloriasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaloriasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaloriasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaloriasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCargarCalorias;
    private javax.swing.JButton jbLimpiarSeleccion;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JComboBox<String> jcbCargarGrupoAlimenticio;
    private javax.swing.JLabel jlMensajeSB;
    public static javax.swing.JLabel jlTotalCalorias;
    private javax.swing.JPanel jpConexion;
    private javax.swing.JTable jtCalorias;
    private javax.swing.JTable jtCaloriasSeleccion;
    // End of variables declaration//GEN-END:variables
}
