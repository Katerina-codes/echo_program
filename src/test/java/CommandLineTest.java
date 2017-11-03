package test.java;

import main.java.CommandLine;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CommandLineTest {

    @Test
    public void getsInputFromCommandLine() {
        InputStream input = new ByteArrayInputStream("hello".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        CommandLine display = new CommandLine(input, new PrintStream(output));

        assertEquals("hello", display.getInput());
    }

    @Test
    public void textIsPrintedToCommandLine() {
        InputStream input = new ByteArrayInputStream("".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        CommandLine display = new CommandLine(input, new PrintStream(output));

        display.printLine("hi");

        assertTrue(output.toString().contains("hi\n"));
    }
}
