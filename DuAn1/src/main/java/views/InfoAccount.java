/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainmodel.DangNhap;
import domainmodel.NhanVien;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import service.impl.QlyNhanVienImpl;

/**
 *
 * @author Admin
 */
public class InfoAccount extends javax.swing.JFrame {

    private DangNhap log = null;

    public InfoAccount() {
        initComponents();
    }

    public InfoAccount(DangNhap log) {
        initComponents();
        txtAccount.setEnabled(false);
        txtTrangThai.setEnabled(false);
        this.log = log;
        txtAccount.setText(log.getTenTaiKhoan());
        txtEmail.setText(log.getIdNhanVien().getEmail());
        txtTrangThai.setText(log.getIdNhanVien().getTrangThai());
        txtFullName.setText(log.getIdNhanVien().getHoTen());
        txtSDT.setText(log.getIdNhanVien().getSDT());
        if (log.getIdNhanVien().getGioiTinh().trim().equalsIgnoreCase("Nam")) {
            jbtNam.setSelected(true);
        } else {
            jbtNu.setSelected(true);
        }

        if (log.getIdNhanVien().getImage() == null) {
            lblAnh.setText("null");
            lblAnh.setIcon(null);
        } else {
            lblAnh.setText("");
            ImageIcon imgIcon = new ImageIcon("C:\\Users\\Admin\\Desktop\\DuAn1\\da1\\DuAn1\\src\\main\\resources\\" + log.getIdNhanVien().getImage());
            Image img = imgIcon.getImage();
            img.getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), 0);
            lblAnh.setIcon(imgIcon);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        txtaccount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtaccount1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jbtNu = new javax.swing.JRadioButton();
        jbtNam = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblAnh = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));

        txtaccount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtaccount.setText("Tài Khoản");
        getContentPane().add(txtaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, -1, -1));

        txtAccount.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountActionPerformed(evt);
            }
        });
        getContentPane().add(txtAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 89, 187, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("Họ Tên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, -1, -1));

        txtFullName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 148, 187, 30));

        txtaccount1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        txtaccount1.setText("Email");
        getContentPane().add(txtaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 202, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 196, 187, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel4.setText("SDT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 250, -1, -1));

        txtSDT.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 244, 187, 30));

        buttonGroup1.add(jbtNu);
        jbtNu.setText("NỮ");
        getContentPane().add(jbtNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 292, -1, -1));

        buttonGroup1.add(jbtNam);
        jbtNam.setText("NAM");
        getContentPane().add(jbtNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 292, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Giới Tính");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 296, -1, -1));

        txtTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getContentPane().add(txtTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 320, 190, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 10));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setForeground(new java.awt.Color(255, 204, 51));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel3.setText("PROFILE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("Trạng Thái");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baomat.png"))); // NOI18N
        jButton2.setText("Bảo Mật");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NhanVien Staff = new NhanVien();
        Staff.setHoTen(txtFullName.getText());
        Staff.setEmail(txtEmail.getText());
        Staff.setSDT(txtSDT.getText());
        Staff.setTrangThai(txtTrangThai.getText());
        if (jbtNam.isSelected()) {
            Staff.setGioiTinh("Nam");
        } else {
            Staff.setGioiTinh("Nữ");
        }
        String hinh;
        if (strHinhAnh1 == null) {
            hinh = "null";
        } else {
            hinh = strHinhAnh1;
            Staff.setImage(strHinhAnh1);
        }
        if (new QlyNhanVienImpl().Update(log.getIdNhanVien().getIdNhanVien(), Staff)) {
            JOptionPane.showMessageDialog(this, "Edit success");
        };

    }//GEN-LAST:event_jButton1ActionPerformed

    private String strHinhAnh1 = "";

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        try {
            JFileChooser jfc = new JFileChooser("C:\\Users\\Admin\\Desktop\\DuAn1\\da1\\DuAn1\\src\\main\\resources");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            Image img = ImageIO.read(file);
            strHinhAnh1 = file.getName();
            lblAnh.setText("");
            int width = lblAnh.getWidth();
            int height = lblAnh.getHeight();
            lblAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn đã huỷ chọn ảnh");
        }
    }//GEN-LAST:event_lblAnhMouseClicked

    private void txtAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new SerPass(this.log).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InfoAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton jbtNam;
    private javax.swing.JRadioButton jbtNu;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTrangThai;
    private javax.swing.JLabel txtaccount;
    private javax.swing.JLabel txtaccount1;
    // End of variables declaration//GEN-END:variables
}
