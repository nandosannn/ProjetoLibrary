package helpers;

import java.util.List;
import java.util.Scanner;


import entities.Book;
import services.BookManagement;

public class SecundaryMenus {
    
    //Menu Book Management
    public void menuMainBook(List<Book> books){
        System.out.print("\033c");
        
        int opcao;
        String inputOpcao;
        Scanner input = new Scanner(System.in);
        
        Menu menu = new Menu();
        BookManagement bookManagement = new BookManagement();


        do{
            System.out.print("\033c");
            menu.menuBook();
            inputOpcao = input.nextLine();

            try {
                opcao = Integer.parseInt(inputOpcao);
            } catch (Exception e) {
                System.out.println("You have to enter a number");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\033c");
                    
                    System.out.println("Book Registration");
                    bookManagement.insertBookAll(books);
                    break;
                case 2:
                    System.out.print("\033c");

                    System.out.println("Remove Book");
                    bookManagement.removeBookAll(books);
                    break;
                case 3:
                    System.out.println("Finish Operation");
                    System.out.print("\033c");
                    break;
                default:
                    System.out.println("Option Invalidet");
                    System.out.print("\033c");
                    break;
            }

        }while(opcao != 3);
    }
}
