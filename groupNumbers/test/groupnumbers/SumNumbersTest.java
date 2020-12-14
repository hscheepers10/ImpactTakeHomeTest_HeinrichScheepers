/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupnumbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class SumNumbersTest {

    /**
     * Test of collect method, of class SumNumbers. Testing to see if return is
     * null.
     */
    @Test
    public void testCollectSouldReturnNull() {
        System.out.println("If collected String is not Integers, return 'wrong input' null");
        String input = "1,2,NANI,3,4";
        SumNumbers instance = new SumNumbers();
        Collection<Integer> expResult = null;
        Collection<Integer> result = instance.collect(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of collect method, of class SumNumbers. Testing whether returns
     * list.
     */
    @Test
    public void testCollectShouldReturnListInt() {
        System.out.println("If collected String is Integers only return intList ");
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        SumNumbers instance = new SumNumbers();

        String[] testArr = input.split(",");
        List<Integer> expResult = Arrays.stream(testArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> actualResult = (List<Integer>) instance.collect(input);

        assertEquals(expResult, actualResult);
    }

    /**
     * Test of collect method, of class SumNumbers. Testing whether String
     * input's length is 36.
     */
    @Test
    public void testInputFromTestDataSize() {
        System.out.println("Testing testData size");
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        int expResult = 36;
        int actualResult = input.length();
        assertEquals(expResult, actualResult);
    }

    /**
     * Test of summarizeCollection method, of class SumNumbers.
     */
    @Test
    public void testSummarizeCollectionShouldReturnSummary() {
        System.out.println("summarizeCollection with testData");
        String testData = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        SumNumbers instance = new SumNumbers();
        String[] testArr = testData.split(",");
        List<Integer> collectInput = Arrays.stream(testArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String expResult = "1, 3, 6-8, 12-15, 21-24, 31";
        String result = instance.summarizeCollection(collectInput);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of summarizeCollection method, of class SumNumbers.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection with testData");
        String testData = "1,4,5,55";
        SumNumbers instance = new SumNumbers();
        String[] testArr = testData.split(",");
        List<Integer> collectInput = Arrays.stream(testArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String expResult = "1, 4-5, 55";
        String result = instance.summarizeCollection(collectInput);
        assertEquals(expResult, result);
    }

}
