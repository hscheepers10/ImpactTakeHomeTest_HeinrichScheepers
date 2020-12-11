package groupnumbers;

import static groupnumbers.GroupNumbers.usrInput_a;
import static groupnumbers.GroupNumbers.usrInput_b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Heinrich Scheepers.  
 */

public class sumNumbers implements NumberRangeSummarizer{

    ///// GETTING USER INPUT /////  
    @Override
    public Collection<Integer> collect(String input) {
        //for manual data input leave as is.  
        //for static input, use usrInput_b and comment out usrInput_a
        input = usrInput_a;                                   
//        input = usrInput_b;

        String[] InStringArr = input.split(",");                    //Converting String received from user into String Array by splitting ","  

        List<Integer> intList = Arrays.stream(InStringArr)          //Obtaining a stream instance from int String Array.  
                .map(Integer::parseInt)                             //Parsing String elements in Stream to Integer.  
                .distinct()                                         //Removing duplicates from List.  
                .collect(Collectors.toList());                      //Collecting parsed integers and saving as List of type Integer.  
        Collections.sort(intList);                                  //Added sort to sort data automatically before sending to summarize.    

        return intList;                                             //Returns collection of type Integer (Required).  
    }

    
    ///// SUMMARIZING DATA /////  
    @Override
    public String summarizeCollection(Collection<Integer> input) {
        //Calling collect method. || again use usrInput_a for manual user data and usrInput_b for static user data variable created in Main. 
          
        input = this.collect(usrInput_a);
//        input = this.collect(usrInput_b);
        
        //////////////////LOGIC//////////////////////////
        Integer[] inArr = new Integer[input.size()];                //Creating Integer Array from input List.  
        inArr = input.toArray(inArr);                               //Int Array.  
        
        //Variables.  
        String res = "";                                            //return variable.  
        
        //Starting values of start and previous.  They get updated in the loop.  
        int previous = inArr[0];
        int start = previous;
        
        for(int i = 1; i<inArr.length;i++){                         //For loop iterating through array.  
            if(inArr[i] == previous+1){                             //compares second element in the arry's value to previous element's value + 1, if true...
                if(i==inArr.length-1){                              //...compares value of i to the array length -1, if true this will add sequencial numbers: 'start' - inArr[i];   
                res = res + start+ "-" + inArr[i] ;                 //------> this will usually happen at the end of Array and numbers are sequensial.
                }
                
            }else{                                                      //Else.  
                if(start == previous){                                  //compares start to previous 
                    res = res + start + ", ";                           //if true... adds 'start' to res as a non sequencial number.
                    
                }else{                                                      //Else.  
                    res = res + start + "-" + previous+ ", ";               //...adds strings 'start' - 'previous' to res as sequensial numbers.  
                }
                
                if(i == inArr.length-1){                            //...compares value of i to array length -1, if true 
                    res = res + inArr[i]+"";                        //... inArr[i] is added as non sequencial number to res.  -----> will also be at the end of iterating the array.    
                }
                start = inArr[i];                                   //end of condition check, start updates index with counter (i).  
            }
            previous = inArr[i];                                    //end of condition check, start updates index with counter (i).
        }
        
        //Ressult variable of type String to be returned to main.
        return res;
    }
}
