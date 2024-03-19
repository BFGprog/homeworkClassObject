public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Кэти", "Сиерра");
        Author author2 = new Author("Барри", "Берд");
        Book book1 = new Book("Head First Java", author1, 2003);
        Book book2 = new Book("Java For Dummies", author2, 2024);
        book1.setPublishYear(2006);

        System.out.println("First book: Name - " + book1.getName() + ", Author - "
                + author1.getAuthor() + ", Year of publication - " + book1.getPublishYear());
        System.out.println("Second book: Name - " + book2.getName() + ", Author - "
                + author2.getAuthor() + ", Year of publication - " + book2.getPublishYear());

        // Эксперимент
        System.out.println("First book: " + book1.getBook());
        System.out.println("Second book: " + book2.getBook());


    }
}