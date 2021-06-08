package Homework_9;


import Homework_8.Task1.Book;
import Homework_8.Task1.BookTester;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Book> arrayList = new ArrayList<>();

        arrayList.add(BookTester.bookCollection().get(0));
        arrayList.add(BookTester.bookCollection().get(1));
        arrayList.add(BookTester.bookCollection().get(2));
        arrayList.add(BookTester.bookCollection().get(3));
        arrayList.add(BookTester.bookCollection().get(4));

        System.out.println("В ArrayList находяться след. книги: ");
        try {
            arrayList.forEach(x -> System.out.println(x.getTitle()));
            System.out.println(arrayList.get(5).getTitle());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("В ArrayList всего 5 книг!");
        }
    }
}

