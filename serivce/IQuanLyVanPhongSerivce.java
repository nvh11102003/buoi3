
package Buoi3.serivce;

import Buoi3.model.QuanLyPhong;
import java.util.ArrayList;


public interface IQuanLyVanPhongSerivce {
    public Boolean add(QuanLyPhong qlp);
    public Boolean xoa(int index);
    public Boolean update(int index, QuanLyPhong qlp);
    public ArrayList<QuanLyPhong> getList();
}
