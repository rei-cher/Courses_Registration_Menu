package project2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class RegistrationType extends JPanel implements ActionListener{
    
    private JRadioButton general;
    private JRadioButton student;
    private JPanel radio;
    private JPanel check;
    private JCheckBox dinner;
    private static int dinnerPrice;
    private static int personPrice;
    private static int registrationPrice;
    
    RegistrationType(){
        this.setLayout(new GridLayout(2,1));
        
        registration();
        checkBox();
        
        this.add(radio);
        this.add(check);
    }
    
    private void registration(){
        radio = new JPanel();
        Border blueline = BorderFactory.createLineBorder(Color.BLUE);
        
        radio.setBorder(BorderFactory.createTitledBorder(blueline,"Registration Type"));
        radio.setLayout(new GridLayout(1,2));
        
        general = new JRadioButton("General Registration");
        student = new JRadioButton("Student Registration");
        
        general.addActionListener(this);
        student.addActionListener(this);
        
        ButtonGroup group = new ButtonGroup();
        group.add(general);
        group.add(student);
        
        radio.add(general);
        radio.add(student);
    }
    
    private void checkBox(){
        check = new JPanel();
        dinner = new JCheckBox("Dinner and Keynote Speech");
        
        dinner.addActionListener(this);
        
        check.add(dinner);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==dinner)
            dinnerPrice = 30;
        else 
            dinnerPrice = 0;
        
        if(e.getSource()==general)
            personPrice = 895;
        else if (e.getSource()==student)
            personPrice = 495;
        
        registrationPrice = personPrice + dinnerPrice;
    }
    
    public int getPrice()
    {
        return registrationPrice;
    }
}
