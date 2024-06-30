package entities;

import java.time.LocalDate;

public class Loan {
    private LocalDate loanDate;
    private LocalDate returnDate;
    
    //Constructors
    public Loan(){

    }
    
    public Loan(LocalDate loanDate, LocalDate returnDate) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    //Encapsulators
    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
