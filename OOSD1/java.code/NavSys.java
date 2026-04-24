/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 *
 * @author thein
 */
public class NavSys extends StockItem {
    public NavSys (String stockCode, int quantity, double price){
        super(stockCode, quantity, price);
    }
    public String getStockName(){
        return "Navigation System";
    }
    public String getStockDescription(){
        return "GeoVision Sat Nav";
    }
    public String toString(){
        return super.toString();
    }

    /**
     * @param args the command line arguments
     */
    
}
