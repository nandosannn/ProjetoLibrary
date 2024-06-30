package entities;

import enums.StatusLoan;
public class Book {
    private String title;
    private String author;
    private Integer page;
    private StatusLoan status;
    private Loan loan;
    
    //Contructors
    public Book(){

    }

    public Book(String title, String author, Integer page, StatusLoan status) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.status = status;
    }

    //Encapsulators

    //Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Page
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    //Loan
    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    //Status
    public StatusLoan getStatus(){
        return status;
    }

    public void setStatus(StatusLoan status){
        this.status = status;
    }
}
