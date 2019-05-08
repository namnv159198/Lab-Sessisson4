/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment6;

import java.util.ArrayList;

/**
 *
 * @author namku
 */

public class News implements INews{
    
    
    public int ID;
    public String title,PublishDate,Author ,Content;
    public float AverageRate ;
    public ArrayList <RateNumber>RateList = new ArrayList<RateNumber>();
    
    public News(){
    
    }
   
    public News(int ID, String title, String PublishDate, String Author, String Content) {
        this.ID = ID;
        this.title = title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
    }
    

    
@Override
    public void display(){
        System.out.println("----------- Information New -----------");
        System.out.println("ID : "+ID);
        System.out.println("Title : " + title);
        System.out.println("PublishDate :"+PublishDate);
        System.out.println("Author : "+Author);
        System.out.println("Content : "+Content);
        System.out.printf("AverageRate : %.2f",AverageRate);
        System.out.println();
    }
    
    public void Calculate(){
        for (int i = 0; i < RateList.size(); i++) {
            AverageRate = AverageRate + RateList.get(i).a + RateList.get(i).b + RateList.get(i).c;
        }
        AverageRate = AverageRate/3;
    }
    public float getAverageRate() {
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    
    public static void main(String[] args) {
        News n = new News(1,"B1","20-03-2019","NAM","Cuc sì ngầu ông bê lắp");
        RateNumber r = new RateNumber(3,2,3);
        n.RateList.add(r);
        n.Calculate();
        n.display();
        
    }
}
