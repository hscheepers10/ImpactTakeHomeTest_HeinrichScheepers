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
        input = usrInput_b;     //Assigning input interface's String variable.  
//        String[] StringInputArr = input.split(",");
//        
//        int[] intInputArr = new int[StringInputArr.length];
//        for(int i = 0;i <=StringInputArr.length;i++){
//            String num = StringInputArr[i];
//            intInputArr[i] = Integer.parseInt(num);
//            
//        }
        
        String[] arr = input.split(",");

        List<Integer> intList = Arrays.stream(arr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        return intList;
        
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
