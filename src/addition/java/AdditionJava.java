/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition.java;

import javax.swing.JOptionPane;

/**
 *
 * @author mukhethwa magadani
 */
public class AdditionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaring datatype and obtain user input from JOptionPane input dialog
        String firstNumber;
        String secondNumber;
        
        firstNumber = JOptionPane.showInputDialog("Enter first number"   );
        secondNumber = JOptionPane.showInputDialog("Enter second number"   );
        
        //convert String inputs to int values for use
        int number1;
        int number2;
        int sum;
        
        number1= Integer.parseInt(firstNumber);
        number2= Integer.parseInt(secondNumber);
        sum= number1 + number2; //finding the sum
        
        //Display results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The Sum is "+ sum,"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
    
}
