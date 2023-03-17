package Shopbook;

public class Book {
    private Long number;
    private String name;
    private String avtor;
    private String sale;
    private String genre;

    public Book(Long number, String name, String avtor, String sale, String genre) {
        this.number = number;
        this.name = name;
        this.avtor = avtor;
        this.sale = sale;
        this.genre = genre;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
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

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
