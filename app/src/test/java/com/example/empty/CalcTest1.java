package com.example.empty;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest1 {
    private calc mcalc;
    @Test
    public void plus() {
        mcalc = new calc();
        assertEquals(3, mcalc.plus(2,1),0 );  //Added plus test code

    }

    @Test
    public void div() {
        mcalc = new calc();
        assertEquals(2, mcalc.div(2,1),0 );  //Added div test code
    }
}