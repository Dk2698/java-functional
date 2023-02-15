package org.example.functional.part3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {
    @Test
    void numberAtPosition() {
        assertAll(
                () -> assertEquals(Arrays.asList("3 4 5"), LabSolution.computeTriples(1))
                , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10"), LabSolution.computeTriples(2))
                , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13"), LabSolution.computeTriples(3))
                , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13", "15 8 17"), LabSolution.computeTriples(4))
                , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13", "15 8 17", "12 16 20"), LabSolution.computeTriples(5))
                , () -> assertEquals(10, LabSolution.computeTriples(10).size())
                , () -> assertTrue(LabSolution.computeTriples(10).contains("21 20 29"))
                , () -> assertEquals(20, LabSolution.computeTriples(20).size())
                , () -> assertTrue(LabSolution.computeTriples(20).contains("45 28 53"))
        );
    }
}
