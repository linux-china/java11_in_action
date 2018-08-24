package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * regex test
 *
 * @author linux_china
 */
public class RegexTest {

    @Test
    public void testAsPredicate() {
        //match all input
        Predicate<String> matchPredicate = Pattern.compile("aaa").asMatchPredicate();
        //find result
        Predicate<String> predicate = Pattern.compile("aaa").asPredicate();
        System.out.println("match predicate");
        System.out.println(matchPredicate.test("aaa"));
        System.out.println(matchPredicate.test("baaab"));
        System.out.println("predicate");
        System.out.println(predicate.test("baaab"));
    }
}
