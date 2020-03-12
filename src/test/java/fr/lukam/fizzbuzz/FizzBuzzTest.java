package fr.lukam.fizzbuzz;

import fr.lukam.fizzbuzz.rules.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {

        List<FizzBuzzRule> fizzBuzzRules = Arrays.asList(
                new Multiple3(),
                new Multiple5(),
                new Multiple7(),
                new Prime(),
                new Default()
        );

        this.fizzBuzz = new FizzBuzz(new LinkedList<>(fizzBuzzRules));

    }

    @Test
    public void fizzBuzz_shouldReturnFizz_when3IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(3);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzz_shouldReturnBuzz_when5IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(5);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("Buzz");
    }

    @Test
    public void fizzBuzz_shouldReturnFizzBuzz_when15IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(15);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzBuzz_shouldReturnBozz_when7IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(7);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("Bozz");
    }

    @Test
    public void fizzBuzz_shouldReturnFizzBuzz_when210IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(210);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("FizzBuzzBozz");
    }

    @Test
    public void fizzBuzz_shouldReturnFIRST_when11IsGiven() {

        FizzBuzzNumber number = new FizzBuzzNumber(11);

        String fizzBuzzReturn = this.fizzBuzz.fizzBuzz(number);

        assertThat(fizzBuzzReturn).isEqualTo("FIRST");
    }

}
