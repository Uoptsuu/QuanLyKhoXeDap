/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import App.*;
import static QLKHView.DangNhapForm.*;
import static QLKHView.indexFormNVKK.*;
import static QLKHView.indexFormNVTN.*;
import static QLKHView.indexFormQL.*;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class NguoiDungController {
     
    public static boolean doLogin(NguoiDungModel user){
            if(NguoiDungModel.checkLogin(user.getMaND(),user.getMatKhau())){
                String cv = NguoiDungModel.getChucVuLogin(user.getMaND(),user.getMatKhau()).trim();
                if(null != cv)switch (cv) {
                    case "Quản lý" -> indexFormQL.runIndexQL();
                    case "Nhân viên tiến nhận" -> indexFormNVTN.runIndexNVTN();
                    case "Nhân viên kiểm kê" -> indexFormNVKK.runIndexNVKK();
                    default -> { DangNhapForm.runLogin();
                    }
                }
                return true;
            }
            else {
                return  false;
            }
    }
    
    public static ArrayList<NguoiDungModel> listNguoiDung() {
        return NguoiDungModel.getListNguoiDung();
    }
}
