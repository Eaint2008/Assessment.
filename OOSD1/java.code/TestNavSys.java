/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 *
 * @author thein
 */
public class TestNavSys {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NavSys b = new NavSys("NS101", 10, 99.99);
        System.out.println("Task 1");
        System.out.println(b);
        
        System.out.println("Task 2");
        b.addStock(10);
        System.out.println(b);
        
        System.out.println("Task 3");
        b.sellStock(2);
        System.out.println(b);
        
        System.out.println("Task 4");
        b.setPriceWithoutVAT(100.99);
        System.out.println(b);
        
        System.out.println("Task 5");
        b.addStock(0);
        
        // TODO code application logic here
    }
    
}
