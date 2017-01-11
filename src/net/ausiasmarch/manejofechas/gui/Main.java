
package net.ausiasmarch.manejofechas.gui;

import javax.swing.JOptionPane;
import net.ausiasmarch.common.Convert;
import java.time.*;
import java.time.temporal.ChronoUnit;
import net.ausiasmarch.manejofechas.modelo.ManejadorFechas;

/**
 * Main.java
 *
 * @author Bruno Fortea Mas
 */
public class Main extends javax.swing.JFrame {

    private String sFechaHora, sFechaHora1, agregar, restar;
    private LocalDateTime ldtFecha;
    private LocalDate ldtFecha2;

    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldFechaHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAnyo = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldMinutos = new javax.swing.JTextField();
        jTextFieldSegundos = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jComboBoxUnidades = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSumar = new javax.swing.JButton();
        jTextFieldFechaHora1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAgregar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonAhora = new javax.swing.JButton();
        jTextFieldAhora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDiaSemana = new javax.swing.JTextField();
        jButtonRestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Fechas");
        setResizable(false);

        jLabel1.setText("Fecha y hora:");

        jLabel2.setText("Día Mes");

        jLabel3.setText("Mes");

        jLabel4.setText("Año");

        jLabel5.setText("Hora");

        jLabel6.setText("Minutos");

        jLabel7.setText("Segundos");

        jTextFieldDia.setEditable(false);
        jTextFieldDia.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMes.setEditable(false);
        jTextFieldMes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldAnyo.setEditable(false);
        jTextFieldAnyo.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAnyo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMinutos.setEditable(false);
        jTextFieldMinutos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldSegundos.setEditable(false);
        jTextFieldSegundos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldSegundos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jComboBoxUnidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dias", "Meses", "Años" }));

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha:");

        jLabel9.setText("Añadir");

        jLabel10.setText("Resultado:");

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(204, 204, 255));

        jButtonAhora.setText("Ahora");
        jButtonAhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAhoraActionPerformed(evt);
            }
        });

        jTextFieldAhora.setEditable(false);
        jTextFieldAhora.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setText("Día Semana");

        jTextFieldDiaSemana.setEditable(false);
        jTextFieldDiaSemana.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDiaSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonRestar.setText("Restar");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAhora)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAhora))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel2))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldMes)
                                                .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSegundos)
                                    .addComponent(jTextFieldHora)
                                    .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFechaHora)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalcular)))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldResultado)
                            .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRestar)))
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAhora)
                    .addComponent(jTextFieldAhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        
        sFechaHora = jTextFieldFechaHora.getText();

        if (!Convert.isValidLocalDateTime(sFechaHora)) {
            mensaje("Fecha y/o Hora no válida.");
            return;
        }

        ldtFecha = Convert.parseLocalDateTime(sFechaHora);

        jTextFieldDia.setText(Convert.format(ManejadorFechas.getDiaMes(ldtFecha)));
        jTextFieldDiaSemana.setText(ManejadorFechas.getDiaSemanaCompleto(ldtFecha).toUpperCase());
        jTextFieldMes.setText((ManejadorFechas.getDiaMesCompleto(ldtFecha).toUpperCase()));
        jTextFieldAnyo.setText(Convert.format(ManejadorFechas.getAnyo(ldtFecha)));
        jTextFieldHora.setText(Convert.format(ManejadorFechas.getHora(ldtFecha)));
        jTextFieldMinutos.setText(Convert.format(ManejadorFechas.getMin(ldtFecha)));
        jTextFieldSegundos.setText(Convert.format(ManejadorFechas.getSec(ldtFecha)));

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        sumaFechas();
    }//GEN-LAST:event_jButtonSumarActionPerformed

  
    private void sumaFechas() {
        sFechaHora1 = jTextFieldFechaHora1.getText();
        agregar = jTextFieldAgregar.getText();
        String unidades = jComboBoxUnidades.getSelectedItem().toString();

        int valor;
        if (!Convert.isValidDate(sFechaHora1)) {
            mensaje("Fecha no válida.");
            return;
        }

        if (!Convert.isValidInt(agregar)) {
            mensaje("Valor no válido");
            return;
        }

        ldtFecha2 = Convert.parseLocalDate(sFechaHora1);
        valor = Convert.parseInt(agregar);

        ChronoUnit unit = null;
        switch (unidades) {
            case "Dias":
                unit = ChronoUnit.DAYS;
                break;

            case "Meses":
                unit = ChronoUnit.MONTHS;
                break;

            case "Años":
                unit = ChronoUnit.YEARS;

        }

        ldtFecha2 = ManejadorFechas.sumar(ldtFecha2, valor, unit);

      
        jTextFieldResultado.setText(Convert.format(ldtFecha2));
    }

 
    private void jButtonAhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAhoraActionPerformed

        jTextFieldAhora.setText(ManejadorFechas.fechaHoraActual());

    }//GEN-LAST:event_jButtonAhoraActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        restaFechas();

    }//GEN-LAST:event_jButtonRestarActionPerformed

    
    private void restaFechas() {
        sFechaHora1 = jTextFieldFechaHora1.getText();
        agregar = jTextFieldAgregar.getText();
        String unidades = jComboBoxUnidades.getSelectedItem().toString();

        int valor;
        if (!Convert.isValidDate(sFechaHora1)) {
            mensaje("Fecha no válida.");
            return;
        }

        if (!Convert.isValidInt(agregar)) {
            mensaje("Valor no válido");
            return;
        }

        ldtFecha2 = Convert.parseLocalDate(sFechaHora1);
        valor = Convert.parseInt(agregar);
    
        ChronoUnit unit = null;
        switch (unidades) {
            case "Dias":
                unit = ChronoUnit.DAYS;
                break;

            case "Meses":
                unit = ChronoUnit.MONTHS;
                break;

            case "Años":
                unit = ChronoUnit.YEARS;

        }
        ldtFecha2 = ManejadorFechas.restar(ldtFecha2, valor, unit);
        jTextFieldResultado.setText(Convert.format(ldtFecha2));
    }

 
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Main fechas = new Main();
            fechas.pack();
            fechas.setLocationRelativeTo(null);
            fechas.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAhora;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JComboBox jComboBoxUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldAgregar;
    private javax.swing.JTextField jTextFieldAhora;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDiaSemana;
    private javax.swing.JTextField jTextFieldFechaHora;
    private javax.swing.JTextField jTextFieldFechaHora1;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldMinutos;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSegundos;
    // End of variables declaration//GEN-END:variables
}
