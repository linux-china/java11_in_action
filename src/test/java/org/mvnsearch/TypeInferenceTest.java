package org.mvnsearch;


import org.junit.jupiter.api.Test;

/**
 * type inference test
 *
 * @author linux_china
 */
public class TypeInferenceTest {
    /**
     * test variable inference
     */
    @Test
    public void testVariableInference() {
        var name = "Jackie";
        System.out.println(name);
    }
}
