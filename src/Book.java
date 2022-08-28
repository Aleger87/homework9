public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }






}
