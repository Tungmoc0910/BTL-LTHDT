package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class BenhNhanNgoaiTru extends BenhNhan implements Serializable {
    private String bacSiDieuTri;
    private String tinhTrangBenhNhan;
 
    public BenhNhanNgoaiTru() {
        super();
       
        bacSiDieuTri = "";
        tinhTrangBenhNhan = "";
    }
    
   

    public BenhNhanNgoaiTru(String maBenhNhan, String maBHYT, String soDienThoai, String hoTen, String diaChi,
            String gioiTinh, int tuoi, String bacSiDieuTri, String tinhTrangBenhNhan) {
        super(maBenhNhan, maBHYT, soDienThoai, hoTen, diaChi, gioiTinh, tuoi);
        this.bacSiDieuTri = bacSiDieuTri;
        this.tinhTrangBenhNhan = tinhTrangBenhNhan;
    
    }

  


  
    public String getBacSiDieuTri() {
        return bacSiDieuTri;
    }



    public void setBacSiDieuTri(String bacSiDieuTri) {
        this.bacSiDieuTri = bacSiDieuTri;
    }



    public String getTinhTrangBenhNhan() {
        return tinhTrangBenhNhan;
    }



    public void setTinhTrangBenhNhan(String tinhTrangBenhNhan) {
        this.tinhTrangBenhNhan = tinhTrangBenhNhan;
    }



  


    

    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap Bac Si Dieu Tri:");
        bacSiDieuTri=scanner.nextLine();
        System.out.println("Nhap Tinh Trang Benh Nhan:");
        tinhTrangBenhNhan=scanner.nextLine();


    }
    
    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println(" Bac Si Dieu Tri:"+bacSiDieuTri);
        System.out.println(" Tinh Trang Benh Nhan:"+tinhTrangBenhNhan); 

    }

    
    
}
