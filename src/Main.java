import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Library library = new Library();
        library.loadBooks("src/resources/data/books.txt");
        library.viewAllBooks();
        SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getPublicationYear));
        library.viewAllBooks();





    }


}