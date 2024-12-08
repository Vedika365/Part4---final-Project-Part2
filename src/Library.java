
import java.util.ArrayList;
import java.util.Arraylist;

class Library {
    //Data members
    private ArrayList<Book> books;

    //Default constructor
    public Library() {
        books = new ArrayList<>();

    }

    //constructor with arraylist
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    //copy constructor
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);

    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Library library = (Library) obj;
        return books.equals(library.books);

    }

    //search the keyword
    //search for books containing the keyword
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        //for loop ro iletrate over the books
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            //hwo to check if it contains the keyword (title, or author)

        }
//toString method
        public String toString () {
            String answer = "library contains: \n"; //initialize result with a header

            //loop to ilterate over the book list
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                answer += books.toString() = "\n";

            }
            return answer;

        }

    }

    public Arraylist <Book> getBooks(){
        return books;
    }
    public void setBooks(Arraylist<Books>book){
        this.books = books;
    }

}