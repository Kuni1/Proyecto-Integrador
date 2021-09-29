
package JFrame;

import Class.TextPrompt;

public class panel1 extends javax.swing.JPanel {

    public panel1() {
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

        jLabel6 = new javax.swing.JLabel();
        lineal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        x = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Formula_lineal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("intermedio entre dos puntos. Sabiendo los valores de las coordenadas");

        setPreferredSize(new java.awt.Dimension(680, 780));

        lineal.setBackground(new java.awt.Color(217, 193, 173));
        lineal.setPreferredSize(new java.awt.Dimension(440, 700));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setText("Interpolación Lineal");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Mediante la calculadora de interpolación podras obtener el valor");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("intermedio entre dos puntos. Sabiendo los valores de las coordenadas");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("de dos puntos y la coordenada x del valor que queremos calcular");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setText("asi obtendremos el valor de y.");

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

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel10.setText("Copyright © 2021-2022 Interpolation Calculator");

        javax.swing.GroupLayout linealLayout = new javax.swing.GroupLayout(lineal);
        lineal.setLayout(linealLayout);
        linealLayout.setHorizontalGroup(
            linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linealLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, linealLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(164, 164, 164))
                                    .addComponent(jLabel7)))
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
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        linealLayout.setVerticalGroup(
            linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linealLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Formula_lineal;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lineal;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    // End of variables declaration//GEN-END:variables
}