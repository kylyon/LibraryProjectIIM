import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bookshelf {
    private static int MAX_BOOK = 10;

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
        if (bookList.size() > 10)
        {
            throw new IllegalArgumentException("Trop de livre pour l'étagère ( Max : 10 )");
        }
        this.bookList = bookList;
    }

    public void addBook(Book book)
    {
        if (this.bookList.size() >= 10)
        {
            throw new IllegalArgumentException("Il n'y a plus de place sur l'étagère ( Max : 10 )");
        }
        this.bookList.add(book);
    }

    public int getNumberOfBook()
    {
        return this.bookList.size();
    }
}
