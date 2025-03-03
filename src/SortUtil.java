import java.util.Comparator;
import java.util.List;

public class SortUtil {
    public static void bubbleSort(List<Book> books,Comparator<Book> comparator){
        for (int i = 0; i < books.size()-1; i++){
            for( int j=0; j<books.size()-i-1;j++){
                if(comparator.compare(books.get(j),books.get(j+1))>0){
                    Book temp = books.get(j);
                    books.set(j,books.get(j+1));
                    books.set(j+1,temp);
                }
            }
        }
    }
}
