/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TamGiac;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class TamGiac {
    public  double canh_1;
    public  double canh_2;
    public  double canh_3;
    
    public TamGiac (){
    }
    
    public TamGiac (double canh_1,double canh_2,double canh_3){
    this.canh_1 = canh_1;
    this.canh_2 = canh_2;
    this.canh_3 = canh_3;
    }
    public void khaiBaoTamGiac(){
    Scanner in = new Scanner(System.in);
    do{
        System.out.println("Nhap canh a : ");
        canh_1 = in.nextDouble();
        System.out.println("Nhap canh b : ");
        canh_2 = in.nextDouble();
        System.out.println("Nhap canh c : ");
        canh_3 = in.nextDouble();
        System.out.println("a = " + canh_1+ " b = " + canh_2 + " c = " +canh_3);
        if (ktTamGiac() == false) {
            System.out.println("Khong hop le ! Xin nhap lai");
        }
    }while(ktTamGiac() == false);
    }
     public boolean ktTamGiac(){
        if (canh_1 + canh_2 > canh_3 && canh_1+canh_3 >canh_2 && canh_2 + canh_3 >canh_1 ) return true;
         return false;
    }
    public double chuViTamGiac(){
    return canh_1 + canh_2 + canh_3;
    }
    public double dienTichTamGiac(){
    return sqrt((chuViTamGiac()/2) * ((chuViTamGiac()/2) - canh_1) * ( (chuViTamGiac()/2) - canh_2) * ((chuViTamGiac()/2) - canh_3));
    }
}
