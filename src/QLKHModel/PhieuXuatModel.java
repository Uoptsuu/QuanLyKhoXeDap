/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author trinh
 */
public class PhieuXuatModel {
    private String MaPhieuXuat;
    private String MaCH;
    private String MaND;
    private Date NgayTao;
    ArrayList<SanPhamModel> DanhSachSP = new ArrayList<>();

    public PhieuXuatModel() {
        DanhSachSP = new ArrayList<>();
    }

    public PhieuXuatModel(String MaPhieuXuat, String MaCH, String MaND, Date NgayTao) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.MaCH = MaCH;
        this.MaND = MaND;
        this.NgayTao = NgayTao;
        DanhSachSP = new ArrayList<>();
    }


    public String getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(String MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public ArrayList<SanPhamModel> getDanhSachSP() {
        return DanhSachSP;
    }

    public void setDanhSachSP(ArrayList<SanPhamModel> DanhSachSP) {
        this.DanhSachSP = DanhSachSP;
    }
    
    public static ArrayList<PhieuXuatModel> getListPhieuXuat() {
        Connection conn = BaseModel.getConnection();
        ArrayList<PhieuXuatModel> listPX = new ArrayList<>(); 
        try{
            String query = "select * from PhieuXuat"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                PhieuXuatModel pn = new PhieuXuatModel();
                
                pn.setMaPhieuXuat(rs.getString(1));
                pn.setNgayTao(rs.getDate(2));
                pn.setMaCH(rs.getString(3));
                pn.setMaND(rs.getString(4));
                
                listPX.add(pn); 
            }
            return listPX; 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPX; 
    }
}
