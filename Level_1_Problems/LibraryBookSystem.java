class LibraryBookSystem{
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(){
        if (isAvailable == true){
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else{
            System.out.println("Sorry, this book is currently not available.");
        }
    }
    
    public void displayBookInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args){
        LibraryBookSystem book1 = new LibraryBookSystem("How to fly higher", "Unknown", 110, true);
        book1.displayBookInfo();
        System.out.println();

        book1.borrowBook();
        System.out.println();
        
        book1.displayBookInfo();
    }
}
