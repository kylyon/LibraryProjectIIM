import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String lastName;
    private List<Book> book;

    public Customer(){};

    public Customer(int id, String name, String lastName, List<Book> book){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.book = book;
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
        return book;
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
        this.book = book;
    }
}
