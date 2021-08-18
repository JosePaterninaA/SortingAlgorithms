package com.sortingalgorithms.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    BubbleSort bubbleSortService;

    @BeforeEach
    public void init(){
        bubbleSortService = new BubbleSort();
    }

    @Test
    public void whenEmptyArrayReturnEmptyArray(){
        assertArrayEquals(bubbleSortService.Sort(new int[]{}),new int[]{});
    }

    @Test
    public void whenSmallArrayReturnArraySorted(){
        assertArrayEquals(bubbleSortService.Sort(new int[]{4,3,2,1}),new int[]{1,2,3,4});
    }

    @Test
    public void whenLongArrayReturnArraySorted(){
        assertArrayEquals(bubbleSortService.Sort(new int[]{4,3,2,1,6,3,7,8,2,5,7,3,2,1,6,4,9,8,6}),new int[]{1,1,2,2,2,3,3,3,4,4,5,6,6,6,7,7,8,8,9});
    }
}
