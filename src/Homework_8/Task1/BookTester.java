package Homework_8.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookTester {
    public static void main(String[] args) {
        Book Book = new Book();

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add( new Book(1250, "Shantaram", "Soft", 864) );
        bookCollection.add( new Book(755, "Jane Eyre", "Soft", 499) );
        bookCollection.add( new Book(755, "1984", "Soft", 765) );
        bookCollection.add( new Book(545, "Harry Potter and the Philosopher's Stone", "Hard", 341) );
        bookCollection.add( new Book(741, "Harry Potter and the Chamber of Secrets", "Hard", 400) );
        bookCollection.add( new Book(684, "Harry Potter and the Prisoner of Azkaban", "Hard", 951) );
        bookCollection.add( new Book(719, "Harry Potter and the Goblet of Fire", "Hard", 301) );
        bookCollection.add( new Book(698, "Harry Potter and the Order of the Phoenix", "Hard", 334) );
        bookCollection.add( new Book(788, "Harry Potter and the Half-Blood Prince", "Hard", 478) );
        bookCollection.add( new Book(1050, "Harry Potter and the Deathly Hallows", "Hard", 847) );

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();
//        Iterator<Book> iter = bookCollection.iterator();


        for (int i =0; i<bookCollection.size(); i++){
            if (Book.getCoverType().equals("Soft")){


               booksWithSoftCover.add();
            }
            else (Book.getCoverType().equals("Hard")){
                booksWithHardCover.add(i);
            }




            System.out.println(bookCollection.get(i));
        }
    }
}
