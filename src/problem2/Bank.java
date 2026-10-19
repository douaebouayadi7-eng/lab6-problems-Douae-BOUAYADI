package problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String n){
        this.name= n;
        this.customers= new ArrayList<>();
    }
    public boolean containsCustomer(String name){
        for (Customer c: customers){
            if (c.getName().equals(name)) return true;
        }
        return false;
    }
    public void addCustomer(Customer c){
        if (!containsCustomer(c.getName())){
            customers.add(c);
        }
    }


}
