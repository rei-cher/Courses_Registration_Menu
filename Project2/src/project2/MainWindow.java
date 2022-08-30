package project2;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame{
    
    private JPanel main;
    
    MainWindow(){
        super("Select Registration Options");
        this.setSize(600, 230);
        this.setResizable(false);
        
        mainContent();
        this.add(main);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void mainContent(){
        main = new JPanel();
        main.setLayout(new FlowLayout());
        
        //top label
        JLabel topLabel = new JLabel("Select Registraion Options");
        topLabel.setFont(new Font("Setif",Font.BOLD,24));
        main.add(topLabel);
        
        //all other content
        main.add(new RegistrationType());
        main.add(new Workshops());
        main.add(new Buttons());
    }
}
