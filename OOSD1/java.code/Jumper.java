/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 * This class extends the StockItem superclass and includes two extra attributes: size and material.
 * 
 */
public class Jumper extends StockItem {
    // Two extra attributes
    private String size;
    private String material;

    /**
     * Constructor
     * 
     * @param stockCode
     * @param quantity
     * @param price
     * @param size
     * @param material 
     */
    public Jumper(String stockCode, int quantity, double price, String size, String material ){
        super(stockCode, quantity, price);
        this.size = size;
        this.material = material;
    }
    /**
     * Returns the stock name
     * @return "Jumpers"
     */
    public String getStockName(){
        return "Jumpers";
    }
    /**
     * Returns the stock description
     * @return "Stripped Jumpers"
     */
    public String getStockDescription(){
        return "Stripped Jumpers";
    }
    // Returns all Jumper details
    @Override
    public String toString(){
        return super.toString() + "\nSize: " + size + "\nMaterial:" + material;
    }

}
