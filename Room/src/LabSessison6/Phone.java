/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSessison6;

/**
 *
 * @author namku
 */
public abstract class Phone {
    public abstract  void insertPhone(String name, String phone);
    public abstract  void removePhone(String name);
    public abstract  void updatePhone(String name, String newPhone);
    public abstract  void searchPhone(String name);
    public abstract void sort();

}
