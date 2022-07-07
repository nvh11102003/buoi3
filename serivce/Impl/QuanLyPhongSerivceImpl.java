/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3.serivce.Impl;

import Buoi3.model.QuanLyPhong;
import Buoi3.serivce.IQuanLyVanPhongSerivce;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QuanLyPhongSerivceImpl implements IQuanLyVanPhongSerivce{
    private ArrayList<QuanLyPhong> listQuanLy;
    public QuanLyPhongSerivceImpl(){
        listQuanLy = new ArrayList<>();
    }

    @Override
    public Boolean add(QuanLyPhong qlp) {
        listQuanLy.add(qlp);
        return true;
    }
    

    @Override
    public Boolean xoa(int index) {
        listQuanLy.remove(index);
        return true;
    }

    @Override
    public Boolean update(int index, QuanLyPhong qlp) {
        QuanLyPhong quanLyPhong = listQuanLy.get(index);
        quanLyPhong.setSoPhong(qlp.getSoPhong());
        quanLyPhong.setKhuVuc(qlp.getKhuVuc());
        quanLyPhong.setLoaiPhong(qlp.getLoaiPhong());
        return true;
    }

    @Override
    public ArrayList<QuanLyPhong> getList() {
        return listQuanLy;
    }
}
