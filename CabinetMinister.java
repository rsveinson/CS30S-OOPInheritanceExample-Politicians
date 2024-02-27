import java.util.ArrayList;

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
    
    //*** Instance Variables ***
    
    private String cabinetPost;
    private ArrayList<String> committees;
    private double committeeStipend;
    
    //*** Constructors ***
    public CabinetMinister(){
        // implicit call to superclass no-arg constructor
        cabinetPost = "Unknown";
        committees = new ArrayList<String>();
        committeeStipend = 0;
    }// end no-arg
    
    // super class full arg constructor arguments
    //String fn, String ln, String r, String p, double sal
    public CabinetMinister(String fn, String ln, String r, 
                        String p, double sal, String cp){
        super(fn, ln, r, p, sal);
        committees = new ArrayList<>();
        committeeStipend = 0;
    }// end full-arg
                        
    //*** Getters ***
    public String getCabinetPost(){
        return cabinetPost;
    }
    
    public ArrayList<String> getCommittees(){
        return committees;
    }
    
    //** might remove this
    public double getCommitteeStipend(){
        return committeeStipend;
    }
    
    //*** Setters ***
    public void setCabinetPost(String cp){
        cabinetPost = cp;
    }
    
    public void setCommittees(ArrayList<String> c){
        committees = c;
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
