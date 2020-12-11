/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupnumbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heinrich Scheepers
 */
public class sumNumbersTest {

    public sumNumbersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of collect method, of class sumNumbers.
     */
    @Test
    public void testCollect() {
        System.out.println("collect");
        
        int[] expectedArr = {1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31};
        List<Integer> expList = new ArrayList<>(expectedArr.length);
        for(int i : expectedArr){
            expList.add(i);
        }
        
        String input = GroupNumbers.usrInput_b;
        sumNumbers instance = new sumNumbers();
        Collection<Integer> expResult = expList;
        Collection<Integer> result = instance.collect(input);
        assertEquals(expResult, result);
        fail("Input Error: something went wrong");
    }

    /**
     * Test of summarizeCollection method, of class sumNumbers.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection");
        Collection<Integer> input = null;
        sumNumbers instance = new sumNumbers();
        String expResult = "";
        String result = instance.summarizeCollection(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
