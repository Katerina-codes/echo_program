package test.java;

import main.java.EchoServer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EchoServerTest {

    @Test
    public void displaysInputToCommandLine() {
        FakeCommandLine inputOutput = new FakeCommandLine();

        EchoServer server = new EchoServer(inputOutput);

        server.run();

        assertTrue(inputOutput.getInputWasCalled());
    }

    @Test
    public void loopIsExitedWhenUserEntersExit() {
        FakeCommandLine inputOutput = new FakeCommandLine();

        EchoServer server = new EchoServer(inputOutput);

        server.run();

        assertTrue(inputOutput.printExitMessageWasCalled());
    }

    @Test
    public void userIsPromptedForInput() {
      FakeCommandLine inputOutput = new FakeCommandLine();

        EchoServer server = new EchoServer(inputOutput);

        server.run();

        assertTrue(inputOutput.promptUserForInputWasCalled());
    }
}
