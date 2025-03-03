import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private LibrarySerializer serializer = new LibrarySerializer();

    LibraryMenu(Library library){
        this.library = library;

    }

    public void displayBooks(List<Book> books){
        if(books != null && !books.isEmpty()){
            books.forEach(System.out::println);
        }
    }

    public void displayMenu(){
        Boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while(running){
            System.out.println("Welcome.. Use numbers to chose options..");
            System.out.println("1 - View all books");
            System.out.println("2 - Sort books by title");
            System.out.println("3 - Sort books by author");
            System.out.println("4 - Sort books by publication year");
            System.out.println("5 - Search book by a keyword");
            System.out.println("type \"exit\" to exit");
            String userInput = scanner.nextLine().trim();
            switch (userInput){
                case "1":
                    library.viewAllBooks();
                    break;
                case "2":
                    SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getTitle));
                    library.viewAllBooks();
                    break;

                case "3":
                    // TODO
                case "4":
                    // TODO
                case "5":
                    System.out.println("Search keyword: ");
                    String keyword = scanner.nextLine().trim();
                    List<Book> books = library.searchBookByKeyword(keyword);
                    displayBooks(books);
                    break;

                case "exit":
                    running=false;
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;

            }

        }
    }


}
