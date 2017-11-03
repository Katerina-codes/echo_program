package test.java;

import main.java.InputOutput;

public class FakeCommandLine implements InputOutput {
    private boolean getInputWasCalled = false;
    private boolean printExitMessageWasCalled = false;
    private boolean promptUserForInputWasCalled = false;

    @Override
    public String getInput() {
        this.getInputWasCalled = true;
        return "exit";
    }

    @Override
    public void printLine(String input) {

    }

    @Override
    public String printExitMessage() {
        this.printExitMessageWasCalled = true;
        return "Bye bye!";
    }

    @Override
    public String promptUserForInput() {
        this.promptUserForInputWasCalled = true;
        return "Enter some text or type 'exit' to quit:";
    }

    public boolean getInputWasCalled() {
        return getInputWasCalled;
    }

    public boolean printExitMessageWasCalled() {
        return printExitMessageWasCalled;
    }

    public boolean promptUserForInputWasCalled() {
        return promptUserForInputWasCalled;
    }
}
