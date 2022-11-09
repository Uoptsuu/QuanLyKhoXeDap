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
public class LoaiSanPhamModel {
    private String MaLoai;
    private String TenLoai;

    public LoaiSanPhamModel() {
    }

    public LoaiSanPhamModel(String MaLoai, String TenLoai) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
    public static ArrayList<LoaiSanPhamModel> getListLoaiSanPham() {
        Connection conn = BaseModel.getConnection();
        ArrayList<LoaiSanPhamModel> listLSP = new ArrayList<>(); 
        try{
            String query = "select * from LoaiSP"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
               LoaiSanPhamModel lsp = new LoaiSanPhamModel();
                
                lsp.setMaLoai(rs.getString(1));
                lsp.setTenLoai(rs.getString(2));
                
                listLSP.add(lsp); 
            }
            return listLSP;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listLSP;  
    }
    
}
