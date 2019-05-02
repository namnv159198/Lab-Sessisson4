/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Product {
    public int id,qty;
    public double  price;
    public String productName;
    
   public Product(){
   }
   public Product(int id, String productName,int qty,double price){
   this.id = id;
   this.productName = productName;
   this.qty = qty;
   this.price = price;
   }
   Product nhapProduct(){
     int id,qty;
     double  price;
     String productName;
   Scanner in = new Scanner (System.in);
      System.out.println("Nhập id : ");
      id = Integer.parseInt(in.nextLine());
      System.out.println("Nhập tên hàng : ");
       productName = in.nextLine();
      System.out.println("Nhập số lượng hàng : ");
       qty = Integer.parseInt(in.nextLine());
       System.out.println("Nhập giá : ");
       price = Integer.parseInt(in.nextLine());
       Product pr = new Product(id,productName,qty,price);
       return pr;
   }
   public void xuatProduct(Product pr){
       System.out.println("ID : "+pr.id);
       System.out.println("ProductName  :"+pr.productName);
       System.out.println("Quatity  : "+pr.qty);
       System.out.println("Price : "+pr.price+" $");
   }
    public void  kiemTraSoLg(){
        Scanner in = new Scanner (System.in);
        System.out.println("Nhập id sản phẩm kiểm tra : ");
        id = in.nextInt();
       if(qty > 0 ) System.out.println("Còn hàng");
       else System.out.println("Hết hàng");
   }
    
    public static void main(String[] args) {
        Product p1  =  new Product();
        p1 = p1.nhapProduct();;
         p1.xuatProduct(p1);
         p1.kiemTraSoLg();
//        p2.xuatProduct(p2);
    }
    
   
    
}
