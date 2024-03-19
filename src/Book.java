public class Book {
    private String name;
    private Author author;
    private int publishYear;
    private String book;

    public Book(String name, Author author, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;
        this.book = this.author + " " + this.name + " " + this.publishYear;
    }

    public String getName() {
        return this.name;
    }
    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    // Эксперимент
    public String getBook() {
        return this.book;
    }


}
