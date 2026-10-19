package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;
    public Item( String n, double p, int q){
        this.name= n;
        this.price= p;
        this.quantity= q;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
