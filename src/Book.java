public class Book {
    private int id;
    private String title;
    private float price;
    private Author author;
    private DocumentState state;
    private Category category;
    private int numberBook;

    public Book() {}

    public Book(int id, String title, float price, Author author, Category category, int numberBook) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.category = category;
        this.numberBook = numberBook;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    private void setState(DocumentState state)
    {
        this.state = state;
    }

    public void rented()
    {
        setState(DocumentState.RENTED);
    }

    public void retrurned()
    {
        setState(DocumentState.FREE);
    }

    public void lost()
    {
        setState(DocumentState.LOST);
    }
}
