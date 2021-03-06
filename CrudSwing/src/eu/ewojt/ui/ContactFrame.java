/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.ewojt.ui;

import eu.ewojt.ui.model.ContactTableModel;
import java.awt.event.ActionListener;

/**
 *
 * @author iwonaw
 */
public class ContactFrame extends javax.swing.JFrame {

    /**
     * Creates new form ContactFrame
     */
    ContactTableModel tmodel;
    public ContactFrame( ContactTableModel model) {
        tmodel = model;
        initComponents();
    }

    public void addAddActionListener(ActionListener l) {
        jButton1.addActionListener(l);
    }
    
    public void addDeleteActionListener(ActionListener l) {
        jButton2.addActionListener(l);
    }
    
    public void addEditActionListener(ActionListener l) {
        jButton3.addActionListener(l);
    }
    
    public void addExitActionListener(ActionListener l) {
        jButton4.addActionListener(l);
    }
    
    public void addViewActionListener(ActionListener l) {
        jButton5.addActionListener(l);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyContacts");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(tmodel);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton1.setText("Add");
        jPanel2.add(jButton1);

        jButton2.setText("Delete");
        jPanel2.add(jButton2);

        jButton3.setText("Edit");
        jPanel2.add(jButton3);

        jButton5.setText("View");
        jPanel2.add(jButton5);

        jLabel1.setText("       ");
        jPanel2.add(jLabel1);

        jButton4.setText("Exit");
        jPanel2.add(jButton4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
