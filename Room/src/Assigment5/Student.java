/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment5;

/**
 *
 * @author namku
 */
import java.util.Calendar;
import  java.util.Date;
public class Student extends  Person{
    public Student(){
    
    }
    public Student(String name, String gioiTinh, String ngaySinh, String diaChi) {
        super(name, gioiTinh, ngaySinh, diaChi);
    }
    public void ktTuoi(Student st){
     Calendar date = Calendar.getInstance();
     int yearNow = date.get(Calendar.YEAR);
     int i = Integer.parseInt(st.nam);
    if( yearNow - i >= 18) System.out.println("Du 18 tuoi ");
    else System.out.println("Khong du 18 tuoi");
    }
}
