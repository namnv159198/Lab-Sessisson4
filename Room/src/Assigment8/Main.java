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
public class Main {
    

    public ArrayList <KhachHangNuocNgoai> KHNN = new ArrayList<KhachHangNuocNgoai>();
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner  (System.in);
               
        KhachHangVietNam vn1 = new KhachHangVietNam();
        KhachHangNuocNgoai nn = new KhachHangNuocNgoai();
        do {            
            System.out.println("\n-------------------------- Chương trình quản lý danh sách hóa đơn tiền điện của khách hàng --------------------------");
            System.out.println("1.Nhập/xuất danh sách các hóa đơn khách hàng.");
            System.out.println("2.Tính tổng số lượng cho từng loại khách hàng.");
            System.out.println("3.Tính trung bình thành tiền của khách hàng người nước ngoài.");
            System.out.println("4.Xuất ra các hoá đơn trong tháng 01 năm 2019 (cùa cả 2 loại khách hàng).");
            System.out.println("0.Exit");
            do {                
            System.out.println("Nhập số để chọn chức năng bằng cách nhập (0/1/2/3/4) : ");
            choice = in.nextInt();
            if(choice < 0 || choice > 4) System.out.println("Nhập sai ! xin hãy nhập lại !");
            } while (choice < 0 || choice > 4);
            
           switch (choice){
               case 1 : 
                   System.out.println("Bạn đã chọn chức năng nhập xuất danh sách các hóa đơn khách hàng\n");
                   vn1.addKHVN();
                   nn.addKHNN();
                   System.out.println("------------------ Danh sach hóa đơn khách hàng  -------------------------");
                           vn1.outDSKHVN();
                           nn.outDSKHNN();
                    break;
               case 2:
                System.out.println("Bạn đã chọn chức năng tính tổng số lượng cho từng loại khách hàng\n");   
                        vn1.soLuongVN();
                        nn.soLuongNN();
                        break;
               case 3:
                   System.out.println("Bạn đã chọn chức năng tính trung bình thành tiền của khách hàng người nước ngoài\n");
                   nn.TBNN();
                   break;
                case 4:
                   System.out.println("Bạn đã chọn chức năng Xuất ra các hoá đơn trong tháng 01 năm 2019 (cùa cả 2 loại khách hàng)\n");
//                   vn1.xuatHoaDonNgayVN();
                   nn.xuatHoaDonNgayNN();
                   break;
                 case 0:
                     System.out.println("Bạn đã chọn chức năng kết thúc chương trình ! Xin cảm ơn đã sử dụng dịch vụ . Hẹn gặp lại !");
                     System.exit(0);
           }
        } while (choice != 0);
        


        
        
    }
}
