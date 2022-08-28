package ru.netology.product.manager;

public class Book extends Product {

    private String author;

    public Book (int bookId, String bookName, String bookAuthor) {
        super.id = bookId;
        super.name = bookName;
        this.author = bookAuthor;
    }
}