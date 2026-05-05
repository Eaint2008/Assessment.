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
public class NavSysGUI extends JFrame {
    private NavSys navigation;
    
    private JTextField addStockField, sellStockField, priceField;
    private JTextArea output;
    
    public NavSysGUI(){
        setTitle("Geo Vision Sat Nav navigation system");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
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
        
        
        JButton updateBtn = new JButton("Update");
        panel.add(updateBtn);
        
        JButton resetBtn = new JButton("Reset");
        panel.add(resetBtn);
        
        add(panel, BorderLayout.NORTH);
        
        navigation = new NavSys ("NS101", 10, 99.99);
        
        output = new JTextArea();
        output.setEditable(false);
        add(new JScrollPane(output), BorderLayout.CENTER);
        
        updateBtn.addActionListener(e -> updateStock());
        printDetails();
        
        resetBtn.addActionListener (e -> resetStock());
        printDetails();
        
        setVisible(true);
    }
    private void updateStock(){
        try{
            if(!addStockField.getText().isEmpty()){
                int add = Integer.parseInt(addStockField.getText());
                navigation.addStock(add);
            }
            if(!sellStockField.getText().isEmpty()){
                int sell = Integer.parseInt(sellStockField.getText());
                navigation.sellStock(sell);
                
            }
            if(!priceField.getText().isEmpty()){
                double newPrice = Double.parseDouble(priceField.getText());
                navigation.setPriceWithoutVAT(newPrice);
            }
            
            printDetails();
        } catch (Exception ex){
            output.append("Invalid input");
        }
    }
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NavSysGUI gui = new NavSysGUI();
        gui.setVisible(true);
        // TODO code application logic here
    }
    
}
