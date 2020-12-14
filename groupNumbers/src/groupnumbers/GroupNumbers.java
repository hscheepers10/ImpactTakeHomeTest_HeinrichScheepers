package groupnumbers;

import java.util.Collection;
import java.util.Scanner;

/**
 * @author Heinrich Scheepers
 */
public class GroupNumbers {

    private static final String testData = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
    private static final String useTestData = "test";

    public static void main(String[] args) {

        //instance class sumNumber that implements NumberRangeSummarizer interface.
        SumNumbers sum1 = new SumNumbers();
        Scanner cin = new Scanner(System.in);

        //User interraction.
        String userData;
        String input;
        Collection<Integer> collectInt;

        System.out.println("Enter numbers sepperated by commas, or enter 'test' to use default Sample input: (" + testData + ")");

        do {
            System.out.print("Input: ");
            userData = cin.next();
            if (useTestData.equals(userData)) {
                input = testData;
            } else {
                input = userData;
            }
            collectInt = sum1.collect(input);           //Collect Method.  
        } while (collectInt == null);

        // SummariseCollection Method called.  
        System.out.println("Result: " + sum1.summarizeCollection(collectInt));
    }
}
