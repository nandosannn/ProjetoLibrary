package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


import entities.Book;
import entities.Loan;
import entities.User;
import helpers.Menu;
import helpers.SecundaryMenus;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        List<Book> books = new ArrayList<>();
        List<User> users = new ArrayList<>();
        
        Menu menu = new Menu();
        SecundaryMenus menuSecundary = new SecundaryMenus();

        int opcao;

        System.out.println("Welcome to Edo Collections Management!");
        System.out.println("=======================================");
        System.out.println();

        do{
            menu.mainMenu();
            String opcaoMainMenu = input.nextLine();
            
            try {
                opcao = Integer.parseInt(opcaoMainMenu);
            } catch (Exception e) {
                System.out.println("You have to enter a number");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\033c");
                    menuSecundary.menuMainBook(books);
                    break;
                case 2:
                    System.out.print("\033c");
                    System.out.println("User Registration");
                    break;
                case 3:
                    System.out.print("\033c");
                    System.out.println("Loans and Returns");
                    break;
                case 4:
                    System.out.print("\033c");
                    System.out.println("Fines");
                    break;
                case 5:
                    System.out.print("\033c");
                    System.out.println("Finish operation");
                    break;
                default:
                    System.out.print("\033c");
                    System.out.println("Option Invalidet");
                    break;
            }
        } while(opcao != 5);
        
        for (Book all : books){
            System.out.println(all.getTitle()+ " - " + all.getAuthor());
        }

        for (User all : users){
            System.out.println(all.getCpf());
        }
    }
}
