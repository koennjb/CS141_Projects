/**
 * lab2 is a package to hold all class files and required images for the lab2 assignment.
 * @author Koenn Becker
 * @version 1.0.0
 */
package project1;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *  Calculates a monthly loan payment given loan amount,
 *  interest rate, and years of loan. Uses Java Swing for GUI
 *  <p>
 *  Environment:    PC, Windows 10, JDK 1.8.0_151, NetBeans 8.2
 *  <p>
 *  Date:           1/10/2018 
 *  <p>
 *  History Log:    1/8/2018
 *  <p>
 *  @author         Koenn Becker
 *  @version        1.0.0
 */
public class Validation {
     //Defines constants for max amounts
    static final double MAX_INTEREST_RATE = 100;
    static final int MAX_COMPOUNDINGS = 12;
    static final double MAX_YEARS = 50;
   
    public static ValidationResult validatePayment(JTextField payArg, JLabel errorOutput) {
        
        ValidationResult result = new ValidationResult();
    
        try {
        
            result.value = Double.parseDouble(payArg.getText());
            
            result.notValid = (result.value < 0);
            
            if (result.notValid) {
                throw new NumberFormatException();
            }
            else {
                return result;       
            } 
        }
        catch (NumberFormatException e){

            errorOutput.setText("Please ensure payment field has a value greater than 0.");
            payArg.requestFocus();
            payArg.selectAll();
            result.notValid = true;
            //result.paymentValue = 0;
            return result;
        
        }
    
    }
    public static ValidationResult validateInterest(JSpinner interestArg, JLabel errorOutput) {
        
        ValidationResult result = new ValidationResult();
    
        try {
            
            // Casts value of spinner into double and then divides by 100 to get decimal
            result.value = Double.parseDouble(interestArg.getValue().toString()) / 100; 
            
            result.notValid = (result.value <= 0);
            
            if (result.notValid) {
                throw new NumberFormatException();
            }
            else {
                return result;       
            } 
        }
        catch (NumberFormatException e){
            errorOutput.setText("Please ensure interest rate is greater than 0%");
            interestArg.requestFocus();
            result.notValid = true;
            return result;
        
        }
    
    }
    public static ValidationResult validateCompound(JTextField compoundArg, JLabel errorOutput) {
        
        ValidationResult result = new ValidationResult();
    
        try {
        
            result.shrtValue = Short.parseShort(compoundArg.getText());
            
            result.notValid = (result.shrtValue < 0 || result.shrtValue > MAX_COMPOUNDINGS);
            
            if (result.notValid) {
                throw new NumberFormatException();
            }
            else {
                return result;
            } 
            
        }
        catch (NumberFormatException e){
            errorOutput.setText("<html>Please ensure that the compoundings field \n has a value between 1 and "
                    + MAX_COMPOUNDINGS + ".</html>");
            compoundArg.requestFocus();
            compoundArg.selectAll();
            result.notValid = true;
            //result.compoundsValue = 0;
            return result;
        
        }
    }
    public static ValidationResult validateYear(JTextField yearArg, JLabel errorOutput) {
        
        ValidationResult result = new ValidationResult();
    
        try {
        
            result.value = Short.parseShort(yearArg.getText());
            
            result.notValid = (result.value < 0 || result.value > MAX_YEARS);
            
            if (result.notValid) {
                throw new NumberFormatException();
            }
            else {
                return result;
            } 
        }
        catch (NumberFormatException e){
            errorOutput.setText("<html>Please ensure that the years field has a value between 1 and "
                    + MAX_YEARS + ".</html>");
            yearArg.requestFocus();
            yearArg.selectAll();
            result.notValid = true;
            //result.yearsValue = 0;
            return result;
        
        }
    }
   
}
