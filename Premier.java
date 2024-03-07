/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

// import libraries as needed here

public class Premier extends Politician{
    //*** Class Variables ***
    
    private static final double PERSEATINCREASE = 2000;
    
    //*** Instance Variables ***
    
    private double approvalRating;
    private int seats;
    
    //*** Constructors ***
    public Premier(){
        approvalRating = 0.0;
        seats = 0;
    }
    
    /*String fn, String ln, String r,String p, double sal */
    public Premier(String fn, String ln, String r,String p, double sal,
                double ar, int s){
        super(fn, ln, r, p, sal);
        this.approvalRating = ar;
        this.seats = s;
        
        // call the salaryIncrease() method to add to the salary
        salary += salaryIncrease();
    }
    
    //*** Getters ***
    public double getApprovalRating(){
        return approvalRating;
    }
    
    public int getSeats(){
        return seats;
    }
    
    //*** Setters ***
    public void setApprovalRating(double ar){
        approvalRating = ar;
    }
    
    public void setSeats(int s){
        seats = s;
        
        /* if the number of seats changes the 
         * salary of the premier changes so 
         * we call salaryIncrease() again
         */
        salary = BASESALARY + salaryIncrease();
    }
    
    // *** utilities ***
    @Override
    public String getName(){
        StringBuilder st = new StringBuilder();
        
        st.append("Hn ");
        st.append(firstName).append(" ").append(lastName);
        st.append(", ").append(party).append(": ");
        st.append(String.format("Approval %.1f", approvalRating));
        
        return st.toString();
    }
    
    private double salaryIncrease(){
        return PERSEATINCREASE * seats;
    }
    
} // end of public class


    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/