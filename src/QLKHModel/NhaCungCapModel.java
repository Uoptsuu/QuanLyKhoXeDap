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
public class NhaCungCapModel {
    private String MaNCC;
    private String TenNCC;
    private String DiaChiNCC;
    private String SdtNCC;

    public NhaCungCapModel() {
    }

    public NhaCungCapModel(String MaNCC, String TenNCC, String DiaChiNCC, String SdtNCC) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChiNCC = DiaChiNCC;
        this.SdtNCC = SdtNCC;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChiNCC() {
        return DiaChiNCC;
    }

    public void setDiaChiNCC(String DiaChiNCC) {
        this.DiaChiNCC = DiaChiNCC;
    }

    public String getSdtNCC() {
        return SdtNCC;
    }

    public void setSdtNCC(String SdtNCC) {
        this.SdtNCC = SdtNCC;
    }
    
    
    public static ArrayList<NhaCungCapModel> getListNhaCungCap() {
        Connection conn = BaseModel.getConnection();
        ArrayList<NhaCungCapModel> listNCC = new ArrayList<>(); 
        try{
            String query = "select * from NhaCungCap"; 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query); 
            while (rs.next()) {
                NhaCungCapModel ncc = new NhaCungCapModel();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setSdtNCC(rs.getString(3));
                ncc.setDiaChiNCC(rs.getString(4));
                
                listNCC.add(ncc); 
            }
            return listNCC;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNCC;  
    }
    
}
