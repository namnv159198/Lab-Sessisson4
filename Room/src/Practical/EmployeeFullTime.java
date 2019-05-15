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
public class EmployeeFullTime extends SalaryPolicy{
public float rate;

public EmployeeFullTime (){

}
public EmployeeFullTime(float n){
this.rate = n;
}

    public EmployeeFullTime(float rate, float baseSalary) {
        this.baseSalary = baseSalary;
        this.rate = rate;
    }
EmployeeFullTime inputFT(){
    float a ,b;
    Scanner in = new Scanner (System.in);
    System.out.println("Input Salary Full Time : ");
    a = Float.parseFloat(in.nextLine());
    System.out.println("Input Base Salary Full Time : ");
    b = Float.parseFloat(in.nextLine());
    EmployeeFullTime es = new EmployeeFullTime(a,b);
    return es;
}
    @Override
void getSalary(){
        System.out.println("Salary = "+(rate*baseSalary));
    }
    
    
}
