/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class KhachHangVietNam extends KhachHang{
    public String doiTuongKhachHang;
    public double dinhMuc,tien;
    public ArrayList <KhachHangVietNam> KHVN = new ArrayList<KhachHangVietNam>();
             
    public KhachHangVietNam(){

    }
    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc) {
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc, double tien, String maKH, String ten, String ngayHoaDon, String ngay, String thang, String nam, double donGia, double soluong) {
        super(maKH, ten, ngayHoaDon, ngay, thang, nam, donGia, soluong);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
        this.tien = tien;
    }

    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc, String maKH, String ten, String ngayHoaDon, double donGia, double soluong) {
        super(maKH, ten, ngayHoaDon, donGia, soluong);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }
        public double hoaDonVN(KhachHangVietNam k){
            if (k.dinhMuc >= k.soluong) {
                if (k.soluong < 50) {
                    tien = k.soluong * 1000;
                }else if (k.soluong >=50 && k.soluong < 100) {
                tien = k.soluong * 1200;
                }else if (k.soluong >= 100 && k.soluong < 200) {
                tien = k.soluong * 1500;
                }else tien = k.soluong * 2000;
            }else
            {
            tien = k.donGia* k.dinhMuc + k.soluong*k.donGia;
            }
            return tien;
    }
     KhachHangVietNam nhapKHVN(){
//         int sl;
      int choice;
      String maKH,ten,ngayHoaDon,doiTuongKhachHang = null,ngay,thang,nam;
      double soluong,donGia,dinhMuc;

             System.out.println("Nhập mã khách hàng việt nam :" );
             maKH = in.nextLine();
             System.out.println("Nhập họ tên khách hàng :");
             ten = in.nextLine();
             System.out.println("Nhập thời gian ra hóa đơn : ");
             System.out.println("Ngày : ");
             ngay = in.nextLine();
             System.out.println("Tháng : ");
             thang = in.nextLine();
             System.out.println("Năm : ");
             nam  = in.nextLine();
             ngayHoaDon = ngay + "-" + thang + "-"+nam;
             do{
             System.out.println("Chọn đối tượng khách hàng : ");
             System.out.println("1.Sinh hoạt ");
             System.out.println("2.Kinh doanh ");
             System.out.println("3.Sản xuất ");
             
             do{
             System.out.println("Nhập số để chọn đối tượng (1/2/3) : ");
             choice = Integer.parseInt(in.nextLine());
                 if (choice < 1 || choice >3) {
                     System.out.println("Nhập sai ! Xin hãy nhập lại ");
                 }
             }while (choice < 1 || choice >3);
             
             switch(choice){
             case 1:
                 System.out.println("Bạn đã chọn đối tượng là Sinh Hoạt ");
                 doiTuongKhachHang = "Sinh Hoạt";
                 break;
              case 2:
                  System.out.println("Bạn đã chọn đối tượng là Kinh Doanh ");
                 doiTuongKhachHang = "Kinh Doanh";
                break;
                case 3:
                  System.out.println("Bạn đã chọn đối tượng là Sản Xuất ");
                 doiTuongKhachHang = "Sản Xuất";
                 break;
             }
             break;
             }while(choice != 1 || choice != 2 || choice != 3);
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
          do {             
               System.out.println("Nhập định mức ");
               dinhMuc =Double.parseDouble(in.nextLine());
               if(ktDouble(dinhMuc) == false){
                  System.out.println("Không được nhập số âm ! hãy nhập lại ! ");
               }
         } while (ktDouble(dinhMuc) == false);
               
               KhachHangVietNam k = new KhachHangVietNam(doiTuongKhachHang, dinhMuc, tien, maKH, ten, ngayHoaDon, ngay, thang, nam, donGia, soluong);
               return k;
     }
     public void addKHVN(){
         int sl;
         KhachHangVietNam v = new  KhachHangVietNam();
         System.out.println("Nhập số lượng khách hàng việt nam : ");
        sl = Integer.parseInt(in.nextLine());
        for (int i = 0; i < sl; i++) {
                v = v.nhapKHVN();
                KHVN.add(v);
            
        }
     }
  public void outDSKHVN(){
      for (int i = 0; i < KHVN.size(); i++) {
          System.out.println("Mã KH (" + KHVN.get(i).maKH +")   - " + "Họ tên KH (" + KHVN.get(i).ten +")   - " + 
                              "Ngày ra hóa đơn (" + KHVN.get(i).ngayHoaDon +")   - " + "Đối tượng KH (" + KHVN.get(i).doiTuongKhachHang +")   - "
          +"Số lượng (" + KHVN.get(i).soluong +")   - " +"Đơn giá (" + KHVN.get(i).donGia +")   - "+"Định mức (" + KHVN.get(i).dinhMuc +")");
      }
  }
  
  public void soLuongVN(){
      System.out.println("------------------ Danh sách tổng số lượng khách hàng việt nam -------------------------");
      for (int i = 0; i < KHVN.size(); i++) {
          System.out.println("Mã KH (" + KHVN.get(i).maKH +")   - " + "Họ tên KH (" + KHVN.get(i).ten +")   - " + 
                                "Đối tượng KH (" + KHVN.get(i).doiTuongKhachHang +")   - "
          +"Tổng số lượng  (" + KHVN.get(i).hoaDonVN(this.KHVN.get(i)) +" ($) )    "  );
      }
  }
 public void xuatHoaDonNgayVN(){
       for (int i = 0; i < KHVN.size(); i++) {
          if(KHVN.get(i).thang.equals("1") && KHVN.get(i).nam.equals("2019") || KHVN.get(i).thang.equals("01") && KHVN.get(i).nam.equals("2019")){
          System.out.println("Mã KH (" + KHVN.get(i).maKH +")   - " + "Họ tên KH (" + KHVN.get(i).ten +")   - " + 
                              "Ngày ra hóa đơn (" + KHVN.get(i).ngayHoaDon +")   - "  +"Định mức (" + KHVN.get(i).dinhMuc +") - "
          +"Số lượng (" + KHVN.get(i).soluong +")   - " +"Đơn giá (" + KHVN.get(i).donGia +")   -" +"Tổng tiền (" + KHVN.get(i).tien +")   ");
          }
       }
   }       
    
    
}
