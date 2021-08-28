package interpolation;

//import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.ActionListener;
public class Principal extends javax.swing.JFrame implements ActionListener {

    panel1 panel1 = new panel1();
    panel2 panel2 = new panel2();

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);

        jPanel1.add(panel1);

        panel1.setVisible(true);
        panel2.setVisible(false);

        btn_lineal.addActionListener(this);
        btn_cuadratica.addActionListener(this);

        // Colocar
    }

    public void DeshabilitarAtras() {
        if (panel1.isVisible()) {
            btn_atras1.setEnabled(false);

        } else if (panel2.isVisible()) {
            btn_atras1.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        barra_lineal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_lineal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_cuadratica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_atras1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_principal.setAlignmentX(0.0F);
        panel_principal.setAlignmentY(0.0F);
        panel_principal.setPreferredSize(new java.awt.Dimension(1040, 780));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_lineal.setBackground(new java.awt.Color(143, 157, 159));
        barra_lineal.setPreferredSize(new java.awt.Dimension(900, 747));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_small_telescope_64px_1.png"))); // NOI18N
        jLabel1.setText("Interpolation Calculator");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_lineal.setBackground(new java.awt.Color(143, 157, 159));
        btn_lineal.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btn_lineal.setForeground(new java.awt.Color(75, 75, 76));
        btn_lineal.setText("Interpolación Lineal");
        btn_lineal.setContentAreaFilled(false);
        btn_lineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_linealActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(143, 157, 159));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton2.setText("Interpolación Polinomica");
        jButton2.setContentAreaFilled(false);

        jButton3.setBackground(new java.awt.Color(143, 157, 159));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton3.setText("Interpolación Spline");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_cuadratica.setBackground(new java.awt.Color(143, 157, 159));
        btn_cuadratica.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btn_cuadratica.setText("Interpolación cuadrática");
        btn_cuadratica.setContentAreaFilled(false);
        btn_cuadratica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadraticaActionPerformed(evt);
            }
        });

        jLabel4.setText("--------------------------------------------------------------------------------");

        btn_salir.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_salir.setPreferredSize(new java.awt.Dimension(120, 50));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_atras1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        btn_atras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        btn_atras1.setText("Atrás");
        btn_atras1.setEnabled(false);
        btn_atras1.setPreferredSize(new java.awt.Dimension(120, 50));
        btn_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras1ActionPerformed(evt);
            }
        });

        jLabel2.setText("--------------------------------------------------------------------------------");

        javax.swing.GroupLayout barra_linealLayout = new javax.swing.GroupLayout(barra_lineal);
        barra_lineal.setLayout(barra_linealLayout);
        barra_linealLayout.setHorizontalGroup(
            barra_linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cuadratica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_linealLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barra_linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_linealLayout.createSequentialGroup()
                        .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barra_linealLayout.createSequentialGroup()
                .addGroup(barra_linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        barra_linealLayout.setVerticalGroup(
            barra_linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_linealLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(btn_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cuadratica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barra_linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_principal.add(barra_lineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 780));

        jPanel1.setLayout(new java.awt.BorderLayout());
        panel_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 680, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(409, 409, 409))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras1ActionPerformed
        panel1.setVisible(true);
        panel2.setVisible(false);

        jPanel1.add(panel1);
        jPanel1.validate();

        DeshabilitarAtras();
    }//GEN-LAST:event_btn_atras1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_linealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_linealActionPerformed

    private void btn_cuadraticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuadraticaActionPerformed


    }//GEN-LAST:event_btn_cuadraticaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_lineal;
    private javax.swing.JButton btn_atras1;
    private javax.swing.JButton btn_cuadratica;
    private javax.swing.JButton btn_lineal;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_principal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if (evt.equals(btn_cuadratica)) {
            panel1.setVisible(false);
            panel2.setVisible(true);

            jPanel1.add(panel2);
            jPanel1.validate();

            DeshabilitarAtras();
        } else if (evt.equals(btn_lineal)) {
            panel1.setVisible(true);
            panel2.setVisible(false);

            jPanel1.add(panel1);
            jPanel1.validate();

            DeshabilitarAtras();
        }
    }

}
