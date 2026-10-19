package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer( String n){
        this.name= n;
        this.transactions= new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void credit(double amount){
        transactions.add(amount);
    }
    public void debit( double amount){
        transactions.add(-amount);
    }


}
