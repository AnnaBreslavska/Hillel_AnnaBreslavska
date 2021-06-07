package Homework_9;


import Homework_8.Task1.Book;
import Homework_8.Task1.testBookCollection;

import java.util.ArrayList;
import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        testBookCollection testBookCollection = new testBookCollection();
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(testBookCollection.collectionBook().get(0));
        arrayList.add(testBookCollection.collectionBook().get(1));
        arrayList.add(testBookCollection.collectionBook().get(2));
        arrayList.add(testBookCollection.collectionBook().get(3));
        arrayList.add(testBookCollection.collectionBook().get(4));
        System.out.println(arrayList.get(0).getTitle());
    }
}
