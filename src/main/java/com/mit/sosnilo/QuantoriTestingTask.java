package com.mit.sosnilo;

public class QuantoriTestingTask {

    public int sumDigits(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException();
        }

        return inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .mapToInt(Character::getNumericValue).sum();
    }
}
