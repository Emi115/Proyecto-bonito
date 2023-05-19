package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorAudios;
import controlador.ControladorCompras;
import controlador.ControladorTablas;
import controlador.ControladorTrucos;
import controlador.Utilidades;

public class Trucar extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla; // Modelo de la tabla

    public Trucar() {
        initComponents(); // Inicializar los componentes visuales

        // Desactiva el borde focus de los botones
        Salir.setFocusPainted(false);
        // Quita el borde de los botones
        Salir.setBorderPainted(false);

        setLocationRelativeTo(null); // Centrar la ventana

        modeloTabla = (DefaultTableModel) Tabla.getModel(); // Obtener el modelo de la tabla
        Tabla.setModel(modeloTabla); // Asignar el modelo a la tabla
        ControladorTablas controladorTablas = new ControladorTablas(Tabla);
        controladorTablas.eliminarFilasVacias();
        controladorTablas.cargarInventarioSoloArmas("inventario_jugador");

        Tabla.setEnabled(false);
        Tabla.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo de la tabla como transparente
        jScrollPane1.setOpaque(false); // Hacer transparente el fondo del jScrollPane que contiene la tabla
        jScrollPane1.getViewport().setOpaque(false); // Hacer transparente el fondo del viewport del jScrollPane que contiene la tabla

        //Botones
        RecargaRed9.setVisible(false);
        PotenciaRed9.setVisible(false);
        CapacidadRed9.setVisible(false);
        CadenciaRed9.setVisible(false);
        RecargaLanzacohetes.setVisible(false);
        PotenciaLanzacohetes.setVisible(false);
        CapacidadLanzacohetes.setVisible(false);
        CadenciaLanzacohetes.setVisible(false);
        RecargaEscopeta.setVisible(false);
        PotenciaEscopeta.setVisible(false);
        CapacidadEscopeta.setVisible(false);
        CadenciaEscopeta.setVisible(false);
        RecargaFranco.setVisible(false);
        PotenciaFranco.setVisible(false);
        CapacidadFranco.setVisible(false);
        CadenciaFranco.setVisible(false);
        RecargaTmp.setVisible(false);
        PotenciaTmp.setVisible(false);
        CapacidadTmp.setVisible(false);
        CadenciaTmp.setVisible(false);

        //Fotos
        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        Utilidades.actualizarCartel(Cartel);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        trucar = new javax.swing.JPanel();
        red9foto = new javax.swing.JLabel();
        escopetafoto = new javax.swing.JLabel();
        tmpfoto = new javax.swing.JLabel();
        francofoto = new javax.swing.JLabel();
        lanzacohetesfoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        CadenciaRed9 = new javax.swing.JButton();
        CapacidadRed9 = new javax.swing.JButton();
        RecargaRed9 = new javax.swing.JButton();
        PotenciaRed9 = new javax.swing.JButton();
        VerRed9 = new javax.swing.JButton();
        VerEscopeta = new javax.swing.JButton();
        VerTmp = new javax.swing.JButton();
        VerFranco = new javax.swing.JButton();
        VerLanzacohetes = new javax.swing.JButton();
        PotenciaLanzacohetes = new javax.swing.JButton();
        CadenciaLanzacohetes = new javax.swing.JButton();
        CapacidadLanzacohetes = new javax.swing.JButton();
        RecargaLanzacohetes = new javax.swing.JButton();
        CadenciaEscopeta = new javax.swing.JButton();
        PotenciaEscopeta = new javax.swing.JButton();
        RecargaEscopeta = new javax.swing.JButton();
        CapacidadEscopeta = new javax.swing.JButton();
        PotenciaTmp = new javax.swing.JButton();
        CadenciaTmp = new javax.swing.JButton();
        CapacidadTmp = new javax.swing.JButton();
        RecargaTmp = new javax.swing.JButton();
        PotenciaFranco = new javax.swing.JButton();
        CadenciaFranco = new javax.swing.JButton();
        RecargaFranco = new javax.swing.JButton();
        CapacidadFranco = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Cartel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(57, 60, 53));
        Salir.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(189, 183, 165));
        Salir.setText("Salir");
        Salir.setContentAreaFilled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 50));

        trucar.setBackground(new java.awt.Color(0, 0, 0));
        trucar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        red9foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/red9.jpeg"))); // NOI18N
        trucar.add(red9foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        escopetafoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escopeta.png"))); // NOI18N
        trucar.add(escopetafoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tmpfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tmp.png"))); // NOI18N
        tmpfoto.setText("jLabel2");
        tmpfoto.setMaximumSize(new java.awt.Dimension(512, 288));
        tmpfoto.setMinimumSize(new java.awt.Dimension(512, 288));
        tmpfoto.setPreferredSize(new java.awt.Dimension(512, 288));
        trucar.add(tmpfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        francofoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/franco.png"))); // NOI18N
        francofoto.setText("jLabel2");
        francofoto.setMaximumSize(new java.awt.Dimension(512, 288));
        francofoto.setMinimumSize(new java.awt.Dimension(512, 288));
        francofoto.setPreferredSize(new java.awt.Dimension(512, 288));
        trucar.add(francofoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lanzacohetesfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lanzacohetesbien.png"))); // NOI18N
        trucar.add(lanzacohetesfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(trucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 470, 250));

        Tabla.setBackground(new java.awt.Color(44, 35, 28));
        Tabla.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(189, 183, 165));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad", "Pesetas", "Descripcion", "Potencia", "Capacidad", "Cadencia", "Recarga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        Tabla.setFocusable(false);
        Tabla.setGridColor(new java.awt.Color(44, 35, 28));
        Tabla.setMaximumSize(new java.awt.Dimension(600, 0));
        Tabla.setMinimumSize(new java.awt.Dimension(600, 0));
        Tabla.setOpaque(false);
        Tabla.setRequestFocusEnabled(false);
        Tabla.setRowHeight(30);
        Tabla.setRowSelectionAllowed(false);
        Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 930, 240));

        CadenciaRed9.setBackground(new java.awt.Color(57, 60, 53));
        CadenciaRed9.setForeground(new java.awt.Color(189, 183, 165));
        CadenciaRed9.setText("Cadencia red9");
        CadenciaRed9.setMaximumSize(new java.awt.Dimension(170, 25));
        CadenciaRed9.setMinimumSize(new java.awt.Dimension(170, 25));
        CadenciaRed9.setPreferredSize(new java.awt.Dimension(170, 25));
        CadenciaRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenciaRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(CadenciaRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 380, -1, -1));

        CapacidadRed9.setBackground(new java.awt.Color(57, 60, 53));
        CapacidadRed9.setForeground(new java.awt.Color(189, 183, 165));
        CapacidadRed9.setText("Capacidad Red9");
        CapacidadRed9.setMaximumSize(new java.awt.Dimension(170, 25));
        CapacidadRed9.setMinimumSize(new java.awt.Dimension(170, 25));
        CapacidadRed9.setPreferredSize(new java.awt.Dimension(170, 25));
        CapacidadRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacidadRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(CapacidadRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        RecargaRed9.setBackground(new java.awt.Color(57, 60, 53));
        RecargaRed9.setForeground(new java.awt.Color(189, 183, 165));
        RecargaRed9.setText("Recarga Red9");
        RecargaRed9.setMaximumSize(new java.awt.Dimension(170, 25));
        RecargaRed9.setMinimumSize(new java.awt.Dimension(170, 25));
        RecargaRed9.setPreferredSize(new java.awt.Dimension(170, 25));
        RecargaRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(RecargaRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 440, -1, -1));

        PotenciaRed9.setBackground(new java.awt.Color(57, 60, 53));
        PotenciaRed9.setForeground(new java.awt.Color(189, 183, 165));
        PotenciaRed9.setText("Potencia Red9");
        PotenciaRed9.setMaximumSize(new java.awt.Dimension(170, 25));
        PotenciaRed9.setMinimumSize(new java.awt.Dimension(170, 25));
        PotenciaRed9.setPreferredSize(new java.awt.Dimension(170, 25));
        PotenciaRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(PotenciaRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        VerRed9.setBackground(new java.awt.Color(57, 60, 53));
        VerRed9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerRed9.setForeground(new java.awt.Color(189, 183, 165));
        VerRed9.setText("Red9");
        VerRed9.setBorderPainted(false);
        VerRed9.setDefaultCapable(false);
        VerRed9.setFocusPainted(false);
        VerRed9.setFocusable(false);
        VerRed9.setMaximumSize(new java.awt.Dimension(105, 25));
        VerRed9.setMinimumSize(new java.awt.Dimension(105, 25));
        VerRed9.setPreferredSize(new java.awt.Dimension(105, 25));
        VerRed9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerRed9ActionPerformed(evt);
            }
        });
        jPanel1.add(VerRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 190, -1));

        VerEscopeta.setBackground(new java.awt.Color(57, 60, 53));
        VerEscopeta.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        VerEscopeta.setText("Escopeta");
        VerEscopeta.setBorderPainted(false);
        VerEscopeta.setDefaultCapable(false);
        VerEscopeta.setFocusPainted(false);
        VerEscopeta.setFocusable(false);
        VerEscopeta.setMaximumSize(new java.awt.Dimension(105, 25));
        VerEscopeta.setMinimumSize(new java.awt.Dimension(105, 25));
        VerEscopeta.setPreferredSize(new java.awt.Dimension(105, 25));
        VerEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(VerEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 190, -1));

        VerTmp.setBackground(new java.awt.Color(57, 60, 53));
        VerTmp.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerTmp.setForeground(new java.awt.Color(189, 183, 165));
        VerTmp.setText("Tmp");
        VerTmp.setBorderPainted(false);
        VerTmp.setDefaultCapable(false);
        VerTmp.setFocusPainted(false);
        VerTmp.setFocusable(false);
        VerTmp.setMaximumSize(new java.awt.Dimension(105, 25));
        VerTmp.setMinimumSize(new java.awt.Dimension(105, 25));
        VerTmp.setPreferredSize(new java.awt.Dimension(105, 25));
        VerTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTmpActionPerformed(evt);
            }
        });
        jPanel1.add(VerTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 190, -1));

        VerFranco.setBackground(new java.awt.Color(57, 60, 53));
        VerFranco.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerFranco.setForeground(new java.awt.Color(189, 183, 165));
        VerFranco.setText("Francotirador");
        VerFranco.setBorderPainted(false);
        VerFranco.setDefaultCapable(false);
        VerFranco.setFocusPainted(false);
        VerFranco.setFocusable(false);
        VerFranco.setMaximumSize(new java.awt.Dimension(105, 25));
        VerFranco.setMinimumSize(new java.awt.Dimension(105, 25));
        VerFranco.setPreferredSize(new java.awt.Dimension(105, 25));
        VerFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFrancoActionPerformed(evt);
            }
        });
        jPanel1.add(VerFranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 190, -1));

        VerLanzacohetes.setBackground(new java.awt.Color(57, 60, 53));
        VerLanzacohetes.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        VerLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        VerLanzacohetes.setText("Lanzacohetes");
        VerLanzacohetes.setBorderPainted(false);
        VerLanzacohetes.setDefaultCapable(false);
        VerLanzacohetes.setFocusPainted(false);
        VerLanzacohetes.setFocusable(false);
        VerLanzacohetes.setMaximumSize(new java.awt.Dimension(105, 25));
        VerLanzacohetes.setMinimumSize(new java.awt.Dimension(105, 25));
        VerLanzacohetes.setPreferredSize(new java.awt.Dimension(105, 25));
        VerLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(VerLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 190, -1));

        PotenciaLanzacohetes.setBackground(new java.awt.Color(57, 60, 53));
        PotenciaLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        PotenciaLanzacohetes.setText("Potencia Lanzacohetes");
        PotenciaLanzacohetes.setMaximumSize(new java.awt.Dimension(170, 25));
        PotenciaLanzacohetes.setMinimumSize(new java.awt.Dimension(170, 25));
        PotenciaLanzacohetes.setPreferredSize(new java.awt.Dimension(170, 25));
        PotenciaLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(PotenciaLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        CadenciaLanzacohetes.setBackground(new java.awt.Color(57, 60, 53));
        CadenciaLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        CadenciaLanzacohetes.setText("Cadencia Lanzacohetes");
        CadenciaLanzacohetes.setMaximumSize(new java.awt.Dimension(170, 25));
        CadenciaLanzacohetes.setMinimumSize(new java.awt.Dimension(170, 25));
        CadenciaLanzacohetes.setPreferredSize(new java.awt.Dimension(170, 25));
        CadenciaLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenciaLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(CadenciaLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 380, -1, -1));

        CapacidadLanzacohetes.setBackground(new java.awt.Color(57, 60, 53));
        CapacidadLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        CapacidadLanzacohetes.setText("Capacidad Lanzacohetes");
        CapacidadLanzacohetes.setMaximumSize(new java.awt.Dimension(170, 25));
        CapacidadLanzacohetes.setMinimumSize(new java.awt.Dimension(170, 25));
        CapacidadLanzacohetes.setPreferredSize(new java.awt.Dimension(170, 25));
        CapacidadLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacidadLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(CapacidadLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        RecargaLanzacohetes.setBackground(new java.awt.Color(57, 60, 53));
        RecargaLanzacohetes.setForeground(new java.awt.Color(189, 183, 165));
        RecargaLanzacohetes.setText("Recarga Lanzacohetes");
        RecargaLanzacohetes.setMaximumSize(new java.awt.Dimension(170, 25));
        RecargaLanzacohetes.setMinimumSize(new java.awt.Dimension(170, 25));
        RecargaLanzacohetes.setPreferredSize(new java.awt.Dimension(170, 25));
        RecargaLanzacohetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaLanzacohetesActionPerformed(evt);
            }
        });
        jPanel1.add(RecargaLanzacohetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 440, -1, -1));

        CadenciaEscopeta.setBackground(new java.awt.Color(57, 60, 53));
        CadenciaEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        CadenciaEscopeta.setText("Cadencia Escopeta");
        CadenciaEscopeta.setMaximumSize(new java.awt.Dimension(170, 25));
        CadenciaEscopeta.setMinimumSize(new java.awt.Dimension(170, 25));
        CadenciaEscopeta.setPreferredSize(new java.awt.Dimension(170, 25));
        CadenciaEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenciaEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(CadenciaEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 380, -1, -1));

        PotenciaEscopeta.setBackground(new java.awt.Color(57, 60, 53));
        PotenciaEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        PotenciaEscopeta.setText("Potencia Escopeta");
        PotenciaEscopeta.setMaximumSize(new java.awt.Dimension(170, 25));
        PotenciaEscopeta.setMinimumSize(new java.awt.Dimension(170, 25));
        PotenciaEscopeta.setPreferredSize(new java.awt.Dimension(170, 25));
        PotenciaEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(PotenciaEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        RecargaEscopeta.setBackground(new java.awt.Color(57, 60, 53));
        RecargaEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        RecargaEscopeta.setText("Recarga Escopeta");
        RecargaEscopeta.setMaximumSize(new java.awt.Dimension(170, 25));
        RecargaEscopeta.setMinimumSize(new java.awt.Dimension(170, 25));
        RecargaEscopeta.setPreferredSize(new java.awt.Dimension(170, 25));
        RecargaEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(RecargaEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 440, -1, -1));

        CapacidadEscopeta.setBackground(new java.awt.Color(57, 60, 53));
        CapacidadEscopeta.setForeground(new java.awt.Color(189, 183, 165));
        CapacidadEscopeta.setText("Capacidad Escopeta");
        CapacidadEscopeta.setMaximumSize(new java.awt.Dimension(170, 25));
        CapacidadEscopeta.setMinimumSize(new java.awt.Dimension(170, 25));
        CapacidadEscopeta.setPreferredSize(new java.awt.Dimension(170, 25));
        CapacidadEscopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacidadEscopetaActionPerformed(evt);
            }
        });
        jPanel1.add(CapacidadEscopeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        PotenciaTmp.setBackground(new java.awt.Color(57, 60, 53));
        PotenciaTmp.setForeground(new java.awt.Color(189, 183, 165));
        PotenciaTmp.setText("Potencia de Tmp");
        PotenciaTmp.setMaximumSize(new java.awt.Dimension(170, 25));
        PotenciaTmp.setMinimumSize(new java.awt.Dimension(170, 25));
        PotenciaTmp.setPreferredSize(new java.awt.Dimension(170, 25));
        PotenciaTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaTmpActionPerformed(evt);
            }
        });
        jPanel1.add(PotenciaTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        CadenciaTmp.setBackground(new java.awt.Color(57, 60, 53));
        CadenciaTmp.setForeground(new java.awt.Color(189, 183, 165));
        CadenciaTmp.setText("Cadencia de Tmp");
        CadenciaTmp.setMaximumSize(new java.awt.Dimension(170, 25));
        CadenciaTmp.setMinimumSize(new java.awt.Dimension(170, 25));
        CadenciaTmp.setPreferredSize(new java.awt.Dimension(170, 25));
        CadenciaTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenciaTmpActionPerformed(evt);
            }
        });
        jPanel1.add(CadenciaTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 380, -1, -1));

        CapacidadTmp.setBackground(new java.awt.Color(57, 60, 53));
        CapacidadTmp.setForeground(new java.awt.Color(189, 183, 165));
        CapacidadTmp.setText("Capacidad de Tmp");
        CapacidadTmp.setMaximumSize(new java.awt.Dimension(170, 25));
        CapacidadTmp.setMinimumSize(new java.awt.Dimension(170, 25));
        CapacidadTmp.setPreferredSize(new java.awt.Dimension(170, 25));
        CapacidadTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacidadTmpActionPerformed(evt);
            }
        });
        jPanel1.add(CapacidadTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        RecargaTmp.setBackground(new java.awt.Color(57, 60, 53));
        RecargaTmp.setForeground(new java.awt.Color(189, 183, 165));
        RecargaTmp.setText("Recarga de Tmp");
        RecargaTmp.setMaximumSize(new java.awt.Dimension(170, 25));
        RecargaTmp.setMinimumSize(new java.awt.Dimension(170, 25));
        RecargaTmp.setPreferredSize(new java.awt.Dimension(170, 25));
        RecargaTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaTmpActionPerformed(evt);
            }
        });
        jPanel1.add(RecargaTmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 440, -1, -1));

        PotenciaFranco.setBackground(new java.awt.Color(57, 60, 53));
        PotenciaFranco.setForeground(new java.awt.Color(189, 183, 165));
        PotenciaFranco.setText("Potencia de Franco");
        PotenciaFranco.setMaximumSize(new java.awt.Dimension(170, 25));
        PotenciaFranco.setMinimumSize(new java.awt.Dimension(170, 25));
        PotenciaFranco.setPreferredSize(new java.awt.Dimension(170, 25));
        PotenciaFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaFrancoActionPerformed(evt);
            }
        });
        jPanel1.add(PotenciaFranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        CadenciaFranco.setBackground(new java.awt.Color(57, 60, 53));
        CadenciaFranco.setForeground(new java.awt.Color(189, 183, 165));
        CadenciaFranco.setText("Cadencia de Franco");
        CadenciaFranco.setMaximumSize(new java.awt.Dimension(170, 25));
        CadenciaFranco.setMinimumSize(new java.awt.Dimension(170, 25));
        CadenciaFranco.setPreferredSize(new java.awt.Dimension(170, 25));
        CadenciaFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenciaFrancoActionPerformed(evt);
            }
        });
        jPanel1.add(CadenciaFranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 380, -1, -1));

        RecargaFranco.setBackground(new java.awt.Color(57, 60, 53));
        RecargaFranco.setForeground(new java.awt.Color(189, 183, 165));
        RecargaFranco.setText("Recarga de Franco");
        RecargaFranco.setMaximumSize(new java.awt.Dimension(170, 25));
        RecargaFranco.setMinimumSize(new java.awt.Dimension(170, 25));
        RecargaFranco.setPreferredSize(new java.awt.Dimension(170, 25));
        RecargaFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaFrancoActionPerformed(evt);
            }
        });
        jPanel1.add(RecargaFranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 440, -1, -1));

        CapacidadFranco.setBackground(new java.awt.Color(57, 60, 53));
        CapacidadFranco.setForeground(new java.awt.Color(189, 183, 165));
        CapacidadFranco.setText("Capacidad de Franco");
        CapacidadFranco.setMaximumSize(new java.awt.Dimension(170, 25));
        CapacidadFranco.setMinimumSize(new java.awt.Dimension(170, 25));
        CapacidadFranco.setPreferredSize(new java.awt.Dimension(170, 25));
        CapacidadFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacidadFrancoActionPerformed(evt);
            }
        });
        jPanel1.add(CapacidadFranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        Ayuda.setBackground(new java.awt.Color(57, 60, 53));
        Ayuda.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(189, 183, 165));
        Ayuda.setText("Ayuda");
        Ayuda.setAlignmentY(0.0F);
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
        jPanel1.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 150, 60));

        Cartel.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        Cartel.setForeground(new java.awt.Color(129, 127, 113));
        Cartel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Cartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1T.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(1333, 750));
        jLabel1.setMinimumSize(new java.awt.Dimension(1333, 750));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1333, 750));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 741, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.boton();

        //esto es el boton volver que deberia volver al menu principal
        // Cerrar la pantalla "Comprar" y mostrar el menú principal
        dispose();
        Welcome welcome = new Welcome();
        welcome.setVisible(true); // Mostrar el menú principal

    }//GEN-LAST:event_SalirActionPerformed

    private void CadenciaRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenciaRed9ActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCadenciaRed9();

            // Verificar si se ha añadido la pistola "Red9" al inventario
            if (controladorT.verificarRed9()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Red9" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CadenciaRed9ActionPerformed

    private void CapacidadRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacidadRed9ActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCapacidadRed9();

            // Verificar si se ha añadido la pistola "Red9" al inventario
            if (controladorT.verificarRed9()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Red9" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CapacidadRed9ActionPerformed

    private void RecargaRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaRed9ActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarRecargaRed9();

            // Verificar si se ha añadido la pistola "Red9" al inventario
            if (controladorT.verificarRed9()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Red9" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_RecargaRed9ActionPerformed

    private void PotenciaRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaRed9ActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarPotenciaRed9();

            // Verificar si se ha añadido la pistola "Red9" al inventario
            if (controladorT.verificarRed9()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Red9" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_PotenciaRed9ActionPerformed

    private void RecargaLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaLanzacohetesActionPerformed
        JOptionPane.showMessageDialog(this, "El Lanzacohetes no se puede mejorar.");
    }//GEN-LAST:event_RecargaLanzacohetesActionPerformed

    private void CapacidadLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacidadLanzacohetesActionPerformed
        JOptionPane.showMessageDialog(this, "El Lanzacohetes no se puede mejorar.");
    }//GEN-LAST:event_CapacidadLanzacohetesActionPerformed

    private void CadenciaLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenciaLanzacohetesActionPerformed
        JOptionPane.showMessageDialog(this, "El Lanzacohetes no se puede mejorar.");
    }//GEN-LAST:event_CadenciaLanzacohetesActionPerformed

    private void PotenciaLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaLanzacohetesActionPerformed
        JOptionPane.showMessageDialog(this, "El Lanzacohetes no se puede mejorar.");
    }//GEN-LAST:event_PotenciaLanzacohetesActionPerformed

    private void VerRed9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRed9ActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        RecargaRed9.setVisible(true);
        PotenciaRed9.setVisible(true);
        CapacidadRed9.setVisible(true);
        CadenciaRed9.setVisible(true);
        RecargaLanzacohetes.setVisible(false);
        PotenciaLanzacohetes.setVisible(false);
        CapacidadLanzacohetes.setVisible(false);
        CadenciaLanzacohetes.setVisible(false);
        RecargaEscopeta.setVisible(false);
        PotenciaEscopeta.setVisible(false);
        CapacidadEscopeta.setVisible(false);
        CadenciaEscopeta.setVisible(false);
        RecargaFranco.setVisible(false);
        PotenciaFranco.setVisible(false);
        CapacidadFranco.setVisible(false);
        CadenciaFranco.setVisible(false);
        RecargaTmp.setVisible(false);
        PotenciaTmp.setVisible(false);
        CapacidadTmp.setVisible(false);
        CadenciaTmp.setVisible(false);
        //fotos
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        red9foto.setVisible(true);

    }//GEN-LAST:event_VerRed9ActionPerformed

    private void VerLanzacohetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerLanzacohetesActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        RecargaLanzacohetes.setVisible(true);
        PotenciaLanzacohetes.setVisible(true);
        CapacidadLanzacohetes.setVisible(true);
        CadenciaLanzacohetes.setVisible(true);
        RecargaRed9.setVisible(false);
        PotenciaRed9.setVisible(false);
        CapacidadRed9.setVisible(false);
        CadenciaRed9.setVisible(false);
        RecargaEscopeta.setVisible(false);
        PotenciaEscopeta.setVisible(false);
        CapacidadEscopeta.setVisible(false);
        CadenciaEscopeta.setVisible(false);
        RecargaFranco.setVisible(false);
        PotenciaFranco.setVisible(false);
        CapacidadFranco.setVisible(false);
        CadenciaFranco.setVisible(false);
        RecargaTmp.setVisible(false);
        PotenciaTmp.setVisible(false);
        CapacidadTmp.setVisible(false);
        CadenciaTmp.setVisible(false);

        red9foto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        lanzacohetesfoto.setVisible(true);
    }//GEN-LAST:event_VerLanzacohetesActionPerformed

    private void VerEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEscopetaActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        RecargaEscopeta.setVisible(true);
        PotenciaEscopeta.setVisible(true);
        CapacidadEscopeta.setVisible(true);
        CadenciaEscopeta.setVisible(true);
        RecargaRed9.setVisible(false);
        PotenciaRed9.setVisible(false);
        CapacidadRed9.setVisible(false);
        CadenciaRed9.setVisible(false);
        RecargaLanzacohetes.setVisible(false);
        PotenciaLanzacohetes.setVisible(false);
        CapacidadLanzacohetes.setVisible(false);
        CadenciaLanzacohetes.setVisible(false);
        RecargaFranco.setVisible(false);
        PotenciaFranco.setVisible(false);
        CapacidadFranco.setVisible(false);
        CadenciaFranco.setVisible(false);
        RecargaTmp.setVisible(false);
        PotenciaTmp.setVisible(false);
        CapacidadTmp.setVisible(false);
        CadenciaTmp.setVisible(false);

        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        tmpfoto.setVisible(false);
        escopetafoto.setVisible(true);
    }//GEN-LAST:event_VerEscopetaActionPerformed

    private void VerTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTmpActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        RecargaTmp.setVisible(true);
        PotenciaTmp.setVisible(true);
        CapacidadTmp.setVisible(true);
        CadenciaTmp.setVisible(true);
        RecargaRed9.setVisible(false);
        PotenciaRed9.setVisible(false);
        CapacidadRed9.setVisible(false);
        CadenciaRed9.setVisible(false);
        RecargaLanzacohetes.setVisible(false);
        PotenciaLanzacohetes.setVisible(false);
        CapacidadLanzacohetes.setVisible(false);
        CadenciaLanzacohetes.setVisible(false);
        RecargaEscopeta.setVisible(false);
        PotenciaEscopeta.setVisible(false);
        CapacidadEscopeta.setVisible(false);
        CadenciaEscopeta.setVisible(false);
        RecargaFranco.setVisible(false);
        PotenciaFranco.setVisible(false);
        CapacidadFranco.setVisible(false);
        CadenciaFranco.setVisible(false);

        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        francofoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(true);
    }//GEN-LAST:event_VerTmpActionPerformed

    private void VerFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFrancoActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.interactuar();
        RecargaFranco.setVisible(true);
        PotenciaFranco.setVisible(true);
        CapacidadFranco.setVisible(true);
        CadenciaFranco.setVisible(true);
        RecargaRed9.setVisible(false);
        PotenciaRed9.setVisible(false);
        CapacidadRed9.setVisible(false);
        CadenciaRed9.setVisible(false);
        RecargaLanzacohetes.setVisible(false);
        PotenciaLanzacohetes.setVisible(false);
        CapacidadLanzacohetes.setVisible(false);
        CadenciaLanzacohetes.setVisible(false);
        RecargaEscopeta.setVisible(false);
        PotenciaEscopeta.setVisible(false);
        CapacidadEscopeta.setVisible(false);
        CadenciaEscopeta.setVisible(false);
        RecargaTmp.setVisible(false);
        PotenciaTmp.setVisible(false);
        CapacidadTmp.setVisible(false);
        CadenciaTmp.setVisible(false);

        red9foto.setVisible(false);
        lanzacohetesfoto.setVisible(false);
        escopetafoto.setVisible(false);
        tmpfoto.setVisible(false);
        francofoto.setVisible(true);
    }//GEN-LAST:event_VerFrancoActionPerformed

    private void CapacidadFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacidadFrancoActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCapacidadRifleFrancotirador();

            // Verificar si se ha añadido la pistola "Franco" al inventario
            if (controladorT.verificarFranco()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Franco" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CapacidadFrancoActionPerformed

    private void RecargaFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaFrancoActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarRecargaRifleFrancotirador();

            // Verificar si se ha añadido la pistola "Franco" al inventario
            if (controladorT.verificarFranco()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Franco" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_RecargaFrancoActionPerformed

    private void CadenciaFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenciaFrancoActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCadenciaRifleFrancotirador();

            // Verificar si se ha añadido la pistola "Franco" al inventario
            if (controladorT.verificarFranco()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Franco" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CadenciaFrancoActionPerformed

    private void PotenciaFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaFrancoActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarPotenciaRifleFrancotirador();

            // Verificar si se ha añadido la pistola "Franco" al inventario
            if (controladorT.verificarFranco()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Franco" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_PotenciaFrancoActionPerformed

    private void CadenciaEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenciaEscopetaActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCadenciaEscopetaAntidisturbios();

            // Verificar si se ha añadido la pistola "Escopeta" al inventario
            if (controladorT.verificarEscopeta()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "EscopetaAntidisturbios" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CadenciaEscopetaActionPerformed

    private void PotenciaEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaEscopetaActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarPotenciaEscopetaAntidisturbios();

            // Verificar si se ha añadido la pistola "Escopeta" al inventario
            if (controladorT.verificarEscopeta()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "EscopetaAntidisturbios" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_PotenciaEscopetaActionPerformed

    private void RecargaEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaEscopetaActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarRecargaEscopetaAntidisturbios();

            // Verificar si se ha añadido la pistola "Escopeta" al inventario
            if (controladorT.verificarEscopeta()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "EscopetaAntidisturbios" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_RecargaEscopetaActionPerformed

    private void CapacidadEscopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacidadEscopetaActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCapacidadEscopetaAntidisturbios();

            // Verificar si se ha añadido la pistola "Escopeta" al inventario
            if (controladorT.verificarEscopeta()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "EscopetaAntidisturbios" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CapacidadEscopetaActionPerformed

    private void PotenciaTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaTmpActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarPotenciaTmp();

            // Verificar si se ha añadido la pistola "Tmp" al inventario
            if (controladorT.verificarTmp()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Tmp" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_PotenciaTmpActionPerformed

    private void CadenciaTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenciaTmpActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCadenciaTmp();

            // Verificar si se ha añadido la pistola "Tmp" al inventario
            if (controladorT.verificarTmp()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Tmp" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CadenciaTmpActionPerformed

    private void CapacidadTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacidadTmpActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarCapacidadTmp();

            // Verificar si se ha añadido la pistola "Tmp" al inventario
            if (controladorT.verificarTmp()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Tmp" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_CapacidadTmpActionPerformed

    private void RecargaTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaTmpActionPerformed
        int cantidad = 50000; // Cantidad a deducir del dinero del jugador

        ControladorCompras controlador = new ControladorCompras();
        ControladorTrucos controladorT = new ControladorTrucos();

        if (controlador.verificarDineroSuficiente(cantidad)) {
            controladorT.modificarRecargaTmp();

            // Verificar si se ha añadido la pistola "Tmp" al inventario
            if (controladorT.verificarTmp()) {
                controlador.deducirDinero(cantidad);
            } else {
                // La pistola "Tmp" no está en el inventario, mostrar un mensaje o realizar alguna acción adicional
                return; // Salir del método si la pistola no está en el inventario
            }

            ControladorTablas controladorTablas = new ControladorTablas(Tabla);
            controladorTablas.limpiarTabla();
            controladorTablas.cargarInventarioSoloArmas("inventario_Jugador");
            Utilidades.actualizarCartel(Cartel);
        }
    }//GEN-LAST:event_RecargaTmpActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Aquí podrás trucar cualquier característica de las armas que hay disponibles hasta el infinito, siempre y cuando tengas 75000 por Mejora. (¡Solo por tiempo limitado!)");
    }//GEN-LAST:event_AyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton CadenciaEscopeta;
    private javax.swing.JButton CadenciaFranco;
    private javax.swing.JButton CadenciaLanzacohetes;
    private javax.swing.JButton CadenciaRed9;
    private javax.swing.JButton CadenciaTmp;
    private javax.swing.JButton CapacidadEscopeta;
    private javax.swing.JButton CapacidadFranco;
    private javax.swing.JButton CapacidadLanzacohetes;
    private javax.swing.JButton CapacidadRed9;
    private javax.swing.JButton CapacidadTmp;
    private javax.swing.JLabel Cartel;
    private javax.swing.JButton PotenciaEscopeta;
    private javax.swing.JButton PotenciaFranco;
    private javax.swing.JButton PotenciaLanzacohetes;
    private javax.swing.JButton PotenciaRed9;
    private javax.swing.JButton PotenciaTmp;
    private javax.swing.JButton RecargaEscopeta;
    private javax.swing.JButton RecargaFranco;
    private javax.swing.JButton RecargaLanzacohetes;
    private javax.swing.JButton RecargaRed9;
    private javax.swing.JButton RecargaTmp;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton VerEscopeta;
    private javax.swing.JButton VerFranco;
    private javax.swing.JButton VerLanzacohetes;
    private javax.swing.JButton VerRed9;
    private javax.swing.JButton VerTmp;
    private javax.swing.JLabel escopetafoto;
    private javax.swing.JLabel francofoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lanzacohetesfoto;
    private javax.swing.JLabel red9foto;
    private javax.swing.JLabel tmpfoto;
    private javax.swing.JPanel trucar;
    // End of variables declaration//GEN-END:variables
}
