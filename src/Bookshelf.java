import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bookshelf {
    private final UUID id;
    private int row;
    private List<Book> bookList;

    public Bookshelf(int row)
    {
        this.id = UUID.randomUUID();
        this.row = row;
        this.bookList = new ArrayList<Book>();
    }

    public UUID getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book)
    {
        this.bookList.add(book);
    }

    public int getNumberOfBook()
    {
        return this.bookList.size();
    }
}
