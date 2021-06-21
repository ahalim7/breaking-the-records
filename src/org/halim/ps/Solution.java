package org.halim.ps;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int stepMin = 0, stepMax = 0;
        int min = -1, max = -1;

        for (Integer score : scores) {

            if (min == -1 && max == -1) {
                min = max = score;
                continue;
            }

            if (score > max) {
                max = score;
                stepMax++;
            } else if (score < min) {
                min = score;
                stepMin++;
            }
        }

        return Arrays.asList(stepMax, stepMin);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> result = Result.breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        result.forEach(System.out::println);

        List<Integer> results = Result.breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
        results.forEach(System.out::println);

        List<Integer> resultss = Result.breakingRecords(Arrays.asList(0, 9, 3, 10, 2, 20));
        resultss.forEach(System.out::println);
    }
}
