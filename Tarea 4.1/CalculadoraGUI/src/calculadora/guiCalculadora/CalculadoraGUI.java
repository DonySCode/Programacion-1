/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora.guiCalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author donyc
 */
public class CalculadoraGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGUI
     */
    public CalculadoraGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        plOperaciones = new javax.swing.JPanel();
        btSumar = new javax.swing.JButton();
        btRestar = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plTitulo.setBackground(new java.awt.Color(102, 102, 102));
        plTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora Básica");
        plTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 268, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/guiCalculadora/imagenes/calcuchiquita.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        plTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 38, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Valor 1");

        txtValor1.setBackground(new java.awt.Color(255, 255, 255));
        txtValor1.setForeground(new java.awt.Color(0, 0, 0));
        txtValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor1KeyTyped(evt);
            }
        });

        txtValor2.setBackground(new java.awt.Color(255, 255, 255));
        txtValor2.setForeground(new java.awt.Color(0, 0, 0));
        txtValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Valor 2");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultado:");

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        plOperaciones.setBackground(new java.awt.Color(153, 153, 153));

        btSumar.setBackground(new java.awt.Color(255, 255, 255));
        btSumar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btSumar.setForeground(new java.awt.Color(0, 0, 0));
        btSumar.setText("Sumar");
        btSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumarActionPerformed(evt);
            }
        });

        btRestar.setBackground(new java.awt.Color(255, 255, 255));
        btRestar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btRestar.setForeground(new java.awt.Color(0, 0, 0));
        btRestar.setText("Restar");
        btRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestarActionPerformed(evt);
            }
        });

        btMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        btMultiplicar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        btMultiplicar.setText("Multiplicar");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setBackground(new java.awt.Color(255, 255, 255));
        btDividir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btDividir.setForeground(new java.awt.Color(0, 0, 0));
        btDividir.setText("Dividir");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btReset.setBackground(new java.awt.Color(255, 255, 255));
        btReset.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btReset.setForeground(new java.awt.Color(0, 0, 0));
        btReset.setText("Limpiar campos");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plOperacionesLayout = new javax.swing.GroupLayout(plOperaciones);
        plOperaciones.setLayout(plOperacionesLayout);
        plOperacionesLayout.setHorizontalGroup(
            plOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plOperacionesLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(plOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plOperacionesLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        plOperacionesLayout.setVerticalGroup(
            plOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plOperacionesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btSumar)
                .addGap(18, 18, 18)
                .addComponent(btRestar)
                .addGap(18, 18, 18)
                .addComponent(btMultiplicar)
                .addGap(18, 18, 18)
                .addComponent(btDividir)
                .addGap(36, 36, 36)
                .addComponent(btReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(plTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(plOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumarActionPerformed
        validarCampos();
        sumarValores();
    }//GEN-LAST:event_btSumarActionPerformed

    private void sumarValores() {
        Calculadora calc = new Calculadora();
        Double resultado = calc.sumar(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));
        txtResultado.setText(resultado + "");
    }

    private void validarCampos() {
        if (txtValor1.getText().trim().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Debe introducir un valor en valor 1.");
            txtValor1.requestFocus();
        } else if (txtValor2.getText().trim().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Debe introducir un valor en valor 2.");
            txtValor2.requestFocus();
        }
    }

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped
        char numeros = evt.getKeyChar();
        if ((numeros < '0' || numeros > '9') && (numeros < ',' || numeros > '.')) {
            JOptionPane.showMessageDialog(null, "Favor ingresar numeros para realizar la operación.");
            evt.consume();
        }
    }//GEN-LAST:event_txtValor1KeyTyped

    private void txtValor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyTyped
        char numeros = evt.getKeyChar();
        if ((numeros < '0' || numeros > '9') && (numeros < ',' || numeros > '.')) {
            JOptionPane.showMessageDialog(null, "Favor ingresar numeros para realizar la operación.");
            evt.consume();
        }
    }//GEN-LAST:event_txtValor2KeyTyped

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed

    }//GEN-LAST:event_txtValor2ActionPerformed

    private void btRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestarActionPerformed
        validarCampos();
        restarValores();
    }//GEN-LAST:event_btRestarActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        validarCampos();
        multiplicarValores();
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        validarCampos();
        dividirValores();
    }//GEN-LAST:event_btDividirActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        limpiarCampos();
        txtValor1.requestFocus();   
    }//GEN-LAST:event_btResetActionPerformed
    
    private void limpiarCampos(){
        txtValor1.setText("");
        txtValor2.setText("");
        txtResultado.setText("");
    }
    private void dividirValores(){
        Calculadora calc = new Calculadora();
        Double resultado = calc.dividir(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));
        txtResultado.setText(resultado + "");
    }
    private void multiplicarValores() {
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicar(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));
        txtResultado.setText(resultado + "");
    }

    private void restarValores() {
        Calculadora calc = new Calculadora();
        Double resultado = calc.restar(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));
        txtResultado.setText(resultado + "");
    }

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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btRestar;
    private javax.swing.JButton btSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plOperaciones;
    private javax.swing.JPanel plTitulo;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}