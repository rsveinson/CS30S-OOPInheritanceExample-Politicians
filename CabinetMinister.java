import java.util.ArrayList;
import java.text.NumberFormat;

/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

// import libraries as needed here

public class CabinetMinister extends Politician{
    //*** Class Variables ***
    
    private static final double COMMITTEAMOUNT =  8500.00;
    private static final String nl = System.lineSeparator();
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    //*** Instance Variables ***
    
    private String cabinetPost;
    private ArrayList<String> committees;
    
    // since we calcualte this on demand there's no
    // need for a field
    //private double committeeStipend;
    
    //*** Constructors ***
    public CabinetMinister(){
        // implicit call to superclass no-arg constructor
        cabinetPost = "Unknown";
        committees = new ArrayList<String>();
        //committeeStipend = 0;
    }// end no-arg
    
    // super class full arg constructor arguments
    //String fn, String ln, String r, String p, double sal
    public CabinetMinister(String fn, String ln, String r, 
                        String p, double sal, String cp){
        super(fn, ln, r, p, sal);
        committees = new ArrayList<>();
        cabinetPost = cp;
        //committeeStipend = 0;
    }// end full-arg
                        
    //*** Getters ***
    public String getCabinetPost(){
        return cabinetPost;
    }
    
    public ArrayList<String> getCommittees(){
        return committees;
    }
    
    //** might remove this
    // public double getCommitteeStipend(){
        // return committeeStipend;
    // }
    
    //*** Setters ***
    public void setCabinetPost(String cp){
        cabinetPost = cp;
    }
    
    public void setCommittees(ArrayList<String> c){
        committees = c;
    }
    
    // *** utilities ***
    public void addCommittee(String com){
        committees.add(com);
    }// end add committee
    
    // remove committee???
    //<lastName>: <party>: <cabinetPost>
    @Override
    public String getName(){
        StringBuilder st = new StringBuilder();
        
        st.append(lastName).append(": ").append(party);
        st.append(": ").append(cabinetPost);
        
        return st.toString();
    }// end to string
    
    
    // calculate the committe stipend
    private double calculateStipend(){
        double stipendAmount = 0;
        
        for(String c : committees){
            stipendAmount += COMMITTEAMOUNT;
        }// end enhanced for
        
        
        return stipendAmount;
    }// end calc stipend 
    
    /* this method will display the cabinet
     * minister's Name, cabinet post
     * list of committees, salary, committee stipend
     * and total pay
     */
    public String displayInfo(){
        StringBuilder st = new StringBuilder();
        double totalPay = 0.0;
        
        // add name and cabinet post
        st.append(firstName).append(" ");
        st.append(lastName).append(" ");
        st.append(cabinetPost).append(nl).append(nl);
        st.append("Committees:").append(nl);
        
        // add list of committees
        for(String c : committees){
            st.append(c);
            st.append(nl);
        }// end for each committee
        
        // get salary and committee stipend
        totalPay = salary + calculateStipend();
        st.append(nl).append("Salary and stipends:").append(nl);
        st.append("Salary: ").append(currency.format(getSalary())).append(nl);
        st.append("Committee Stipend: ");
        st.append(currency.format(calculateStipend())).append(nl);
        st.append("Total Pay: ").append(currency.format(totalPay)).append(nl);
        
        
        return st.toString();
    }// end displayInfo
    
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
