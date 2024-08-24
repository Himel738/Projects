package com.mycompany.librarymanagementsystem;

import javax.swing.JOptionPane;

public class Issue_Book extends BookInfo {
    
    public static void issue_book(String bookname)
    {
        
        if(mp.containsKey(bookname)==true)
        {
            if(mp.put(bookname,mp.get(bookname))==0)
            {
               JOptionPane.showMessageDialog(null,"Book Is Not Available Right Now"); 
            }
            else
            {
                
            mp.put(bookname,mp.get(bookname) - 1);
            
            }
        }  
      else
      {
          JOptionPane.showMessageDialog(null,"Book Is Not Available Right Now");
      }
    }
}
