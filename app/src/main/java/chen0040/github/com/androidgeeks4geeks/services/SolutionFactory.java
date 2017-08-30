package chen0040.github.com.androidgeeks4geeks.services;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

/**
 * Created by chen0 on 29/8/2017.
 */

public class SolutionFactory {
    private static final String TAG = "SolutionFactory";
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
        solutions.add(new Solution("Find whether a given number is a power of 2 or not", "bitwise_algorithms/power_of_two.java", field, topic));
        solutions.add(new Solution("Compute modulus division by a power-of-2-number", "bitwise_algorithms/modulus_by_power_of_2.java", field, topic));
        solutions.add(new Solution("Rotate bits of a number", "bitwise_algorithms/rotate_bits_of_a_number.java", field, topic));
        solutions.add(new Solution("Find the Number Occurring Odd Number of Times", "bitwise_algorithms/number_appearing_odd_number_of_times.java", field, topic));
        solutions.add(new Solution("Check for Integer Overflow", "bitwise_algorithms/check_int_overflow.java", field, topic));
        solutions.add(new Solution("Count set bits in an integer", "bitwise_algorithms/count_set_bits.java", field, topic));
        solutions.add(new Solution("Efficient way to multiply with 7", "bitwise_algorithms/multiply_with_7.java", field, topic));
        solutions.add(new Solution("Position of rightmost set bit", "bitwise_algorithms/rightmost_set_bit.java", field, topic));
        solutions.add(new Solution("Binary representation of a given number", "bitwise_algorithms/binary_representation.java", field, topic));
        solutions.add(new Solution("Find position of the only set bit", "bitwise_algorithms/position_of_set_bit.java", field, topic));
        solutions.add(new Solution("How to swap two numbers without using a temporary variable?", "bitwise_algorithms/swap_two_numbers.java", field, topic));
        solutions.add(new Solution("Swap two nibbles in a byte", "bitwise_algorithms/swap_nibbles.java", field, topic));
        solutions.add(new Solution("How to turn off a particular bit in a number?", "bitwise_algorithms/turn_off_a_bit.java", field, topic));
        solutions.add(new Solution("Multiply two numbers using bitwise operators", "bitwise_algorithms/multiply_using_bitwise_op.java", field, topic));
        solutions.add(new Solution("Add two bit strings", "bitwise_algorithms/add_two_bit_strings.java", field, topic));






        Log.i(TAG, "solutions: " + solutions.size());

        return solutions;
    }
}
