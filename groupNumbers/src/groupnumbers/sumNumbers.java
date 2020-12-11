package groupnumbers;

import static groupnumbers.GroupNumbers.usrInput_a;
import java.util.ArrayList;
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
        //TODO: decide whether to 'sout' in main or .this.
        
        //////////////////LOGIC//////////////////////////
        
        Integer[] inArr = new Integer[input.size()];        //Creating Integer Array from input List.  
        inArr = input.toArray(inArr);                       //INt Array.  
        
        //Variables.  
        String res = "";
        int previous = inArr[0];
        int start = previous;
        
        for(int i = 1; i<inArr.length;i++){
            if(inArr[i] == previous+1){
                if(i==inArr.length-1){
                res = res + start+ "-" + inArr[i] +",";
                }
                
            }else{
                if(start == previous){
                    res = res + start + ",";
                }else{
                    res = res + start + "-" + previous;
                }
                
                if(i == inArr.length-1){
                    res = res + inArr[i]+"";
                }
                start = inArr[i];
            }
            previous = inArr[i];
        }
         //Ressult variable of type String to be returned to main.
        return res;
    }
     
    
    
    
    
//        Integer inArr[] = new Integer[input.size()];      //Creating array from list.  
//        inArr = input.toArray(inArr);
//        
//        String res = inArr[0].toString();
//        for(int i = 0;i<inArr.length;i++){
//            int i1 = i+1;
//            int i2 = i+2;
//            
//            if(inArr[i1].toString().equals(inArr[i].toString())){
//                boolean cond = true;
//                String seqStart;
//                String seqFin;
//                while(cond = true){
//                    if(inArr[i1].toString().equals(inArr[i2].toString())){
//                        seqStart = inArr[i].toString();
//                        res = res + ", "+seqStart;
//                        
//                    }else{
//                        cond = false;
//                        seqFin = inArr[i+1].toString();
//                        res = res + "-" +seqFin;
//                    }
//                }
//            }else{
//                res = res + "";
//            }
//        }
//        res = input.toString();

        

//        Integer[] intArr = new Integer[input.size()];
//        intArr = input.toArray(intArr);
//        
//        Integer[] intArrRef = new Integer[intArr.length+1];
//        intArrRef[0] = 0;
//        for(int i =1; i < intArrRef.length; i++){
//            int j = i - 1;
//            intArrRef[i] = intArr[j];
//        }
//        
//        for(int c = 0; c < intArrRef.length; c++){
//            if(intArr[c]!=intArrRef[c] && intArr[c]!=intArr[c+1]){
//                res = intArr[c]+", ";
//            }
//        }
        
        
    
        
//* Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
// * Result: "1, 3, 6-8, 12-15, 21-24, 31"        

        
    
}
