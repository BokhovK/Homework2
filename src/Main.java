import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Author blok = new Author("Александр", "Блок");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book skif = new Book("Скиф", 1918, blok);
        Book igrok = new Book("Игрок", 1866, dostoevsky);

        print(skif);
        print(igrok);
    }

    public static void print(Book book) {
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() +
                        ", название: " + book.getTitle() + ", год издания: " + book.getYear());
    }

}





