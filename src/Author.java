import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Author {
    private final UUID id;
    private String name;
    private String firstname;
    private List<Book> books;

    public Author(String name, String firstname)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.firstname = firstname;
        this.books = new ArrayList<Book>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void hasWritten(Book book)
    {
        books.add(book);
    }
}
