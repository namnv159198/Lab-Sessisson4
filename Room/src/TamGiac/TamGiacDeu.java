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
public class TamGiacDeu extends  TamGiacCan{
    public TamGiacDeu(){
    
    }
    public boolean ktTamGiacDeu(){
        if(canh_1 == canh_2 && canh_2 == canh_3)return true;
        else return false;
    }
    public double chuViTamGiacDeu(){
    return canh_1*3;
    }
    public TamGiacDeu(double canh_1, double canh_2, double canh_3){
    super(canh_1,canh_2,canh_3);
    }
}
