package vista;

import controlador.ControladorAudios;

public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents(); // Inicializa los componentes visuales

        // Desactiva el borde focus de los botones
        Comprar.setFocusPainted(false);
        Salir.setFocusPainted(false);
        Trucar.setFocusPainted(false);
        Vender.setFocusPainted(false);

        // Quita el borde de los botones
        Comprar.setBorderPainted(false);
        Salir.setBorderPainted(false);
        Trucar.setBorderPainted(false);
        Vender.setBorderPainted(false);

        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vender = new javax.swing.JButton();
        Trucar = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        RellenarBaseDeDatos = new javax.swing.JButton();
        FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vender.setBackground(new java.awt.Color(44, 35, 28));
        Vender.setFont(new java.awt.Font("Cambria", 0, 32)); // NOI18N
        Vender.setForeground(new java.awt.Color(189, 183, 165));
        Vender.setText("Vender");
        Vender.setMaximumSize(new java.awt.Dimension(160, 90));
        Vender.setMinimumSize(new java.awt.Dimension(160, 90));
        Vender.setPreferredSize(new java.awt.Dimension(160, 90));
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        jPanel1.add(Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 160, 90));

        Trucar.setBackground(new java.awt.Color(44, 35, 28));
        Trucar.setFont(new java.awt.Font("Cambria", 0, 32)); // NOI18N
        Trucar.setForeground(new java.awt.Color(189, 183, 165));
        Trucar.setText("Trucar");
        Trucar.setMaximumSize(new java.awt.Dimension(160, 90));
        Trucar.setMinimumSize(new java.awt.Dimension(160, 90));
        Trucar.setPreferredSize(new java.awt.Dimension(160, 90));
        Trucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrucarActionPerformed(evt);
            }
        });
        jPanel1.add(Trucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        Comprar.setBackground(new java.awt.Color(44, 35, 28));
        Comprar.setFont(new java.awt.Font("Cambria", 0, 32)); // NOI18N
        Comprar.setForeground(new java.awt.Color(189, 183, 165));
        Comprar.setText("Comprar");
        Comprar.setMaximumSize(new java.awt.Dimension(170, 70));
        Comprar.setMinimumSize(new java.awt.Dimension(170, 70));
        Comprar.setPreferredSize(new java.awt.Dimension(170, 70));
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        jPanel1.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 170, 70));

        Salir.setBackground(new java.awt.Color(44, 35, 28));
        Salir.setFont(new java.awt.Font("Cambria", 0, 32)); // NOI18N
        Salir.setForeground(new java.awt.Color(189, 183, 165));
        Salir.setText("Salir");
        Salir.setMaximumSize(new java.awt.Dimension(170, 70));
        Salir.setMinimumSize(new java.awt.Dimension(170, 70));
        Salir.setPreferredSize(new java.awt.Dimension(170, 70));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        RellenarBaseDeDatos.setBackground(new java.awt.Color(15, 12, 21));
        RellenarBaseDeDatos.setForeground(new java.awt.Color(255, 255, 255));
        RellenarBaseDeDatos.setText("Rellenar");
        RellenarBaseDeDatos.setBorderPainted(false);
        RellenarBaseDeDatos.setFocusPainted(false);
        RellenarBaseDeDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RellenarBaseDeDatos.setMaximumSize(new java.awt.Dimension(110, 40));
        RellenarBaseDeDatos.setMinimumSize(new java.awt.Dimension(110, 40));
        RellenarBaseDeDatos.setPreferredSize(new java.awt.Dimension(110, 40));
        RellenarBaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarBaseDeDatosActionPerformed(evt);
            }
        });
        jPanel1.add(RellenarBaseDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        FondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1M.jpeg"))); // NOI18N
        FondoMenu.setAlignmentY(0.0F);
        jPanel1.add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.vender();
        this.dispose();
        Vender V = new Vender();
        V.setVisible(true);
    }//GEN-LAST:event_VenderActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.comprar();

        this.dispose();
        Comprar C = new Comprar();
        C.setVisible(true);
    }//GEN-LAST:event_ComprarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        ControladorAudios controlador = new ControladorAudios();
        controlador.comeback();

        long tiempoInicial = System.currentTimeMillis();
        long tiempoActual = tiempoInicial;

        while (tiempoActual - tiempoInicial < 5000) {
            tiempoActual = System.currentTimeMillis();
        }
        System.out.println("Han pasado 5 segundos");
        System.exit(0);

    }//GEN-LAST:event_SalirActionPerformed

    private void TrucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrucarActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.trucar();

        this.dispose();
        Trucar T = new Trucar();
        T.setVisible(true);
    }//GEN-LAST:event_TrucarActionPerformed

    private void RellenarBaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarBaseDeDatosActionPerformed
        this.dispose();
        RellenarBaseDeDatosCsv R = new RellenarBaseDeDatosCsv();
        R.setVisible(true);
    }//GEN-LAST:event_RellenarBaseDeDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JButton RellenarBaseDeDatos;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Trucar;
    private javax.swing.JButton Vender;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
