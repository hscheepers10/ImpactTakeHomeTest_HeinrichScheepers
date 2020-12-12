/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupnumbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Heinrich Scheepers
 */
public class GroupNumbersTest {
    public GroupNumbersTest() {
        
    }
    
    //usrInput_b which is static input variable should not be null.  
    @Test   
    public void usrInput_bShouldNotBeNull() {
        assertNotNull(GroupNumbers.testData);
    }
}
