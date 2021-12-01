package pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Философия Java", 5);
        Book book2 = new Book("Java для всех", 6);
        Book book3 = new Book("Алгоритмы", 9);
        Book book4 = new Book("Clean Code", 4);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        for (int i = 0; i < books.length; i++) {
            String nameOfBook = books[i].getName();
            if (nameOfBook.equals("Clean Code")) {
                System.out.println(nameOfBook + books[i].getCount());
            }
        }
    }
}
