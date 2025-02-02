import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.display();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = input.nextLine();
        System.out.print("Enter author: ");
        String author = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();

        Book userBook = new Book(title, author, price);
        userBook.display();
    }
}