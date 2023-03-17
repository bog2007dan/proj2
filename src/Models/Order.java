package Models;

public class Order {
    private long Number;
    private long NumEmpl;
    private long NumCus;
    private long [] book;

    public Order(long number, long numEmpl, long numCus, long[] book) {
        Number = number;
        NumEmpl = numEmpl;
        NumCus = numCus;
        this.book = book;
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }

    public long getNumEmpl() {
        return NumEmpl;
    }

    public void setNumEmpl(long numEmpl) {
        NumEmpl = numEmpl;
    }

    public long getNumCus() {
        return NumCus;
    }

    public void setNumCus(long numCus) {
        NumCus = numCus;
    }

    public long[] getBook() {
        return book;
    }

    public void setBook(long[] book) {
        this.book = book;
    }
}
