package com.wipro.java.microservices.solid;
// Define the Book interface
interface Book1 {
    void displayDetails();
}

// Implement the Book interface in different classes without using inheritance
class Fiction implements Book1 {
    private String title;
    private String author;

    // Constructor
    public Fiction(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Implement displayDetails method
    public void displayDetails() {
        System.out.println("Fiction Book: " + title + " by " + author);
    }
}

class NonFiction implements Book1 {
    private String title;
    private String author;

    // Constructor
    public NonFiction(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Implement displayDetails method
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + title + " by " + author);
    }
}

// Main class to test the interface implementation
public class BookInterface {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("The Hobbit", "J.R.R. Tolkien");
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari");

        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
    }
}
