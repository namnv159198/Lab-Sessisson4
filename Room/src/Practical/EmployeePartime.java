/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class EmployeePartime extends SalaryPolicy{
public float rate;

    public EmployeePartime(float rate) {
        this.rate = rate;
    }
     public EmployeePartime(float rate,float b) {
        this.rate = rate;
        this.baseSalary = b;
    }
    public EmployeePartime (){
    }
    @Override
    void getSalary(){
        System.out.println("Salary = "+(rate*baseSalary));
    }
    EmployeePartime inputPT(){
    float a,b ;
    Scanner in = new Scanner (System.in);
    System.out.println("Input Salary Partime : ");
    a = Float.parseFloat(in.nextLine());
    System.out.println("Input Base Salary Partime : ");
    b = Float.parseFloat(in.nextLine());
    EmployeePartime es = new EmployeePartime(a,b);
    return es;
}

    
    
}
