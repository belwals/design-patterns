package com.sab.learn.composite;

public class LibraryClient {

    public static void main(String[] args) {

        NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(nonfictionBook);
        bookCollection.addBook(fictionBookOne);
        bookCollection.addBook(fictionBookTwo);

        bookCollection.checkout(nonfictionBook.getName());
        bookCollection.checkout(fictionBookOne.getName());
        bookCollection.checkout(fictionBookTwo.getName());


        bookCollection.returnBook(nonfictionBook.getName());
        bookCollection.returnBook(fictionBookOne.getName());
        bookCollection.returnBook(fictionBookTwo.getName());

        bookCollection.checkout(nonfictionBook.getName());

        bookCollection.printSummary();
    }
}
