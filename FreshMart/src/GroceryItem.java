public class GroceryItem {
    String name;
    double price;
    int quantity;

    public GroceryItem(String item, double cost, int qty){
        this.name = item;
        this.price = cost;
        this.quantity = qty;
    }
    public String getName() { //accessor method for returning the item's name
        return name;
    }
    public double getPrice() { //accessor method for returning the item's price
        return price;
    }
    public int getQty() { //accessor method for returning how much there is in stock of the item
        return quantity;
    }
    public double getTotalPrice(){
        return price * quantity;
    }
    public String toString(){
        return name + " (" + quantity + ") " + " - " + price + " each | Total: $" + price;
    }
}