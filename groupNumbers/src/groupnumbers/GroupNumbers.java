package groupnumbers;

import java.util.Scanner;

/*
 * @author Heinrich Scheepers
 */

public class GroupNumbers {

    //Variables.  
    //Two data variables for user data && static pre entered data.
    public static String usrInput_a ;                                                       //user input received through scanner.       
    public static String usrInput_b = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";               //static string of numbers for test purposes. 
    
    public static void main(String[] args) {
        //Scanner.  
        Scanner cin = new Scanner(System.in);
        
        //User interraction.  
        System.out.println("Enter numbers sepperated buy commas: ");
        usrInput_a = cin.next();
        
        //if using static variable usrInput_b. comment out two lines of code above (line 21 and 22). and un-comment line below(line 25).    
//        System.out.println("Sample Input: \"1,3,6,7,8,12,13,14,15,21,22,23,24,31\"");
        
        //instance class sumNumber that implements NumberRangeSummarizer interface.  
        sumNumbers sum1 = new sumNumbers();
        
        System.out.println("Result: "+sum1.summarizeCollection(sum1.collect(usrInput_a)));  //collect class in't called from here 
                                                                                            //but rather from summariseCollection class.  
    }
}
