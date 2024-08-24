package com.mycompany.librarymanagementsystem;

public class addbook extends BookInfo {
    public static void AddBook(String book)
    {
        addbook [] objects = new addbook[5];
        for(int i =0; i < 5; i++)
        {
            
        }
        if(mp.containsKey(book)==true)
        {
            mp.put(book,mp.get(book) + 1);
        }
        else{
            mp.put(book,1);
        }
            
    }
    
}
