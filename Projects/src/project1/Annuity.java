package project1;


/**
* This class is used to calculate the annuity of an account. It has methods to
* return the output for the total annuity, total payments made, and total interest earned.
* 
* <p>
* <b>Class:</b>         Annuity
* <p>
* <b>File:</b>          Annuity.java
* <p>
* <b>Environment:</b>   PC, Windows 10, JDK 1.8.0_151, NetBeans 8.2
* <p>
* <b>Date:</b>          1/19/2018 
* <p>
* <b>History Log:</b>   1/19/2018
* <p>
* @author               Koenn Becker
* @version              1.0.0
* @see                  project1.FutureAnnuity
* @see                  #getAnnuity() 
* @see                  #getPayments() 
* @see                  #getInterest() 
* 
*/ 
public class Annuity {
    // Variable declaration
    double payment;
    double interest;
    short compounds;
    double years;
 
    /**        
    * <b>Constructor:</b>   Annuity
    * <p>
    * <b>Description:</b>   Assigns variables to arguments passed through the parameters.
    * <p>
    * <b>Date Created:</b>  1/19/2018 
    * <p>
    * @author               Koenn Becker
    * @param                paymentParameter Double - The amount to use as the payment
    * @param                interestParameter Double - The interest amount to use in the calculation
    * @param                compoundsParameter Short - The number of compounds a year to use in the calculation
    * @param                yearsParameter Double - The number of years to collect annuity in the calculation
    * 
    */
    public Annuity(Double paymentParameter, Double interestParameter, Short compoundsParameter, Double yearsParameter) {
        
        
        payment = paymentParameter;
        interest = interestParameter;
        compounds = compoundsParameter;
        years = yearsParameter;

    }
    
    /**        
    * <b>Method:</b>        getAnnuity()
    * <p>
    * <b>Description:</b>   Returns the annuity as a double, which, is calculated
    *                       with the variables assigned in the Annuity constructor
    * <p>
    * <b>Date Created:</b>  1/19/2018 
    * <p>
    * @author               Koenn Becker
    * @return               Returns a double containing total annuity
    * @see                  project1.Annuity 
    */ 
    public double getAnnuity() {
        // Calculate annuity
        return payment * (Math.pow(1 + (interest / compounds), years * compounds) - 1) /
                (interest / compounds);
      
    }
    
    /**        
    * <b>Method:</b>        getPayment()
    * <p>
    * <b>Description:</b>   Returns the total payments made over the length of years
    *                       input
    * <p>
    * <b>Date Created:</b>  1/19/2018 
    * <p>
    * @author               Koenn Becker
    * @return               Returns a double containing total payments made
    */ 
    public double getPayments(){
        // Calculates total payments made
        return payment * (compounds * years);
    }
    
    /**        
    * <b>Method:</b>        getInterest()
    * <p>
    * <b>Description:</b>   Returns the total interest earned from the annuity account
    *                       by subtracting the payments made from the total of the annuity account
    * <p>
    * <b>Date Created:</b>  1/19/2018 
    * <p>
    * @author               Koenn Becker
    * @return               Returns a double containing the total interest earned
    */ 
    public double getInterest() {
        // Calculates the total interest earned by subtracting the total amount of payments from the annuity balance
        return getAnnuity() - getPayments();
    }
}
