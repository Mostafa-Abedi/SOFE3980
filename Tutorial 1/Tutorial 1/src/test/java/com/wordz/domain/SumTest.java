package com.wordz.domain;

import com.wordz.Sum;
import org.junit.jupiter.api.Test;

import static com.wordz.domain.Letter.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void testAddTwoNumbers() {
        Sum calculator = new Sum();
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void testADDTwoNumbersWrong(){
        Sum calculator = new Sum();
        assertEquals(6, calculator.add(2,3));
    }
}