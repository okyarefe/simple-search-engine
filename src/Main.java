import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Library library = new Library();
        library.loadBooks("src/resources/data/books.txt");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a keyword to search(title, author, or year): ");
        String keyword = scan.nextLine();
        List<Book> foundBook = library.searchBookByKeyword(keyword);
        if(foundBook != null){
            foundBook.forEach(System.out::println);
        }else{
            System.out.println("No book matching the criteria");
        }


        /*
        Map<Integer,List<Book>> books = library.getBooksByYear();
        Set<Integer> set = books.keySet();

        for (int key : set){
            System.out.println("Books published in "+ key);
            books.get(key).forEach(book ->System.out.println(book));
            System.out.println("   *****   ");
        }
         */



    }
}