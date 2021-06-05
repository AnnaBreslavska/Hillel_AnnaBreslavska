package Homework_8.Task1;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(1250, "Shantaram", "Soft", 864));
        bookCollection.add(new Book(755, "Jane Eyre", "Soft", 499));
        bookCollection.add(new Book(755, "1984", "Soft", 765));
        bookCollection.add(new Book(545, "Harry Potter and the Philosopher's Stone", "Hard", 341));
        bookCollection.add(new Book(741, "Harry Potter and the Chamber of Secrets", "Hard", 400));
        bookCollection.add(new Book(684, "Harry Potter and the Prisoner of Azkaban", "Hard", 951));
        bookCollection.add(new Book(719, "Harry Potter and the Goblet of Fire", "Hard", 301));
        bookCollection.add(new Book(698, "Harry Potter and the Order of the Phoenix", "Hard", 334));
        bookCollection.add(new Book(788, "Harry Potter and the Half-Blood Prince", "Hard", 478));
        bookCollection.add(new Book(1050, "Harry Potter and the Deathly Hallows", "Hard", 847));

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();


        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getCoverType().equals("Soft")) {
                booksWithSoftCover.add(bookCollection.get(i));
            } else {
                booksWithHardCover.add(bookCollection.get(i));
            }
        }

        System.out.println("Все книги в магазине: ");
        bookCollection.forEach(x -> System.out.println(x.getTitle()));
        System.out.println("В магазине есть след. книги в мягком переплете: ");
        booksWithSoftCover.forEach(x -> System.out.println(x.getTitle()));
        System.out.println("В магазине есть след. книги в твердом переплете");
        booksWithHardCover.forEach(x -> System.out.println(x.getTitle()));
    }
}
