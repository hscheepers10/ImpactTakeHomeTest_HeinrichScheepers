package groupnumbers;

import static groupnumbers.GroupNumbers.usrInput_a;
//import static groupnumbers.GroupNumbers.usrInput_b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Heinrich Scheepers.  
 */

public class sumNumbers implements NumberRangeSummarizer{

    
    //Getting user input.  
    @Override
    public Collection<Integer> collect(String input) {
        input = usrInput_a;                                 //Assigning input interface's String variable.  

        String[] arr = input.split(",");                    //Converting String into Array by splitting ",".  

        List<Integer> intList = Arrays.stream(arr)          //Creating List by ....
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.sort(intList);                          //Added sort to sort data automatically.  
                
        //TODO: Duplicates ????
        //TODO: Sort list through stream ????
        //TODO: Change variables to compliment current setting.  
        
        return intList;                                     //Returns collection of type Integer (Required).  
    }

    
    
    
    //Summarizing data.  
    @Override
    public String summarizeCollection(Collection<Integer> input) {  
        String res;                                    //Ressult variable of type String to be returned to main.
        //TODO: decide whether to 'sout' in main or .this.
        
        
        input = this.collect(usrInput_a);
        
        res = input.toString();
        
        
        //////////////////LOGIC//////////////////////////
        
        
        
        
        return res;
    }
    
}
