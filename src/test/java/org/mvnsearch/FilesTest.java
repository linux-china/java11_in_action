package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * file test
 *
 * @author linux_china
 */
public class FilesTest {

    @Test
    public void testReadString() throws Exception {
        testWriteString();
        String content = Files.readString(new File("demo.txt").toPath(),StandardCharsets.UTF_8);
        System.out.println(content);
    }

    @Test
    public void testWriteString() throws Exception {
        String content = "你好";
        Files.writeString(new File("demo.txt").toPath(), content, StandardCharsets.UTF_8);
    }
}
