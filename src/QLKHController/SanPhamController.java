/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKHController;
import QLKHModel.*;
import QLKHView.*;
import App.*;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class SanPhamController {
    public static ArrayList<SanPhamModel> listSanPham() {
        return SanPhamModel.getListSanPham();
    }
}
