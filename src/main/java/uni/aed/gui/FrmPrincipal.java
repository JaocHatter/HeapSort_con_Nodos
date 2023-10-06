/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.gui;

/**
 *
 * @author hp
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mDataSimple = new javax.swing.JMenuItem();
        mDataObject = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mSimpleLinkedList = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mBinaryTrees = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Search & Sort Methods");

        mDataSimple.setText("Data Simple");
        mDataSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDataSimpleActionPerformed(evt);
            }
        });
        jMenu1.add(mDataSimple);

        mDataObject.setText("Data Object");
        mDataObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDataObjectActionPerformed(evt);
            }
        });
        jMenu1.add(mDataObject);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("LinkedList");

        mSimpleLinkedList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSimpleLinkedList.setText("Simple LinkedList");
        mSimpleLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSimpleLinkedListActionPerformed(evt);
            }
        });
        jMenu2.add(mSimpleLinkedList);

        jMenuItem1.setText("Heap Sort With Nodes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("BinaryTrees");

        mBinaryTrees.setText("BinaryTrees");
        mBinaryTrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBinaryTreesActionPerformed(evt);
            }
        });
        jMenu3.add(mBinaryTrees);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mDataObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDataObjectActionPerformed
        // TODO add your handling code here:
        FrmDirectorio v=new FrmDirectorio();
        v.setVisible(true);
    }//GEN-LAST:event_mDataObjectActionPerformed

    private void mDataSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDataSimpleActionPerformed
        // TODO add your handling code here:
        FrmDataSimple v=new FrmDataSimple();
        v.setVisible(true);
    }//GEN-LAST:event_mDataSimpleActionPerformed

    private void mSimpleLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSimpleLinkedListActionPerformed
        // TODO add your handling code here:
        FrmLinkedList v=new FrmLinkedList();
        v.setVisible(true);
    }//GEN-LAST:event_mSimpleLinkedListActionPerformed

    private void mBinaryTreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBinaryTreesActionPerformed
        // TODO add your handling code here:
        FrmBinaryTrees v = new FrmBinaryTrees();
        v.setVisible (true);
    }//GEN-LAST:event_mBinaryTreesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmSortNodes v = new FrmSortNodes();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mBinaryTrees;
    private javax.swing.JMenuItem mDataObject;
    private javax.swing.JMenuItem mDataSimple;
    private javax.swing.JMenuItem mSimpleLinkedList;
    // End of variables declaration//GEN-END:variables
}
