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
    public void printExitMessage() {
        this.printExitMessageWasCalled = true;
    }

    @Override
    public void promptUserForInput() {
        this.promptUserForInputWasCalled = true;
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
