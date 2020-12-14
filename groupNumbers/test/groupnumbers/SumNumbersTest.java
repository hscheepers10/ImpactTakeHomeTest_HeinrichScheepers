package groupnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heinrich Scheepers.  
 */
public class SumNumbersTest {

    /**
     * Test of collect method, of class SumNumbers. Testing to see if return is
     * null.
     */
    @Test
    public void testCollectShouldReturnNull() {
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
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        SumNumbers instance = new SumNumbers();

        List<Integer> list = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        Collection<Integer> expResult = new ArrayList<>();
        expResult.addAll(list);
        
        List<Integer> actualResult = (List<Integer>) instance.collect(input);

        assertEquals(expResult, actualResult);
    }

    /**
     * Test of summarizeCollection method, of class SumNumbers.
     * result should be equals to "1, 3, 6-8, 12-15, 21-24, 31"
     */
    @Test
    public void testSummarizeCollectionWithGivenData() {
        SumNumbers instance = new SumNumbers();
        List<Integer> collectInput = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);

        String expResult = "1, 3, 6-8, 12-15, 21-24, 31";
        String result = instance.summarizeCollection(collectInput);
        assertEquals(expResult, result);                                        //Equals
    }
    
    /*
     * Testing SummarizeCollection with own Data.  
     * Should equal "1-2, 2, 1"
     */
    @Test
    public void testSummarizeCollection() {
        SumNumbers instance = new SumNumbers();
        List<Integer> collectInput = Arrays.asList(1,2,2,1);

        String expResult = "1-2, 2, 1";
        String result = instance.summarizeCollection(collectInput);
        assertEquals(expResult, result);                                        //Equals
    }
}
