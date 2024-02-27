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

        // testing
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

        // ************************ print output ****************************

        // ******** closing message *********
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());

        // ***** close streams *****

        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream

    }  // end main
}  // end class
