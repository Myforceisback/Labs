/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;
import static java.lang.Math.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sdxop
 */
public class LW_UI extends javax.swing.JFrame {

    /**
     * Creates new form LW_UI
     */
    public LW_UI() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LW1");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Ниж. гран");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Верх. гран");
        jTextField2.setToolTipText("");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Шаг");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя граница", "Верхняя граница", "Шаг", "Результат"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Вычисить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Удалить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Добавить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setText("F(x) = sin(x^2)dx");

        jButton4.setText("Заполнить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Очистить");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Сохранение\n в текстовом \nвиде");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Заполнить из файла");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Сохранение в двоичном виде");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Заполнить из файла");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class Chooser {

        String FileName;

        public String SaveOpen(String NameFilter) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter txt = new FileNameExtensionFilter(
                    "Text File(txt)", "txt");
            FileNameExtensionFilter bin = new FileNameExtensionFilter(
                    "Binary File(bin)", "bin");
            chooser.addChoosableFileFilter(txt);
            chooser.addChoosableFileFilter(bin);
            int returnVal = chooser.showDialog(null, null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                FileName = chooser.getSelectedFile().getAbsolutePath();
            }

            return FileName;
        }
    }

    public class ExceptionforRecIntegral extends Exception {

        public ExceptionforRecIntegral(String description) {
            JOptionPane.showMessageDialog(null, description, "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    ArrayList<RecIntegral> digits = new ArrayList<RecIntegral>();

    public class RecIntegral implements Serializable {

        public double Top, Bottom, Step, Res;

        public void RecIntegral(double bottom, double top, double step) {
            this.Top = top;
            this.Bottom = bottom;
            this.Step = step;
        }
    }

    public double integr(double nij, double verh, double step) {

        double res = 0;
        double resM = 0;
        double resMs = 0; // last non integr
        double fin_mnoj = step / 2;
        double n = (verh - nij) / step;
        double xi = 0;
        double xilast = 0;

        for (int i = 1; i < n; ++i) {
            xi = nij + i * step;
            resM += sin(pow(xi, 2));
            xilast = nij + (i + 1) * step;
        }
        if (xilast == verh) {
            res = fin_mnoj * (sin(pow(nij + 0 * step, 2)) + 2 * (resM) + sin(pow(nij + n * step, 2)));
        } else {
            resMs += sin(pow(verh - xi, 2));
            res = fin_mnoj * (sin(pow(nij + 0 * step, 2)) + 2 * (resM) + resMs);
        }

        return res;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Кнопка добаить
        Vector data = new Vector();
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        try {
            double a = Double.valueOf(jTextField1.getText()).doubleValue();
            double b = Double.valueOf(jTextField2.getText()).doubleValue();
            double c = Double.valueOf(jTextField3.getText()).doubleValue();
            data.add(a);
            data.add(b);
            data.add(c);
            if (a < 0.000001 || b < 0.000001 || c < 0.000001 || a > 1000000 || b > 1000000 || c > 1000000) {
                throw new ExceptionforRecIntegral("Data entered incorrectly");
            }
            if (a > b) {
                throw new ExceptionforRecIntegral("a > b");
            }
            if ((b - a) <= c) {
                throw new ExceptionforRecIntegral("b - a >= c");
            }
            tbl.addRow(data);
            RecIntegral save = new RecIntegral();
            save.RecIntegral(a, b, c);
            digits.add(save);
        } catch (ExceptionforRecIntegral e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Кнопка удалить
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        int indexROW = jTable1.getSelectedRow();
        tbl.removeRow(indexROW);
        digits.remove(indexROW);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Кнопка вычислить
        Vector row = new Vector(3, 1);

        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < tbl.getColumnCount(); i++) {
            for (int j = 0; j < tbl.getRowCount(); j++) {
                row.add(0, tbl.getValueAt(j, 0));
                row.add(1, tbl.getValueAt(j, 1));
                row.add(2, tbl.getValueAt(j, 2));
                double res = integr((double) row.get(0), (double) row.get(1), (double) row.get(2));
                tbl.setValueAt(res, j, 3);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Очистить
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        for (int i = tbl.getRowCount(); i > 0; i--) {
            tbl.removeRow(i - 1);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Заполнить
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[4];
        for (int i = 0; i < digits.size(); ++i) {
            rowData[0] = digits.get(i).Bottom;
            rowData[1] = digits.get(i).Top;
            rowData[2] = digits.get(i).Step;
            tbl.addRow(rowData);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //Сериализация в текстовом виде
        ArrayList<String> ser = new ArrayList<String>();
        Chooser chsr = new Chooser();
        String Filename = chsr.SaveOpen("txt") + ".txt";
        try {
            FileOutputStream fout = new FileOutputStream(Filename);
            BufferedOutputStream bufferFout = new BufferedOutputStream(fout);
            ObjectOutputStream ObjFout = new ObjectOutputStream(bufferFout);
            for (int i = 0; i < digits.size(); ++i) {
                Object step = null, bottom = null, top = null;
                RecIntegral node = digits.get(i);
                top = node.Top;
                bottom = node.Bottom;
                step = node.Step;
                ser.add(bottom.toString() + ' ' + top.toString() + ' ' + step.toString());
            }
            ObjFout.writeObject(ser);
            ObjFout.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //заполнить из txt
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        Chooser chsr = new Chooser();
        String Filename = chsr.SaveOpen("txt");
        ArrayList<String> ser = new ArrayList<String>();

        while (tbl.getRowCount() != 0) {
            tbl.removeRow(tbl.getRowCount() - 1);
        }
        while (digits.size() != 0) {
            digits.remove(digits.size() - 1);
        }

        try {
            FileInputStream fin = new FileInputStream(Filename);
            BufferedInputStream bufferFin = new BufferedInputStream(fin);
            ObjectInputStream ObjFin = new ObjectInputStream(bufferFin);

            ser = (ArrayList<String>) ObjFin.readObject();

            for (int i = 0; i < ser.size(); i++) {
                String str = ser.get(i),
                        strTop = " ",
                        strBottom = " ",
                        strStep = " ";
                int size = str.length();
                int j = 0;
                while(str.charAt(j) != ' '){
                    strBottom += str.charAt(j);
                    j++;
                }
                j++;
                while(str.charAt(j) != ' '){
                    strTop += str.charAt(j);
                    j++;
                }
                j++;
                while(j != size){
                    strStep += str.charAt(j);
                    j++;
                }
                RecIntegral node = new RecIntegral();
                tbl.addRow(new Object[]{Double.parseDouble(strBottom), Double.parseDouble(strTop), Double.parseDouble(strStep), null});
                node.RecIntegral(Double.parseDouble(strBottom), Double.parseDouble(strTop), Double.parseDouble(strStep));
                digits.add(node);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //сохранить в bin
        ArrayList<String> ser = new ArrayList<String>();
        Chooser chsr = new Chooser();
        String Filename = chsr.SaveOpen("bin") + ".bin";
        try {
            FileOutputStream fout = new FileOutputStream(Filename);
            BufferedOutputStream bufferFout = new BufferedOutputStream(fout);
            ObjectOutputStream ObjFout = new ObjectOutputStream(bufferFout);
            for (int i = 0; i < digits.size(); ++i) {
                Object step = null, bottom = null, top = null;
                RecIntegral node = digits.get(i);
                top = node.Top;
                bottom = node.Bottom;
                step = node.Step;
                ser.add(bottom.toString() + ' ' + top.toString() + ' ' + step.toString());
            }
            ObjFout.writeObject(ser);
            ObjFout.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //открыть бин
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        Chooser chsr = new Chooser();
        String Filename = chsr.SaveOpen("bin");
        ArrayList<String> ser = new ArrayList<String>();

        while (tbl.getRowCount() != 0) {
            tbl.removeRow(tbl.getRowCount() - 1);
        }
        while (digits.size() != 0) {
            digits.remove(digits.size() - 1);
        }

        try {
            FileInputStream fin = new FileInputStream(Filename);
            BufferedInputStream bufferFin = new BufferedInputStream(fin);
            ObjectInputStream ObjFin = new ObjectInputStream(bufferFin);

            ser = (ArrayList<String>) ObjFin.readObject();

            for (int i = 0; i < ser.size(); i++) {
                String str = ser.get(i),
                        strTop = " ",
                        strBottom = " ",
                        strStep = " ";
                int size = str.length();
                int j = 0;
                while(str.charAt(j) != ' '){
                    strBottom += str.charAt(j);
                    j++;
                }
                j++;
                while(str.charAt(j) != ' '){
                    strTop += str.charAt(j);
                    j++;
                }
                j++;
                while(j != size){
                    strStep += str.charAt(j);
                    j++;
                }
                RecIntegral node = new RecIntegral();
                tbl.addRow(new Object[]{Double.parseDouble(strBottom), Double.parseDouble(strTop), Double.parseDouble(strStep), null});
                node.RecIntegral(Double.parseDouble(strBottom), Double.parseDouble(strTop), Double.parseDouble(strStep));
                digits.add(node);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(LW_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LW_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LW_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LW_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new LW_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
