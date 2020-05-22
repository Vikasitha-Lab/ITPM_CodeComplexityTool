/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Size;

import Commons.Weights;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class VariableWeight extends javax.swing.JFrame {

    
    public VariableWeight() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabelVarableW = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVariableW = new javax.swing.JTable();
        jButtVariablW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelVarableW.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabelVarableW.setText("            Weight related to the Variable Factor");

        jTableVariableW.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jTableVariableW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Global Variable", "2"},
                {"Local Variable", "1"},
                {"Primitive date type", "1"},
                {"Composite data type variable", "2"}
            },
            new String [] {
                "Program Conponent", "Weight"
            }
        ));
        jScrollPane1.setViewportView(jTableVariableW);

        jButtVariablW.setBackground(new java.awt.Color(102, 204, 255));
        jButtVariablW.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtVariablW.setText("Save");
        jButtVariablW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtVariablWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabelVarableW, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jButtVariablW)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelVarableW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtVariablW, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtVariablWActionPerformed(java.awt.event.ActionEvent evt) {
         DefaultTableModel model = (DefaultTableModel)jTableVariableW.getModel();

            Weights.globalVariable = Integer.parseInt(model.getValueAt(0, 1).toString());
            Weights.localVariable = Integer.parseInt(model.getValueAt(1, 1).toString());
            Weights.primitiveDataType = Integer.parseInt(model.getValueAt(2, 1).toString());
            Weights.compositeDataType = Integer.parseInt(model.getValueAt(3, 1).toString());

            

        dispose();
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VariableWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VariableWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VariableWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VariableWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VariableWeight().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton jButtVariablW;
    private javax.swing.JLabel jLabelVarableW;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVariableW;
}
