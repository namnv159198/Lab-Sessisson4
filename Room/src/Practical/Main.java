/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical;

/**
 *
 * @author namku
 */
public class Main {
    public static void main(String[] args) {
    EmployeeFullTime FT = new EmployeeFullTime();
    EmployeePartime PT  = new EmployeePartime();
    FT = FT.inputFT();
    FT.getSalary();
    PT = PT.inputPT();
    PT.getSalary();
    }

}
