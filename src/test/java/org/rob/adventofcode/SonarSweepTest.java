package org.rob.adventofcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SonarSweepTest {
    private final SonarSweep sonarsweep = new SonarSweep();

    @Test
    void partOne() {

        String input = "199\n" +
                "200\n" +
                "208\n" +
                "210\n" +
                "200\n" +
                "207\n" +
                "240\n" +
                "269\n" +
                "260\n" +
                "263";

        int expected = 7;
        assertEquals(expected, sonarsweep.solve(input));
    }

    @Test
    void partTwo() {

        String input = "199\n" +
                "200\n" +
                "208\n" +
                "210\n" +
                "200\n" +
                "207\n" +
                "240\n" +
                "269\n" +
                "260\n" +
                "263";

        int expected = 5;
        assertEquals(expected, sonarsweep.solveThreeLines(input));
    }
}