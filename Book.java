/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Diogo Alves
 * @version 2025.02.10
 */

public class Book {
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed; // Field to track number of times borrowed

    /**
     * Constructor to initialize book details.
     * Defaults to a Harry Potter book if no values are provided.
     */
    public Book() {
        author = "J.K. Rowling";
        title = "Harry Potter and the Sorcerer’s Stone";
        pages = 309;
        refNumber = "";
        borrowed = 0;
    }

    /**
     * Constructor to initialize any book.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    /**
     * Returns the author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the number of pages in the book.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Prints book details to the terminal.
     */
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        String refNumberString = refNumber.length() > 0 ? refNumber : "ZZZ";
        System.out.println("Reference number: " + refNumberString);
        System.out.println("Times borrowed: " + borrowed);
    }

    /**
     * Sets the reference number for the book.
     */
    public void setRefNumber(String ref) {
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error! The reference number must be at least 3 characters long.");
        }
    }

    /**
     * Gets the reference number for the book.
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Borrows the book. Increments the number of times the book has been borrowed.
     */
    public void borrow() {
        borrowed++;
    }

    /**
     * Gets the number of times the book has been borrowed.
     */
    public int getBorrowed() {
        return borrowed;
    }
}