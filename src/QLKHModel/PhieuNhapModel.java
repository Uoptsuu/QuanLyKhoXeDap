/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author trinh
 */
public class PhieuNhapModel {
    private String MaPhieuNhap;
    private String MaNCC;
    private String MaND;
    private Date NgayTao;
    ArrayList<SanPhamModel> DanhSachSP = new ArrayList<>();

    public PhieuNhapModel(String MaPhieuNhap, String MaNCC, String MaND, Date NgayTao) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaNCC = MaNCC;
        this.MaND = MaND;
        this.NgayTao = NgayTao;
        DanhSachSP = new ArrayList<>();
    }

    public PhieuNhapModel() {
        DanhSachSP = new ArrayList<>();
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
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
    
    
    
    
    
    public static ArrayList<PhieuNhapModel> getListPhieuNhap() {
        Connection conn = BaseModel.getConnection();
        ArrayList<PhieuNhapModel> listPN = new ArrayList<>(); 
        try{
            String query = "select * from PhieuNhap"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                PhieuNhapModel pn = new PhieuNhapModel();
                pn.setMaPhieuNhap(rs.getString(1));
                pn.setNgayTao(rs.getDate(2));
                pn.setMaNCC(rs.getString(3));
                pn.setMaND(rs.getString(4));
                listPN.add(pn); 
            }
            return listPN; 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPN; 
    }
}
