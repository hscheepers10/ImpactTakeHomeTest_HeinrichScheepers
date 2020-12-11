/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetsum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LeetSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<String>();
 
    if(nums == null || nums.length==0)
        return result;
 
    if(nums.length==1){
        result.add(nums[0]+"");
    }
 
    int pre = nums[0]; // previous element   
    int first = pre; // first element of each range
 
    for(int i=1; i<nums.length; i++){
            if(nums[i]==pre+1){
                if(i==nums.length-1){
                    result.add(first+"->"+nums[i]);
                }
            }else{
                if(first == pre){
                    result.add(first+"");
                }else{
                    result.add(first + "->"+pre);   
                }
 
                if(i==nums.length-1){
                    result.add(nums[i]+"");
                }
 
                first = nums[i];
            }
 
            pre = nums[i];
    }
 
    return result;
    }
    
}
