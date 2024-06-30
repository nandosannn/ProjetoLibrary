package entities;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String cpf;
    private String nome;
    List<Book> booksUser = new ArrayList<>();
    
    //Contructors
    public User(){

    }
    
    public User(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }


    //Encapsulators
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Methods
    public void insertBooksUser(Book book){
        booksUser.add(book);
    }
}
