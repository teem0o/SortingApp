package com.elearn;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

@RunWith(Parameterized.class)
public class SortingTest {
    int[] arr;
    Sorting sorting = new Sorting();

    public SortingTest(int[] arr) {
        this.arr = arr;
    }

    @org.junit.Test
    public void sort() {
        sorting.sort(arr);
        System.out.println(arr);
    }



    @Parameterized.Parameters
    public static Object[] testAreaCases() throws IOException {
        List<String> areas = Files.readAllLines(Paths.get("src/main/resources/array-sort.txt"));
        return areas.toArray();
    }
}