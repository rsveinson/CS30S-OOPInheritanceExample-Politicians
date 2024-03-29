/********************************************************************
 * Programmer:  sveinson
 * Class:  CS20S
 *
 * Assignment: AxQy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 ***********************************************************************/

// import java libraries here as needed

import javax.swing.*;
import java.util.ArrayList;

//import java.text.DecimalFormat;
import java.io.*;
import java.text.NumberFormat;

public class Mlas {  // begin class

    public static void main(String[] args)throws IOException {  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;       // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ :,/]+";   // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input

        String nl = System.lineSeparator();
        // new line character for file writing

        // ***** create objects *******

        //DecimalFormat df1 = new DecimalFormat("##.###");
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // the ProgramInfo class has both a default and initialized constructor
        // so you can choose which model you want to employ

        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");

        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));

        // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());

        // ************************ get input **********************
        /* input will now come from an external file so there
        will not normally be a need for a prompt

        prompt = "Enter your prompt text here. \n"; 
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);     
         */
        // read a line of data from the external text file

        // ************************ processing ***************************

        // testing Politician
        Politician p = new Politician();
        Politician p1 = new Politician("Robert", "Oppenhiemer", "Central", "NDP", 100000);

        System.out.println(p.getFirstName() + " " + p.getSalary());
        System.out.println(p1.getLastName() + " " + p1.getRiding() + " " + p1.getParty());
        System.out.println(p1.getLastName() + " " + p1.getSalary());

        p.setFirstName("Max");
        p.setLastName("Plank");
        p.setRiding("Southdale");
        p.setParty("Liberal");
        p.setSalary(100000.0);

        System.out.println();
        System.out.println("See the results of the setters");
        System.out.println(p.getFirstName() + " " + p.getSalary());
        System.out.println(p.getLastName() + " " + p.getRiding());
        System.out.println(p.getFirstName() + " " + p.getParty());

        System.out.println();
        System.out.println("Testing getName()");
        System.out.println(p1.getName());

        System.out.println();
        System.out.println("Testing toString()");
        System.out.println(p1);
        
        // testing CabinetMinister
        //"Robert", "Oppenhiemer", "Central", "NDP", 100000
        CabinetMinister cb1 = new CabinetMinister("Nelo", "Altomar",
                                    "Transcona", "NDP", 100000, "Edu");
                                    
        // getName()
        System.out.println();
        System.out.println("Testing CabinetMinister getName()");
        System.out.println(cb1);
        
        System.out.println();
        System.out.println("Testing CabinetMinister toString()");
        System.out.println(cb1);
        
        System.out.println();
        System.out.println("Testing CabinetMinister displayInfo()");
        
        // add some committees
        cb1.addCommittee("Tourism");
        cb1.addCommittee("HealthCare");
        cb1.addCommittee("Agriculture");
        System.out.println(cb1.displayInfo());
        
        // test Premier
        Premier prem = new Premier("Winston", "Churchill", "South", "Whig", 100000, 4.3, 35);
        
        System.out.println();
        System.out.println("Testing Premier getName()");
        System.out.println("The Premier is: " + prem.getName());
        
        System.out.println();
        System.out.println("Testing Premier getrSalary()");
        System.out.println("The Premier is: " + currency.format(prem.getSalary()));
        
        /* the premier's part has lost some seats
         * use the setter to set the new number of seats 
         * and then display the new slaray
         */
        
        System.out.println();
        System.out.println("Testing Premier getSalary() and set new number of seats");
        System.out.println("Salary should be reduced by $10,000");
        prem.setSeats(30);       // now 30 seats instead of 35
        System.out.println("The Premier is: " + currency.format(prem.getSalary()));

        /* now test them all together
         * using an ArrayList of type <Politician> we can 
         * have a collection of Politicians, CabinetMinisters
         * and premiers. Why is this?
         * Because CabinetMinister and Premier extend Poltitician so 
         * there is a "is a" relationship
         * 
         * we have Politicians p and p1
         * CabinetMinisters cb1
         * Premier prem
         */
        
        ArrayList<Politician> list = new ArrayList<>();
        System.out.println();
        System.out.println("Testing driver array list of politicians");
        
        // add some objects to the list
        list.add(p);
        list.add(p1);
        list.add(cb1);
        list.add(prem);
        
        //System.out.println(list);
        for(Politician pol : list){
            //System.out.println(pol);
            System.out.println(pol.getName());
        }
        
        // accessing sub-class features from the arraylist
        Premier tempPrem = (Premier)list.get(3);
        tempPrem.setSeats(25);
        System.out.println(tempPrem.getSalary());
        System.out.println(list.get(3).getSalary());
        
        // use instanceof
        for(Politician pol : list){
            String type = "Politician";
            if(pol instanceof CabinetMinister){
                type = "Cabinet Minister";
            }
            
            if(pol instanceof Premier){
                type = "Premier";
            }
            System.out.println(type);
        }
        
        // ************************ print output ****************************

        // ******** closing message *********
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());

        // ***** close streams *****

        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream

    }  // end main
}  // end class
