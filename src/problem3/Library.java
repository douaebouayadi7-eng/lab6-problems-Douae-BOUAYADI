package problem3;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity= capacity;
        this.documents= new ArrayList<>();
    }
    public void displayDocument(){
        for (Document d: documents){
            System.out.println(d);
        }
    }
    public boolean add(Document doc){
        if (doc == null || documents.size() >= capacity || documents.contains(doc)) {
            return  false;
        }
        return documents.add(doc);
    }
    public boolean delete( Document doc){
        return documents.remove(doc);
    }
    public Document document(int numEnreg) {
        for (Document d : documents) {
            if (d.getNumRec() == numEnreg) return d;
        }
        return null;
    }
    public void displayAuthors(){
        for (Document d: documents){
            if (d instanceof Book){
                System.out.println(((Book) d).getAuthor());
            }
        }
    }
}
