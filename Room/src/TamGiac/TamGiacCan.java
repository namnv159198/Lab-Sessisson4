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
public class TamGiacCan extends  TamGiac{
    
    public TamGiacCan(){
    
    }
    public void ktTamGiacCan(){
        if (ktTamGiac() == true && canh_1 == canh_2 || canh_2 == canh_3 || canh_1 == canh_2)  System.out.println("Tam giac can hop le !");
        else System.out.println("Khong hop le !");
    }
    
    
    public TamGiacCan(double canh_1, double canh_2, double canh_3){
    super(canh_1,canh_2,canh_3);
    }
}
