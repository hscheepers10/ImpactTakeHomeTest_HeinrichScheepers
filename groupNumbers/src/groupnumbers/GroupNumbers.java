package groupnumbers;

import java.util.Scanner;

/*
 * @author Heinrich Scheepers
 */

public class GroupNumbers {

    //Variables.  
    public static String usrInput_a ;                                             //inout received from user.  
//    public static String usrInput_b = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";     //static string of numbers for test purposes. 
    
    public static void main(String[] args) {
        //Scanner.  
        Scanner cin = new Scanner(System.in);
        
        //User interraction.  
        System.out.println("Enter numbers sepperated buy commas: ");
        usrInput_a = cin.next();
        
        //instance class sumNumber that implements NumberRangeSummarizer interface.  
        sumNumbers sum1 = new sumNumbers();
        
        //Test purposes.  
        //Actual calling of methods will happen in sumNumbers class.  
//        System.out.println(sum1.collect(usrInput_b));
        System.out.println("Nani: "+sum1.summarizeCollection(sum1.collect(usrInput_a)));
        
        

        
    }
    
}
