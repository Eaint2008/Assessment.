/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

/**
 *
 * @author thein
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StockItemGUI extends JFrame{
    private StockItem currentItem;
    
    private JTextField stockCodeField, quantityField, priceField, addStockField, sellStockField;
    private JTextArea outputArea;
    
    public StockItemGUI(){
        setTitle("Car Parts & Acessories Shop (Stock Item)");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JPanel createPanel = new JPanel(new GridLayout(4,2));
        
        createPanel.add(new JLabel("Stock Code:"));
        stockCodeField = new JTextField();
        createPanel.add(stockCodeField);
        
        createPanel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        createPanel.add(quantityField);
        
        createPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        createPanel.add(priceField);
        
        JButton createBtn = new JButton("Create StockItem");
        createPanel.add(createBtn);
        
        
        add(createPanel, BorderLayout.NORTH); 
        
        
        JPanel actionPanel = new JPanel(new GridLayout(4,4));
        
        
        actionPanel.add(new JLabel("addStock Amount:"));
        addStockField = new JTextField();
        actionPanel.add(addStockField);
        JButton addBtn = new JButton("Add:");
        actionPanel.add(addBtn);
        
        actionPanel.add(new JLabel("sellStock Amount:"));
        sellStockField = new JTextField();
        actionPanel.add(sellStockField);
        JButton sellBtn = new JButton("Sell:");
        actionPanel.add(sellBtn);
       
        
        actionPanel.add(new JLabel("Insert New Price:"));
        JTextField newpriceField = new JTextField();
        actionPanel.add(newpriceField);
        JButton priceBtn = new JButton("Change Price:");
        actionPanel.add(priceBtn);

        
        add(actionPanel, BorderLayout.CENTER);
        
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add((outputArea),BorderLayout.SOUTH);
        
        createBtn.addActionListener(e ->{
            try{
                String stockCode = stockCodeField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                double price = Double.parseDouble(priceField.getText());
                
                currentItem = new StockItem(stockCode, quantity, price);
                outputArea.setText("StockItem objects created:\n\n" + currentItem.toString());
            }catch (Exception ex){
                outputArea.setText("Invalid Value!");
            }
        });
        
        addBtn.addActionListener(e ->{
            if(currentItem == null){
                outputArea.setText("Create an item first.");
                return;
            } try{
                int amount  = Integer.parseInt(addStockField.getText());
                currentItem.addStock(amount);
                outputArea.setText("Stock added:\n\n" + currentItem.toString());
            }catch (Exception ex){
                outputArea.setText("Invalid Amount!");
            }
        });
        sellBtn.addActionListener(e->{
            if(currentItem == null){
                outputArea.setText("Create an item first.");
                return;
            } try{
                int amount = Integer.parseInt(sellStockField.getText());
                currentItem.sellStock(amount);
                outputArea.setText("Stock sold:\n\n " + currentItem.toString());
            } catch(Exception ex){
                outputArea.setText("Invalid sell amount!");
            }
        });
        priceBtn.addActionListener(e->{
            if(currentItem == null){
                outputArea.setText("Create an item first.");
                return;
            }try{
                double newprice = Double.parseDouble(newpriceField.getText());
                currentItem.setPriceWithoutVAT(newprice);
                outputArea.setText("Price changes:\n\n " + currentItem.toString());
            } catch(Exception ex){
                outputArea.setText("Inavlid Price!");
            }
        });
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StockItemGUI gui = new StockItemGUI();
        gui.setVisible(true);
        
        // TODO code application logic here
    }
    
}
