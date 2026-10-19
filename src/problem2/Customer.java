package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions= new ArrayList<>();
    public Customer( String n, ArrayList<Double> t){
        this.name= n;
        this.transactions= t;
    }
    public void credit(double amount){
        transactions.add(amount);
    }
    public void debit( double amount){
        transactions.add(-amount);
    }


}
