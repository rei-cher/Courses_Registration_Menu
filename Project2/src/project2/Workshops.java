
package project2;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;

public class Workshops extends JPanel implements ListSelectionListener{
    
    private JList workshops;
    private static int workshopsPrice;
    private static int ecommercePrice;
    private static int webPrice;
    private static int javaPrice;
    private static int networkPrice;
    private String[] workshopsArray = {"Introduction to E-commerce","The Future of the Web",
            "Advanced Java Programming","Network Security"};
    
    Workshops(){
        
        Border blueline = BorderFactory.createLineBorder(Color.BLUE);
        this.setBorder(BorderFactory.createTitledBorder(blueline,"Workshops"));;
        
        //creating a list
        
        workshops = new JList(workshopsArray);
        workshops.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        workshops.addListSelectionListener(this);
        
        this.add(workshops);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        if(workshops.isSelectedIndex(0)==true) ecommercePrice = 295;
        else ecommercePrice = 295;
        if(workshops.isSelectedIndex(1)==true) webPrice = 295;
        else webPrice = 0;
        if(workshops.isSelectedIndex(2)==true) javaPrice = 395;
        else javaPrice = 0;
        if(workshops.isSelectedIndex(3)==true) networkPrice = 395;
        else networkPrice = 0;
        
        workshopsPrice = ecommercePrice + webPrice + javaPrice + networkPrice;
    }

    public int getPrice()
    {
        return workshopsPrice;
    }
    
}
