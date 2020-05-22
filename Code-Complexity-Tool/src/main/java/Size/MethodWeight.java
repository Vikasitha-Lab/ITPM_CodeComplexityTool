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
public class MethodWeight extends javax.swing.JFrame {

    
    public MethodWeight() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabelMethodW = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMethod = new javax.swing.JTable();
        jButtMethodWe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMethodW.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabelMethodW.setText("Weight relatedvto the Method Factor");

        jTableMethod.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jTableMethod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Method with a primitive return type", "1"},
                {"Method with a composite return type", "2"},
                {"Method with vod return type", "0"},
                {"Primitive data type parameters", "1"},
                {"Composite data type prameters", "2"}
            },
            new String [] {
                "Program Component", "Weight"
            }
        ));
        jScrollPane1.setViewportView(jTableMethod);

        jButtMethodWe.setBackground(new java.awt.Color(51, 204, 255));
        jButtMethodWe.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtMethodWe.setText("Save");
        jButtMethodWe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtMethodWeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabelMethodW, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jButtMethodWe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelMethodW, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtMethodWe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtMethodWeActionPerformed(java.awt.event.ActionEvent evt) {
         DefaultTableModel model = (DefaultTableModel)jTableMethod.getModel();

            Weights.methodPrimitiveType = Integer.parseInt(model.getValueAt(0, 1).toString());
            Weights.methodCompositeType = Integer.parseInt(model.getValueAt(1, 1).toString());
            Weights.methodVoidType = Integer.parseInt(model.getValueAt(2, 1).toString());
            Weights.primitiveDataTypeParameter = Integer.parseInt(model.getValueAt(3, 1).toString());
            Weights.compositeDataTypeParameter = Integer.parseInt(model.getValueAt(4, 1).toString());

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
            java.util.logging.Logger.getLogger(MethodWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MethodWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MethodWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MethodWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MethodWeight().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton jButtMethodWe;
    private javax.swing.JLabel jLabelMethodW;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMethod;
    
}
