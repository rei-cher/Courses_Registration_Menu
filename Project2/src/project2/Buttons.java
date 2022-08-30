package project2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buttons extends JPanel implements ActionListener{
    
    private JButton calc;
    private JButton exit;
    
    Buttons(){
        this.setLayout(new GridLayout(1,2));
        
        calc = new JButton("Calculate Charges");
        exit = new JButton("Exit");
        
        calc.addActionListener(this);
        exit.addActionListener(this);
        
        this.add(calc);
        this.add(exit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RegistrationType rt = new RegistrationType();
        Workshops w = new Workshops();
        
        double sum = rt.getPrice()+w.getPrice();
        
        if(e.getSource()==calc)
            JOptionPane.showMessageDialog(null,"Total Charges: $"+sum);
        
        if(e.getSource()==exit) System.exit(0);
    }
}
