package com.mycompany.librarymanagementsystem;

public class Total_Books extends BookInfo {
    
    public static int calculateTotalBooks() {
        int total = 0;
        for (int value : mp.values()) {
            total += value;
        }
        return total;
    }
}
