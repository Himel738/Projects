package com.mycompany.librarymanagementsystem;

import static com.mycompany.librarymanagementsystem.BookInfo.printBookInfo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LibraryManagementSystem {
    
    private JFrame frame;
    private JButton displayButton;
    private JButton addButton;
    private JButton totalButton;
    private JButton issueButton;
    
    public LibraryManagementSystem()
    {
        frame = new JFrame("Library Management System"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayButton = new JButton("Display Book Information");
        //displayButton.setBackground(Color.MAGENTA);
        addButton = new JButton("Add New Book");
        totalButton = new JButton("Display Total Number of Books");
        issueButton = new JButton("Issue a Book");
        
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookInfo.printBookInfo();
            }
        });
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = JOptionPane.showInputDialog(frame, "Enter book name:");
                addbook.AddBook(book);
            }
        });
        
         totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalBooks = Total_Books.calculateTotalBooks();
                JOptionPane.showMessageDialog(frame, "Total number of books: " + totalBooks);
            }
        });
         
          issueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookName = JOptionPane.showInputDialog(frame, "Enter book name to issue:");
                Issue_Book.issue_book(bookName);
            }
        });
          
        frame.setLayout(new GridLayout(4, 1));
        frame.add(displayButton);
        frame.add(addButton);
        frame.add(totalButton);
        frame.add(issueButton);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);

        //frame.pack();
        frame.setVisible(true);
    }

    private void addBook(String book) {
        if (book != null && !book.isEmpty()) {
            addbook.AddBook(book);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid book name!");
        }
    }
    
public static void main(String[] args) {
        
        Login loginFrame = new Login();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                loginFrame.setVisible(true);
            }
        });
        
        // After successful login, show the library management system frame
        loginFrame.setLoginListener(new LoginListener() {
            @Override
            public void onLoginSuccess() {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new LibraryManagementSystem().setVisible(true);
                    }
                });
            }
        });
    }
    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
