public class GroceryItem {
    String name;
    double price;
    int quantity;
    String aisle;
    public GroceryItem(String item, String catagory; double cost, int qty){
        this.name = item;
        this.aisle = catagory;
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
    public void addMore(int qty){
        quantity = qty;
    }

}