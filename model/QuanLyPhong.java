
package Buoi3.model;

public class QuanLyPhong {
    private String soPhong;
    private String khuVuc;
    private boolean loaiPhong;

    public QuanLyPhong() {
    }

    public QuanLyPhong(String soPhong, String khuVuc, boolean loaiPhong) {
        this.soPhong = soPhong;
        this.khuVuc = khuVuc;
        this.loaiPhong = loaiPhong;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public boolean getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(boolean loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String loaiPhong(){
        if(loaiPhong){
            return "Phòng đơn";
        }else{
            return "Phòng kép";
        }
    }
}
