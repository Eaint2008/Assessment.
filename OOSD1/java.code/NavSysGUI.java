/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 * NavSysGUI class
 * This class provides a GUI for managing a NavSys object. It allows to user to add stock, sell stock, and update price.
 * @author thein
 */
import javax.swing.*;
import java.awt.*;
public class NavSysGUI extends JFrame {
    // NavSys objects
    private NavSys navigation;
    // Input fields
    private JTextField addStockField, sellStockField, priceField;
    // Output area to display item details
    private JTextArea output;
    // Constructor
    public NavSysGUI(){
        // Window settings
        setTitle("Geo Vision Sat Nav navigation system");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Using Panel for user input field and buttons
        JPanel panel = new JPanel(new GridLayout(4,2,5,5));
        
        panel.add(new JLabel("Insert addStock amount:"));
        addStockField = new JTextField();
        panel.add(addStockField);
        
        panel.add(new JLabel("Insert sellStock amount:"));
        sellStockField = new JTextField();
        panel.add(sellStockField);
        
        panel.add(new JLabel("New Price:"));
        priceField = new JTextField();
        panel.add(priceField);
        
        // Update Button
        JButton updateBtn = new JButton("Update");
        panel.add(updateBtn);
        // Reset Button
        JButton resetBtn = new JButton("Reset");
        panel.add(resetBtn);
        
        add(panel, BorderLayout.NORTH);
        // Creating default NavSys object
        navigation = new NavSys ("NS101", 10, 99.99);
        // Output area to display item details
        output = new JTextArea();
        output.setEditable(false);
        add(new JScrollPane(output), BorderLayout.CENTER);
        
        updateBtn.addActionListener(e -> updateStock());
        printDetails();
        
        resetBtn.addActionListener (e -> resetStock());
        printDetails();
        
        setVisible(true);
    }
    // Let the user to update stock and price.
    private void updateStock(){
        try{
            // Add stock if field is not empty
            if(!addStockField.getText().isEmpty()){
                int add = Integer.parseInt(addStockField.getText());
                navigation.addStock(add);
            }
            // Sell stock if field 
            if(!sellStockField.getText().isEmpty()){
                int sell = Integer.parseInt(sellStockField.getText());
                navigation.sellStock(sell);
                
            }
            // Change price
            if(!priceField.getText().isEmpty()){
                double newPrice = Double.parseDouble(priceField.getText());
                navigation.setPriceWithoutVAT(newPrice);
            }
            
            printDetails();
        } catch (Exception ex){
            output.append("Invalid input");
        }
    }
    // resetting the addStock, sellStock, and price
    private void resetStock(){
        addStockField.setText("");
        sellStockField.setText("");
        priceField.setText("");
        
        navigation = new NavSys("NS101", 10, 99.99);
        
        printDetails();
        
    }
    private void printDetails(){
        output.setText(navigation.toString());
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        NavSysGUI gui = new NavSysGUI();
        gui.setVisible(true);
        // TODO code application logic here
    }
    
}

