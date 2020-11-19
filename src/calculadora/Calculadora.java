package calculadora;
                                            //usamos el motor de javascript
import javax.script.ScriptEngine; 
import javax.script.ScriptEngineManager;  

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();  
    ScriptEngine se = sem.getEngineByName("JavaScript");    //evalua nuestra operacion con JS
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null); //se ejecuta el programa en el centro de la pantalla
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btnCe = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(49, 60, 70));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        txtResultado.setFont(new java.awt.Font("MS PGothic", 0, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(49, 60, 70));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 79));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setFont(new java.awt.Font("MS PGothic", 1, 30)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn3.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btnCe.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        btnCe.setForeground(new java.awt.Color(49, 60, 70));
        btnCe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCe.setText("CE");
        btnCe.setFocusPainted(false);
        btnCe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnCe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });
        jPanel2.add(btnCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(49, 60, 70));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btnDivision.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(49, 60, 70));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btnMulti.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(49, 60, 70));
        btnMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMulti.setText("x");
        btnMulti.setFocusPainted(false);
        btnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btnResta.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(49, 60, 70));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btnSuma.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(49, 60, 70));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btnC.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(49, 60, 70));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn9.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(49, 60, 70));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn7.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(49, 60, 70));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn8.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(49, 60, 70));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn6.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(49, 60, 70));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn5.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(49, 60, 70));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn4.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(49, 60, 70));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn3.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(49, 60, 70));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn1.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(49, 60, 70));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn2.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(49, 60, 70));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn0.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(49, 60, 70));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btnPunto.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(49, 60, 70));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt1_pressed.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 340, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try{
            String resultado = se.eval(txtOperacion.getText()).toString();  //Creamos la variable, luego llamamos el motor y lo convertimos en String, metiendolo en un TRY
            txtResultado.setText(resultado); //luego al resultado lo muestra en la parte de abajo
        } catch (Exception e){
           
        }
         
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1); //este metodo susbstring corta desde un punto hasta otro
                                         //al txtOperacion se va a cortar desde 0 hasta su longitud -1 (eliminando el ultimo caracter)
        txtOperacion.setText(texto);
        btnIgual.doClick();
        
        
    }//GEN-LAST:event_btnCeActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        addNumer("%");
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        addNumer("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        addNumer("*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addNumer("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addNumer("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtOperacion.setText(""); //Limpia el texto, en las variables
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumer("9");
        btnIgual.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumer("7"); //aca llamamos al metodo y le asignamos un valor
        btnIgual.doClick();
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumer("8");
        btnIgual.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumer("6");
        btnIgual.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumer("5");
        btnIgual.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumer("4");
        btnIgual.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumer("3");
        btnIgual.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumer("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumer("2");
        btnIgual.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addNumer("0");
        btnIgual.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addNumer(".");
        btnIgual.doClick();  //este comando hara que cada vez que se precione un boton sea en tiempo real
    }//GEN-LAST:event_btnPuntoActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumer(String digito){  //este metodo lo llamaremos cuando se presione algun boton
        txtOperacion.setText(txtOperacion.getText() + digito);  //con esto se muestra los numeros ingresados en l aparte de arriba de la calculadora
                                //txtOperacion.getText()esto sumara lo que ya tenemos mas lo que le seguimos mandando
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCe;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
