/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author namku
 */
public class Student {
    public int ID;
    public String name,age,address;
    public float gpa;
    public ArrayList <Student> studentsList = new ArrayList<Student>();
    Scanner in = new Scanner (System.in);
    public Student(){
    
    }
    public Student(int ID, String name, String age, String address, float gpa) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    Student inPut(){
    Scanner in = new Scanner (System.in);
     int ID;
    String name,age,address;
     float gpa;
     boolean b = true;
     System.out.println("Nhập ID : ");
            ID = Integer.parseInt(in.nextLine());
//      while (b){
//            System.out.println("Nhập ID : ");
//            ID = Integer.parseInt(in.nextLine());
//            try {
//                Integer.parseInt(ID);
//            } catch (NumberFormatException e) {
//                System.out.println("Dữ liệu nhập vào không phải kiểu số");
//            }
//    }
        System.out.println("Nhập tên sinh viên : ");
        name = in.nextLine();
        System.out.println("Nhập tuổi : ");
        age = in.nextLine();
        System.out.println("Nhập địa chỉ : ");
        address = in.nextLine();
        System.out.println("Nhập điểm trung bình : ");
        gpa = Float.parseFloat(in.nextLine());
        Student t = new Student(ID, name, age, address, gpa);
        return t;
    }
    public void addStudent (){
        Student t = new Student();
        int sl;
        System.out.println("Nhập số lượng sinh viên muốn thêm vào : ");
        sl = in.nextInt();
        for (int i = 0; i < sl; i++) {
             t = t.inPut();
             studentsList.add(t);   
        }
    }
    public void EditStudent(){
       int ID,c,k;
       boolean b = true;
        do {            
            System.out.println("Nhập ID sinh viên : ");
        ID = in.nextInt();
        for (int i = 0; i < studentsList.size(); i++) {
            if(ID == studentsList.get(i).ID){
                do {                    
                    System.out.println("\n------------------------Chỉnh sửa thông tin sinh viên------------------------");
                    System.out.println("1.Sửa ID sinh sinh viên");
                    System.out.println("2.Sửa Tên sinh sinh viên");
                    System.out.println("3.Sửa Tuổi sinh sinh viên");
                    System.out.println("4.Sửa Địa chỉ sinh sinh viên");
                    System.out.println("5.Sửa Điểm trung bình sinh sinh viên");
                    System.out.println("0.Thoát chỉnh sửa");
                    do {            
            System.out.println("Nhập các số để chọn từng chức năng chỉnh sửa  (1/2/3/4/5/0) : ");
            c = in.nextInt();
            if (c < 0 || c > 5) {
                System.out.println("Nhập sai ! xin hãy nhập lại");
            }
        } while (c < 0 || c > 6);
                    switch (c){
                    case 1:
                        System.out.println("Bạn đã chọn chức năng sửa ID !");
                        do {          
                            System.out.println("Vui lòng nhập ID cũ : ");
                             k  = in.nextInt();
                        if(k == studentsList.get(i).ID){
                            System.out.println("ID hợp lệ");
                            System.out.println("Vui lòng nhập ID mới :");
                            int h = in.nextInt();
                            studentsList.get(i).ID = h;
                            System.out.println("Thay đổi ID hành công !");
                        }else System.out.println("ID không hợp lệ ! vui lòng nhập lại !");
                        } while (k == studentsList.get(i).ID);
                       break;
                       case 2: 
                           System.out.println("Bạn đã chọn chức năng sửa tên !");
                           System.out.println("Vui lòng nhập tên mới :");
                           in.nextLine();
                           String v = in.nextLine();
                           studentsList.get(i).name = v;
                           System.out.println("Thay đổi tên thành công");
                           break;
                        case 3: 
                           System.out.println("Bạn đã chọn chức năng sửa tuổi !");
                           System.out.println("Vui lòng nhập tuổi mới :");
                           in.nextLine();
                           String y = in.nextLine();
                           studentsList.get(i).age = y;
                           System.out.println("Thay đổi tuỏi thành công");
                           break;
                        case 4: 
                           System.out.println("Bạn đã chọn chức năng sửa địa chỉ !");
                           System.out.println("Vui lòng nhập địa chỉ mới :");
                           in.nextLine();
                           String j = in.nextLine();
                           studentsList.get(i).address = j;
                           System.out.println("Thay đổi địa chỉ thành công");
                           break;
                        case 5: 
                           System.out.println("Bạn đã chọn chức năng sửa điểm trung bình !");
                           System.out.println("Vui lòng nhập điểm trung bình mới :");
                           float x = in.nextFloat();
                           studentsList.get(i).gpa = x;
                           System.out.println("Thay đổi điểm thành công");
                           break;
                        case 0 :
                            System.out.println("Bạn đã thoát chức năng chỉnh sửa ! tạm biệt ");
                            continue;
                    }
                } while (c != 0 );
                b = true;
                break;
        
            }
        }
        if(b) System.out.println("ID sinh viên  không có trong danh sách ! Hãy nhập lại");
        } while (b);
    
    }
    public void deleteStudent(){
       int ID;
       boolean b = true;
        do {            
            System.out.println("Nhập ID sinh viên : ");
        ID = in.nextInt();
        for (int i = 0; i < studentsList.size(); i++) {
            if(ID == studentsList.get(i).ID){
                studentsList.remove(i);
                System.out.println("Đã xóa thông tin sinh viên ID : "+ID +" trong danh sách !");
                b= false;
                break;
            }
        }
        if(b) System.out.println("ID sinh viên  không có trong danh sách ! Hãy nhập lại");
        }while (b);            
    }
    public void sortStudentGpa(){
Collections.sort(studentsList, new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.gpa, o2.gpa);
            }
        });
        
    }
    public void sortStudentName(){
        Collections.sort(studentsList, new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    
    }
    public void showStudentList(){
        System.out.println("------------------------- Danh sách thông tin sinh viên -------------------------");

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("STT ("+(i+1)+") | "+"ID : ("+studentsList.get(i).ID+") | "+"Name : ("+studentsList.get(i).name+") | "
            +"Age : ("+studentsList.get(i).age+") | "+"Adress : ("+studentsList.get(i).address+") | "+"GPA : ("+studentsList.get(i).gpa+")");
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner (System.in);
        Student t = new Student();
        do {            
        System.out.println("\n-------------------------Menu-------------------------");
        System.out.println("1.Add Student");
        System.out.println("2.Edit Student by ID");
        System.out.println("3.Delete Student by ID");
        System.out.println("4.Sort student by gpa");
        System.out.println("5.Sort student by name");
        System.out.println("6.Show student");
        System.out.println("0.Exit");
        do {            
            System.out.println("Nhập các số để chọn từng chức năng (1/2/3/4/5/6/0) : ");
            choice = in.nextInt();
            if (choice < 0 || choice > 6) {
                System.out.println("Nhập sai ! xin hãy nhập lại");
            }
        } while (choice < 0 || choice > 6);           
            switch (choice){
        case 1:
            System.out.println("Bạn đã chọn chức năng thêm sinh viên ");
            t.addStudent();
            break;
        case 2 :
            System.out.println("Bạn đã chọn chức năng sửa thông tin sinh viên bằng ID");
            t.EditStudent();
            break;
        case 3 :
            System.out.println("Bạn đã chọn chức năng xóa thông tin sinh viên bằng ID ");
            t.deleteStudent();
            break;
        case 4 :
            System.out.println("Bạn đã chọn chức năng sắp xếp thông tin sinh viên theo điểm trung bình ");
            t.sortStudentGpa();
            t.showStudentList();
            break;
        case 5 :
            System.out.println("Bạn đã chọn chức năng sắp xếp thông tin sinh viên theo tên  ");
            t.sortStudentName();
            t.showStudentList();
            break;
        case 6:
            System.out.println("Bạn đã chọn chức năng hiển thị danh sách sinh viên ");
            t.showStudentList();
            break;
        case 0 :
               System.out.println("Bạn đã chọn chức năng thoát chương trình ! Tạm biệt");
               System.exit(0);
               break;
        }
            
        } while (choice != 0);

    }
    
    
    
}
