/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TamGiac;

/**
 *
 * @author namku
 */
public class Main {
    public static void main(String[] args) {
        TamGiac tg = new TamGiac();
        TamGiacCan tgc = new TamGiacCan();
        TamGiacVuong tgv = new TamGiacVuong();
        TamGiacDeu tgd = new TamGiacDeu();
        System.out.println(" ----------------------------- Tam giac -----------------------------");
        tg.khaiBaoTamGiac();
        System.out.println("C = " + tg.chuViTamGiac());
        System.out.println("S = " + tg.dienTichTamGiac());
        System.out.println(" ----------------------------- Tam giac Can -----------------------------");
        tgc.khaiBaoTamGiac();
        tgc.ktTamGiacCan();
        System.out.println("Chu vi tam giac can = " + tgc.chuViTamGiac());
        System.out.println("Dien tich tam giac can  = " + tgc.dienTichTamGiac());
        do {            
         System.out.println(" ----------------------------- Tam giac vuong -----------------------------");
        tgv.khaiBaoTamGiac();
        if (tgv.ktTamGiacVuong() == true) {
        System.out.println("Chu vi tam giac vuong = " + tgv.chuViTamGiac());
        System.out.println("Dien tich tam giac vuong  = " + tgv.dienTichTamGiac());
        }else System.out.println("Khong hop le ! Xin nhap lai");
        } while (tgv.ktTamGiacVuong() == false);
        do {            
         System.out.println(" ----------------------------- Tam giac deu -----------------------------");
        tgd.khaiBaoTamGiac();
        if (tgd.ktTamGiacDeu() == true) {
        System.out.println("Chu vi tam giac vuong = " + tgd.chuViTamGiacDeu());
        System.out.println("Dien tich tam giac vuong  = " + tgd.dienTichTamGiac());
        }else System.out.println("Khong hop le ! Xin nhap lai");
        } while (tgd.ktTamGiacDeu() == false);

        
    }
}
