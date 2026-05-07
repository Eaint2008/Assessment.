/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 * This class extends the StockItem superclass and includes two extra attributes: model and color.
 * @author thein
 */
public class PhoneCase extends StockItem {
    // Two extra attributes
    private String model;
    private String colour;
    
    /**
     * Constructor
     * @param stockCode
     * @param quantity
     * @param price
     * @param model
     * @param colour 
     */
    public PhoneCase(String stockCode, int quantity, double price, String model, String colour){
        super(stockCode, quantity, price);
        this.model = model;
        this.colour = colour;
    }
    /**
     * Returns the stock name
     * @return "Phone Case"
     */
    public String getStockName(){
        return "Phone Case";
    }
 
   /**
    * Returns the stock description
    * @return "Durable Phone Case"
    */
    public String getStockDescription(){
        return "Durable Phone Case";
    }
    /**
     * Returns all Phone Case details
     * @return 
     */
    @Override
    public String toString(){
        return super.toString()+"\nModel:" + model + "\nColour:" +colour;
    }


    
}
