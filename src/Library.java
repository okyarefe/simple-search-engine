import org.w3c.dom.stylesheets.LinkStyle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
    private List<Book> books = new ArrayList<>();
    private Map<Integer,List<Book>> booksByYear = new HashMap<>();

    public void loadBooks(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line=br.readLine()) != null){
                String[] bookDetails = line.split(",");
                String tittle = bookDetails[0];
                String author = bookDetails[1];
                int publicationYear = Integer.parseInt(bookDetails[2]);
                Book newBook = new Book(tittle,author,publicationYear);
                addBook(newBook);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void viewAllBooks(){
        for(Book book : books){
            System.out.println(book);
        }

    }

    public List<Book> getBooks(){
        return  books;
    }

    private void addBook(Book newBook){
        books.add(newBook);
        booksByYear.computeIfAbsent(newBook.getPublicationYear(), k -> new ArrayList<>()).add(newBook);
    }

    public List<Book> searchBookByKeyword(String keyword){
        try {
            int year = Integer.parseInt(keyword.trim());
            return searchByPublicationYear(year);

        }catch (Exception e){
            return linearSearch(keyword);
        }
    }

    public Map<Integer,List<Book>> getBooksByYear(){
        return booksByYear;
    }

    public List<Book> linearSearch(String keyword){
        List<Book> booksfound = new ArrayList<>();
        String sanitizedKeyword = keyword.toLowerCase().trim();
        for(Book book : books){
            if(book.getAuthor().toLowerCase().contains(sanitizedKeyword) || book.getTitle().toLowerCase().contains(sanitizedKeyword) || String.valueOf(book.getPublicationYear()).equals(sanitizedKeyword)){
                booksfound.add(book);
                return  booksfound;
            }
        }
        return null;
    }

    private List<Book> searchByPublicationYear(int publicationYear){

        return booksByYear.get(publicationYear);
    }
}
