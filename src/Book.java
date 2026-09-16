public class Book {
    public static int numberBook;
    private static int CPT_BOOK = 1;

    private int id;
    private String title;
    private float price;
    private Author author;
    private DocumentState state;
    private String category;

    public Book(String title, float price, Author author, String category) {
        this.id = CPT_BOOK++;
        this.title = title;
        this.price = price;
        this.author = author;
        this.category = category;
        numberBook++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private void setState(DocumentState state)
    {
        this.state = state;
    }

    public void rented()
    {
        setState(DocumentState.RENTED);
    }

    public void returned()
    {
        setState(DocumentState.FREE);
    }

    public void lost()
    {
        setState(DocumentState.LOST);
    }

    @Override
    public String toString()
    {
        return this.title + " written by " + this.author.getName() + " - Price : " + this.price;
    }
}
