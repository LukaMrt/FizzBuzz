package fr.lukam.fizzbuzz.rules;

import fr.lukam.fizzbuzz.FizzBuzzNumber;
import fr.lukam.fizzbuzz.FizzBuzzRule;

public class Default implements FizzBuzzRule {

    @Override
    public void applyRule(FizzBuzzNumber number, StringBuilder builder) {

        if (builder.length() == 0) {

            builder.append(number.number);

        }

    }

}
