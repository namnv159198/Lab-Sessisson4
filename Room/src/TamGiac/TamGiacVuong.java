/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TamGiac;

import static java.lang.Math.pow;

/**
 *
 * @author namku
 */
public class TamGiacVuong extends TamGiac{
    public TamGiacVuong(){
    
    }
    public boolean ktTamGiacVuong(){
        if(ktTamGiac() == true && canh_1*canh_1 + canh_2*canh_2 == canh_3*canh_3 ||    canh_2*canh_2  + canh_3*canh_3 == canh_1*canh_1 || canh_1*canh_1 + canh_3*canh_3 == canh_2*canh_2  ) return true;
        else return false;
    }
    
    public TamGiacVuong(double canh_1, double canh_2, double canh_3){
    super(canh_1,canh_2,canh_3);
    }
    
}
