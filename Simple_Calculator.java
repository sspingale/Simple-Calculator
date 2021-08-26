package Learn;

import java.awt.event.*;
import javax.swing.*;

public class Simple_Calculator {
    public static void main(String[] args) {
        //creating frame 
        JFrame f = new JFrame();
        //creating Jlabel and setting its boundaries
        JLabel l1 = new JLabel("Enter 1st Number ");
        l1.setBounds(150, 100, 150, 30);
        //Creating Jlabel and setting its boundaries
        JLabel l2 = new JLabel("Enter 2nd Number ");
        l2.setBounds(150, 200, 150, 30);
        //adding Jlabel 3 and setting its boundaries
        JLabel l3 = new JLabel("Answer");
        l3.setBounds(200, 400, 150, 30);
        //Creating Textfield 1 and setting its boundaries
        JTextField tf1 = new JTextField("");
        tf1.setBounds(275, 100, 200, 30);
        //setting the default values of textfield 1 as 0
        tf1.setText("0");
        //creating Textfield 2 and setting its boundaries
        JTextField tf2 = new JTextField("");
        tf2.setBounds(275, 200, 200, 30);
        //setting the default value of textfield 2 as 0
        tf2.setText("0");
        //adding JTextfield to the swing window frame f and setting its boundaries
        JTextField tf3 = new JTextField();
        tf3.setBounds(350, 400, 150, 30);
        //setting the default value of textfield 3 as 0
        tf3.setText("0");
        // code that will restrict the user to not to edit the value given as the output by the claculator
        tf3.setEditable(false);
        //adding button 1 to the swing window frame f and setting its boundaries
        JButton b1 = new JButton(" + ");
        b1.setBounds(100, 300, 100, 30);
        //adding sum function to the button 1 that is + button
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //declaring and initialising the variables
                double a=0,b=0,c=0;
                //using the try catch block so that it should not throw any kind of input error suppose any alphabets or multiple decimals , etc
                try{
                    //storing values from the textfield where the number is taken in 2 variables a and b
                    a = Double.parseDouble(tf1.getText());
                    b = Double.parseDouble(tf2.getText());
                    //performing operation on it and saving it in c
                    c=a+b;
                    //setting the text of output value to replace it with the current calculated value
                    tf3.setText(String.valueOf(c));
                }//using catch block for catching the exception thrown by the try block 
                catch(Exception ex1){
                    /*when the error will be thrown and caught in catch block it will show an Warning message given below with a new window in front of the original swing window frame f in java*/
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Valid Number", "Warning", JOptionPane.ERROR_MESSAGE);
                    tf1.setText("0");
                    tf2.setText("0");
                    tf3.setText("0");
                }
            }
        });
        //adding button 2 to the swing window frame f and setting its boundaries
        JButton b2 = new JButton(" - ");
        b2.setBounds(200, 300, 100, 30);
        //adding subtract function to the button 2 that is - button
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //declaring and initialising the variables
                double a=0,b=0,c=0;
                //using the try catch block so that it should not throw any kind of input error suppose any alphabets or multiple decimals , etc
                try{
                    //storing values from the textfield where the number is taken in 2 variables a and b
                    a = Double.parseDouble(tf1.getText());
                    b = Double.parseDouble(tf2.getText());
                    //performing operation on it and saving it in c
                    c=a-b;
                    //setting the text of output value to replace it with the current calculated value
                    tf3.setText(String.valueOf(c));
                }//using catch block for catching the exception thrown by the try block 
                catch(Exception ex1){
                    /*when the error will be thrown and caught in catch block it will show an Warning message given below with a new window in front of the original swing windowframe f in java*/
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Valid Number", "Warning", JOptionPane.ERROR_MESSAGE);
                    tf1.setText("0");
                    tf2.setText("0");
                    tf3.setText("0");
                }
            }
        });
        //adding button 3 to the swing window frame f and setting its boundaries
        JButton b3 = new JButton(" x ");
        b3.setBounds(300, 300, 100, 30);
        //adding multiply function to the button 3 that is x button
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //declaring and initialising the variables
                double a=0,b=0,c=0;

                try{
                    //storing values from the textfield where the number is taken in 2 variables a and b
                    a = Double.parseDouble(tf1.getText());
                    b = Double.parseDouble(tf2.getText());
                    //performing operation on it and saving it in c
                    c=a*b;
                    //setting the text of output value to replace it with the current calculated value
                    tf3.setText(String.valueOf(c));
                }//using catch block for catching the exception thrown by the try block 
                catch(Exception ex1){
                    /*when the error will be thrown and caught in catch block it will show an Warning message given below with a new window in front of the original swing window frame f in java*/
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Valid Number", "Warning", JOptionPane.ERROR_MESSAGE);
                    tf1.setText("0");
                    tf2.setText("0");
                    tf3.setText("0");
                }
            }
        }); 
        //adding button4 to the swing window frame f and setting boundaries of it
        JButton b4 = new JButton(" / ");
        b4.setBounds(400, 300, 100, 30);
        //adding divide function to the button / that is button 4
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //declaring and initialising the variables
                double a=0,b=0,c=0;
                //using the try catch block so that it should not throw any kind of input error suppose any alphabets or multiple decimals , etc
                try{
                    //storing values from the textfield where the number is taken in 2 variables a and b
                    a = Double.parseDouble(tf1.getText());
                    b = Double.parseDouble(tf2.getText());
                }//using catch block to catch the exception thrown by the try block
                catch(Exception ex1){
                    /*It will catch an error if the user inputs a number other than double or integer input */
                    JOptionPane.showMessageDialog(new JFrame(), "Please Enter a Valid Number", "Warning", JOptionPane.ERROR_MESSAGE);
                    tf1.setText("0");
                    tf2.setText("0");
                    tf3.setText("0");
                }//another try catch block in continuation with the previous one
                try{
                    //error to check whether there is any exception that b=0
                    c=a/b;
                }//catch block of the thrown exception of second try block
                catch(Exception ex2){
                    /*When b=0 then it will always throw an Warning that a number cannot be divided by 0 in a new swing window frame f in java*/
                    JOptionPane.showMessageDialog(new JFrame(), "Number cannot be divided by 0 ", "Warning", JOptionPane.ERROR_MESSAGE);
                    tf1.setText("0");
                    tf2.setText("0");
                    tf3.setText("0");
                }
                if(b==0){
                    tf3.setText("∞");
                }
                tf3.setText(String.valueOf(c));
            }
        });
        //creating Clear button and setting its boundaries
        JButton b5 = new JButton(" Clear All ");
        b5.setBounds(100, 475, 150, 30);
        //adding function to the Clear button to Clear the input and output JLabels
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("0");
                tf2.setText("0");
                tf3.setText("0");
            }
        });
        //creating Exit Button and setting its boundaries
        JButton b6 = new JButton(" Exit ");
        b6.setBounds(350, 475, 150, 30);
        //adding function on exit button to close the swing window frame f 
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        //adding JLabel 1 , 2 and 3 in the swing window frame f 
        f.add(l1);f.add(l2);f.add(l3);
        //adding textfield 1 ,2 and 3 in the swing window frame f
        f.add(tf1);f.add(tf2);f.add(tf3);
        //adding all the 6 buttons to the swing window frame f
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
        //setting title of the swing window frame
        f.setTitle("Simple Calculator");
        //setting layout of the swing window frame
        f.setLayout(null);
        //setting size of the swing window frame
        f.setSize(650,600);
        //now keeping the frame visible to ous
        f.setVisible(true);
        //the swing window will get closed when the "X" Button will be clicked present at the right corner of the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
