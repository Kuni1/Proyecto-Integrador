
package interpolation;

public class Secundario extends javax.swing.JFrame {

    public Secundario() {
        initComponents();
        
        // Colocar texto tipo "placeholder"
        TextPrompt x1 = new TextPrompt("   Valor X1", this.x1);
        TextPrompt y1 = new TextPrompt("   Valor Y1", this.y1);
        
        TextPrompt x2 = new TextPrompt("   Valor X2", this.x2);
        TextPrompt y2 = new TextPrompt("   Valor Y2", this.y2);
        
        TextPrompt x3 = new TextPrompt("   Valor X3", this.x3);
        TextPrompt y3 = new TextPrompt("   Valor Y3", this.y3);
        
        TextPrompt x = new TextPrompt(" X (Conocido)", this.x);
        TextPrompt y = new TextPrompt("Y (Interpolar)", this.y);
        
        TextPrompt form_lineal = new TextPrompt(" Formula para hallar el valor interpolar (Y)", this.Formula_lineal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_secundario = new javax.swing.JPanel();
        barra_cuadratica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_lineal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_cuadratica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_atras1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cuadratica = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        y2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Formula_lineal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_secundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_cuadratica.setBackground(new java.awt.Color(143, 157, 159));
        barra_cuadratica.setPreferredSize(new java.awt.Dimension(900, 747));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_small_telescope_64px_1.png"))); // NOI18N
        jLabel1.setText("Interpolation Calculator");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_lineal.setBackground(new java.awt.Color(143, 157, 159));
        btn_lineal.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
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
        btn_cuadratica.setForeground(new java.awt.Color(75, 75, 76));
        btn_cuadratica.setText("Interpolación cuadrática");
        btn_cuadratica.setContentAreaFilled(false);

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
        btn_atras1.setPreferredSize(new java.awt.Dimension(120, 50));
        btn_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras1ActionPerformed(evt);
            }
        });

        jLabel2.setText("--------------------------------------------------------------------------------");

        javax.swing.GroupLayout barra_cuadraticaLayout = new javax.swing.GroupLayout(barra_cuadratica);
        barra_cuadratica.setLayout(barra_cuadraticaLayout);
        barra_cuadraticaLayout.setHorizontalGroup(
            barra_cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cuadratica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_cuadraticaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barra_cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_cuadraticaLayout.createSequentialGroup()
                        .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barra_cuadraticaLayout.createSequentialGroup()
                .addGroup(barra_cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        barra_cuadraticaLayout.setVerticalGroup(
            barra_cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_cuadraticaLayout.createSequentialGroup()
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
                .addGroup(barra_cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_secundario.add(barra_cuadratica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 780));

        cuadratica.setBackground(new java.awt.Color(217, 193, 173));
        cuadratica.setPreferredSize(new java.awt.Dimension(440, 700));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setText("Interpolación Cuadrática");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Mediante la calculadora de interpolación podras predecir cualquier");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("valor apartir de saber las coordenadas de tres puntos y la coordenada");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("x del valor que queremos calcular, asi obtendremos el valor de y.");

        y2.setBackground(new java.awt.Color(217, 193, 173));
        y2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        y2.setSelectionColor(new java.awt.Color(143, 157, 159));

        x3.setBackground(new java.awt.Color(217, 193, 173));
        x3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x3.setSelectionColor(new java.awt.Color(143, 157, 159));

        x2.setBackground(new java.awt.Color(217, 193, 173));
        x2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x2.setSelectionColor(new java.awt.Color(143, 157, 159));

        x.setBackground(new java.awt.Color(217, 193, 173));
        x.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x.setSelectionColor(new java.awt.Color(143, 157, 159));

        y.setEditable(false);
        y.setBackground(new java.awt.Color(217, 193, 173));
        y.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        y.setRequestFocusEnabled(false);
        y.setSelectionColor(new java.awt.Color(143, 157, 159));

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

        x1.setBackground(new java.awt.Color(217, 193, 173));
        x1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        x1.setSelectionColor(new java.awt.Color(143, 157, 159));

        y1.setBackground(new java.awt.Color(217, 193, 173));
        y1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        y1.setSelectionColor(new java.awt.Color(143, 157, 159));

        y3.setBackground(new java.awt.Color(217, 193, 173));
        y3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        y3.setSelectionColor(new java.awt.Color(143, 157, 159));

        javax.swing.GroupLayout cuadraticaLayout = new javax.swing.GroupLayout(cuadratica);
        cuadratica.setLayout(cuadraticaLayout);
        cuadraticaLayout.setHorizontalGroup(
            cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadraticaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createSequentialGroup()
                            .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(79, 79, 79))
                        .addGroup(cuadraticaLayout.createSequentialGroup()
                            .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cuadraticaLayout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createSequentialGroup()
                        .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cuadraticaLayout.createSequentialGroup()
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cuadraticaLayout.createSequentialGroup()
                                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(169, 169, 169))))
        );
        cuadraticaLayout.setVerticalGroup(
            cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadraticaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        panel_secundario.add(cuadratica, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 720, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_linealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linealActionPerformed

        new Secundario().setVisible(false);
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_linealActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras1ActionPerformed
        new Secundario().setVisible(false);
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atras1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secundario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Formula_lineal;
    private javax.swing.JPanel barra_cuadratica;
    private javax.swing.JButton btn_atras1;
    private javax.swing.JButton btn_cuadratica;
    private javax.swing.JButton btn_lineal;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel cuadratica;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_secundario;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    // End of variables declaration//GEN-END:variables
}
