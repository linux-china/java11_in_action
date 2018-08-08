package org.mvnsearch;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * lambda parameters test
 *
 * @author linux_china
 */
public class LambdaParametersTest {
    @Test
    public void testLocalVariable() {
        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println(square.apply(5));
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        Integer result = sum.apply(1, 2);
        System.out.println(result);
    }

    @Test
    public void filter() {
        var xs = new int[]{3, 2, 6, 4, 8, 9};

        int x = Arrays.stream(xs).filter((a) -> a < 5).sum();

        System.out.println(x);
    }

    @Test
    public void testForLoop() {
        var xs = new int[]{3, 2, 6, 4, 8, 9};
        for (var x : xs) {
            System.out.println(x);
        }
    }

}
