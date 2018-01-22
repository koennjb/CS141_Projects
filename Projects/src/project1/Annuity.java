/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;


/**
 *
 * @author Koenn
 */
public class Annuity {
  
    double payment;
    double interest;
    short compounds;
    double years;
    
    double annuity;
    double paymentTotal;
    double interestTotal;
        
    
    public Annuity(Double paymentParameter, Double interestParameter, Short compoundsParameter, Double yearsParameter) {
        
        
        payment = paymentParameter;
        interest = interestParameter;
        compounds = compoundsParameter;
        years = yearsParameter;

    }
    
    public double calculateAnnuity() {
        // Calculate annuity
        annuity = payment * (Math.pow(1 + (interest / compounds), years * compounds) - 1) /
                (interest / compounds);
        return annuity;
    }
    
    public double getPayments(){
        // Calculates total payments made
        paymentTotal = payment * (compounds * years);
        return paymentTotal;
    }
    
    public double getInterest() {
        // Calculates the total interest earned by subtracting the total amount of payments from the annuity balance
        interestTotal = annuity - paymentTotal;
        return interestTotal;
    }
}
