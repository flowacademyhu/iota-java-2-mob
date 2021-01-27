package hu.flowacademy.diagonalDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {
    private final DiagonalDifference diagonalDifference = new DiagonalDifference();

    @Test
    public void testCase_1() {
        int[][] input = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        int diff = diagonalDifference.diagonalDifference(input);

        assertEquals(15, diff);
    }

}
