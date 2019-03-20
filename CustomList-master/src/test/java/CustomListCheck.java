
import com.CustomLIstPackage.Book;
import com.CustomLIstPackage.CustomList;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class CustomListCheck {
  @Test 
    public void method() {
       CustomList<Book> list = new CustomList<>();
       list.add(new Book("Wings", "nnn", 1222222222, "2-8-18", 500));
       list.add(new Book("Blink", "gggg", 366673322, "3-4-18", 700));
       //System.out.println(list);
       CustomList<Book> list4 = new CustomList<>();
       list4.add(new Book("kakatua", "rahim", 1234567890, "7-2-18", 900));
       list4.add(new Book("jjjjjlin", "Jubin", 1342567980, "17-4-18", 1000));
       list.addAll(list4);
       
       assertTrue(list.get(0).getAuthorname().equals("Wings"));
       assertTrue(list.get(2).getAuthorname().equals("kakatua"));
       list.remove(1);
       assertTrue(list.get(1).getAuthorname().equals("kakatua"));
       list.removeAll(list4);
        assertTrue(1==list.size());
       
        list.clear();
        assertTrue(0==list.size());
       
      
        
    }
}
