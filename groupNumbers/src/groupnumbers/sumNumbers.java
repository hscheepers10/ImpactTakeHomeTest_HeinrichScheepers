package groupnumbers;

import static groupnumbers.GroupNumbers.usrInput_a;
//import static groupnumbers.GroupNumbers.usrInput_b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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
        input = this.collect(usrInput_a);
                                         //Ressult variable of type String to be returned to main.
        //TODO: decide whether to 'sout' in main or .this.
        
        
        
        
        
        
        //////////////////LOGIC//////////////////////////
        
//        Iterator<Integer> iter = input.iterator();
//        
//        while(iter.hasNext()){
//            int c = iter.next();
//            if(c==iter.next()+1){
//                
//            }
//        }
        
        Integer inArr[] = new Integer[input.size()];      //Creating array from list.  
        inArr = input.toArray(inArr);
        
        String res = inArr[0].toString();
        
        for(int i = 0;i<=inArr.length;i++){
            if(inArr[i+1].toString().equals(inArr[i].toString())){
                boolean cond = true;
                String seqStart;
                String seqFin;
                while(cond = true){
                    if(inArr[i+1].toString().equals(inArr[i+2].toString())){
                        seqStart = inArr[i].toString();
                        res = res + ", "+seqStart;
                        
                    }else{
                        cond = false;
                        seqFin = inArr[i+1].toString();
                        res = res + "-" +seqFin;
                    }
                }
            }else{
                res = res + "";
            }
        }
        

        
        
        
        res = input.toString();
        return res;
    }
    
}
