/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 * Test polymorphism using different StockItem subclasses.
 */
public class TestPolymorphism {
    public static void itemInstance(StockItem s) {
        System.out.println("Printing item stock information:");
        System.out.println(s);
        
        s.addStock(7);
        s.sellStock(4);
        s.setPriceWithoutVAT(s.getPriceWithoutVAT()+ 5);
        
        
      
        

    }
    // Array of different StockItem types
    public static void main(String[] args){
        StockItem[] items = new StockItem [4];
        items[0] = new NavSys("NS1001", 5, 10.0);
        items[1] = new Jumper("JM1001", 30, 25.50,"12","Stripped Jumper");
        items[2] = new Jewellery("JW1001", 19, 35.3,"Bracelect",120.0);
        items[3] = new PhoneCase("PC1001", 25, 96.3, "iPhone 14", "Black");
        // Showing polymorphism
        for (int i = 0; i< items.length; i++){
            itemInstance(items[i]);
        }
               
        
    }
    
}
