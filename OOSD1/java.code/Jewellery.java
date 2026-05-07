 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 *
 * This class extends the StockItem superclass and includes two extra attributes: metal and weight.
 */
public class Jewellery extends StockItem {
   // Two extra attributes
    private String metal;
    private double weight;
    
    
    /**
     * Constructor
     * @param stockCode
     * @param quantity
     * @param price
     * @param metal
     * @param weight 
     */
    public Jewellery(String stockCode, int quantity, double price, String metal, double weight ){
        super(stockCode, quantity, price);
        this.metal = metal;
        this.weight= weight;
    }
    /**
     * Returns the stock name
     * @return "Jewellery"
     */
    public String getStockName(){
        return "Jewellery";
    }
 
    /**
     * Returns the stock description
     * @return "Bracelets"
     */
    public String getStockDescription(){
        return "Bracelets";
    }
    // Return all Jewellery details
    @Override
    public String toString(){
        return super.toString()+"\nMetal:" + metal + "\nWeight:" +weight;
    }


    
}
