/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.*;

/**
 *
 * @author namku
 */
public class KhachHangNuocNgoai extends KhachHang{
    public String quocTich;
    public double  tien;
    public ArrayList <KhachHangNuocNgoai> KHNN = new ArrayList<>();
    public KhachHangNuocNgoai(){
    
    }
    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String quocTich, double tien, String maKH, String ten, String ngayHoaDon, String ngay, String thang, String nam, double donGia, double soluong) {
        super(maKH, ten, ngayHoaDon, ngay, thang, nam, donGia, soluong);
        this.quocTich = quocTich;
        this.tien = tien;
    }

    public KhachHangNuocNgoai(String quocTich, String maKH, String ten, String ngayHoaDon, double donGia, double soluong) {
        super(maKH, ten, ngayHoaDon, donGia, soluong);
        this.quocTich = quocTich;
    }
            public double hoaDonNN(KhachHangNuocNgoai k){
            if (2000 >= k.soluong) {
                if (k.soluong < 50) {
                    tien = k.soluong * 1000;
                }else if (k.soluong >=50 && k.soluong < 100) {
                tien = k.soluong * 1200;
                }else if (k.soluong >= 100 && k.soluong < 200) {
                tien = k.soluong * 1500;
                }else tien = k.soluong * 2000;
            }else
            {
            tien = k.donGia*2000 + k.soluong*k.donGia;
            }
            return tien;
    }
       KhachHangNuocNgoai nhapKHNN(){
//         int sl;
      int choice;
      String maKH,ten,ngayHoaDon,quocTich,ngay,thang,nam;
      double soluong,donGia;

             System.out.println("Nhập mã khách hàng nước ngoài :" );
             maKH = in.nextLine();
             System.out.println("Nhập họ tên khách hàng :");
             ten = in.nextLine();
             System.out.println("Nhập quốc tịch :");
             quocTich = in.nextLine();
             System.out.println("Nhập thời gian ra hóa đơn : ");
             System.out.println("Ngày : ");
             ngay = in.nextLine();
             System.out.println("Tháng : ");
             thang = in.nextLine();
             System.out.println("Năm : ");
             nam  = in.nextLine();
             ngayHoaDon = ngay + "-" + thang + "-"+nam;
               do {             
               System.out.println("Nhập số lượng : ");
               soluong = Double.parseDouble(in.nextLine());
               if(ktDouble(soluong) == false){
                    System.out.println("Không được nhập số âm ! hãy nhập lại ! ");
               }
         } while (ktDouble(soluong) == false);
          do {             
                System.out.println("Nhập đơn giá : ");
               donGia = Double.parseDouble(in.nextLine());
               if(ktDouble(donGia) == false){
                    System.out.println("Không được nhập số âm ! hãy nhập lại ! ");
               }
         } while (ktDouble(donGia) == false);
               KhachHangNuocNgoai k = new KhachHangNuocNgoai(quocTich, tien, maKH, ten, ngayHoaDon, ngay, thang, nam, donGia, soluong);
               return k;
     }
     public void addKHNN(){
         int sl;
         KhachHangNuocNgoai v = new  KhachHangNuocNgoai();
         System.out.println("Nhập số lượng khách hàng nước ngoài : ");
        sl = Integer.parseInt(in.nextLine());
        for (int i = 0; i < sl; i++) {
            System.out.println("Khách hàng thứ " + (i+1));
                v = v.nhapKHNN();
                KHNN.add(v);
            
        }
     }
  public void outDSKHNN(){
    
      for (int i = 0; i < KHNN.size(); i++) {
          System.out.println("Mã KH (" + KHNN.get(i).maKH +")   - " + "Họ tên KH (" + KHNN.get(i).ten +")   - " + 
                              "Ngày ra hóa đơn (" + KHNN.get(i).ngayHoaDon +")   - " + "Quốc tịch KH (" + KHNN.get(i).quocTich +")   - "
          +"Số lượng (" + KHNN.get(i).soluong +")   - " +"Đơn giá (" + KHNN.get(i).donGia +")    ");
      }
  }
  
   public void soLuongNN(){
      System.out.println("------------------ Danh sách tổng số lượng khách hàng nước ngoài -------------------------");
      for (int i = 0; i < KHNN.size(); i++) {
          System.out.println("Mã KH (" + KHNN.get(i).maKH +")   - " + "Họ tên KH (" + KHNN.get(i).ten +")   - " + 
                                "Quốc tịch KH (" + KHNN.get(i).quocTich +")   - "
          +"Tổng số lượng  (" + KHNN.get(i).hoaDonNN(this.KHNN.get(i)) +" ($) )    "  );
      }
     
  }
   
   public void TBNN(){
       int dem =1;
       double tienTB = 0;
       for (int i = 0; i < KHNN.size(); i++) {
           dem = dem + i;
           tienTB = tienTB + KHNN.get(i).tien;
       }
//       System.out.println("------- Trung bình tiền của khách hàng nước ngoài -------");
//       for (int i = 1; i <= KHNN.size(); i++) {
//           System.out.println("Mã KH (" + KHNN.get(i).maKH +")   - " + "Họ tên KH (" + KHNN.get(i).ten +")   - " + 
//                                "Quốc tịch KH (" + KHNN.get(i).quocTich +")   - "
//          +"Tổng số lượng  (" + KHNN.get(i).hoaDonNN(this.KHNN.get(i)) +" ($) )    "  );
//       }
       System.out.println("Tổng số khách hàng nước ngoài : " + dem);
       System.out.println("Trung bình tiền : "+(tienTB/dem) );
       
   }
   
   public void xuatHoaDonNgayNN(){
       for (int i = 0; i < KHNN.size(); i++) {
          if(KHNN.get(i).thang.equals("1") && KHNN.get(i).nam.equals("2019") || KHNN.get(i).thang.equals("01") && KHNN.get(i).nam.equals("2019")){
          System.out.println("Mã KH (" + KHNN.get(i).maKH +")   - " + "Họ tên KH (" + KHNN.get(i).ten +")   - " + 
                              "Ngày ra hóa đơn (" + KHNN.get(i).ngayHoaDon +")   - " + "Quốc tịch KH (" + KHNN.get(i).quocTich +")   - "
          +"Số lượng (" + KHNN.get(i).soluong +")   - " +"Đơn giá (" + KHNN.get(i).donGia +")   -" +"Tổng tiền (" + KHNN.get(i).tien +")   ");
          }
       }
      
   }
}


