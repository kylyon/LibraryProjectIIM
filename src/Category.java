import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Category {
    public static int nbCategory = 0;
    private final UUID id;
    private String name;
    private List<Book> books;

    public Category(String name)
    {
        this.id = UUID.randomUUID();
        Category.nbCategory++;
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
