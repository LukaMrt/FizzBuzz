package fr.lukam.fizzbuzz;

import java.util.LinkedList;

public class FizzBuzz {

    private final LinkedList<FizzBuzzRule> rules;

    public FizzBuzz(LinkedList<FizzBuzzRule> rules) {
        this.rules = rules;
    }

    public String fizzBuzz(FizzBuzzNumber number) {

        StringBuilder builder = new StringBuilder();

        this.rules.forEach(rule -> rule.applyRule(number, builder));

        return builder.toString();
    }

}
