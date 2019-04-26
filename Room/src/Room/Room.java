/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Room {
    public String tenP;
    public String vt;
    public ArrayList <String> dsuser;
public Room(){
}
public Room(String tenP,String vt,ArrayList dsuser){
    this.tenP = tenP;
    this.vt = vt;
    this.dsuser = dsuser;
}
Room input(){
     String tenP;
     String vt;
     String x;
     int sl;
     ArrayList <String> dsuser = new ArrayList<>();
     Scanner in = new Scanner(System.in);
     System.out.println("Nhập tên phòng : ");
     tenP = in.nextLine();
     System.out.println("Nhập vị trí : ");
     vt = in.nextLine();
     System.out.println("Nhập số lượng người dùng : ");
     sl = in.nextInt();
     in.nextLine();
     for (int i = 1; i <= sl; i++) {
         System.out.println("Nhập người thứ " + i);
         x = in.nextLine();
         dsuser.add(x);
    }
       Room l = new Room(tenP,vt,dsuser);
      return l;
}
public void outPut(Room lb){
    System.out.println("Tên phòng       Vị trí        Ds người dùng");
    System.out.println(lb.tenP+"               " + lb.vt + "           " + lb.dsuser);
    
}
 Room  themUser(Room lb){
    String x;
    int sl;
    Scanner in = new Scanner(System.in);
    System.out.println("Nhập số lượng thêm người dùng :  ");
    sl = in.nextInt();
    in.nextLine();
    for (int i = 1; i <= sl; i++) {
         System.out.println("Nhập người thứ " + i);
         x=in.nextLine();
         lb.dsuser.add(x);
    }
    return lb;
}
 Room xoaUser(Room r){
      int t;
      Scanner in = new Scanner(System.in);
      System.out.println("Nhập vị trí xóa trong danh sách  người dùng :  ");     
      t = in.nextInt();
      r.dsuser.remove(t-1);
      return r;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Room p = new Room();
       p = p.input();
       p.outPut(p);
       p.themUser(p);
       p.outPut(p);
       p.xoaUser(p);
       System.out.println("Danh sách người dùng phòng " + p.tenP + " sau khi xóa là : " );
       p.outPut(p);
       
    }
    
}
