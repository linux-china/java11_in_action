package org.mvnsearch;

import org.junit.jupiter.api.Test;

/**
 * string test
 *
 * @author linux_china
 */
public class StringTest {

    @Test
    public void testNewStringFunctions() {
        System.out.println(" 1 ".strip().length());
        System.out.println(" ".isBlank());
        System.out.println("hello \n jackie\n good".lines().count());
        System.out.println("repeat".repeat(3));
    }
}
