package JFrame;

import Class.TextPrompt;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;

public class panel1 extends javax.swing.JPanel {

    Double x0, x1, x2;
    Double y0, y1, y2;

    public panel1() {
        initComponents();
        // Colocar texto tipo "placeholder"
        TextPrompt txtPromp_x1 = new TextPrompt("   Valor X1", this.jtxt_x1);
        TextPrompt txtPromp_y1 = new TextPrompt("   Valor Y1", this.jtxt_y1);

        TextPrompt txtPromp_x2 = new TextPrompt("   Valor X2", this.jtxt_x2);
        TextPrompt txtPromp_y2 = new TextPrompt("   Valor Y2", this.jtxt_y2);

        TextPrompt txtPromp_x = new TextPrompt(" X (Conocido)", this.jtxt_x0);
        TextPrompt txtPromp_y = new TextPrompt("Y (Interpolar)", this.jtxt_y0);

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
        jtxt_y1 = new javax.swing.JTextField();
        jtxt_y0 = new javax.swing.JTextField();
        jtxt_x0 = new javax.swing.JTextField();
        jtxt_x1 = new javax.swing.JTextField();
        jtxt_x2 = new javax.swing.JTextField();
        jtxt_y2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Formula_lineal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jlbl_imagen = new javax.swing.JLabel();

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

        jtxt_y1.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_y1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jtxt_y1.setSelectionColor(new java.awt.Color(143, 157, 159));

        jtxt_y0.setEditable(false);
        jtxt_y0.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_y0.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jtxt_y0.setRequestFocusEnabled(false);
        jtxt_y0.setSelectionColor(new java.awt.Color(143, 157, 159));

        jtxt_x0.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_x0.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jtxt_x0.setSelectionColor(new java.awt.Color(143, 157, 159));

        jtxt_x1.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_x1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jtxt_x1.setSelectionColor(new java.awt.Color(143, 157, 159));

        jtxt_x2.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_x2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jtxt_x2.setSelectionColor(new java.awt.Color(143, 157, 159));

        jtxt_y2.setBackground(new java.awt.Color(217, 193, 173));
        jtxt_y2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jtxt_y2.setSelectionColor(new java.awt.Color(143, 157, 159));

        jButton5.setBackground(new java.awt.Color(241, 115, 106));
        jButton5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_calculator_32px.png"))); // NOI18N
        jButton5.setText("Calcular");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(75, 75, 76));
        jButton6.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_repeat_32px.png"))); // NOI18N
        jButton6.setText("Reiniciar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(79, 79, 79))
                        .addGroup(linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(linealLayout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linealLayout.createSequentialGroup()
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxt_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxt_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxt_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jlbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))
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
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(linealLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(linealLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jlbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(linealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Formula_lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        x0 = Double.parseDouble(jtxt_x0.getText());
        x1 = Double.parseDouble(jtxt_x1.getText());
        x2 = Double.parseDouble(jtxt_x2.getText());
        y1 = Double.parseDouble(jtxt_y1.getText());
        y2 = Double.parseDouble(jtxt_y2.getText());

        Double resultado = interpolar(x0);

        jtxt_y0.setText(String.valueOf(Math.round(resultado * 1000d) / 1000d));

        DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries("Interpolacion Lineal", new double[][]{{x1, x0, x2}, {y1, resultado, y2}});

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);

        renderer.setSeriesStroke(0, new BasicStroke(2));

        JFreeChart chart = ChartFactory.createXYLineChart("Plano cartesiano", "X", "Y", dataset);
        Double mayorY = y1;
        if(mayorY <y2){
            mayorY = y2;
        }
        
        chart.getXYPlot().getRangeAxis().setRange(0, (mayorY + 10));
        chart.getXYPlot().setRenderer(renderer);

        BufferedImage image = chart.createBufferedImage(300, 200);
        try {
            ImageIO.write(image, "png", new File("xy-chart.png"));
        } catch (IOException ex) {
            Logger.getLogger(panel1.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon icono = new ImageIcon("xy-chart.png");
        icono.getImage().flush();
        jlbl_imagen.setIcon(icono);
       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


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
    private javax.swing.JLabel jlbl_imagen;
    private javax.swing.JTextField jtxt_x0;
    private javax.swing.JTextField jtxt_x1;
    private javax.swing.JTextField jtxt_x2;
    private javax.swing.JTextField jtxt_y0;
    private javax.swing.JTextField jtxt_y1;
    private javax.swing.JTextField jtxt_y2;
    private javax.swing.JPanel lineal;
    // End of variables declaration//GEN-END:variables

    private Double interpolar(Double x0) {
        return y1 + (((y2 - y1) / (x2 - x1)) * (x0 - x1));
    }
    
    

}
