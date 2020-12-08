ImpactTakeHomeTest_HeinrichScheepers

Instructions:
Implement code which has the ability to produce a comma delimited list of numbers, grouping the numbers into a range when they are sequential. Please submit your finished task via a pull request in GitHub (your code should be in GitHub, only code in GitHub will be reviewed. Please do not send us your files). Provided for you is an interface that you should implement as a solution to the exercise.

 

Requirements:
- Must be Java code. Minimum Java version 8. If you are not familiar with the changes in Java 8, you will need to learn them for this exercise.
- Must be in GitHub.
- Must implement provided interface
- Must have valid unit tests

 

 
The review will be based on: 
 - your ability to understand / interpret a requirement.
- your ability to learn quickly (learning changes in Java 8)
 - your coding ability.
 - optimisation of your code.
 - your ability to compile a structured solution.
- present your solution with valid unit test

=========================Interface===================

package numberrangesummarizer;

import java.util.Collection;

/**
 * @author Werner
 *
 * Implement this Interface to produce a comma delimited list of numbers,
 * grouping the numbers into a range when they are sequential.
 *
 *
 * Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31
 * Result: "1, 3, 6-8, 12-15, 21-24, 31"
 *
 * The code will be evaluated on
 *   - functionality
 *   - style
 *   - robustness
 *   - best practices
 *   - unit tests
 */
public interface NumberRangeSummarizer {

    //collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);

}