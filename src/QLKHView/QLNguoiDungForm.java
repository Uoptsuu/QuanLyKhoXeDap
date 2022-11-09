/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLKHView;
import QLKHModel.*;
import QLKHController.*;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  

/**
 *
 * @author VTTDung
 */
public class QLNguoiDungForm extends javax.swing.JFrame {

    /**
     * Creates new form QLNguoiDungForm
     */
    final String header[] = {"Mã người dùng","Chức vụ","Mật khẩu","Tên người dùng","Số điện thoại","Địa chỉ","Ngày sinh","Giới tính"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    public QLNguoiDungForm() {
        initComponents();
        loadTableNguoiDung();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNguoiDung = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNguoiDung = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMaNguoiDung = new javax.swing.JTextField();
        lblMaNguoiDung = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblTenNguoiDung = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtTenNguoiDung = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        cboChucVu = new javax.swing.JComboBox<>();
        cboGioiTinh = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNguoiDung.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNguoiDung.setText("QUẢN LÝ NGƯỜI DÙNG");

        tbNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã người dùng", "Tên người dùng", "Chức vụ", "Địa chỉ", "Mật khẩu", "Giới tính", "Ngày sinh", "Số điện thoại"
            }
        ));
        jScrollPane2.setViewportView(tbNguoiDung);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập thông tin vào đây!"));

        lblMaNguoiDung.setText("Mã người dùng:");

        lblSoDienThoai.setText("Số điện thoại:");

        lblChucVu.setText("Chức vụ:");

        lblTenNguoiDung.setText("Tên người dùng:");

        lblDiaChi.setText("Địa chỉ:");

        lblNgaySinh.setText("Ngày sinh:");

        lblGioiTinh.setText("Giới tính:");

        lblMatKhau.setText("Mật khẩu:");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên kiểm kê", "Nhân viên tiếp nhận", " " }));
        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));
        cboGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGioiTinhActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNguoiDung)
                    .addComponent(lblChucVu)
                    .addComponent(lblTenNguoiDung)
                    .addComponent(lblDiaChi))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatKhau)
                    .addComponent(lblGioiTinh)
                    .addComponent(lblNgaySinh)
                    .addComponent(lblSoDienThoai))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(btnThem)
                .addGap(29, 29, 29)
                .addComponent(btnTim)
                .addGap(26, 26, 26)
                .addComponent(btnCapNhat)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNguoiDung)
                    .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNguoiDung)
                    .addComponent(lblGioiTinh)
                    .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChucVu)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(lblSoDienThoai)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnTim))
                .addGap(37, 37, 37))
        );

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 282, Short.MAX_VALUE)
                .addComponent(lblNguoiDung)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(820, Short.MAX_VALUE)
                    .addComponent(btnDangXuat)
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblNguoiDung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(btnDangXuat)
                    .addContainerGap(753, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadTableNguoiDung(){
        ArrayList<NguoiDungModel> lnd = NguoiDungController.listNguoiDung();
        for(int i=0; i<lnd.size(); i++){
            String GioiTinh = "";
            if(lnd.get(i).getGioiTinh() == true){
                GioiTinh = "nam";
            } else {
                GioiTinh = "nu";
            }
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String NgaySinh = dateFormat.format(lnd.get(i).getNgaySinh());
            String[] nd = {lnd.get(i).getMaND(), lnd.get(i).getChucVu().trim(), lnd.get(i).getMatKhau(), lnd.get(i).getTenND(), lnd.get(i).getSdtND(), lnd.get(i).getDiaChiND(), NgaySinh, GioiTinh};
            tb.addRow(nd);
            tbNguoiDung.setModel(tb);
        }
    }
    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChucVuActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void cboGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGioiTinhActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void runQLNguoiDung() {
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
            java.util.logging.Logger.getLogger(QLNguoiDungForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNguoiDungForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNguoiDungForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNguoiDungForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNguoiDungForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNguoiDung;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNguoiDung;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNguoiDung;
    private javax.swing.JTable tbNguoiDung;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNguoiDung;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNguoiDung;
    // End of variables declaration//GEN-END:variables
}