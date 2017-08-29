package chen0040.github.com.androidgeeks4geeks.services;

import java.util.ArrayList;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

/**
 * Created by chen0 on 29/8/2017.
 */

public class SolutionFactory {
    public static List<Solution> getSolutions(Field field, Topic topic) {
       if(topic == Topic.BitwiseAlgorithms) {
           return getBitwiseAlgorithms(field, topic);
       }
       return new ArrayList<>();
    }

    private static List<Solution> getBitwiseAlgorithms(Field field, Topic topic) {


        List<Solution> solutions = new ArrayList<>();
        solutions.add(new Solution("Find the element that appears once", "bitwise_algorithms/find_the_element_that_appears_once.java", field, topic));
        solutions.add(new Solution("Detect if two integers have opposite signs", "bitwise_algorithms/int_opposite_sign.java", field, topic));
        solutions.add(new Solution("Add 1 to a given number", "bitwise_algorithms/add_one.java", field, topic));
        solutions.add(new Solution("Multiply a given Integer with 3.5", "bitwise_algorithms/multiply_3p5.java", field, topic));
        solutions.add(new Solution("Turn off the rightmost set bit", "bitwise_algorithms/turn_off_rightmost_set_bit.java", field, topic));
        solutions.add(new Solution("Find whether a given number is a power of 4 or not", "bitwise_algorithms/power_of_four.java", field, topic));
        solutions.add(new Solution("Compute modulus division by a power-of-2-number", "bitwise_algorithms/modulus_by_power_of_2.java", field, topic));



        return solutions;
    }
}
