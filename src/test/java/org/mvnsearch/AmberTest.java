package org.mvnsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Amber test
 *
 * @author linux_china
 */
public class AmberTest {

    @Test
    public void testEnum() {
        Assertions.assertEquals("36 X 19", Size.SMALL.toText());
        Assertions.assertEquals("LARGE", Size.LARGE.toText());
    }
}
