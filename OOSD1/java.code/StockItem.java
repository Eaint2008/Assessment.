/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 *
 * @author thein
 */

/**
 * The StockItem class stores the stock code, quantity, and price (without VAT).
 * It provides methods to update stock levels, calculate VAT, and return item details.
 */
public class StockItem {
  

    private String stockCode;     
    private int quantity;        
    private double price;  
    
    /**
     * 
     * @param stockCode
     * @param quantity
     * @param price 
     */

    public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    /*
    *Reutrns the getStockName, getStockDescription, VAT percentage, Pricewith VAT, and PriceWithoutVAT.
    */
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
    
    /*
    * Update the price without VAT
    * @param price new price value
    */
    public void setPriceWithoutVAT(double price) {
        this.price = price;
    }
    
    /*
    * Calculates and returns the PricewithVAT
    */
    public double getPriceWithVAT() {
        return price + (price * getVAT() / 100);
    }

    public int getQuantity() {
        return quantity;
    }
    /*
    * @param new quantity value
    */

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /*
    Adds stock if the amount is valid and does not exceed the limit
    */
    public void addStock(int amount) {
        // Check if amount is less than 1
        if (amount < 1) {
            System.out.println("Error: the value is less than one.");
            return;
        }
        // Check if adding stock would exceed 100 units
        if (quantity + amount > 100) {
            System.out.println("Error: the stock exceeds 100.");
            return;
        }
        // Add the stock
        quantity = quantity + amount;
    }
    
    //Sells stock if the amount is valid

    public boolean sellStock(int amount) {
        // Check if amount is less than 1
        if (amount < 1) {
            System.out.println("Error: Amount is less than 1.");
            return false;
        }
        // Check if enough stock is available
        if (amount <= quantity) {
            quantity = quantity - amount;
            return true;
        }
        // return false if not enough stock to sell
        return false;
    }
    

    // Returns a string showing all stock details
    @Override
    public String toString() {
        return "Stock Type: " + getStockName() +"\nDescription: " + getStockDescription() +"\nStock Code: " + stockCode +"\nPrice Without VAT: " + price +"\nPrice With VAT: " + getPriceWithVAT() + "\nTotal unit in stock: " + quantity;
    }

  
    // Main method
    public static void main(String[] args) {

        StockItem a = new StockItem("W101", 10, 99.99);

        // Task 1
        System.out.println("Task 1");
        System.out.println(a);
        

        // Task 2
        a.addStock(10);
        System.out.println("\nTask 2");
        System.out.println(a);

        // Task 3
        a.sellStock(2);
        System.out.println("\nTask 3");
        System.out.println(a);

        // Task 4
        a.setPriceWithoutVAT(100.99);
        System.out.println("\nTask 4");
        System.out.println(a);
    }
}






