
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import Size.MethodTable;
import Size.VariableComplexity;
import Size.SizeTable;
import Size.VariableTable;
import ControlStructure.ControlStruc;
import Inheritance.Inheritance;
import Coupling.Main;
import FinalRepo.FinalReportTable;
import Inheritance.Inheritance;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class upload extends javax.swing.JFrame {
	
	 public upload () {
	        initComponents();
	    }
    
    public String fpath="";

    private void unzipFunction(String destinationFolder, String zipFile) {
      
        File directory = new File(destinationFolder);

        
        if (!directory.exists()) {
            directory.mkdirs();
        }

        
        byte[] buffer = new byte[2048];

        
        JFileChooser chooser = new JFileChooser(destinationFolder);
       
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        FileReader reader;
        try {
            reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            
            jTextArea1.read(br, null);
            br.close();
            jTextArea1.requestFocus();
        } catch (Exception ex) {
            Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    int Csval = 0;
    int Wkw = 1;
    int Nkw = 0;
    int Wid = 1;
    int Nid = 0;
    int Wop = 1;
    int Nop = 0;
    int Wnv = 1;
    int Nnv = 0;
    int Wsl = 1;
    int Nsl = 0;

   
   
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1147, 800));

        jLabel1.setBackground(new java.awt.Color(0, 107, 179));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); 
        jLabel1.setText("Complexity Measuring Tool");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setBackground(new java.awt.Color(0, 107, 179));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
        jButton3.setText("UPLOAD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 107, 179));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); 
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 107, 179));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton1.setText("SIZE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 107, 179));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton2.setText("VARIABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 107, 179));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton5.setText("METHODS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 107, 179));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton6.setText("INHERITANCE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 107, 179));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton7.setText("COUPLING");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 107, 179));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton8.setText("FINAL");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 107, 179));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); 
        jButton9.setText("CONTROL STRUCTURE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(406, 406, 406))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        
        chooser.showOpenDialog(null);
        
        chooser.setMultiSelectionEnabled(true);

        File f = chooser.getSelectedFile();
        String fileName = f.getName();
        String[] fileNameArray = fileName.split("\\.");
        
        String filename = f.getAbsolutePath();
        try {

           String zipFile = filename;
        String destinationFolder = "C:\\complexityUnzipper";

           
          if (!zipFile.equals("") && fileNameArray[fileNameArray.length - 1].equalsIgnoreCase("zip")) {
                try {

                  unzipFunction(destinationFolder, zipFile);
               } catch (Exception e) {
                   e.printStackTrace();
                    System.exit(1);
               }
            } else {
                
                FileReader reader = new FileReader(filename);
               
                fpath = filename;
                
                BufferedReader br = new BufferedReader(reader);
                
                jTextArea1.read(br, null);
                br.close();
                jTextArea1.requestFocus();
            }
        } catch (Exception e) {
            System.out.println(e);}
       }
        

    

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        String msg = jTextArea1.getText();

        new ControlStruc(msg).setVisible(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        

        if(fpath.isEmpty()){
            JOptionPane.showMessageDialog(this, "import a Text File!");
        }
        else{
            Main up = new Main(fpath);
            up.setVisible(true);
        }
        

    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       

        String msg = jTextArea1.getText();

        new VariableTable(msg).setVisible(true);

        VariableComplexity vcISHU = new VariableComplexity();

    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        
        FinalReportTable up = new FinalReportTable(jTextArea1.getText());
        up.setVisible(true);
        String fullCode6 = jTextArea1.getText();
        String[] lines = fullCode6.split("\n");
        int lineCount = lines.length;
        
    }

    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        Inheritance up = new Inheritance();
        up.setVisible(true);

        String msg = jTextArea1.getText();
        new Inheritance(msg).setVisible(true);
       
        String fullCode6 = jTextArea1.getText();

        if (fullCode6.isEmpty()) {

            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "import a Text File!");
        } else {

        }
       
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String msg = jTextArea1.getText();

        new SizeTable(msg).setVisible(true);

        
        String maintext = jTextArea1.getText().toString();

        
        Scanner scanText = new Scanner(maintext);

       
        String st;
        int totother = 0;

        
        while ((st = scanText.nextLine()) != null) {
            String[] texx = st.split(" ");

            for (int i = 0; i < texx.length; i++) {
                
                if (texx[i].equals("class") || texx[i].equals("public") || texx[i].equals("void") || texx[i].equals("true") || texx[i].equals("else")
                        || texx[i].equals("default") || texx[i].equals("return") || texx[i].equals("null") || texx[i].equals("break") || texx[i].equals("static") || texx[i].equals("this")) {
                    Nkw = Nkw + 1;
                }
                else if (texx[i].contains("int") || texx[i].contains("float") || texx[i].contains("double") || texx[i].contains("char") || texx[i].contains("main")
                        || texx[i].contains("class") || texx[i].contains("args") || texx[i].contains("array") || texx[i].contains("Linked List")
                        || texx[i].contains("Stack") || texx[i].contains("Queue") || texx[i].contains("System") || texx[i].contains("out") || texx[i].contains("println")
                        || texx[i].contains("print") || texx[i].equals("i") || texx[i].contains("j") || texx[i].equals("counter")) {
                    Nid = Nid + 1;
                } else if (texx[i].equals("+") || texx[i].equals("-") || texx[i].equals("*") || texx[i].equals("/") || texx[i].equals("%") || texx[i].contains("&&")
                        || texx[i].equals("||") || texx[i].equals("<") || texx[i].equals(">") || texx[i].contains("<=") || texx[i].contains(">=")
                        || texx[i].contains("==") || texx[i].equals("=") || texx[i].contains("++") || texx[i].contains("--") || texx[i].contains(".")) {
                    Nop = Nop + 1;
                    
                } else if (texx[i].equals("") || texx[i].equals("Hi") || texx[i].contains("")) {
                    Nsl = Nsl + 1;
                    
                } else {
                    totother = totother + 1;
                }
            }

           
            Csval = Nkw + Nid + Nop + Nsl;

           
            String Nnid = Integer.toString(Csval);

           
        }

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        String msg = jTextArea1.getText();

        new MethodTable(msg).setVisible(true);


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextArea1.setText("");
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
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upload().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    
}
