package Models;

import java.util.ArrayList;
import java.util.List;
public class Main {
    static List<Book> book = new ArrayList<>();
    static List<Employee> empl = new ArrayList<>();
    static List<Customer> cus = new ArrayList<>();
    static List<Order> ord = new ArrayList<>();

    public static void main(String[] args) {
       initDat();
String bookInfo =
        String.format("Загальна кілбкість книг %d на суму %f", getOrderById() ,getAllPriceOfSoldBooks());
        System.out.println(bookInfo);
        System.out.println();
getTitleAndAuthorInfo();
    }

    public static void getTitleAndAuthorInfo() {
        for(Book book : book){
            System.out.println("Title" + book.getName());
            System.out.println("Author" + book.getAvtor());
        }
    }
    public static Book getBookById (long Id){
        Book current = null;
        for (Book b:book){
            if ( b.getNumber() == Id) {
                current = b;
                break;
            }
        }
        return current;
    }
    public static double getAllPriceOfSoldBooks(){
        double sale = 0;
        for(Order order : ord){
            sale += getPriceOfSoldBooksInOrder(order);
        }
        return sale;
    }
    public static double getPriceOfSoldBooksInOrder (Order order){
        double sale = 0;
        for(long bookId : order.getBook()){
            Book book = getBookById(bookId);
            if (book != null){
                sale += book.getSale();
            }
        }
        return sale;
    }
    public static int getOrderById (){
        int count = 0;
        for (Order order:ord){
           count += order.getBook().length;
        }
        return count;
    }
    public static void initDat() {
        //empl
empl.add(new Employee("Katy Perry", 1, 38));
        empl.add(new Employee("Lionel Messi", 2, 35));
        empl.add(new Employee("Elon Musk", 3, 51));
        //cus
        cus.add(new Customer("Pele", 1, 82));
        cus.add(new Customer("Isaac Newton", 2, 84));
        cus.add(new Customer("Buddha Shakyamuni", 3, 80));
        cus.add(new Customer("Confucius", 4, 72));
        cus.add(new Customer("John Lennon", 5, 40));
        //book
        book.add(new Book(1, "why nations fail", "Daron Acemoglu, James Robinson", 100, BookGenre.POLITICAL));
        book.add(new Book(2, "Harry Potter and the Goblet of Fire", "Rowling Joan", 450, BookGenre.FANTASY));
        book.add(new Book(3, "Winnie the Pooh", "Milne Alan Alexander", 600, BookGenre.FANTASY));
        book.add(new Book(4, "1", "1", 650, BookGenre.HORROR));
        book.add(new Book(5, "2", "2",100, BookGenre.ADVENTURE));
        book.add(new Book(6, "3", "3",250 , BookGenre.POLITICAL));
        book.add(new Book(7, "4", "4",1000 , BookGenre.DETEKTIVE));
        book.add(new Book(8, "5", "5",80 , BookGenre.HORROR));
        book.add(new Book(9, "6", "6", 6000, BookGenre.ADVENTURE));
        book.add(new Book(10, "7", "7", 400, BookGenre.DETEKTIVE));
        //ord
        ord.add(new Order(1, 1, 1, new long []{1,4}));
        ord.add(new Order(2, 2, 2, new long []{1,2,3,5,6}));
        ord.add(new Order(3, 3, 3, new long []{4}));
        ord.add(new Order(4, 4, 4, new long []{3,6,8}));
        ord.add(new Order(5, 5, 5, new long []{4,6,9,10}));
    }
}
