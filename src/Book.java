public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this. author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public String toString() {
        return "Title:" + title + "Author:" + author;
    }
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }
















}
