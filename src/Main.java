//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Tolkien", "JRR");

        Book lotr = new Book("The Lord of the Ring", 10.99f, tolkien, "Fantasy" );
    }
}