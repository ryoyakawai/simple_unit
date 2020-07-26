package com.example.empty;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class calcTest {
    private calc mcalc;


    public void plus() {
        @Test
        mcalc  = new calc();
        assertEquals(3, mcalc.plus(2,1),0 );  //Added plus test code
        assertEquals(2, mcalc.div(2,1),0 );  //Added div test code

    }
}