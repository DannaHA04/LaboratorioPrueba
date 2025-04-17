
package Laboratorio;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //Manejo de tablla


public class Frm_Principal extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public Frm_Principal() {
        initComponents();
        
        String [] columnas = {"T1", "T2", "T3", "EF", "Situacion Academica"};
        modelo = new DefaultTableModel(columnas, 0);
        
        tb_Información.setModel(modelo);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Lab01_T1 = new javax.swing.JTextField();
        txt_Lab02_T1 = new javax.swing.JTextField();
        txt_Lab03_T1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ExamenFinal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Lab01_T2 = new javax.swing.JTextField();
        txt_Lab02_T2 = new javax.swing.JTextField();
        txt_Lab03_T2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_ExamenT2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ExamenT1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ExamenT3 = new javax.swing.JTextField();
        btn_Limpiar = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Información = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Calcular Notas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 6, 119, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("T1:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 43, 30, 16);

        jLabel3.setText("Lab01");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(37, 68, 31, 16);

        jLabel4.setText("Lab02");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(37, 96, 31, 16);

        jLabel5.setText("Lab03");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(37, 124, 31, 16);
        getContentPane().add(txt_Lab01_T1);
        txt_Lab01_T1.setBounds(80, 65, 64, 22);
        getContentPane().add(txt_Lab02_T1);
        txt_Lab02_T1.setBounds(80, 93, 64, 22);
        getContentPane().add(txt_Lab03_T1);
        txt_Lab03_T1.setBounds(80, 121, 64, 22);

        jLabel6.setText("Examen T1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 57, 16);
        getContentPane().add(txt_ExamenFinal);
        txt_ExamenFinal.setBounds(280, 200, 64, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("T2:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 40, 30, 16);

        jLabel8.setText("Lab01");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 60, 31, 16);

        jLabel9.setText("Lab02");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 90, 31, 16);

        jLabel10.setText("Lab03");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 120, 31, 16);
        getContentPane().add(txt_Lab01_T2);
        txt_Lab01_T2.setBounds(250, 60, 64, 22);
        getContentPane().add(txt_Lab02_T2);
        txt_Lab02_T2.setBounds(250, 90, 64, 22);
        getContentPane().add(txt_Lab03_T2);
        txt_Lab03_T2.setBounds(250, 120, 64, 22);

        jLabel11.setText("Examen T2");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 150, 57, 16);
        getContentPane().add(txt_ExamenT2);
        txt_ExamenT2.setBounds(250, 150, 64, 22);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Examen Final:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 200, 80, 16);
        getContentPane().add(txt_ExamenT1);
        txt_ExamenT1.setBounds(80, 150, 64, 22);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Examen T3:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 200, 80, 16);
        getContentPane().add(txt_ExamenT3);
        txt_ExamenT3.setBounds(100, 200, 64, 22);

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar);
        btn_Limpiar.setBounds(20, 250, 72, 23);

        btn_Calcular.setText("Calcular");
        getContentPane().add(btn_Calcular);
        btn_Calcular.setBounds(140, 250, 73, 23);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir);
        btn_Salir.setBounds(250, 250, 72, 23);

        tb_Información.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_Información);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 20, 360, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        
        txt_Lab01_T1.setText("");
        txt_Lab02_T1.setText("");
        txt_Lab03_T1.setText("");
        txt_ExamenT1.setText("");
        txt_Lab01_T2.setText("");
        txt_Lab02_T2.setText("");
        txt_Lab03_T2.setText("");
        txt_ExamenT2.setText("");
        txt_ExamenT3.setText("");
        txt_ExamenFinal.setText("");
   
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
                                            //(Lugar donde aparecera el cuadro de dialogo,Mensaje o pregunta,Titulo,opciones, icono)
        int rpt = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?", "Mensaje de confirmacion", 
                                               JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null ,null ,null );
        
        if(rpt==0) System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Información;
    private javax.swing.JTextField txt_ExamenFinal;
    private javax.swing.JTextField txt_ExamenT1;
    private javax.swing.JTextField txt_ExamenT2;
    private javax.swing.JTextField txt_ExamenT3;
    private javax.swing.JTextField txt_Lab01_T1;
    private javax.swing.JTextField txt_Lab01_T2;
    private javax.swing.JTextField txt_Lab02_T1;
    private javax.swing.JTextField txt_Lab02_T2;
    private javax.swing.JTextField txt_Lab03_T1;
    private javax.swing.JTextField txt_Lab03_T2;
    // End of variables declaration//GEN-END:variables
}
