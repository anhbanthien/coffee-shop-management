/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainmodel.KhuyenMai;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.DataFormat;
import repository.KhuyenMaiRepository;
import service.impl.KhuyenMaiServiceImp;

/**
 *
 * @author vutuo
 */
public class ViewKhuyenMai extends javax.swing.JFrame {
    
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel tbl = new DefaultTableModel();
    private List<KhuyenMai> km = new KhuyenMaiRepository().getAll();
    
    public void fillToTable(List<KhuyenMai> km) {
        
        tbl = (DefaultTableModel) tblKhuyenMai.getModel();
        tbl.setRowCount(0);
        for (KhuyenMai o : km) {
            tbl.addRow(new Object[]{o.getMaKM(), o.getNgayBatDau(), o.getNgayKetThuc(), o.getPhanTramKM(), o.getTrangThai()});
        }
        
    }
    
    public ViewKhuyenMai() {
        initComponents();
        fillToTable(km);
                setLocationRelativeTo(null);

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhanTramKM = new javax.swing.JTextField();
        jbdOn = new javax.swing.JRadioButton();
        jbtOff = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtMaKM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBatDau = new com.toedter.calendar.JDateChooser();
        txtKetThuc = new com.toedter.calendar.JDateChooser();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salePNG.png"))); // NOI18N
        jLabel1.setText("Bảng khuyến mãi sản phẩm của Cửa Hàng ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Ngày bắt đầu", "Ngày kết thúc", "% KM", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(tblKhuyenMai);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 611, 134));

        jLabel2.setText("Ngày Bắt Đầu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 119, -1, -1));

        jLabel3.setText("Ngày Kết Thúc");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 176, -1, -1));

        jLabel4.setText("%KM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 216, -1, -1));
        getContentPane().add(txtPhanTramKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 213, 338, -1));

        jbdOn.setText("Còn Hoạt Động");
        getContentPane().add(jbdOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jbtOff.setText("Ngưng Hoạt Động");
        getContentPane().add(jbtOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 116, 87, 22));

        jButton2.setText("udapte");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 90, 30));
        getContentPane().add(txtMaKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 253, 338, -1));

        jLabel5.setText("Mã KM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 256, -1, -1));

        txtBatDau.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 112, 341, 37));

        txtKetThuc.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 167, 338, 28));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-icon_1.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        KhuyenMai km = new KhuyenMai();
        
        km.setNgayBatDau((java.sql.Date) txtBatDau.getDate());
        km.setNgayKetThuc((java.sql.Date) txtKetThuc.getDate());
        
        km.setMaKM(txtMaKM.getText());
        if (jbdOn.isSelected()) {
            km.setTrangThai(1);
        } else {
            km.setTrangThai(0);
        }
        
        if (new KhuyenMaiServiceImp().add(km)) {
            JOptionPane.showMessageDialog(this, "Khởi tạo thành công");
            fillToTable(new KhuyenMaiServiceImp().getAll());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(ViewKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jbdOn;
    private javax.swing.JRadioButton jbtOff;
    private javax.swing.JTable tblKhuyenMai;
    private com.toedter.calendar.JDateChooser txtBatDau;
    private com.toedter.calendar.JDateChooser txtKetThuc;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtPhanTramKM;
    // End of variables declaration//GEN-END:variables
}
