/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thfinal;

/**
 *
 * @author jiang
 */
public class ThemHoaDon_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThemNhanVien_JFrame
     */
    public ThemHoaDon_JFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        maNhanVien_jLabel = new javax.swing.JLabel();
        maNhanVien_jTextField = new javax.swing.JTextField();
        soHoaDon_jLabel = new javax.swing.JLabel();
        soHoaDon_jTextField = new javax.swing.JTextField();
        ngayLap_jLabel = new javax.swing.JLabel();
        ngayLap_jTextField = new javax.swing.JTextField();
        triGia_jLabel = new javax.swing.JLabel();
        triGia_jTextField = new javax.swing.JTextField();
        themHoaDon_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        maNhanVien_jLabel.setText("Mã nhân viên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(maNhanVien_jLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(maNhanVien_jTextField, gridBagConstraints);

        soHoaDon_jLabel.setText("Số hóa đơn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(soHoaDon_jLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(soHoaDon_jTextField, gridBagConstraints);

        ngayLap_jLabel.setText("Ngày lập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        getContentPane().add(ngayLap_jLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(ngayLap_jTextField, gridBagConstraints);

        triGia_jLabel.setText("Trị giá");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        getContentPane().add(triGia_jLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(triGia_jTextField, gridBagConstraints);

        themHoaDon_jButton.setText("Thêm");
        themHoaDon_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themHoaDon_jButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(themHoaDon_jButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themHoaDon_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themHoaDon_jButtonActionPerformed
        // TODO add your handling code here:
        String maNV = maNhanVien_jTextField.getText();
        String soHoaDon = soHoaDon_jTextField.getText();
        String ngayLap = ngayLap_jTextField.getText();
        String triGia = triGia_jTextField.getText(); 
        ExcuteSQLStatement.ExcuteSQLUpdate("insert into HOADON values ('" + maNV + "', '" +soHoaDon +"','" +ngayLap+ "','" +triGia +"')");
        maNhanVien_jTextField.setText("");
        soHoaDon_jTextField.setText("");
        ngayLap_jTextField.setText("");
        triGia_jTextField.setText("");
        System.out.println("Da them hoa don thanh cong!");
    }//GEN-LAST:event_themHoaDon_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ThemHoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemHoaDon_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel maNhanVien_jLabel;
    private javax.swing.JTextField maNhanVien_jTextField;
    private javax.swing.JLabel ngayLap_jLabel;
    private javax.swing.JTextField ngayLap_jTextField;
    private javax.swing.JLabel soHoaDon_jLabel;
    private javax.swing.JTextField soHoaDon_jTextField;
    private javax.swing.JButton themHoaDon_jButton;
    private javax.swing.JLabel triGia_jLabel;
    private javax.swing.JTextField triGia_jTextField;
    // End of variables declaration//GEN-END:variables
}