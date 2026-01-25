package Streams.intermediate;

public class Book {
    String title;
    double price;
    int publicationYear;
    String category;

    public Book(String title, double price, int publicationYear, String category) {
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", category='" + category + '\'' +
                '}';
    }
}
