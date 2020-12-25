package com.sab.learn.composite;

import java.util.ArrayList;
import java.util.Optional;

public class BookCollection {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkout(String name) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getName().equals(name))
                .filter(b -> !b.isCheckedOut())
                .findFirst();

        if (book.isPresent()) {
            System.out.println("Checking out book " + book.get().getName());
            book.get().setCheckedOut(true);
        }
    }

    public void returnBook(String name) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getName().equals(name))
                .filter(Book::isCheckedOut)
                .findFirst();
        if (book.isPresent()) {
            System.out.println("Returning book " + book.get().getName());
            book.get().setCheckedOut(false);
        }

    }

    public void printSummary() {
      System.out.println("\n------------------------SUMMARY-------------------------------------");
        books.forEach(b -> System.out.println(b.getName() + ", " + b.isCheckedOut()));
      System.out.println("--------------------------END---------------------------------------");

    }
}
