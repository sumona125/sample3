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
public class Main {

    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();

        
        list.add("nisha");
        list.add("Mita");
        list.add("Sunny");
        System.out.println(list);

        CustomList<String> list2 = new CustomList<>();
        list2.add("hh");
        list2.add("aa");
        list2.addAll(list);
        System.out.println(list2);
        list2.removeAll(list);
        System.out.println(list2);
        
        list.remove(2);
        System.out.println(list);

       
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        
        System.out.println(list.size());

        CustomList<Book> list3 = new CustomList<>();
        list3.add(new Book("Wings", "nnn", 1222222222, "2-8-18", 500));
        list3.add(new Book("Blink", "gggg", 366673322, "3-4-18", 700));
        System.out.println(list3);
        CustomList<Book> list4 = new CustomList<>();
        list4.add(new Book("kakatua", "rahim", 1234567890, "7-2-18", 900));
        list4.add(new Book("jjjjjlin", "Jubin", 1342567980, "17-4-18", 1000));
        list3.addAll(list4);
        
        System.out.println(list3);
        list3.removeAll(list4);
        System.out.println(list3);
        list3.clear();
        System.out.println(list3);
         System.out.println(list3.size());
    }
}
