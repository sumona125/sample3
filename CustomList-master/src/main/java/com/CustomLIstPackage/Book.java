/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CustomLIstPackage;

/**
 *
 * @author acer
 */
public class Book {
    String Authorname;
    String name;
    int isbnno;
    String publish_date;
    int price;
    public Book(String Authorname, String name, int isbnno, String publish_date, int price) {
        this.Authorname = Authorname;
        this.name = name;
        this.isbnno = isbnno;
        this.publish_date = publish_date;
        this.price = price;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public void setAuthorname(String Authorname) {
        this.Authorname = Authorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbnno() {
        return isbnno;
    }

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "Authorname=" + Authorname + ", name=" + name + ", isbnno=" + isbnno + ", publish_date=" + publish_date + ", price=" + price + '}';
    }
    
    
}
