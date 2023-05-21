package vista;

import javax.swing.table.DefaultTableModel;
import controlador.ControladorAudios;
import controlador.ControladorTablas;
import controlador.ControladorVentas;
import controlador.Utilidades;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Vender extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla; // Modelo de la tabla

    public Vender() {

        initComponents();
        setLocationRelativeTo(null);
        // Desactiva el borde focus de los botones
        // Quita el borde de los botones
        Salir.setFocusPainted(false);
        Salir.setBorderPainted(false);
        VenderCandilMariposas.setFocusPainted(false);
        VenderCandilMariposas.setBorderPainted(false);
        VenderEstatua.setFocusPainted(false);
        VenderEstatua.setBorderPainted(false);
        VenderCaliz.setFocusPainted(false);
        VenderCaliz.setBorderPainted(false);
        VenderEmblema.setFocusPainted(false);
        VenderEmblema.setBorderPainted(false);
        VenderCorona.setFocusPainted(false);
        VenderCorona.setBorderPainted(false);

        // Ocultar la tabla por defecto
        //Tabla.setVisible(false);
        modeloTabla = (DefaultTableModel) Tabla.getModel(); // Obtener el modelo de la tabla
        Tabla.setModel(modeloTabla); // Asignar el modelo a la tabla
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);
        controladorTablas.eliminarFilasVacias();
        controladorTablas.cargarInventario("inventario_jugador");

        Tabla.setEnabled(false);//esto deja no seleccionar la tabla
        Tabla.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo de la tabla como transparente
        jScrollPane1.setOpaque(false); // Hacer transparente el fondo del jScrollPane que contiene la tabla
        jScrollPane1.getViewport().setOpaque(false); // Hacer transparente el fondo del viewport del jScrollPane que contiene la tabla
        //fotos
        corona.setVisible(false);
        caliz.setVisible(false);
        candil.setVisible(false);
        estatua.setVisible(false);
        colgante.setVisible(false);
        Utilidades.actualizarCartel(Cartel);

    }

    // Resto del código de tu clase Vender...
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        estatua = new javax.swing.JLabel();
        candil = new javax.swing.JLabel();
        caliz = new javax.swing.JLabel();
        colgante = new javax.swing.JLabel();
        corona = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        VenderCandilMariposas = new javax.swing.JButton();
        VenderEstatua = new javax.swing.JButton();
        VenderCaliz = new javax.swing.JButton();
        VenderEmblema = new javax.swing.JButton();
        VenderCorona = new javax.swing.JButton();
        VerCandil = new javax.swing.JButton();
        VerEstatua = new javax.swing.JButton();
        VerCaliz = new javax.swing.JButton();
        VerEmblema = new javax.swing.JButton();
        VerCorona = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Cartel = new javax.swing.JLabel();
        Prueba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(59, 62, 55));
        Salir.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(189, 183, 165));
        Salir.setText("Salir");
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.setDefaultCapable(false);
        Salir.setFocusPainted(false);
        Salir.setFocusable(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(512, 288));
        jPanel2.setMinimumSize(new java.awt.Dimension(512, 288));
        jPanel2.setPreferredSize(new java.awt.Dimension(512, 288));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estatua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estatua.jpeg"))); // NOI18N
        jPanel2.add(estatua, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        candil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candil.png"))); // NOI18N
        jPanel2.add(candil, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 480, 260));

        caliz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caliz.png"))); // NOI18N
        jPanel2.add(caliz, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        colgante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Colgante.jpg"))); // NOI18N
        colgante.setText("colgante");
        colgante.setMaximumSize(new java.awt.Dimension(512, 288));
        colgante.setPreferredSize(new java.awt.Dimension(512, 288));
        jPanel2.add(colgante, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        corona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corona.jpg"))); // NOI18N
        jPanel2.add(corona, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 260));

        Tabla.setBackground(new java.awt.Color(44, 35, 28));
        Tabla.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(189, 183, 165));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad", "Pesetas", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tabla.setAutoscrolls(false);
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setFocusable(false);
        Tabla.setGridColor(new java.awt.Color(44, 35, 28));
        Tabla.setMaximumSize(new java.awt.Dimension(600, 0));
        Tabla.setOpaque(false);
        Tabla.setRequestFocusEnabled(false);
        Tabla.setRowHeight(30);
        Tabla.setRowSelectionAllowed(false);
        Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
        }
        //articulo
        Tabla.getColumnModel().getColumn(0).setMaxWidth(175); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(175); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles

        //cantidad
        Tabla.getColumnModel().getColumn(1).setMaxWidth(75); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(1).setPreferredWidth(75); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles
        //pesetas
        Tabla.getColumnModel().getColumn(2).setMaxWidth(100); // Establece el ancho máximo de la columna "pesetas" en 100 píxeles
        Tabla.getColumnModel().getColumn(2).setPreferredWidth(100); // Establece el ancho preferido de la columna "pesetas" en 100 píxeles
        //cosas horizontales

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 487, 930, 260));

        VenderCandilMariposas.setBackground(new java.awt.Color(46, 43, 34));
        VenderCandilMariposas.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VenderCandilMariposas.setForeground(new java.awt.Color(189, 183, 165));
        VenderCandilMariposas.setText("Vender Candil");
        VenderCandilMariposas.setBorderPainted(false);
        VenderCandilMariposas.setDefaultCapable(false);
        VenderCandilMariposas.setEnabled(false);
        VenderCandilMariposas.setFocusPainted(false);
        VenderCandilMariposas.setMaximumSize(new java.awt.Dimension(160, 40));
        VenderCandilMariposas.setMinimumSize(new java.awt.Dimension(160, 40));
        VenderCandilMariposas.setPreferredSize(new java.awt.Dimension(160, 40));
        VenderCandilMariposas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderCandilMariposasActionPerformed(evt);
            }
        });
        jPanel1.add(VenderCandilMariposas, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 200, -1));

        VenderEstatua.setBackground(new java.awt.Color(46, 43, 34));
        VenderEstatua.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VenderEstatua.setForeground(new java.awt.Color(189, 183, 165));
        VenderEstatua.setText("Vender Estatua");
        VenderEstatua.setBorderPainted(false);
        VenderEstatua.setDefaultCapable(false);
        VenderEstatua.setEnabled(false);
        VenderEstatua.setFocusPainted(false);
        VenderEstatua.setFocusable(false);
        VenderEstatua.setMaximumSize(new java.awt.Dimension(160, 40));
        VenderEstatua.setMinimumSize(new java.awt.Dimension(160, 40));
        VenderEstatua.setPreferredSize(new java.awt.Dimension(160, 40));
        VenderEstatua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderEstatuaActionPerformed(evt);
            }
        });
        jPanel1.add(VenderEstatua, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 200, -1));

        VenderCaliz.setBackground(new java.awt.Color(46, 43, 34));
        VenderCaliz.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VenderCaliz.setForeground(new java.awt.Color(189, 183, 165));
        VenderCaliz.setText("Vender Caliz");
        VenderCaliz.setBorderPainted(false);
        VenderCaliz.setDefaultCapable(false);
        VenderCaliz.setEnabled(false);
        VenderCaliz.setFocusPainted(false);
        VenderCaliz.setFocusable(false);
        VenderCaliz.setMaximumSize(new java.awt.Dimension(160, 40));
        VenderCaliz.setMinimumSize(new java.awt.Dimension(160, 40));
        VenderCaliz.setPreferredSize(new java.awt.Dimension(160, 40));
        VenderCaliz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderCalizActionPerformed(evt);
            }
        });
        jPanel1.add(VenderCaliz, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 200, -1));

        VenderEmblema.setBackground(new java.awt.Color(46, 43, 34));
        VenderEmblema.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VenderEmblema.setForeground(new java.awt.Color(189, 183, 165));
        VenderEmblema.setText("Vender Emblema");
        VenderEmblema.setBorderPainted(false);
        VenderEmblema.setDefaultCapable(false);
        VenderEmblema.setEnabled(false);
        VenderEmblema.setFocusPainted(false);
        VenderEmblema.setFocusable(false);
        VenderEmblema.setMaximumSize(new java.awt.Dimension(160, 40));
        VenderEmblema.setMinimumSize(new java.awt.Dimension(160, 40));
        VenderEmblema.setPreferredSize(new java.awt.Dimension(160, 40));
        VenderEmblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderEmblemaActionPerformed(evt);
            }
        });
        jPanel1.add(VenderEmblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 200, 40));

        VenderCorona.setBackground(new java.awt.Color(46, 43, 34));
        VenderCorona.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VenderCorona.setForeground(new java.awt.Color(189, 183, 165));
        VenderCorona.setText("Vender Corona");
        VenderCorona.setBorderPainted(false);
        VenderCorona.setDefaultCapable(false);
        VenderCorona.setEnabled(false);
        VenderCorona.setFocusPainted(false);
        VenderCorona.setFocusable(false);
        VenderCorona.setMaximumSize(new java.awt.Dimension(160, 40));
        VenderCorona.setMinimumSize(new java.awt.Dimension(160, 40));
        VenderCorona.setPreferredSize(new java.awt.Dimension(160, 40));
        VenderCorona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderCoronaActionPerformed(evt);
            }
        });
        jPanel1.add(VenderCorona, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 200, 40));

        VerCandil.setBackground(new java.awt.Color(46, 43, 34));
        VerCandil.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerCandil.setForeground(new java.awt.Color(189, 183, 165));
        VerCandil.setText("Ver Candil de mariposas");
        VerCandil.setBorderPainted(false);
        VerCandil.setDefaultCapable(false);
        VerCandil.setFocusPainted(false);
        VerCandil.setFocusable(false);
        VerCandil.setMaximumSize(new java.awt.Dimension(160, 40));
        VerCandil.setMinimumSize(new java.awt.Dimension(160, 40));
        VerCandil.setPreferredSize(new java.awt.Dimension(160, 40));
        VerCandil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCandilActionPerformed(evt);
            }
        });
        jPanel1.add(VerCandil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 230, -1));

        VerEstatua.setBackground(new java.awt.Color(46, 43, 34));
        VerEstatua.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerEstatua.setForeground(new java.awt.Color(189, 183, 165));
        VerEstatua.setText("Ver Estatua");
        VerEstatua.setBorderPainted(false);
        VerEstatua.setFocusPainted(false);
        VerEstatua.setFocusable(false);
        VerEstatua.setMaximumSize(new java.awt.Dimension(160, 40));
        VerEstatua.setMinimumSize(new java.awt.Dimension(160, 40));
        VerEstatua.setPreferredSize(new java.awt.Dimension(160, 40));
        VerEstatua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstatuaActionPerformed(evt);
            }
        });
        jPanel1.add(VerEstatua, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 230, -1));

        VerCaliz.setBackground(new java.awt.Color(46, 43, 34));
        VerCaliz.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerCaliz.setForeground(new java.awt.Color(189, 183, 165));
        VerCaliz.setText("Ver Caliz");
        VerCaliz.setBorderPainted(false);
        VerCaliz.setDefaultCapable(false);
        VerCaliz.setFocusPainted(false);
        VerCaliz.setFocusable(false);
        VerCaliz.setMaximumSize(new java.awt.Dimension(160, 40));
        VerCaliz.setMinimumSize(new java.awt.Dimension(160, 40));
        VerCaliz.setPreferredSize(new java.awt.Dimension(160, 40));
        VerCaliz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCalizActionPerformed(evt);
            }
        });
        jPanel1.add(VerCaliz, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 230, -1));

        VerEmblema.setBackground(new java.awt.Color(46, 43, 34));
        VerEmblema.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerEmblema.setForeground(new java.awt.Color(189, 183, 165));
        VerEmblema.setText("Ver Emblema");
        VerEmblema.setBorderPainted(false);
        VerEmblema.setDefaultCapable(false);
        VerEmblema.setFocusPainted(false);
        VerEmblema.setFocusable(false);
        VerEmblema.setMaximumSize(new java.awt.Dimension(160, 40));
        VerEmblema.setMinimumSize(new java.awt.Dimension(160, 40));
        VerEmblema.setPreferredSize(new java.awt.Dimension(160, 40));
        VerEmblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmblemaActionPerformed(evt);
            }
        });
        jPanel1.add(VerEmblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 230, -1));

        VerCorona.setBackground(new java.awt.Color(46, 43, 34));
        VerCorona.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerCorona.setForeground(new java.awt.Color(189, 183, 165));
        VerCorona.setText("Ver Corona");
        VerCorona.setBorderPainted(false);
        VerCorona.setDefaultCapable(false);
        VerCorona.setFocusPainted(false);
        VerCorona.setFocusable(false);
        VerCorona.setMaximumSize(new java.awt.Dimension(160, 40));
        VerCorona.setMinimumSize(new java.awt.Dimension(160, 40));
        VerCorona.setPreferredSize(new java.awt.Dimension(160, 40));
        VerCorona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCoronaActionPerformed(evt);
            }
        });
        jPanel1.add(VerCorona, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 230, -1));

        Ayuda.setBackground(new java.awt.Color(57, 60, 53));
        Ayuda.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(189, 183, 165));
        Ayuda.setText("Ayuda");
        Ayuda.setBorderPainted(false);
        Ayuda.setContentAreaFilled(false);
        Ayuda.setDefaultCapable(false);
        Ayuda.setFocusPainted(false);
        Ayuda.setFocusable(false);
        Ayuda.setMaximumSize(new java.awt.Dimension(120, 60));
        Ayuda.setMinimumSize(new java.awt.Dimension(120, 60));
        Ayuda.setPreferredSize(new java.awt.Dimension(120, 60));
        Ayuda.setRequestFocusEnabled(false);
        Ayuda.setRolloverEnabled(false);
        Ayuda.setVerifyInputWhenFocusTarget(false);
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        jPanel1.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 140, -1));

        Cartel.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        Cartel.setForeground(new java.awt.Color(129, 127, 113));
        Cartel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Cartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 150, 50));

        Prueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1V.jpg"))); // NOI18N
        Prueba.setText("jLabel1");
        Prueba.setMaximumSize(new java.awt.Dimension(1333, 750));
        Prueba.setMinimumSize(new java.awt.Dimension(1333, 750));
        Prueba.setPreferredSize(new java.awt.Dimension(1333, 750));
        jPanel1.add(Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        ControladorAudios controlador = new ControladorAudios();
        controlador.boton();
        //esto es el boton volver que deberia volver al menu principal
        // Cerrar la pantalla "Comprar" y mostrar el menú principal

        dispose(); // Cerrar la pantalla "Comprar"
        Welcome welcome = new Welcome();
        welcome.setVisible(true); // Mostrar el menú principal        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void VenderCandilMariposasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderCandilMariposasActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar3();

        ControladorVentas controladorVentas = new ControladorVentas();
        controladorVentas.VenderCandil();

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_jugador");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_VenderCandilMariposasActionPerformed

    private void VerCandilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCandilActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        corona.setVisible(false);
        caliz.setVisible(false);
        candil.setVisible(true);
        estatua.setVisible(false);
        colgante.setVisible(false);

        VenderCandilMariposas.setEnabled(true);
        VenderEstatua.setEnabled(false);
        VenderCaliz.setEnabled(false);
        VenderEmblema.setEnabled(false);
        VenderCorona.setEnabled(false);
    }//GEN-LAST:event_VerCandilActionPerformed

    private void VerEstatuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstatuaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        estatua.setVisible(true);
        corona.setVisible(false);
        caliz.setVisible(false);
        candil.setVisible(false);
        colgante.setVisible(false);

        VenderEstatua.setEnabled(true);
        VenderCandilMariposas.setEnabled(false);
        VenderCaliz.setEnabled(false);
        VenderEmblema.setEnabled(false);
        VenderCorona.setEnabled(false);
    }//GEN-LAST:event_VerEstatuaActionPerformed

    private void VerCalizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCalizActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        caliz.setVisible(true);
        corona.setVisible(false);
        candil.setVisible(false);
        estatua.setVisible(false);
        colgante.setVisible(false);

        VenderCaliz.setEnabled(true);
        VenderCandilMariposas.setEnabled(false);
        VenderEstatua.setEnabled(false);
        VenderEmblema.setEnabled(false);
        VenderCorona.setEnabled(false);
    }//GEN-LAST:event_VerCalizActionPerformed

    private void VerEmblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmblemaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        colgante.setVisible(true);
        corona.setVisible(false);
        caliz.setVisible(false);
        candil.setVisible(false);
        estatua.setVisible(false);

        VenderEmblema.setEnabled(true);
        VenderCandilMariposas.setEnabled(false);
        VenderEstatua.setEnabled(false);
        VenderCaliz.setEnabled(false);
        VenderCorona.setEnabled(false);
    }//GEN-LAST:event_VerEmblemaActionPerformed

    private void VerCoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCoronaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.locomprareaunaltoprecio();
        corona.setVisible(true);
        caliz.setVisible(false);
        candil.setVisible(false);
        estatua.setVisible(false);
        colgante.setVisible(false);

        VenderCorona.setEnabled(true);
        VenderCandilMariposas.setEnabled(false);
        VenderEstatua.setEnabled(false);
        VenderCaliz.setEnabled(false);
        VenderEmblema.setEnabled(false);

    }//GEN-LAST:event_VerCoronaActionPerformed

    private void VenderEstatuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderEstatuaActionPerformed
        // Desactivar el botón
        VenderEstatua.setEnabled(false);

        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(2100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                VenderEstatua.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();

        // Resto del código de tu acción de botón
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar3();

        ControladorVentas controladorVentas = new ControladorVentas();
        controladorVentas.VenderEstatua();

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);
        controladorTablas.limpiarTabla();
        controladorTablas.cargarInventario("inventario_jugador");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_VenderEstatuaActionPerformed

    private void VenderCalizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderCalizActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar3();

        ControladorVentas controladorVentas = new ControladorVentas();
        controladorVentas.VenderCaliz();

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_jugador");
        Utilidades.actualizarCartel(Cartel);

    }//GEN-LAST:event_VenderCalizActionPerformed

    private void VenderEmblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderEmblemaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar3();

        ControladorVentas controladorVentas = new ControladorVentas();
        controladorVentas.VenderEmblema();

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_jugador");
        Utilidades.actualizarCartel(Cartel);

    }//GEN-LAST:event_VenderEmblemaActionPerformed

    private void VenderCoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderCoronaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar3();

        ControladorVentas controladorVentas = new ControladorVentas();
        controladorVentas.VenderCorona();

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_jugador");
        Utilidades.actualizarCartel(Cartel);


    }//GEN-LAST:event_VenderCoronaActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        JOptionPane.showMessageDialog(null, "¡Aquí podrás comprar armas y equipamiento a un precio razonable! ¡Date prisa, me lo quitan de las manos!");
    }//GEN-LAST:event_AyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JLabel Cartel;
    private javax.swing.JLabel Prueba;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton VenderCaliz;
    private javax.swing.JButton VenderCandilMariposas;
    private javax.swing.JButton VenderCorona;
    private javax.swing.JButton VenderEmblema;
    private javax.swing.JButton VenderEstatua;
    private javax.swing.JButton VerCaliz;
    private javax.swing.JButton VerCandil;
    private javax.swing.JButton VerCorona;
    private javax.swing.JButton VerEmblema;
    private javax.swing.JButton VerEstatua;
    private javax.swing.JLabel caliz;
    private javax.swing.JLabel candil;
    private javax.swing.JLabel colgante;
    private javax.swing.JLabel corona;
    private javax.swing.JLabel estatua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
