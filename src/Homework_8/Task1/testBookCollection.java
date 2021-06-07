package Homework_8.Task1;

import java.util.ArrayList;

public class testBookCollection {
    public static void main(String[] args) {
    }
    public ArrayList<Book> collectionBook(){
        ArrayList<Book> collectionBook= new ArrayList<>();
        collectionBook.add(new Book(1250, "Shantaram", "Soft", 864));
        collectionBook.add(new Book(755, "Jane Eyre", "Soft", 499));
        collectionBook.add(new Book(755, "1984", "Soft", 765));
        collectionBook.add(new Book(545, "Harry Potter and the Philosopher's Stone", "Hard", 341));
        collectionBook.add(new Book(741, "Harry Potter and the Chamber of Secrets", "Hard", 400));
        collectionBook.add(new Book(684, "Harry Potter and the Prisoner of Azkaban", "Hard", 951));
        collectionBook.add(new Book(719, "Harry Potter and the Goblet of Fire", "Hard", 301));
        collectionBook.add(new Book(698, "Harry Potter and the Order of the Phoenix", "Hard", 334));
        collectionBook.add(new Book(788, "Harry Potter and the Half-Blood Prince", "Hard", 478));
        collectionBook.add(new Book(1050, "Harry Potter and the Deathly Hallows", "Hard", 847));

        return collectionBook;
    }
}
