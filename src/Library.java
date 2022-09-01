import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Library {
    private Book[] bookss;
    String bookData;

    public Library (int arrLength){
        this.bookss = new Book[arrLength];
    }

    public void setBooks(Book[] books) {
        for (int i = 0; i < bookss.length; i++) {
            if (bookss[i] == null && i <= books.length-1) {
                this.bookss[i] = books[i];
            } else {
                addBook(bookss, i);
            }
        }

    }

    public void getBooks() {
        for (int i = 0; i < bookss.length; i++) {
           bookData  = "Книгу " +bookss[i].getName()+ " написал " + bookss[i].getAuthor()+ " в " + bookss[i].getYear();
           System.out.println(bookData);
        }

    }

    public void setNewData(String name, int year) {
        for (int i = 0; i < bookss.length; i++) {
            if (bookss[i].getName().equalsIgnoreCase(name)) {
                bookss[i].setYear(year);
            }
        }
    }

    public static Object addBook (Book[] books, int i){
        Scanner newBook = new Scanner(System.in) ;
        System.out.println("Введите название книги:");
        String title = newBook.nextLine();
        System.out.println("Укажите автора:");
        String author = newBook.nextLine();
        System.out.println("Укажите год публикации:");

        int year = newBook.nextInt();

        Book book = new Book(title, author, year);
        books[i] = book;
        return books;
    }
}
