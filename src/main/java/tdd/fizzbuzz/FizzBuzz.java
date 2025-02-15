package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ= "Buzz";
    public static final String WHIZZ= "Whizz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZWHIZZ = "FizzWhizz";
    public static final String FIZZBUZZWHIZZ = "FizzBuzzWhizz";
    public static final String BUZZWHIZZ = "BuzzWhizz";

    public String countOff(int order) {
        return  ((order%3 == 0) && (order%5 ==0) && (order%7 ==0))
                ? FIZZBUZZWHIZZ
                : ((order%5 ==0) && (order%7 ==0))
                    ? BUZZWHIZZ
                    : ((order%3 == 0) && (order%7 ==0))
                        ? FIZZWHIZZ
                        : ((order%3 == 0) && (order%5 ==0))
                            ? FIZZBUZZ
                            : (order%7 == 0)
                                ? WHIZZ
                                : (order%5 == 0)
                                    ? BUZZ
                                    : (order%3 == 0)
                                        ? FIZZ
                                        : String.valueOf(order);
    }

}
