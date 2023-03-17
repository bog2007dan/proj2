package Shopbook;

public class Order {
    private Long Number;
    private Long NumEmpl;
    private Long NumCus;
    private Long ListBook;

    public Order(Long number, Long numEmpl, Long numCus, Long listBook) {
        Number = number;
        NumEmpl = numEmpl;
        NumCus = numCus;
        ListBook = listBook;
    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }

    public Long getNumEmpl() {
        return NumEmpl;
    }

    public void setNumEmpl(Long numEmpl) {
        NumEmpl = numEmpl;
    }

    public Long getNumCus() {
        return NumCus;
    }

    public void setNumCus(Long numCus) {
        NumCus = numCus;
    }

    public Long getListBook() {
        return ListBook;
    }

    public void setListBook(Long listBook) {
        ListBook = listBook;
    }
}
