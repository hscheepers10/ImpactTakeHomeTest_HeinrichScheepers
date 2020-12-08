package groupnumbers;

import static groupnumbers.GroupNumbers.usrInput_b;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Heinrich Scheepers.  
 */

public class sumNumbers implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        input = usrInput_b;                             //Assigning input interface's String variable.  

        String[] arr = input.split(",");                //Converting String into Array by splitting ",".  

        List<Integer> intList = Arrays.stream(arr)      //Creating List by ....
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        return intList;                                 //Returns collection of type Integer (Required).  
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        
        
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
