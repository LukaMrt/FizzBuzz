package fr.lukam.fizzbuzz.rules;

import fr.lukam.fizzbuzz.FizzBuzzNumber;
import fr.lukam.fizzbuzz.FizzBuzzRule;

public class Prime implements FizzBuzzRule {

    @Override
    public void applyRule(FizzBuzzNumber number, StringBuilder builder) {

        if (isPrime(number.number) && builder.length() == 0) {

            builder.append("FIRST");

        }

    }

    private boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }

}
