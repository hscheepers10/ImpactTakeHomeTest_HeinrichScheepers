package groupnumbers;

import java.util.Scanner;

/**
 * @author Heinrich Scheepers
 */

public class GroupNumbers {

    //Variables.  
    //Two data variables for user data'usrInput_a' && static pre entered data 'usrInput_b'.
    public static String usrInput_a ;                                                       //user input received through scanner.       
    public static String usrInput_b = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";                 //static string of numbers for test purposes. 
    
    public static void main(String[] args) {
        //Scanner, only used with usrInput_a.    
//        Scanner cin = new Scanner(System.in);
        
        //User interraction (usrInput_a).  
//        System.out.println("Enter numbers sepperated buy commas: ");
//        usrInput_a = cin.next();
        
        //if using static variable (usrInput_b)     
        System.out.println("Sample Input: \"1,3,6,7,8,12,13,14,15,21,22,23,24,31\"");
        
        //instance class sumNumber that implements NumberRangeSummarizer interface.  
        sumNumbers sum1 = new sumNumbers();
        
        //collect method is called through the summarizeCollection method.  
        System.out.println("Result: "+sum1.summarizeCollection(sum1.collect(usrInput_b)));  
                                                                                            
    }
}
