package mouredev.practicas.exercisesPooUno;

public class Book {
   private String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void data(){
        System.out.println("Title: " + title + ", " + "Author: " + author);
    }
}
