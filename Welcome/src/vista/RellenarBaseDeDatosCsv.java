package vista;

import controlador.ControladorAudios;
import modelo.CreacionBaseDeDatos;
import java.applet.AudioClip;

public class RellenarBaseDeDatosCsv extends javax.swing.JFrame {

    /**
     * Creates new form RellenarBaseDeDatosCsv
     */
    public RellenarBaseDeDatosCsv() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AñadirTesoros = new javax.swing.JButton();
        borrarJugador = new javax.swing.JButton();
        Dineroa0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 350));
        setMinimumSize(new java.awt.Dimension(900, 350));
        setPreferredSize(new java.awt.Dimension(900, 350));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Este boton borra los registros del buhonero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        Borrar.setText("Borrar Registros");
        Borrar.setPreferredSize(new java.awt.Dimension(72, 23));
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 170, 30));

        jLabel2.setText("Este añade registros desde el Csv a la base de datos del buhonero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Añadir.setText("Añadir");
        Añadir.setAlignmentY(0.0F);
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 30));

        jLabel3.setText("Este boton añade desde otro Csv tesoros para vender al jugador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setText("Este borra los registros del jugador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        AñadirTesoros.setText("Añadir Tesoros");
        AñadirTesoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirTesorosActionPerformed(evt);
            }
        });
        jPanel1.add(AñadirTesoros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, 30));

        borrarJugador.setText("Borrar Registros");
        borrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(borrarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, 30));

        Dineroa0.setText("Dinero a 0");
        Dineroa0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dineroa0ActionPerformed(evt);
            }
        });
        jPanel1.add(Dineroa0, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        CreacionBaseDeDatos.insertarDatos();
    }//GEN-LAST:event_AñadirActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        CreacionBaseDeDatos.eliminarRegistros();
    }//GEN-LAST:event_BorrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        ControladorAudios controlador = new ControladorAudios();
        controlador.boton();
        //esto es el boton volver que deberia volver al menu principal
        // Cerrar la pantalla "Comprar" y mostrar el menú principal

        dispose(); // Cerrar la pantalla "Comprar"
        Welcome welcome = new Welcome();
        welcome.setVisible(true); // Mostrar el menú principal        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void AñadirTesorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirTesorosActionPerformed
        CreacionBaseDeDatos.insertarDatosJugador();
    }//GEN-LAST:event_AñadirTesorosActionPerformed

    private void borrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarJugadorActionPerformed
        CreacionBaseDeDatos.eliminarRegistrosJugador();
    }//GEN-LAST:event_borrarJugadorActionPerformed

    private void Dineroa0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dineroa0ActionPerformed
        CreacionBaseDeDatos.eliminarRegistrosDinero();
    }//GEN-LAST:event_Dineroa0ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton AñadirTesoros;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Dineroa0;
    private javax.swing.JButton borrarJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
