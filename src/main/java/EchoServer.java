package main.java;

public class EchoServer {
    private InputOutput inputOutput;

    public EchoServer(InputOutput inputOutput) {
        this.inputOutput = inputOutput;
    }

    public void run() {
        String line = getInput();
        while (!line.equals("exit")) {
            inputOutput.printLine(line);
            line = getInput();
        }
        printExitMessage();
    }

    private void promptUserForInput() {
        inputOutput.promptUserForInput();
    }

    private String getInput() {
        promptUserForInput();
        return inputOutput.getInput();
    }

    private void printExitMessage() {
        inputOutput.printExitMessage();
    }
}