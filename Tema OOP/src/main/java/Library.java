import java.util.*;
public class Library {
    private List<Book> listOfBooks;

    public Library(){
        listOfBooks = new ArrayList<>();
    }

    public List<Book> getListOfBooks() {
        return this.listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Book book){
        listOfBooks.add(book);
    }

    public void removeAllBooks(String bookName){
        Iterator<Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()){
            book = it.next();
            if(book.getNume().equals(bookName)){
                it.remove();
            }
        }
    }

    public void remove(Book book){
        listOfBooks.remove(book);
    }
}
