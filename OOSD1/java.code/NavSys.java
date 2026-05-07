/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 * 
 * Subclass of StockItem
 */
public class NavSys extends StockItem {
    /**
     * Creating a NavSys item
     * @param stockCode
     * @param quantity
     * @param price 
     */
    public NavSys (String stockCode, int quantity, double price){
        super(stockCode, quantity, price);
    }
    
    /**
     * Returns the stock name
     * @return "Navigation System"
     */
    public String getStockName(){
        return "Navigation System";
    }
    /**
     * Returns the stock description
     * @return "GeoVision Sat Nav"
     */
    public String getStockDescription(){
        return "GeoVision Sat Nav";
    }
    /**
     * Returns full item details
     * @return 
     */
    public String toString(){
        return super.toString();
    }

   
    
}
