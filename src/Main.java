import java.util.Objects;
import java.util.Scanner;

public class Main {
    /*
    1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
       Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
    2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
    3. Написать конструкторы для обоих классов, заполняющие все поля.
    4. Создать геттеры для всех полей автора и всех полей книги.
    5. Создать сеттер для поля «Год публикации» у книги.
    6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов
        Автор (достаточно тоже двух) и инициализировать друг друга.
        Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        Метод main не должен находиться в классах Book и Author.
        Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
    7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
    * */

    public static void main(String[] args) {
        Book book = new Book("Война и Мир", "Толстой Лев Николаевич ", 1863);
        Book book1 = new Book("Мастер и Маргарита", "Булгакова Михаил Афанасьевич ", 1928);
        System.out.println(book.getName()+" " + book.getAuthor()+ " " +book.getYear());
        System.out.println(book1.getName()+" " + book1.getAuthor()+ " " +book1.getYear());
        book1.setYear(1929);
        System.out.println(book1.getName()+" " + book1.getAuthor()+ " " +book1.getYear());


        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Михаил", "Булгаков");
        System.out.println(author.getFirstName() +" " +author.getLastName());
        System.out.println(author1.getFirstName() +" " +author1.getLastName());

        /*
        1. Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
        2. Написать статические методы для работы с массивом в классе, где располагается метод main:
            1. Добавить книгу (найти свободную ячейку массива и положить туда книгу).
                Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
            2. Напечатать в консоль все книги из массива в следующем формате:
         “Stephen King: The Stand: 1978
        * */
        System.out.println("Задание 2");
        Book[] books = new Book[3];
        books[0] = book;
        books[1] = book1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
            } else {
               Library.addBook (books, i);
            }
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ": " +books[i].getAuthor() + ": " + books[i].getYear());
        }


        System.out.println("Задание 3");
        Scanner text = new Scanner(System.in) ;

        System.out.println("Текущее количество книг в массиве " + books.length);
        System.out.println("Укажите сколько книг желаете добавить");
        int countBook = text.nextInt();
        Library lib = new Library(books.length + countBook);
        lib.setBooks(books);
        lib.getBooks();
        lib.setNewData("война и мир", 2025);
        lib.getBooks();

    }



}