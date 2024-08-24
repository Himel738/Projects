package com.mycompany.librarymanagementsystem;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class BookInfo {
    protected static Map<String,Integer> mp = new HashMap<>();
    
    static {
        mp.put("A", 2);
        mp.put("B", 5);
        mp.put("C", 5);
    }

   
    public static void printBookInfo() {
    StringBuilder bookInfo = new StringBuilder("<== Book Information ==>\n");
    for (Map.Entry<String, Integer> entry : mp.entrySet()) {
        bookInfo.append("Title: ").append(entry.getKey()).append(" | Quantity: ").append(entry.getValue()).append("\n");
    }
    JOptionPane.showMessageDialog(null, bookInfo.toString());
}

}
