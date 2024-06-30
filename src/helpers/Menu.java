package helpers;

import java.util.ArrayList;
import java.util.List;
import entities.Book;
import services.BookManagement;
import java.util.Scanner;

public class Menu {
    public void mainMenu(){
        System.out.println("What the operation you wish make it?");
        System.out.println("1 - Book Managment");
        System.out.println("2 - User Registration");
        System.out.println("3 - Loans and Returns");
        System.out.println("4 - Fines");
        System.out.println("5 - Finish operation");
    }

    public void menuBook(){
        System.out.println("What the operation you wish make it?");
        System.out.println("1 - Book Registration");
        System.out.println("2 - Remove Book");
        System.out.println("3 - Finish Operation");
    }
}
