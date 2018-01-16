package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Addition extends JFrame{
    private JTextField answerfield;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equals;
    private String stemp1, stemp2, sanswer;
    double answer;
    private JPanel contentPanel;
    private boolean equalsClicked;
    private boolean opchosen = false;
    char operation = ' ';
    
    
    public Addition(){
        super("Calculator");
        this.equalsClicked = false;
        
        answerfield = new JTextField(null,20);
        answerfield.setEditable(false);
        
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        zero=new JButton("0");
        add=new JButton("+");
        subtract=new JButton("-");
        multiply=new JButton("*");
        divide=new JButton("/");
        equals=new JButton("=");
        
        Dimension dim = new Dimension(75,25);
        
        one.setPreferredSize(dim);
        two.setPreferredSize(dim);
        three.setPreferredSize(dim);
        four.setPreferredSize(dim);
        five.setPreferredSize(dim);
        six.setPreferredSize(dim);
        seven.setPreferredSize(dim);
        eight.setPreferredSize(dim);
        nine.setPreferredSize(dim);
        zero.setPreferredSize(new Dimension(225,25));
        add.setPreferredSize(new Dimension(113,25));
        subtract.setPreferredSize(new Dimension(113,25));
        multiply.setPreferredSize(new Dimension(113,25));
        divide.setPreferredSize(new Dimension(113,25));
        equals.setPreferredSize(new Dimension(225,25));
        
        Numbers n = new Numbers ();
        Calc c = new Calc ();
        
        one.addActionListener(n); two.addActionListener(n); three.addActionListener(n);
        four.addActionListener(n); five.addActionListener(n); six.addActionListener(n);
        seven.addActionListener(n); eight.addActionListener(n); nine.addActionListener(n);
        zero.addActionListener(n);
        
        add.addActionListener(c); subtract.addActionListener(c); multiply.addActionListener(c);
        divide.addActionListener(c); equals.addActionListener(n);
        
        
       
        contentPanel = new JPanel ();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(answerfield,BorderLayout.NORTH);
        
        contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(seven);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(zero);contentPanel.add(add);contentPanel.add(subtract);contentPanel.add(multiply);contentPanel.add(divide);contentPanel.add(equals);
        this.setContentPane(contentPanel);
        
    }
        
    private class Numbers implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JButton std = (JButton) event.getSource();    
            
            if(std.equals(one))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "1";
                    }else{
                        stemp1=stemp1 + "1";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="1";
                    }else{
                        stemp2=stemp1 + "1";
                        }
                    }
            }
            if(std.equals(two))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "2";
                    }else{
                        stemp1=stemp1 + "2";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="2";
                    }else{
                        stemp2=stemp1 + "2";
                        }
                    }
            }
            if(std.equals(three))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "3";
                    }else{
                        stemp1=stemp1 + "3";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="3";
                    }else{
                        stemp2=stemp1 + "3";
                        }
                    }
            }
            if(std.equals(four))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "4";
                    }else{
                        stemp1=stemp1 + "4";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="4";
                    }else{
                        stemp2=stemp1 + "4";
                        }
                    }
            }
            if(std.equals(five))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "5";
                    }else{
                        stemp1=stemp1 + "5";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="5";
                    }else{
                        stemp2=stemp1 + "5";
                        }
                    }
            }
            if(std.equals(six))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "6";
                    }else{
                        stemp1=stemp1 + "6";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="6";
                    }else{
                        stemp2=stemp1 + "6";
                        }
                    }
            }
            if(std.equals(seven))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "7";
                    }else{
                        stemp1=stemp1 + "7";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="7";
                    }else{
                        stemp2=stemp1 + "7";
                        }
                    }
            }
            if(std.equals(eight))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "8";
                    }else{
                        stemp1=stemp1 + "8";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="8";
                    }else{
                        stemp2=stemp1 + "8";
                        }
                    }
            }
            if(std.equals(nine))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "9";
                    }else{
                        stemp1=stemp1 + "9";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="9";
                    }else{
                        stemp2=stemp1 + "9";
                        }
                    }
            }
            if(std.equals(zero))
            {
                if(opchosen==false){
                    if(stemp1==null){
                        stemp1 = "0";
                    }else{
                        stemp1=stemp1 + "0";
                    }
                }else{
                    if (stemp2==null){
                        stemp2="0";
                     }else{
                        stemp2=stemp1 + "0";
                        }
                    }
            }
        

            if(opchosen==false){
                answerfield.setText(stemp1);
            }else{
                answerfield.setText(stemp2);
            }
            if(equalsClicked==false){
                if(opchosen==false){
                    answerfield.setText(stemp1);
                }else{
                    answerfield.setText(stemp2);
                }
                }
        }
    }    
                           
    
    class Calc implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JButton std;
            std = (JButton) event.getSource();
            
            if(std.equals(add)){
                if(stemp1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(stemp1!= null && stemp2!= null){
                        opchosen = true;
                        operation = '+';
                    }else
                     if(stemp1!= null && stemp2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(subtract)){
                if(stemp1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(stemp1!= null && stemp2!= null){
                        opchosen = true;
                        operation = '-';
                    }else
                     if(stemp1!= null && stemp2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(multiply)){
                if(stemp1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(stemp1!= null && stemp2!= null){
                        opchosen = true;
                        operation = '*';
                    }else
                     if(stemp1!= null && stemp2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(divide)){
                if(stemp1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(stemp1!= null && stemp2!= null){
                        opchosen = true;
                        operation = '/';
                    }else
                     if(stemp1!= null && stemp2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(equals)){
                if(stemp1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(stemp1!= null && stemp2!= null){
                    System.out.println("Choose BOTH numbers first");
                    }else
                     if(stemp1!= null && stemp2!= null){
                        System.out.println("Two operations only!");
                }

            }
            
            if(stemp1 != null && stemp2 != null){
                double d1=0.0, d2=0.0;
                d1 = Double.parseDouble(stemp1);
                d2 = Double.parseDouble(stemp2);
                switch(operation){
                    case'+':
                        answer= d1 + d2;
                        break;
                    case'-':
                        answer= d1 - d2;
                        break;
                    case'/':
                        answer= d1 / d2;
                        break;
                    case'*':
                        answer= d1 * d2;
                        break;                        
                }
                
                sanswer = Double.toString(answer);
                answerfield.setText(sanswer);
                if(operation == '/' && d2 ==0.0){
                    answerfield.setText("DIVIDE BY 0 ERROR");
                }
                
        }
               
                    
        }
    
    }
}

       