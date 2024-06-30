package helpers;

import java.util.List;
import java.util.Scanner;

import entities.Book;

public class SecundaryMenus {
    
    //Menu Book Management
    public void menuMainBook(List<Book> books){
        System.out.print("\033c");
        int opcao;
        String inputOpcao;
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do{
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
                    System.out.println("Book Registration");
                    break;
                case 2:
                    System.out.println("Remove Book");
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
