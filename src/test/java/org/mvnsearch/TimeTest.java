package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * time test
 *
 * @author linux_china
 */
public class TimeTest {

    @Test
    public void testConvert() {
        long days = TimeUnit.DAYS.convert(Duration.ofHours(49));
        System.out.println(days);
    }
}
