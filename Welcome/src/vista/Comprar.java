package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorAudios;
import controlador.ControladorCompras;
import controlador.ControladorTablas;
import controlador.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Comprar extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla; // Modelo de la tabla

    public Comprar() {
        initComponents(); // Inicializar los componentes visuales
        setLocationRelativeTo(null); // Centrar la ventana
        //poner lo botones en false
        //false los botones
        ComprarRed9.setEnabled(false);
        ComprarEscopeta.setEnabled(false);
        ComprarFrancotirador.setEnabled(false);
        ComprarTmp.setEnabled(false);
        ComprarLanzacohetes.setEnabled(false);
        // Ajusta el tamaño de la fuente de los botones
        Volver.setFocusPainted(false);
        Volver.setBorderPainted(false);

        Red9Inspeccionar.setBorderPainted(false);
        Red9Inspeccionar.setFocusPainted(false);
        // Desactiva el borde focus de los botones y quita el borde de los botones

        // Establecer la fuente y propiedades de borde/foco para EscopetaInspeccionar
        EscopetaInspeccionar.setBorderPainted(false);
        EscopetaInspeccionar.setFocusPainted(false);

        // Establecer la fuente y propiedades de borde/foco para FrancoInspeccionar
        FrancoInspeccionar.setBorderPainted(false);
        FrancoInspeccionar.setFocusPainted(false);

        // Establecer la fuente y propiedades de borde/foco para TmpInspeccionar
        TmpInspeccionar.setBorderPainted(false);
        TmpInspeccionar.setFocusPainted(false);

        // Establecer la fuente y propiedades de borde/foco para LanzacohetesInspeccionar
        LanzacohetesInspeccionar.setBorderPainted(false);
        LanzacohetesInspeccionar.setFocusPainted(false);

        ComprarRed9.setBorderPainted(false);
        ComprarRed9.setFocusPainted(false);
        ComprarLanzacohetes.setBorderPainted(false);
        ComprarLanzacohetes.setFocusPainted(false);
        ComprarEscopeta.setBorderPainted(false);
        ComprarEscopeta.setFocusPainted(false);
        ComprarTmp.setBorderPainted(false);
        ComprarTmp.setFocusPainted(false);
        ComprarFrancotirador.setBorderPainted(false);
        ComprarFrancotirador.setFocusPainted(false);

        modeloTabla = (DefaultTableModel) Tabla.getModel(); // Obtener el modelo de la tabla
        Tabla.setModel(modeloTabla); // Asignar el modelo a la tabla

        ControladorTablas controladorTablas = new ControladorTablas(Tabla);
        controladorTablas.eliminarFilasVacias();
        controladorTablas.cargarInventario("inventario_buhonero");

        Tabla.setEnabled(false);
        Tabla.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo de la tabla como transparente
        jScrollPane1.setOpaque(false); // Hacer transparente el fondo del jScrollPane que contiene la tabla
        jScrollPane1.getViewport().setOpaque(false); // Hacer transparente el fondo del viewport del jScrollPane que contiene la tabla

        //las fotos me las pone a false para que no se muestren
        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);

        Utilidades.actualizarCartel(Cartel);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        inv_buhonero = new javax.swing.JPanel();
        escopetafoto = new javax.swing.JLabel();
        francofoto = new javax.swing.JLabel();
        tmpfoto = new javax.swing.JLabel();
        lanzacohetesfoto = new javax.swing.JLabel();
        red9foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ComprarRed9 = new javax.swing.JButton();
        ComprarLanzacohetes = new javax.swing.JButton();
        ComprarFrancotirador = new javax.swing.JButton();
        ComprarTmp = new javax.swing.JButton();
        ComprarEscopeta = new javax.swing.JButton();
        Red9Inspeccionar = new javax.swing.JButton();
        FrancoInspeccionar = new javax.swing.JButton();
        LanzacohetesInspeccionar = new javax.swing.JButton();
        EscopetaInspeccionar = new javax.swing.JButton();
        TmpInspeccionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ayuda = new javax.swing.JButton();
        Cartel = new javax.swing.JLabel();
        Comprar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setBackground(new java.awt.Color(57, 60, 53));
        Volver.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(189, 183, 165));
        Volver.setText("Salir");
        Volver.setBorderPainted(false);
        Volver.setContentAreaFilled(false);
        Volver.setDefaultCapable(false);
        Volver.setFocusPainted(false);
        Volver.setFocusable(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 50));

        inv_buhonero.setBackground(new java.awt.Color(0, 0, 0));
        inv_buhonero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escopetafoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escopeta.png"))); // NOI18N
        escopetafoto.setText("jLabel1");
        escopetafoto.setAlignmentY(0.0F);
        escopetafoto.setMaximumSize(new java.awt.Dimension(512, 288));
        escopetafoto.setMinimumSize(new java.awt.Dimension(512, 288));
        escopetafoto.setPreferredSize(new java.awt.Dimension(512, 288));
        inv_buhonero.add(escopetafoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        francofoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/franco.png"))); // NOI18N
        francofoto.setText("jLabel2");
        francofoto.setAlignmentY(0.0F);
        francofoto.setAutoscrolls(true);
        francofoto.setMaximumSize(new java.awt.Dimension(512, 288));
        francofoto.setMinimumSize(new java.awt.Dimension(512, 288));
        francofoto.setPreferredSize(new java.awt.Dimension(512, 288));
        inv_buhonero.add(francofoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 250));

        tmpfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tmp.png"))); // NOI18N
        tmpfoto.setText("jLabel1");
        tmpfoto.setAlignmentY(0.0F);
        tmpfoto.setPreferredSize(new java.awt.Dimension(512, 288));
        inv_buhonero.add(tmpfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lanzacohetesfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzacohetesbien.png"))); // NOI18N
        lanzacohetesfoto.setAlignmentY(0.0F);
        inv_buhonero.add(lanzacohetesfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        red9foto.setForeground(new java.awt.Color(242, 242, 242));
        red9foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/red9.jpeg"))); // NOI18N
        red9foto.setAlignmentY(0.0F);
        inv_buhonero.add(red9foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(inv_buhonero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 470, 250));

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBackground(new java.awt.Color(44, 35, 28));
        Tabla.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(189, 183, 165));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Articulo", "Cantidad", "Pesetas", "Descripcion", "Potencia", "Capacidad", "Cadencia", "Recarga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, false
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
        Tabla.setEnabled(false);
        Tabla.setFocusable(false);
        Tabla.setOpaque(false);
        Tabla.setRequestFocusEnabled(false);
        Tabla.setRowHeight(30);
        Tabla.setRowSelectionAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
            Tabla.getColumnModel().getColumn(6).setResizable(false);
            Tabla.getColumnModel().getColumn(7).setResizable(false);
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
        //cosas horizontales
        //articulo
        Tabla.getColumnModel().getColumn(3).setMaxWidth(275); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(3).setPreferredWidth(175); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles

        //cantidad
        Tabla.getColumnModel().getColumn(4).setMaxWidth(75); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(4).setPreferredWidth(75); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles
        //pesetas
        Tabla.getColumnModel().getColumn(5).setMaxWidth(75); // Establece el ancho máximo de la columna "pesetas" en 100 píxeles
        Tabla.getColumnModel().getColumn(5).setPreferredWidth(100); // Establece el ancho preferido de la columna "pesetas" en 100 píxeles
        //cosas horizontales
        //articulo
        Tabla.getColumnModel().getColumn(6).setMaxWidth(75); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(6).setPreferredWidth(175); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles

        //cantidad
        Tabla.getColumnModel().getColumn(7).setMaxWidth(75); // Establece el ancho máximo de la columna "cantidad" en 100 píxeles
        Tabla.getColumnModel().getColumn(7).setPreferredWidth(75); // Establece el ancho preferido de la columna "cantidad" en 100 píxeles

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 930, 250));

        ComprarRed9.setBackground(new java.awt.Color(46, 43, 34));
        ComprarRed9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ComprarRed9.setForeground(new java.awt.Color(189, 183, 165));
        ComprarRed9.setText("Comprar Red9");
        ComprarRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(ComprarRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 250, 50));

        ComprarLanzacohetes.setBackground(new java.awt.Color(46, 43, 34));
        ComprarLanzacohetes.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ComprarLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        ComprarLanzacohetes.setText("Comprar Lanzacohetes");
        ComprarLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(ComprarLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 250, 50));

        ComprarFrancotirador.setBackground(new java.awt.Color(46, 43, 34));
        ComprarFrancotirador.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ComprarFrancotirador.setForeground(new java.awt.Color(189, 183, 165));
        ComprarFrancotirador.setText("Comprar Francotirador");
        ComprarFrancotirador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarFrancotiradorActionPerformed(evt);
            }
        });
        jPanel1.add(ComprarFrancotirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 250, 50));

        ComprarTmp.setBackground(new java.awt.Color(46, 43, 34));
        ComprarTmp.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ComprarTmp.setForeground(new java.awt.Color(189, 183, 165));
        ComprarTmp.setText("Comprar Tmp");
        ComprarTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarTmpActionPerformed(evt);
            }
        });
        jPanel1.add(ComprarTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 250, 50));

        ComprarEscopeta.setBackground(new java.awt.Color(46, 43, 34));
        ComprarEscopeta.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ComprarEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        ComprarEscopeta.setText("Comprar Escopeta");
        ComprarEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(ComprarEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 250, 50));

        Red9Inspeccionar.setBackground(new java.awt.Color(46, 43, 34));
        Red9Inspeccionar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        Red9Inspeccionar.setForeground(new java.awt.Color(189, 183, 165));
        Red9Inspeccionar.setText("Ver Red9");
        Red9Inspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Red9InspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Red9Inspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 190, 50));

        FrancoInspeccionar.setBackground(new java.awt.Color(46, 43, 34));
        FrancoInspeccionar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        FrancoInspeccionar.setForeground(new java.awt.Color(189, 183, 165));
        FrancoInspeccionar.setText("Ver Francotirador");
        FrancoInspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrancoInspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(FrancoInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 190, 50));

        LanzacohetesInspeccionar.setBackground(new java.awt.Color(46, 43, 34));
        LanzacohetesInspeccionar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        LanzacohetesInspeccionar.setForeground(new java.awt.Color(189, 183, 165));
        LanzacohetesInspeccionar.setText("Ver Lanzacohetes");
        LanzacohetesInspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanzacohetesInspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(LanzacohetesInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 190, 50));

        EscopetaInspeccionar.setBackground(new java.awt.Color(46, 43, 34));
        EscopetaInspeccionar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        EscopetaInspeccionar.setForeground(new java.awt.Color(189, 183, 165));
        EscopetaInspeccionar.setText("Ver Escopeta");
        EscopetaInspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscopetaInspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(EscopetaInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 190, 50));

        TmpInspeccionar.setBackground(new java.awt.Color(46, 43, 34));
        TmpInspeccionar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        TmpInspeccionar.setForeground(new java.awt.Color(189, 183, 165));
        TmpInspeccionar.setText("Ver Tmp");
        TmpInspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmpInspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(TmpInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 190, 50));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

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
        Cartel.setMaximumSize(new java.awt.Dimension(130, 50));
        Cartel.setMinimumSize(new java.awt.Dimension(130, 50));
        Cartel.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel1.add(Cartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 160, 50));

        Comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1C.jpg"))); // NOI18N
        Comprar.setAlignmentY(0.0F);
        jPanel1.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.boton();
        //esto es el boton volver que deberia volver al menu principal
        // Cerrar la pantalla "Comprar" y mostrar el menú principal

        dispose(); // Cerrar la pantalla "Comprar"
        Welcome welcome = new Welcome();
        welcome.setVisible(true); // Mostrar el menú principal
    }//GEN-LAST:event_VolverActionPerformed

    private void ComprarRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarRed9ActionPerformed
        int cantidad = 20000; // Cantidad a deducir del dinero del jugador
        ControladorCompras controlador = new ControladorCompras();
        if (controlador.verificarDineroSuficiente(cantidad)) {
            controlador.deducirDinero(cantidad);
            controlador.ComprarRed9();
        }
        Utilidades.actualizarCartel(Cartel);
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_buhonero");
        
    }//GEN-LAST:event_ComprarRed9ActionPerformed

    private void Red9InspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Red9InspeccionarActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.red9();

        Red9Inspeccionar.setEnabled(false);
        EscopetaInspeccionar.setEnabled(false);
        TmpInspeccionar.setEnabled(false);
        FrancoInspeccionar.setEnabled(false);
        LanzacohetesInspeccionar.setEnabled(false);
        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                Red9Inspeccionar.setEnabled(true);
                EscopetaInspeccionar.setEnabled(true);
                TmpInspeccionar.setEnabled(true);
                FrancoInspeccionar.setEnabled(true);
                LanzacohetesInspeccionar.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();

        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        red9foto.setVisible(true);
        //desctivar botones
        ComprarRed9.setEnabled(true);
        ComprarLanzacohetes.setEnabled(false);
        ComprarEscopeta.setEnabled(false);
        ComprarFrancotirador.setEnabled(false);
        ComprarTmp.setEnabled(false);
    }//GEN-LAST:event_Red9InspeccionarActionPerformed

    private void ComprarLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarLanzacohetesActionPerformed
        int cantidad = 300000; // Cantidad a deducir del dinero del jugador
        ControladorCompras controlador = new ControladorCompras();
        if (controlador.verificarDineroSuficiente(cantidad)) {
            controlador.deducirDinero(cantidad);
            controlador.ComprarLanzacohetes();
        }
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_buhonero");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_ComprarLanzacohetesActionPerformed

    private void LanzacohetesInspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanzacohetesInspeccionarActionPerformed
        ControladorAudios controlador = new ControladorAudios();

        controlador.lanzacohetes();
        Red9Inspeccionar.setEnabled(false);
        EscopetaInspeccionar.setEnabled(false);
        TmpInspeccionar.setEnabled(false);
        FrancoInspeccionar.setEnabled(false);
        LanzacohetesInspeccionar.setEnabled(false);
        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                Red9Inspeccionar.setEnabled(true);
                EscopetaInspeccionar.setEnabled(true);
                TmpInspeccionar.setEnabled(true);
                FrancoInspeccionar.setEnabled(true);
                LanzacohetesInspeccionar.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();
        red9foto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        lanzacohetesfoto.setVisible(true);
        //desbloqueas el boton de comprar
        ComprarLanzacohetes.setEnabled(true);
        ComprarRed9.setEnabled(false);
        ComprarEscopeta.setEnabled(false);
        ComprarFrancotirador.setEnabled(false);
        ComprarTmp.setEnabled(false);
    }//GEN-LAST:event_LanzacohetesInspeccionarActionPerformed

    private void EscopetaInspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscopetaInspeccionarActionPerformed
        ControladorAudios controlador = new ControladorAudios();

        controlador.escopeta();
        Red9Inspeccionar.setEnabled(false);
        EscopetaInspeccionar.setEnabled(false);
        TmpInspeccionar.setEnabled(false);
        FrancoInspeccionar.setEnabled(false);
        LanzacohetesInspeccionar.setEnabled(false);
        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                Red9Inspeccionar.setEnabled(true);
                EscopetaInspeccionar.setEnabled(true);
                TmpInspeccionar.setEnabled(true);
                FrancoInspeccionar.setEnabled(true);
                LanzacohetesInspeccionar.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();
        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        tmpfoto.setVisible(false);
        escopetafoto.setVisible(true);
        //desbloqueas el boton de comprar
        ComprarEscopeta.setEnabled(true);
        ComprarLanzacohetes.setEnabled(false);
        ComprarRed9.setEnabled(false);
        ComprarFrancotirador.setEnabled(false);
        ComprarTmp.setEnabled(false);
    }//GEN-LAST:event_EscopetaInspeccionarActionPerformed

    private void TmpInspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmpInspeccionarActionPerformed
        ControladorAudios controlador = new ControladorAudios();

        controlador.tmp();
        Red9Inspeccionar.setEnabled(false);
        EscopetaInspeccionar.setEnabled(false);
        TmpInspeccionar.setEnabled(false);
        FrancoInspeccionar.setEnabled(false);
        LanzacohetesInspeccionar.setEnabled(false);
        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                Red9Inspeccionar.setEnabled(true);
                EscopetaInspeccionar.setEnabled(true);
                TmpInspeccionar.setEnabled(true);
                FrancoInspeccionar.setEnabled(true);
                LanzacohetesInspeccionar.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();
        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(true);
        //desbloqueas el boton de comprar
        ComprarTmp.setEnabled(true);
        ComprarEscopeta.setEnabled(false);
        ComprarLanzacohetes.setEnabled(false);
        ComprarRed9.setEnabled(false);
        ComprarFrancotirador.setEnabled(false);

    }//GEN-LAST:event_TmpInspeccionarActionPerformed

    private void FrancoInspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrancoInspeccionarActionPerformed
        ControladorAudios controlador = new ControladorAudios();

        controlador.elephant();
        Red9Inspeccionar.setEnabled(false);
        EscopetaInspeccionar.setEnabled(false);
        TmpInspeccionar.setEnabled(false);
        FrancoInspeccionar.setEnabled(false);
        LanzacohetesInspeccionar.setEnabled(false);
        // Crear un temporizador para habilitar el botón después de 7 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Activar el botón después de 7 segundos
                Red9Inspeccionar.setEnabled(true);
                EscopetaInspeccionar.setEnabled(true);
                TmpInspeccionar.setEnabled(true);
                FrancoInspeccionar.setEnabled(true);
                LanzacohetesInspeccionar.setEnabled(true);
            }
        });
        timer.setRepeats(false); // No se repite
        timer.start();
        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        francofoto.setVisible(true);
        //desbloqueas el boton de comprar
        ComprarFrancotirador.setEnabled(true);
        ComprarEscopeta.setEnabled(false);
        ComprarLanzacohetes.setEnabled(false);
        ComprarRed9.setEnabled(false);
        ComprarTmp.setEnabled(false);
    }//GEN-LAST:event_FrancoInspeccionarActionPerformed

    private void ComprarFrancotiradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarFrancotiradorActionPerformed
        int cantidad = 25000; // Cantidad a deducir del dinero del jugador
        ControladorCompras controlador = new ControladorCompras();
        if (controlador.verificarDineroSuficiente(cantidad)) {
            controlador.deducirDinero(cantidad);
            controlador.ComprarRifleFrancotirador();
        }
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_buhonero");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_ComprarFrancotiradorActionPerformed

    private void ComprarTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarTmpActionPerformed
        int cantidad = 30000; // Cantidad a deducir del dinero del jugador
        ControladorCompras controlador = new ControladorCompras();
        if (controlador.verificarDineroSuficiente(cantidad)) {
            controlador.deducirDinero(cantidad);
            controlador.ComprarTmp();
        }
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_buhonero");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_ComprarTmpActionPerformed

    private void ComprarEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarEscopetaActionPerformed
        int cantidad = 35000; // Cantidad a deducir del dinero del jugador
        ControladorCompras controlador = new ControladorCompras();
        if (controlador.verificarDineroSuficiente(cantidad)) {
            controlador.deducirDinero(cantidad);
            controlador.ComprarEscopetaAntidisturbios();
        }
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);

        controladorTablas.limpiarTabla();

        controladorTablas.cargarInventario("inventario_buhonero");
        Utilidades.actualizarCartel(Cartel);
    }//GEN-LAST:event_ComprarEscopetaActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        JOptionPane.showMessageDialog(null, "¡Aquí podrás comprar armas y equipamiento a un precio razonable! ¡Date prisa, me lo quitan de las manos!");
    }//GEN-LAST:event_AyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JLabel Cartel;
    private javax.swing.JLabel Comprar;
    private javax.swing.JButton ComprarEscopeta;
    private javax.swing.JButton ComprarFrancotirador;
    private javax.swing.JButton ComprarLanzacohetes;
    private javax.swing.JButton ComprarRed9;
    private javax.swing.JButton ComprarTmp;
    private javax.swing.JButton EscopetaInspeccionar;
    private javax.swing.JButton FrancoInspeccionar;
    private javax.swing.JButton LanzacohetesInspeccionar;
    private javax.swing.JButton Red9Inspeccionar;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton TmpInspeccionar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel escopetafoto;
    private javax.swing.JLabel francofoto;
    private javax.swing.JPanel inv_buhonero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lanzacohetesfoto;
    private javax.swing.JLabel red9foto;
    private javax.swing.JLabel tmpfoto;
    // End of variables declaration//GEN-END:variables
}
