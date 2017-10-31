package test.java;

import main.java.EchoServer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EchoServerTest {

    @Test
    public void displaysInputToCommandLine() {
        InputStream input = new ByteArrayInputStream("hello\nexit\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        EchoServer server = new EchoServer(input, new PrintStream(output));

        server.run();

        assertTrue(output.toString().contains("hello\n"));
        assertTrue(output.toString().contains("Bye bye!\n"));
    }

    @Test
    public void loopIsExitedWhenUserEntersExit() {
        InputStream input = new ByteArrayInputStream("exit\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        EchoServer server = new EchoServer(input, new PrintStream(output));

        server.run();

        assertTrue(output.toString().contains("Bye bye!\n"));
    }

    @Test
    public void userIsPromptedForInput() {
        InputStream input = new ByteArrayInputStream("\nexit\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        EchoServer server = new EchoServer(input, new PrintStream(output));

        server.run();

        assertTrue(output.toString().contains("Enter some text or type 'exit' to quit:\n"));
        assertTrue(output.toString().contains("Bye bye!\n"));
    }
}
