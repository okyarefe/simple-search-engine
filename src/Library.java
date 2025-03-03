import org.w3c.dom.stylesheets.LinkStyle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

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
    }
}
