
import gentechquiz.Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Q18.java
 *
 * Created on Nov 1, 2017, 10:23:42 PM
 */

/**
 *
 * @author Admin
 */
public class Q18 extends javax.swing.JFrame {

    /** Creates new form Q18 */
    public Q18() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("GenTech Quiz");

        jLabel2.setText("8.)Which country's team has won the 2017 FIFA Under-17 World Cup?");

        buttonGroup1.add(r1);
        r1.setText("Brazil");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setText("England");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setText("Spain");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setText("France");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        b1.setText("Submit your answer");
        b1.setEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Next Question");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r1)
                                    .addComponent(r3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(r2)
                                    .addComponent(r4))
                                .addGap(38, 38, 38))))
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(b1)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(b2)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3)
                    .addComponent(r4))
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addGap(44, 44, 44)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(b2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
       Main.l=Main.l+1;
        if(r3.isSelected()==true) {
            Main.m=Main.m+1;
           if(Main.k==0)
           {
            Main.b=Main.b+1;
            Main.k=0;
           }
           if(Main.k==1)
           {
            Main.b=(float) (Main.b + 0.5);
            Main.k=0;
           }
           if(Main.k==2)
           {
            Main.b=(float) (Main.b + 0.25);
            Main.k=0;
           }
           if(Main.k>=3)
           {
            Main.k=0;
           }
           l1.setText("Correct Answer.Your Total Score is "+Main.b);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r2.isSelected()==true) {
            Main.b=Main.b-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.b);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r1.isSelected()==true) {
            Main.b=Main.b-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.b);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if(r4.isSelected()==true) {
            Main.b=Main.b-1;
            l1.setText("Wrong Answer.Your Total Score is "+Main.b);
            b1.setEnabled(false);
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
}//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        new Q19().setVisible(true);
        dispose();
           if(Main.l==0)
        {
            Main.k=Main.k+1;
        }
        Main.l=0;
}//GEN-LAST:event_b2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
b1.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
b1.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
b1.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
b1.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables

}
