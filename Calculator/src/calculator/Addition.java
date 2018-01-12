package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Addition extends JFrame{
    private JTextField answerfield;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equals;
    private String stemp1, stemp2, answer;
    private JPanel contentPanel;
    
    
    public Addition(){
        super("Calculator");
        
        answerfield = new JTextField(null,20);
        
        contentPanel = new JPanel ();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.add(answerfield,BorderLayout.NORTH);
        this.setContentPane(contentPanel);
        
        
    }
 
    
    
    
}



  


    
    

