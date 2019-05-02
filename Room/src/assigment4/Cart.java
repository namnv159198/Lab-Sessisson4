/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Cart {
    public int idc;
    public String customer,city;
    public double grandTobal;
    public ArrayList <String> productList;
    
    public Cart(){
    }
    
    public Cart(int idc,String customer , ArrayList productList,String city,double grandTobal){
    this.idc = idc;
    this.customer = customer;
    this.grandTobal = grandTobal;
    this.productList = productList;
    this.city = city;
    }
    
    Cart nhapSP(Cart c){
     int idc;
     String x;
     int idsp;
     int sl;
     String customer,city;
     double grandTobal;
     ArrayList <String> productList = new ArrayList<>();
     Scanner in = new Scanner (System.in);
        System.out.println("Nhập id khách hàng : ");
        idc = Integer.parseInt(in.nextLine());
        System.out.println("Nhập tên khách hàng : ");
        customer = in.nextLine();
        System.out.println("Nhập số lượng  sp thêm vào giỏ hàng : ");
        sl = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= sl; i++) {
            System.out.println("Nhập tên sản phẩm thứ " + i + ": ");
            x = in.nextLine();
            productList.add(x);
        }
        System.out.println("Nhập tổng tiền : ");
        grandTobal = Double.parseDouble(in.nextLine());
        System.out.println("Nhập thành phố : ");
        city = in.nextLine();
        c = new Cart(idc,customer,productList,city,grandTobal);
        return c;
    }
    
    public void hienThi(){
        System.out.println("\nID khách hàng : " + idc);
        System.out.println("Tên khách hàng : " + customer);
        System.out.println("Danh sách sản phẩm : " +productList);
        System.out.println("Tổng tiền sản phẩm : " +grandTobal +" $");
        System.out.println("Thành phố : " +city);
    }
    
    Cart them1Sp(Cart c){
        String x;
        Scanner in = new Scanner (System.in);
        System.out.println("\nNhập sản phẩm thêm vào giỏ hàng : ");
        x = in.nextLine();
        c.productList.add(x);
        return c;
    }
    
    Cart xoa1Sp(Cart c){
        int k;
        Scanner in = new Scanner (System.in);
        System.out.println("\nNhập vị trí sản phẩm cần xóa trong giỏ hàng : ");
        k = in.nextInt();
        c.productList.remove(k-1);
        return c;
    }
    public double tongTien(Cart c){
    if(c.city.equals("HN") || c.city.equals("hn")|| c.city.equals("Hn")|| c.city.equals("hN") || c.city.equals("HCM") || c.city.equals("hcm")) c.grandTobal = c.grandTobal + (c.grandTobal*1)/100;
    else c.grandTobal = c.grandTobal + (c.grandTobal*2)/100;
    return c.grandTobal;
    }
    
    public static void main(String[] args) {
        Cart c = new Cart();
        c= c.nhapSP(c);
        c.hienThi();
        c.them1Sp(c);
        c.hienThi();
        c.xoa1Sp(c);
        c.hienThi();
        System.out.println("\nTổng tiền bao gồm tiền ship : " + c.tongTien(c) +" $");
        
    }
}
