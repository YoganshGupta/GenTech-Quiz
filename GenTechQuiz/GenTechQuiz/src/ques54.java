/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ques54.java
 *
 * Created on Nov 9, 2017, 6:56:42 PM
 */

import gentechquiz.Main;/**
 *
 * @author Admin
 */
public class ques54 extends javax.swing.JFrame {

    /** Creates new form ques54 */
    public ques54() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("GenTech Quiz");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 30, 76, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Q4)In which year was the Bharat Ratna instituted?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 70, 290, 14);

        r1.setBackground(new java.awt.Color(0, 0, 102));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 0));
        r1.setText("1956   ");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(60, 100, 70, 23);

        r3.setBackground(new java.awt.Color(0, 51, 204));
        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 0));
        r3.setText("1954        ");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3);
        r3.setBounds(260, 100, 90, 23);

        r4.setBackground(new java.awt.Color(0, 0, 102));
        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 0));
        r4.setText("1945");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4);
        r4.setBounds(60, 130, 60, 23);

        r2.setBackground(new java.awt.Color(0, 51, 204));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 0));
        r2.setText("1952    ");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(260, 130, 70, 23);

        b1.setBackground(new java.awt.Color(0, 0, 204));
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 0));
        b1.setText("Submit your answer");
        b1.setEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(97, 170, 160, 23);

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(l1);
        l1.setBounds(10, 220, 250, 20);

        b2.setBackground(new java.awt.Color(0, 0, 204));
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 0));
        b2.setText("Next Question");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(121, 260, 130, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosah.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 230, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lar1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        b1.setEnabled(true);        // TODO add your handling code here:
}//GEN-LAST:event_r1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        b1.setEnabled(true);        // TODO add your handling code here:
}//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        b1.setEnabled(true);        // TODO add your handling code here:
}//GEN-LAST:event_r4ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        b1.setEnabled(true);        // TODO add your handling code here:
}//GEN-LAST:event_r2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        Main.l=Main.l+1;
        if(r3.isSelected()==true) {
            Main.m=Main.m+1;
            if(Main.k==0) {
                Main.f=Main.f+1;
                Main.k=0;
            }
            if(Main.k==1) {
                Main.f=(float) (Main.f + 0.5);
                Main.k=0;
            }
            if(Main.k==2) {
                Main.f=(float) (Main.f + 0.25);
                Main.k=0;
            }
            if(Main.k>=3) {
                Main.k=0;
            }
            l1.setText("Correct Answer.Your Total Score is "+Main.f);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r2.isSelected()==true) {
            Main.f=Main.f-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.f);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r4.isSelected()==true) {
            Main.f=Main.f-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.f);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r1.isSelected()==true) {
            Main.f=Main.f-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.f);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
}//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        new ques55().setVisible(true);
        dispose();
        if(Main.l==0) {
            Main.k=Main.k+1;
        }
        Main.l=0;
}//GEN-LAST:event_b2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ques54().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables

}
