package interpolation;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Principal extends javax.swing.JFrame{

    public Principal() {
        initComponents();
                
        // Colocar texto tipo "placeholder"
        TextPrompt x1 = new TextPrompt("   Valor X1", this.x1);
        TextPrompt y1 = new TextPrompt("   Valor Y1", this.y1);
        
        TextPrompt x2 = new TextPrompt("   Valor X2", this.x2);
        TextPrompt y2 = new TextPrompt("   Valor Y2", this.y2);
        
        TextPrompt x = new TextPrompt(" X (Conocido)", this.x);
        TextPrompt y = new TextPrompt("Y (Interpolar)", this.y);
        
        TextPrompt form_lineal = new TextPrompt(" Formula para hallar el valor interpolar (Y)", this.Formula_lineal);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_atras = new javax.swing.JButton();
        panel_principal = new javax.swing.JPanel();
        barra_lineal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_atras1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lineal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        x = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Formula_lineal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        btn_atras.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(143, 157, 159));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(75, 75, 76));
        jButton1.setText("Interpolación Lineal");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton4.setBackground(new java.awt.Color(143, 157, 159));
        jButton4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton4.setText("Interpolación cuadrática");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lineal.setBackground(new java.awt.Color(217, 193, 173));
        lineal.setPreferredSize(new java.awt.Dimension(440, 700));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setText("Interpolación Lineal");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Mediante la calculadora de interpolación podras obtener el valor");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("intermedio entre dos puntos. Sabiendo los valores de las coordenadas");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("de dos puntos y la coordenada x del valor que queremos calcular");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("asi obtendremos el valor de y.");

        y1.setBackground(new java.awt.Color(217, 193, 173));
        y1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        y1.setSelectionColor(new java.awt.Color(143, 157, 159));

        y.setEditable(false);
        y.setBackground(new java.awt.Color(217, 193, 173));
        y.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        y.setRequestFocusEnabled(false);
        y.setSelectionColor(new java.awt.Color(143, 157, 159));

        x.setBackground(new java.awt.Color(217, 193, 173));
        x.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x.setSelectionColor(new java.awt.Color(143, 157, 159));

        x1.setBackground(new java.awt.Color(217, 193, 173));
        x1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x1.setSelectionColor(new java.awt.Color(143, 157, 159));

        x2.setBackground(new java.awt.Color(217, 193, 173));
        x2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x2.setSelectionColor(new java.awt.Color(143, 157, 159));

        y2.setBackground(new java.awt.Color(217, 193, 173));
        y2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        y2.setSelectionColor(new java.awt.Color(143, 157, 159));

        jButton5.setBackground(new java.awt.Color(241, 115, 106));
        jButton5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_calculator_32px.png"))); // NOI18N
        jButton5.setText("Calcular");

        jButton6.setBackground(new java.awt.Color(75, 75, 76));
        jButton6.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_repeat_32px.png"))); // NOI18N
        jButton6.setText("Reiniciar");

        Formula_lineal.setEditable(false);
        Formula_lineal.setBackground(new java.awt.Color(217, 193, 173));
        Formula_lineal.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        Formula_lineal.setRequestFocusEnabled(false);
        Formula_lineal.setSelectionColor(new java.awt.Color(143, 157, 159));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel9.setText("Copyright © 2021-2022 Interpolation Calculator");

        javax.swing.GroupLayout linealLayout = new javax.swing.GroupLayout(lineal);
        lineal.setLayout(linealLayout);
        linealLayout.setHorizontalGroup(
            linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, linealLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(164, 164, 164))
                                    .addComponent(jLabel6)))
                            .addGap(79, 79, 79))
                        .addGroup(linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(linealLayout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                        .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())))
            .addGroup(linealLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        linealLayout.setVerticalGroup(
            linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linealLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(60, 60, 60)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        panel_principal.add(lineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 720, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras1ActionPerformed
        
    }//GEN-LAST:event_btn_atras1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        new Principal().setVisible(false);
        new Secundario().setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Formula_lineal;
    private javax.swing.JPanel barra_lineal;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_atras1;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lineal;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    // End of variables declaration//GEN-END:variables

}
