package services;

import entities.Book;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import enums.StatusLoan;

public class BookManagement {
    //Methods
    public void insertBookAll(List<Book> booksAll){
        String title;
        String author;
        Integer page;
        StatusLoan status = StatusLoan.AVAILABLE;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the title of the book: ");
        title = input.nextLine();
        System.out.printf("Enter the author of the book: ");
        author = input.nextLine();
        System.out.printf("Enter the number of pages the book: ");
        page = input.nextInt();

        Book book = new Book(title, author, page, status);

        booksAll.add(book);

    }

    public void removeBookAll(List<Book> bookAll){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the title of book that you whish remove: ");
        String title = input.nextLine();
        System.out.printf("Enter the author of book that you whish remove: ");
        String author = input.nextLine();

        Book auxBook = new Book();
        boolean find = false;

        for(Book books : bookAll){
            if(books.getTitle().equals(title) && books.getAuthor().equals(author)){
                auxBook = books;
                find = true;
            }
        }
        if (find) {
            bookAll.remove(auxBook);
        }
    }
}
