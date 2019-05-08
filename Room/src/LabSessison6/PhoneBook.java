/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSessison6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class PhoneBook extends Phone{
    public ArrayList <phoneNumber> PhoneList = new ArrayList<phoneNumber>();
    
    
    @Override
    public void insertPhone(String name , String phone){
        boolean b = false;
        for (int i = 0; i < PhoneList.size(); i++) {
            if (name.equals(PhoneList.get(i).name)) {
                if (phone.equals(PhoneList.get(i).phone)) {
                    System.out.println("So dien thoai da ton tai !");
                }
                else  { 
                PhoneList.get(i).phone = PhoneList.get(i).phone + " : " + phone;
                }
                b = true;
                break;
            }
        }
        if (!b) {
            System.out.println("\nChua ton tai nguoi dung va so dien thoai");
                phoneNumber p1 = new phoneNumber(name,phone);
                PhoneList.add(p1);
                System.out.println("Them nguoi dung : " + name + " - so dien thoai : " +phone + " thanh cong ! \n");
        }
        
    }
    public void outPut(){
                     System.out.println("--------------------Danh sach thue bao nguoi dung------------------------------ ");
                    System.out.println("Name" + "             |          "+"Phone"  );
        for (int i = 0; i < PhoneList.size(); i++) {
//            System.out.println("Name : " +PhoneList.get(i).name + " - " + "Phone : "+PhoneList.get(i).phone);
            System.out.println(PhoneList.get(i).name+ "              |          "+PhoneList.get(i).phone);
        }
        
    }
    
    
    
 
    @Override
    public void removePhone(String name){
        boolean b = false;
        for(int i = 0; i < PhoneList.size(); i++){
        if(name.equals(PhoneList.get(i).name)) {
        PhoneList.remove(i);
        System.out.println("Xoa thue bao : "+name+" - thanh cong !");
        b = true;
        break;
            }
        }
        if (!b) {
            System.out.println("Không thể xóa thuê bao ("+name+") không có trong danh sách ! " );
        }
        

    }
    @Override
    public void sort(){
        for (int i = 0; i < PhoneList.size(); i++) {
            for (int j = i+1; j < PhoneList.size(); j++) {
                if (PhoneList.get(i).name.compareTo(PhoneList.get(j).name)>0) {
                    String x  = PhoneList.get(i).name;
                    String y = PhoneList.get(i).phone;
                    PhoneList.get(i).name = PhoneList.get(j).name;
                    PhoneList.get(i).phone = PhoneList.get(j).phone;
                    PhoneList.get(j).name = x;
                    PhoneList.get(j).phone = y;
                }
            }
        }
        System.out.println("--------------------Danh sach thue bao sau khi đã sắp xếp theo tên nguoi dung------------------------------ ");
                    System.out.println("Name" + "             |          "+"Phone"  );
        for (int i = 0; i < PhoneList.size(); i++) {
//            System.out.println("Name : " +PhoneList.get(i).name + " - " + "Phone : "+PhoneList.get(i).phone);
            System.out.println(PhoneList.get(i).name+ "              |          "+PhoneList.get(i).phone);
        }
    }
    @Override
    public void updatePhone(String name, String newPhone){
        boolean b = false;
        String x;
    for(int i = 0; i < PhoneList.size(); i++){
        if(name.equals(PhoneList.get(i).name)) {
            x = PhoneList.get(i).phone;
            PhoneList.get(i).phone =  newPhone;
            System.out.println("Cập nhật thuê bao ("+PhoneList.get(i).name+" ) : "+x+" -> "+newPhone);
            b = true;
            break;
            }
        }
        if (!b) {
            System.out.println("Không thể cập nhật thuê bao ("+name+") khi không có trong danh sách ! " );
        }
    }
    @Override
    public void searchPhone(String name){
        boolean b = false;
        for(int i = 0; i < PhoneList.size(); i++){
        if(name.equals(PhoneList.get(i).name)) {
               System.out.println("Thông tin tìm kiếm thuê bao ( "+name+" ) là : ");
               System.out.println("Name" + "             |          "+"Phone"  );
               System.out.println(PhoneList.get(i).name + "              |          "+PhoneList.get(i).phone);
               b=true;
               break;
            }
        }
        if(!b)   System.out.println("Không thể tìm thấy thông tin thuê bao ("+name+") khi không có trong danh sách ! " );
            
    }
    
    public static void main(String[] args) {
       PhoneBook p  = new PhoneBook();
       phoneNumber pn = new phoneNumber("nam", "0963404604");
       phoneNumber pn1 = new phoneNumber("an", "0963404568");
       phoneNumber pn2 = new phoneNumber("hoa", "026512458");
       p.PhoneList.add(pn);
       p.PhoneList.add(pn1);
       p.PhoneList.add(pn2);
       p.outPut();
       p.insertPhone("hoa", "0964121454");
       p.outPut();
       p.insertPhone("quang", "06584587");
       p.outPut();
//       p.insertPhone("Ha", "0123454789");
//       p.outPut();
       p.removePhone("binh");
       p.updatePhone("nam", "0965214157");
       p.outPut();
//       p.updatePhone("hoa", "0965214157");
//       p.outPut();
       p.searchPhone("binh");
       p.outPut();
       p.sort();
    }
    
}
