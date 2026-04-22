package Assignment;

/**
 *
 * @author thein
 */
public class StockItem {

    private String stockCode;     
    private int quantity;        
    private double price;        

    public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

   
    public String getStockName() {
        return "Unknown Stock Name";
    }
    public String getStockDescription(){
        return "Unknown Stock Description";
    }
    
    public double getVAT() {
        return 17.5;
    }
    public double getPriceWithoutVAT() {
        return price;
    }

    public void setPriceWithoutVAT(double price) {
        this.price = price;
    }
    public double getPriceWithVAT() {
        return price + (price * getVAT() / 100);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void addStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: the value is less than one.");
            return;
        }
        if (quantity + amount > 100) {
            System.out.println("Error: the stock exceeds 100.");
            return;
        }
        quantity = quantity + amount;
    }

    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Amount is less than 1.");
            return false;
        }
        if (amount <= quantity) {
            quantity = quantity - amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() +"\nDescription: " + getStockDescription() +"\nStock Code: " + stockCode +"\nPrice Without VAT: " + price +"\nPrice With VAT: " + getPriceWithVAT() + "\nTotal unit in stock: " + quantity;
    }

  
    public static void main(String[] args) {

        StockItem a = new StockItem("W101", 10, 99.99);

        System.out.println("Task 1");
        System.out.println(a);

        a.addStock(10);
        System.out.println("\nTask 2");
        System.out.println(a);

        a.sellStock(2);
        System.out.println("\nTask 3");
        System.out.println(a);

        a.setPriceWithoutVAT(100.99);
        System.out.println("\nTask 4");
        System.out.println(a);
    }
}


