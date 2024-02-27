/********************************************************************
 * Programmer:      sveinson
 * Class:           CS30S
 *
 * Assignment:      Politician class
 *
 * Description: super class for the Politician hiearchy/inheritance
 *              example
 ***********************************************************************/

// import libraries as needed here
import java.text.NumberFormat;

public class Politician {
    //*** Class Variables ***

    public static NumberFormat currency = NumberFormat.getCurrencyInstance();

    //*** Instance Variables ***

    protected String firstName;
    protected String lastName;
    protected String riding;    // the area represnted by an elected politician
    protected String party;     // political group of a politician
    protected double salary;    

    //*** Constructors ***
    public Politician(){
        firstName = lastName = riding = party = "Unknown";
        salary = 0.0;
    }// end no-arg

    public Politician(String fn, String ln, String r,
    String p, double sal){
        firstName = fn;
        lastName = ln;
        riding = r;
        party = p;
        salary = sal;

    }// end full arg

    // ** getters **
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getRiding(){
        return riding;
    }

    public String getParty(){
        return party;
    }

    public double getSalary(){
        return salary;
    }

    //*** Setters ***
    public void setFirstName(String fn){
        this.firstName = fn;
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }

    public void setRiding(String r){
        this.riding = r;
    }

    public void setParty(String p){
        this.party = p;
    }

    public void setSalary(double s){
        this.salary = s;
    }

    // ** utility **
    public String getName(){
        StringBuilder st = new StringBuilder();
        st.append(firstName.charAt(0));
        st.append(". ").append(lastName);
        st.append(": ");
        st.append(party).append(" ");
        st.append(currency.format(salary));

        return st.toString();
    }// end getName()

    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append(lastName);
        st.append(": ");
        st.append(party).append(", ");
        st.append(riding);

        return st.toString();   
    }// end toString()

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
