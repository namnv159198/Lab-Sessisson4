/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment8;

import java.time.LocalDate;
import java.time.*;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class KhachHang {
    public String maKH,ten,ngayHoaDon,ngay,thang,nam;
    public double donGia,soluong;
 Scanner in = new Scanner(System.in);
public KhachHang(){
}

    public KhachHang(String maKH, String ten, String ngayHoaDon, String ngay, String thang, String nam, double donGia, double soluong) {
        this.maKH = maKH;
        this.ten = ten;
        this.ngayHoaDon = ngayHoaDon;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.soluong = soluong;
    }

    public KhachHang(String maKH, String ten, String ngayHoaDon, double donGia, double soluong) {
        this.maKH = maKH;
        this.ten = ten;
        this.ngayHoaDon = ngayHoaDon;
        this.donGia = donGia;
        this.soluong = soluong;
    }
 public boolean ktDouble(double a){
     if (a<0) {
         return false;
     }
     return true;
 }

    
}
