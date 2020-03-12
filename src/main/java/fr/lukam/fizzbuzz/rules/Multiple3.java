package fr.lukam.fizzbuzz.rules;

import fr.lukam.fizzbuzz.FizzBuzzNumber;
import fr.lukam.fizzbuzz.FizzBuzzRule;

public class Multiple3 implements FizzBuzzRule {

    @Override
    public void applyRule(FizzBuzzNumber number, StringBuilder builder) {

        if (number.number % 3 == 0) {

            builder.append("Fizz");

        }

    }

}
