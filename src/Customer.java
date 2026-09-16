import java.util.List;

public class Customer {
    private static int CPT_CUSTOMER = 1;

    private int id;
    private String name;
    private String lastName;
    private List<Book> books;

    public Customer(int id, String name, String lastName, List<Book> book){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.books = book;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBook() {
        return books;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBook(List<Book> book) {
        this.books = book;
    }

    public void rent(Book book)
    {
        this.books.add(book);
        book.rented();
    }

    public void giveBack(Book book)
    {
        book.returned();
        this.books.remove(book);
    }

    public void hasLost(Book book)
    {
        book.lost();
        books.remove(book);
    }
}
