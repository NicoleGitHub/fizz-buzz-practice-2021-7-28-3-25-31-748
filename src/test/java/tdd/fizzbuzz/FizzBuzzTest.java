package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ= "Buzz";
    public static final String WHIZZ= "Whizz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZWHIZZ = "FizzWhizz";
    public static final String FIZZBUZZWHIZZ = "FizzBuzzWhizz";
    public static final String BUZZWHIZZ = "BuzzWhizz";

    @Test
    void should_return_order_when_count_off_given_order_number_with_normal_case() {
        //given
        int order = 4;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(String.valueOf(order), result);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_multiple_of_3() {
        //given
        int order = 3;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(FIZZ, result);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_multiple_of_5() {
        //given
        int order = 5;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(BUZZ, result);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_multiple_of_7() {
        //given
        int order = 7;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(WHIZZ, result);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_multiple_of_3_And_5() {
        //given
        int order = 15;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(FIZZBUZZ, result);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_multiple_of_3_And_7() {
        //given
        int order = 21;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(FIZZWHIZZ, result);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_given_order_number_multiple_of_3_And_5_And_7() {
        //given
        int order = 105;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(FIZZBUZZWHIZZ, result);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_multiple_of_5_And_7() {
        //given
        int order = 45;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(order);

        //then
        assertEquals(BUZZWHIZZ, result);
    }

}
