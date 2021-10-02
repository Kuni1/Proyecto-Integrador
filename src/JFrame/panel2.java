
package JFrame;

import Class.TextPrompt;

public class panel2 extends javax.swing.JPanel {
    
    Double xx1, xx2, xx3;
    Double yy1, yy2, yy3;
    
    Double xconocido,yinterpolar;
    

    public panel2() {
        initComponents();
        TextPrompt x1 = new TextPrompt("   Valor X1", this.x1);
        TextPrompt y1 = new TextPrompt("   Valor Y1", this.y1);
        
        TextPrompt x2 = new TextPrompt("   Valor X2", this.x2);
        TextPrompt y2 = new TextPrompt("   Valor Y2", this.y2);
        
        TextPrompt x3 = new TextPrompt("   Valor X3", this.x3);
        TextPrompt y3 = new TextPrompt("   Valor Y3", this.y3);
        
        TextPrompt x = new TextPrompt(" X (Conocido)", this.x);
        TextPrompt y = new TextPrompt("Y (Interpolar)", this.y);
        
//        TextPrompt form_lineal = new TextPrompt(" Formula para hallar el valor interpolar (Y)", this.Formula_lineal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel9 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();

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
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadraticaLayout.createSequentialGroup()
                        .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(cuadraticaLayout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
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
                                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cuadraticaLayout.createSequentialGroup()
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(26, 26, 26)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(cuadraticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cuadratica, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cuadratica, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int n = 3; //tamaño de la matriz
        
        //Matrices a utilizar;
        double matrizSistema [][] = new double [n][n];
        double matrizX [][] = new double [n][n];
        double matrizY [][] = new double [n][n];
        double matrizZ [][] = new double [n][n];
        
        
        xx1 = Double.parseDouble(x1.getText());
        xx2 = Double.parseDouble(x2.getText());
        xx3 = Double.parseDouble(x3.getText());
       
        yy1 = Double.parseDouble(y1.getText());
        yy2 = Double.parseDouble(y2.getText());
        yy3 = Double.parseDouble(y3.getText());
          
        //primera ecuacion cuadrática
        double a1=xx1*xx1;
        double b1=xx1;
        double c1=1;
        double yf1=yy1;
        
        //segunda ecuación cuadrática
        double a2=xx2*xx2;
        double b2=xx2;
        double c2=1;
        double yf2=yy2;
        
        //tercera ecuacion cuadrática
        double a3=xx3*xx3;
        double b3=xx3;
        double c3=1;
        double yf3=yy3;
        
        //determinante del sistema    
        
        matrizSistema [0][0]=  a1;
        matrizSistema [0][1]=  b1;
        matrizSistema [0][2]=  c1;
        
        matrizSistema [1][0]=  a2;
        matrizSistema [1][1]=  b2;
        matrizSistema [1][2]=  c2;
      
        matrizSistema [2][0]=  a3;
        matrizSistema [2][1]=  b3;
        matrizSistema [2][2]=  c3;
        
        //valor de la determinante del sistema
        double valorDS;
        valorDS= determinanteMatriz(matrizSistema,n);
        
        
        //determinante de x
        matrizX [0][0]=  yf1;
        matrizX [0][1]=  b1;
        matrizX [0][2]=  c1;
        
        matrizX [1][0]=  yf2;
        matrizX [1][1]=  b2;
        matrizX [1][2]=  c2;
      
        matrizX [2][0]=  yf3;
        matrizX [2][1]=  b3;
        matrizX [2][2]=  c3;
        
        //valor determinante de x
        
        double valorDX;
        valorDX= determinanteMatriz(matrizX,n);
        
        
        //determinante y 
        
        matrizY [0][0]=  a1;
        matrizY [0][1]=  yf1;
        matrizY [0][2]=  c1;
        
        matrizY [1][0]=  a2;
        matrizY [1][1]=  yf2;
        matrizY [1][2]=  c2;
      
        matrizY [2][0]=  a3;
        matrizY [2][1]=  yf3;
        matrizY [2][2]=  c3;
        
        //valor determinante de y
        
        double valorDY;
        valorDY= determinanteMatriz(matrizY,n);
        
        //determinante de z
        matrizZ [0][0]=  a1;
        matrizZ [0][1]=  b1;
        matrizZ [0][2]=  yf1;
        
        matrizZ [1][0]=  a2;
        matrizZ [1][1]=  b2;
        matrizZ [1][2]=  yf2;
      
        matrizZ [2][0]=  a3;
        matrizZ [2][1]=  b3;
        matrizZ [2][2]=  yf3;
        
        //valor determinante de z
        
        double valorDZ;
        valorDZ= determinanteMatriz(matrizZ,n);
        
        //encontramos los valores del sistema
        
        double xf,yf,zf;
        xf= valorDX/valorDS;
        yf= valorDY/valorDS;
        zf= valorDZ/valorDS;
        
        //hallar el valor interpolado    
        
        xconocido=Double.parseDouble(x.getText());
        
        Double resultado;
        resultado = (xf*(Math.pow(xconocido,2))+(yf*xconocido)+(zf));
        
        y.setText(String.valueOf(Math.round(resultado * 1000d) / 1000d));
        
        //y.setText(String.valueOf(Math.round(resultado * 1000d) / 1000d));
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        x1.setText("");
        y1.setText("");
        
        x2.setText("");
        y2.setText("");
        
        x3.setText("");
        y3.setText("");
        
        x.setText("");
        y.setText("");
        
        x1.grabFocus();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cuadratica;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    // End of variables declaration//GEN-END:variables

private  void obtenerCofactor (double matriz [][], double temp[][], double p, double q,int n){
    int i=0,j=0;
    for (int fila = 0; fila < n; fila++) {
        for (int columna = 0; columna < n; columna++) {
            if (fila !=p && columna !=q) {
                temp[i][j++] =matriz [fila][columna];
                if (j==n-1) {
                    j=0;
                    i++;                 
                }              
            }           
        }    
    }  
}//termina cofactor


private double determinanteMatriz(double matriz[][],int n){
    int Determinante =0;
    if (n == 1) {
        return matriz [0][0];              
    }
    double temp [][] = new double [n][n];
    int multiplicador =1;
    for (int f = 0; f < n; f++) {
        obtenerCofactor(matriz,temp,0,f,n);
        Determinante += multiplicador * matriz[0][f] * determinanteMatriz(temp,n-1);
        multiplicador = -multiplicador;
                
        }
    return Determinante;
            
    
}

}

