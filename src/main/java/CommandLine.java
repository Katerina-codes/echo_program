package main.java;

import java.io.*;

public class CommandLine implements InputOutput {
    private final BufferedReader input;
    private final PrintStream output;

    public CommandLine(InputStream input, PrintStream output) {
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = output;
    }

    @Override
    public String getInput() {
        String line = null;
        try {
            line = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    @Override
    public void printLine(String input) {
        output.println(input);
    }

    @Override
    public void printExitMessage() {
        output.println("Bye bye!");
    }

    @Override
    public void promptUserForInput() {
        output.println("Enter some text or type 'exit' to quit:");
    }
}
