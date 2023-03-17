package Models;

public class Book {
    private long number;
    private String name;
    private String avtor;
    private int sale;
    private BookGenre genre;

    public Book(long number, String name, String avtor, int sale, BookGenre genre) {
        this.number = number;
        this.name = name;
        this.avtor = avtor;
        this.sale = sale;
        this.genre = genre;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}