/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment5;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Person {
    public String name;
    public String gioiTinh;
    public String ngaySinh;
    public String ngay;
    public String thang;
    public String nam;
    public String diaChi;
    
   public Person(){

}
   public Person(String name,String gioiTinh,String ngaySinh,String diaChi){
   this.name = name;
   this.gioiTinh = gioiTinh;
   this.ngaySinh = ngaySinh;
   this.diaChi = diaChi;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
   public void inputInfor(){
       Scanner in = new Scanner (System.in);
       System.out.println("Nhap ten :");
       name = in.nextLine();
       System.out.println("Nhap gioi tinh : ");
       gioiTinh = in.nextLine();
       System.out.println("Nhap ngay sinh : ");
       System.out.println("Ngay : ");
       ngay = in.nextLine();
       System.out.println("Thang : ");
       thang = in.nextLine();
       System.out.println("Nam : ");
       nam = in.nextLine();
       System.out.println("Nhap dia chi : ");
       diaChi = in.nextLine();
       ngaySinh = ngay + "-"+thang+"-"+nam;
   }
   public void showInfor(){
       System.out.println("------------------ Thong tin -----------------------");
       System.out.println("Ten : " +name);
       System.out.println("Gioi tinh : "+ gioiTinh);
       System.out.println("Ngay sinh : " + ngay + "-" +thang+"-"+nam);
       System.out.println("Dia chi : " + diaChi);
   }
}
