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
        solutions.add(new Solution("Basic", "Find the element that appears once", "bitwise_algorithms/find_the_element_that_appears_once.java", field, topic));
        solutions.add(new Solution("Basic", "Detect if two integers have opposite signs", "bitwise_algorithms/int_opposite_sign.java", field, topic));
        solutions.add(new Solution("Basic", "Add 1 to a given number", "bitwise_algorithms/add_one.java", field, topic));
        solutions.add(new Solution("Basic", "Multiply a given Integer with 3.5", "bitwise_algorithms/multiply_3p5.java", field, topic));
        solutions.add(new Solution("Basic", "Turn off the rightmost set bit", "bitwise_algorithms/turn_off_rightmost_set_bit.java", field, topic));
        solutions.add(new Solution("Basic", "Find whether a given number is a power of 4 or not", "bitwise_algorithms/power_of_four.java", field, topic));
        solutions.add(new Solution("Basic", "Find whether a given number is a power of 2 or not", "bitwise_algorithms/power_of_two.java", field, topic));
        solutions.add(new Solution("Basic", "Compute modulus division by a power-of-2-number", "bitwise_algorithms/modulus_by_power_of_2.java", field, topic));
        solutions.add(new Solution("Basic", "Rotate bits of a number", "bitwise_algorithms/rotate_bits_of_a_number.java", field, topic));
        solutions.add(new Solution("Basic", "Find the Number Occurring Odd Number of Times", "bitwise_algorithms/number_appearing_odd_number_of_times.java", field, topic));
        solutions.add(new Solution("Basic", "Check for Integer Overflow", "bitwise_algorithms/check_int_overflow.java", field, topic));
        solutions.add(new Solution("Basic", "Count set bits in an integer", "bitwise_algorithms/count_set_bits.java", field, topic));
        solutions.add(new Solution("Basic", "Efficient way to multiply with 7", "bitwise_algorithms/multiply_with_7.java", field, topic));
        solutions.add(new Solution("Basic", "Position of rightmost set bit", "bitwise_algorithms/rightmost_set_bit.java", field, topic));
        solutions.add(new Solution("Basic", "Binary representation of a given number", "bitwise_algorithms/binary_representation.java", field, topic));
        solutions.add(new Solution("Basic", "Find position of the only set bit", "bitwise_algorithms/position_of_set_bit.java", field, topic));
        solutions.add(new Solution("Basic", "How to swap two numbers without using a temporary variable?", "bitwise_algorithms/swap_two_numbers.java", field, topic));
        solutions.add(new Solution("Basic", "Swap two nibbles in a byte", "bitwise_algorithms/swap_nibbles.java", field, topic));
        solutions.add(new Solution("Basic", "How to turn off a particular bit in a number?", "bitwise_algorithms/turn_off_a_bit.java", field, topic));
        solutions.add(new Solution("Basic", "Multiply two numbers using bitwise operators", "bitwise_algorithms/multiply_using_bitwise_op.java", field, topic));
        solutions.add(new Solution("Basic", "Add two bit strings", "bitwise_algorithms/add_two_bit_strings.java", field, topic));
        solutions.add(new Solution("Basic", "Write your own strcmp that ignores cases", "bitwise_algorithms/strcmp_ignore_case.java", field, topic));
        solutions.add(new Solution("Basic", "Check if two numbers are equal without using arithmetic and comparison operators", "bitwise_algorithms/check_equal_using_bitwise.java", field, topic));
        solutions.add(new Solution("Basic", "Find XOR of two number without using XOR operator", "bitwise_algorithms/xor_without_xor.java", field, topic));
        solutions.add(new Solution("Basic", "XOR counts of 0s and 1s in binary representation", "bitwise_algorithms/xor_counts_zeroes_and_ones.java", field, topic));
        solutions.add(new Solution("Basic", "Calculate XOR from 1 to n.", "bitwise_algorithms/xor_from_one_to_n.java", field, topic));
        solutions.add(new Solution("Basic", "Multiply a number with 10 without using multiplication operator", "bitwise_algorithms/multiply_10.java", field, topic));
        solutions.add(new Solution("Basic", "Equal Sum and XOR", "bitwise_algorithms/equal_sum_and_xor.java", field, topic));
        solutions.add(new Solution("Basic", "Swap three variables without using temporary variable", "bitwise_algorithms/swap_three_numbers.java", field, topic));
        solutions.add(new Solution("Basic", "Check if a number has bits in alternate pattern", "bitwise_algorithms/bit_alternative_patterns.java", field, topic));
        solutions.add(new Solution("Basic", "Count minimum bits to flip such that XOR of A and B equal to C", "bitwise_algorithms/min_bits_to_flip_xor.java", field, topic));
        solutions.add(new Solution("Basic", "Efficient method for 2’s complement of a binary string", "bitwise_algorithms/two_complement_of_binary_str.java", field, topic));
        solutions.add(new Solution("Basic", "Toggle case of a string using Bitwise operators", "bitwise_algorithms/toggle_string_case.java", field, topic));
        solutions.add(new Solution("Basic", "Toggling k-th bit of a number", "bitwise_algorithms/toggle_k_th_bit.java", field, topic));
        solutions.add(new Solution("Basic", "Convert decimal fraction to binary number", "bitwise_algorithms/convert_decimal_to_binary.java", field, topic));
        solutions.add(new Solution("Basic", "Toggle all the bits of a number except k-th bit.", "bitwise_algorithms/toggle_very_bit_except_k_th.java", field, topic));
        solutions.add(new Solution("Basic", "Set the rightmost unset bit", "bitwise_algorithms/set_rightmost_unset_bit.java", field, topic));
        solutions.add(new Solution("Basic", "Convert a binary number to octal", "bitwise_algorithms/convert_binary_to_octal.java", field, topic));
        solutions.add(new Solution("Basic", "Check in binary array the number represented by a subarray is odd or even", "bitwise_algorithms/check_subarray_odd_or_even.java", field, topic));
        solutions.add(new Solution("Basic", "Toggle the last m bits", "bitwise_algorithms/toggle_last_m_bits.java", field, topic));
        solutions.add(new Solution("Basic", "1 to n bit numbers with no consecutive 1s in binary representation.", "bitwise_algorithms/no_consecutive_ones.java", field, topic));
        solutions.add(new Solution("Basic", "Toggle bits in the given range", "bitwise_algorithms/toggle_bits_in_a_given_range.java", field, topic));
        solutions.add(new Solution("Basic", "Unset bits in the given range", "bitwise_algorithms/unset_bits_in_a_given_range.java", field, topic));
        solutions.add(new Solution("Basic", "Find the largest number with n set and m unset bits", "bitwise_algorithms/largest_number_with_n_set_bits.java", field, topic));
        solutions.add(new Solution("Basic", "Find the smallest number with n set and m unset bits", "bitwise_algorithms/smallest_number_with_n_set_bits.java", field, topic));
        solutions.add(new Solution("Basic", "Sum of numbers with exactly 2 bits set", "bitwise_algorithms/sum_of_numbers_with_2_set_bits.java", field, topic));
        Log.i(TAG, "solutions: " + solutions.size());

        return solutions;
    }
}
