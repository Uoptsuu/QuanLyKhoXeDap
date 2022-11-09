/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author trinh
 */
public class SanPhamModel {
    private String MaSP;
    private String TenSP;
    private String MaLoai;
    private String Hang;
    private String KieuDang;
    private String MauSac;
    private int DonGia;
    private String DonVi;
    private String ChatLieu;
    private int SoLuong;

    public SanPhamModel() {
    }

    public SanPhamModel(String MaSP, String TenSP, String MaLoai, String Hang, String KieuDang, String MauSac, int DonGia, String DonVi, String ChatLieu, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MaLoai = MaLoai;
        this.Hang = Hang;
        this.KieuDang = KieuDang;
        this.MauSac = MauSac;
        this.DonGia = DonGia;
        this.DonVi = DonVi;
        this.ChatLieu = ChatLieu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getKieuDang() {
        return KieuDang;
    }

    public void setKieuDang(String KieuDang) {
        this.KieuDang = KieuDang;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    public static ArrayList<SanPhamModel> getListSanPham() {
        Connection conn = BaseModel.getConnection();
        ArrayList<SanPhamModel> listSP = new ArrayList<>(); 
        try{
            String query = "select * from SanPham"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaLoai(rs.getString(3));
                sp.setHang(rs.getString(4));
                sp.setMauSac(rs.getString(5));
                sp.setKieuDang(rs.getString(6));
                sp.setChatLieu(rs.getString(7));
                sp.setDonGia(rs.getInt(8));
                sp.setDonVi(rs.getString(9));
                listSP.add(sp); 
            }
            return listSP;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSP;  
    }
    
    
}
