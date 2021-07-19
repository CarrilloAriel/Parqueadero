/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import parqueadero_proyecto.Parqueadero;
import parqueadero_proyecto.Persona;
import parqueadero_proyecto.Tarifa;
import parqueadero_proyecto.Vehiculo;

/**
 *
 * @author Usuario
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    
    
    String hora ="";
    
    public Configuracion() {
        DateFormat f = new SimpleDateFormat("HH:mm");
        initComponents();
        
        
        setLocationRelativeTo(null);
        layCliente.setVisible(false);
        //actualizacion del horario de atencion
        String a =f.format(Principal.abierto);
        String b = f.format(Principal.cerrado);
        horaAbierto.setText(a);
        horaCerrado.setText(b);
        //fin actualizacion del horario de atencion
        
        nPlazasConf.setText(""+Principal.Parqueaderos.contar());
        tfAuto1era.setText(""+Principal.tarifasAuto.get(0).getValor());
        tfAuto2da.setText(""+Principal.tarifasAuto.get(1).getValor());
        tfAutoMax.setText(""+Principal.tarifasAuto.get(2).getValor());
        tfMoto1era.setText(""+Principal.tarifasMoto.get(0).getValor());
        tfMoto2da.setText(""+Principal.tarifasMoto.get(1).getValor());
        tfMotoMax.setText(""+Principal.tarifasMoto.get(2).getValor());
        setSize(800,499);
        
        
        //Hora de entrada
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConfGeneral = new javax.swing.JPanel();
        layGeneral = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nPlazasConf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfAuto1era = new javax.swing.JTextField();
        tfAuto2da = new javax.swing.JTextField();
        tfAutoMax = new javax.swing.JTextField();
        tfMoto1era = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfMoto2da = new javax.swing.JTextField();
        tfMotoMax = new javax.swing.JTextField();
        cambiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        horaAbierto = new javax.swing.JTextField();
        horaCerrado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        layCliente = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buscarPlacaParaEditar = new javax.swing.JTextField();
        tfNombrePorEditar = new javax.swing.JTextField();
        tfApellidoPorEditar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnBuscarParaEditar = new javax.swing.JButton();
        rbMoto = new javax.swing.JRadioButton();
        rbAutomovil = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnConfGeneral = new javax.swing.JButton();
        btnConfCLiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        layGeneral.setBackground(new java.awt.Color(51, 255, 51));
        layGeneral.setForeground(new java.awt.Color(102, 255, 102));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Configuración");

        jLabel1.setText(" N° de plazas actuales");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Motocicleta");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Automóvil");

        jLabel2.setText("1era hora:");

        jLabel3.setText("A partir de la 2da hora");

        jLabel4.setText("Máximo diario:");

        jLabel5.setText("1era hora:");

        jLabel6.setText("A partir de la 2da hora:");

        jLabel7.setText("Máximo diario:");

        cambiar.setText("Guardar");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });

        jLabel11.setText("Horario de atención");

        horaAbierto.setText("00:00");
        horaAbierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaAbiertoActionPerformed(evt);
            }
        });

        horaCerrado.setText("23:59");
        horaCerrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCerradoActionPerformed(evt);
            }
        });

        jLabel14.setText("-");

        layGeneral.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(nPlazasConf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfAuto1era, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfAuto2da, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfAutoMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfMoto1era, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfMoto2da, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(tfMotoMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(cambiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(horaAbierto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(horaCerrado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layGeneral.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layGeneralLayout = new javax.swing.GroupLayout(layGeneral);
        layGeneral.setLayout(layGeneralLayout);
        layGeneralLayout.setHorizontalGroup(
            layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layGeneralLayout.createSequentialGroup()
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layGeneralLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)))
                    .addGroup(layGeneralLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layGeneralLayout.createSequentialGroup()
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(horaAbierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nPlazasConf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(184, 184, 184))))
            .addGroup(layGeneralLayout.createSequentialGroup()
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cambiar)
                    .addGroup(layGeneralLayout.createSequentialGroup()
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layGeneralLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layGeneralLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)))
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addComponent(tfAuto2da, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addComponent(tfAuto1era, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56))
                            .addGroup(layGeneralLayout.createSequentialGroup()
                                .addComponent(tfAutoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)))
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMotoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMoto1era, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMoto2da, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layGeneralLayout.setVerticalGroup(
            layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layGeneralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nPlazasConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(horaAbierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(5, 5, 5)
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layGeneralLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfMoto1era, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(47, 47, 47)
                        .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAuto1era, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)))
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAuto2da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfMoto2da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAutoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfMotoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cambiar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        layCliente.setBackground(new java.awt.Color(51, 255, 51));
        layCliente.setForeground(new java.awt.Color(102, 255, 102));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Configuración Cliente");

        jLabel13.setText("Ingrese la placa");

        buscarPlacaParaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPlacaParaEditarActionPerformed(evt);
            }
        });

        tfNombrePorEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombrePorEditarActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombre del Propietario");

        jLabel20.setText("Apellido del propietario");

        btnBuscarParaEditar.setText("Buscar");
        btnBuscarParaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarParaEditarActionPerformed(evt);
            }
        });

        rbMoto.setText("Motocicleta");

        rbAutomovil.setText("Automóvil");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        layCliente.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(buscarPlacaParaEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(tfNombrePorEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(tfApellidoPorEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(btnBuscarParaEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(rbMoto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(rbAutomovil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layCliente.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layClienteLayout = new javax.swing.GroupLayout(layCliente);
        layCliente.setLayout(layClienteLayout);
        layClienteLayout.setHorizontalGroup(
            layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layClienteLayout.createSequentialGroup()
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layClienteLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnBuscarParaEditar))
                    .addGroup(layClienteLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(rbMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAutomovil)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layClienteLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(201, 201, 201)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createSequentialGroup()
                            .addComponent(buscarPlacaParaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(61, 61, 61)
                            .addComponent(tfNombrePorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(182, 182, 182))
                        .addGroup(layClienteLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(68, 68, 68)
                            .addComponent(tfApellidoPorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(174, 174, 174)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layClienteLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(68, 68, 68))))
        );
        layClienteLayout.setVerticalGroup(
            layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPlacaParaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addComponent(btnBuscarParaEditar)
                .addGap(49, 49, 49)
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombrePorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tfApellidoPorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMoto)
                    .addComponent(rbAutomovil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConfGeneralLayout = new javax.swing.GroupLayout(panelConfGeneral);
        panelConfGeneral.setLayout(panelConfGeneralLayout);
        panelConfGeneralLayout.setHorizontalGroup(
            panelConfGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConfGeneralLayout.setVerticalGroup(
            panelConfGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfGeneralLayout.createSequentialGroup()
                .addComponent(layGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnConfGeneral.setText("Configuración General");
        btnConfGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfGeneralActionPerformed(evt);
            }
        });

        btnConfCLiente.setText("Configuración Cliente");
        btnConfCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfCLienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfGeneral, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfCLiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelConfGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConfGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnConfCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        // TODO add your handling code here:
        
        DateFormat dateForma = new SimpleDateFormat("HH:mm");
        Calendar ca = Calendar.getInstance();
        Date horaActual = ca.getTime();
        
        hora = dateForma.format(horaActual);
        
        Date inicio = null;
        Date fin = null;
        try {
            inicio = new SimpleDateFormat("HH:mm").parse(horaAbierto.getText());
            fin = new SimpleDateFormat("HH:mm").parse(horaCerrado.getText());
        } catch (ParseException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //verificacion fuera de rango de horario de atencion
        if(inicio.compareTo(fin)>0){
            JOptionPane.showMessageDialog(null, "La hora de entrada debe ser mayor a la de salida","Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(inicio.compareTo(fin)==0){
            JOptionPane.showMessageDialog(null, "La hora de entrada no puede ser igual a la hora de salida","Error!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Principal.abierto=inicio;
            Principal.cerrado=fin;
        }
        
        if(inicio.compareTo(fin)>0){
            System.out.println("Inicio despues de fin");
        }
        else if(inicio.compareTo(fin)<0){
            System.out.println("Inicio antes de fin");
        }
        else if(inicio.compareTo(fin)==0){
            System.out.println("Ambas horas igual");
        }
        
        Principal.tarifasAuto.set(0, new Tarifa("1ra hora: $",Double.parseDouble(tfAuto1era.getText())));
        Principal.tarifasAuto.set(1, new Tarifa("Apartir de la 2da hora: ",Double.parseDouble(tfAuto2da.getText())));
        Principal.tarifasAuto.set(2, new Tarifa("Tarifa máxima diaria: ",Double.parseDouble(tfAutoMax.getText())));
        Principal.tarifasMoto.set(0, new Tarifa("1ra hora: $",Double.parseDouble(tfMoto1era.getText())));
        Principal.tarifasMoto.set(1, new Tarifa("Apartir de la 2da hora: ",Double.parseDouble(tfMoto2da.getText())));
        Principal.tarifasMoto.set(2, new Tarifa("Tarifa máxima diaria: ",Double.parseDouble(tfMotoMax.getText())));
        
        //cambio de plazas
        if(Principal.Parqueaderos.contar()<=Integer.parseInt(nPlazasConf.getText())){
            for(int i=Principal.Parqueaderos.contar()+1;i<Integer.parseInt(nPlazasConf.getText())+1;i++){
                Principal.Parqueaderos.insertarFin(new Parqueadero("A"+i,null));
            }
        }
        else{
            if(Principal.Parqueaderos.contar()==Principal.Parqueaderos.contarLugaresDisponibles()){
                int num =Principal.Parqueaderos.contar()-Integer.parseInt(nPlazasConf.getText());
                for(int i = 0;i<num;i++){
                    System.out.println(Principal.Parqueaderos.contar()-Integer.parseInt(nPlazasConf.getText()));
                    try {
                        Principal.Parqueaderos.eliminarFin();
                    } catch (Exception ex) {
                        Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No se puede disminuir la cantidad de plazas disponibles si hay autos dentro del parqueadero!","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cambiarActionPerformed

    private void btnConfCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfCLienteActionPerformed
        // TODO add your handling code here:
        layGeneral.setVisible(false);
        layCliente.setVisible(true);
        setSize(800, 470);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnConfCLienteActionPerformed

    private void btnConfGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfGeneralActionPerformed
        // TODO add your handling code here:
        layGeneral.setVisible(true);
        layCliente.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnConfGeneralActionPerformed

    private void btnBuscarParaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarParaEditarActionPerformed
        // TODO add your handling code here:
        Vehiculo a = Principal.Parqueaderos.buscarPlaca(buscarPlacaParaEditar.getText());
        tfNombrePorEditar.setText(a.getPersona().getNombre());
        tfApellidoPorEditar.setText(a.getPersona().getApellido());
        if (a.getTipo().equals("Automovil")) {
                    rbAutomovil.setSelected(true);}
        if (a.getTipo().equals("Motocicleta")) {
                    rbMoto.setSelected(true);
                }
    }//GEN-LAST:event_btnBuscarParaEditarActionPerformed

    private void buscarPlacaParaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPlacaParaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPlacaParaEditarActionPerformed

    private void tfNombrePorEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombrePorEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombrePorEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Acciones BOton guardar
        Principal.Parqueaderos.buscarPlaca(buscarPlacaParaEditar.getText()).setPersona(new Persona(tfNombrePorEditar.getText(), tfApellidoPorEditar.getText()));
        if (rbAutomovil.isSelected()) {
                    Principal.Parqueaderos.buscarPlaca(buscarPlacaParaEditar.getText()).setTipo("Automovil");
                }
        if (rbMoto.isSelected()) {
                    Principal.Parqueaderos.buscarPlaca(buscarPlacaParaEditar.getText()).setTipo("Motocicleta");
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void horaAbiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaAbiertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaAbiertoActionPerformed

    private void horaCerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCerradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaCerradoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarParaEditar;
    private javax.swing.JButton btnConfCLiente;
    private javax.swing.JButton btnConfGeneral;
    private javax.swing.JTextField buscarPlacaParaEditar;
    private javax.swing.JButton cambiar;
    private javax.swing.JTextField horaAbierto;
    private javax.swing.JTextField horaCerrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layCliente;
    private javax.swing.JLayeredPane layGeneral;
    private javax.swing.JTextField nPlazasConf;
    private javax.swing.JPanel panelConfGeneral;
    private javax.swing.JRadioButton rbAutomovil;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTextField tfApellidoPorEditar;
    private javax.swing.JTextField tfAuto1era;
    private javax.swing.JTextField tfAuto2da;
    private javax.swing.JTextField tfAutoMax;
    private javax.swing.JTextField tfMoto1era;
    private javax.swing.JTextField tfMoto2da;
    private javax.swing.JTextField tfMotoMax;
    private javax.swing.JTextField tfNombrePorEditar;
    // End of variables declaration//GEN-END:variables
}
