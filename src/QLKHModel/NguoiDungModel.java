/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHModel;
import QLKHController.*;
import QLKHView.*;
import App.*;
import QLKHController.NguoiDungController;
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
public class NguoiDungModel {
    private String MaND;
    private String TenND;
    private String ChucVu;
    private String MatKhau;
    private String SdtND;
    private String DiaChiND;
    private Date NgaySinh;
    private boolean GioiTinh;

    public NguoiDungModel() {
    }

    public NguoiDungModel(String MaND, String TenND, String ChucVu, String MatKhau, String SdtND, String DiaChiND, Date NgaySinh, boolean GioiTinh) {
        this.MaND = MaND;
        this.TenND = TenND;
        this.ChucVu = ChucVu;
        this.MatKhau = MatKhau;
        this.SdtND = SdtND;
        this.DiaChiND = DiaChiND;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getTenND() {
        return TenND;
    }

    public void setTenND(String TenND) {
        this.TenND = TenND;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getSdtND() {
        return SdtND;
    }

    public void setSdtND(String SdtND) {
        this.SdtND = SdtND;
    }

    public String getDiaChiND() {
        return DiaChiND;
    }

    public void setDiaChiND(String DiaChiND) {
        this.DiaChiND = DiaChiND;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    public static boolean checkLogin(String maNd, String matKhau) {
        try (Connection conn = BaseModel.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery("SELECT ma_nd, mat_khau from NguoiDung where ma_nd = '"+maNd+"' and mat_khau='"+matKhau+"'");
            if(result.next()){
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static String getChucVuLogin(String maNd, String matKhau){
        String chucVu = "";
        try (Connection conn = BaseModel.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery("SELECT chuc_vu from NguoiDung where ma_nd = '"+maNd+"' and mat_khau='"+matKhau+"'");
            while(result.next()){
                chucVu = result.getString(1);
            }
            //chucVu = result.getString(1);
            return chucVu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chucVu;
    }
    
    public static ArrayList<NguoiDungModel> getListNguoiDung() {
        Connection conn = BaseModel.getConnection();
        ArrayList<NguoiDungModel> listND = new ArrayList<>(); 
        try{
            String query = "select * from NguoiDung"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                NguoiDungModel nd = new NguoiDungModel();  
                nd.setMaND(rs.getString(1));
                nd.setChucVu(rs.getString(2));
                nd.setMatKhau(rs.getString(3));
                nd.setTenND(rs.getString(4));
                nd.setSdtND(rs.getString(5));
                nd.setDiaChiND(rs.getString(6));
                nd.setNgaySinh(rs.getDate(7));
                nd.setGioiTinh(rs.getBoolean(8)); 
                listND.add(nd); 
            }
            return listND; 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listND; 
    }
    
}
