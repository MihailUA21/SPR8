package com.example.spr8;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    //Positive tests
    @Test
    public void findMinElement_correctSearch_positiveTest(){
        int[] testArray = {11,3,13,24,155,16,15,10,8,65,1,31,2};
        int expected = 1 ;

        AlgorithmMethod test1 = new AlgorithmMethod() ;

        int actual = test1.findMinElement(testArray) ;
        assertEquals(expected,actual);
    }
    @Test
    public void calculateSum_correctCalculate_positiveTest(){
        int[] testArray2 = {-2,-1,-10,-4,-7} ;
        int expected = -24 ;

        AlgorithmMethod test2 = new AlgorithmMethod() ;

        int result = test2.calculateSum(testArray2) ;
        assertEquals(expected,result);
    }
    @Test
    public void fibonacci_correctCalcutlate_positiveTest(){
        int n = 6 ;
        int expected = 8 ;

        AlgorithmMethod test3 = new AlgorithmMethod() ;

        int fibanacciResult = test3.fibonacci(n);
        assertEquals(expected,fibanacciResult);
    }
    @Test
    public void current_CalculateCurrent_positiveTest(){
        double voltage = 10 ;
        double resistance = 5 ;
        double expected = 2 ;

        AlgorithmMethod test4 = new AlgorithmMethod();

        double resultCurrent = test4.current(voltage,resistance);
        assertEquals(expected,resultCurrent,0.001);
    }
    // Negative tests
    @Test
    public void findMinElement_nullArray_negativeTest(){

        int expected = -1 ;

        AlgorithmMethod test5 = new AlgorithmMethod() ;

        int actual = test5.findMinElement(null) ;
        assertEquals(expected,actual);
    }

    @Test
    public void calculateSum_positiveArray_negotiveTest(){
        int[] testArray2 = {2,10,1,4,7} ;
        int expected = 0 ;

        AlgorithmMethod test6 = new AlgorithmMethod() ;

        int result = test6.calculateSum(testArray2) ;
        assertEquals(expected,result);
    }
    @Test
    public void fibonacci_negotiveN_negotiveTest(){
        int n = -2 ;
        int expected = -2 ;

        AlgorithmMethod test7 = new AlgorithmMethod() ;

        int fibanacciResult = test7.fibonacci(n);
        assertEquals(expected,fibanacciResult);
    }
    @Test
    public void current_negotiveResistance_negotiveTest(){
        double voltage = 10 ;
        double resistance = -5 ;

        AlgorithmMethod test4 = new AlgorithmMethod();

        double resultCurrent = test4.current(voltage,resistance);
        assertEquals(0,resultCurrent,0.001);
    }
}