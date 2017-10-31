package main.java;

import java.io.*;

public class EchoServer {
    private final BufferedReader input;
    private final PrintStream output;

    public EchoServer(InputStream input, PrintStream output) {
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = output;
    }

    public void run() {
        String line = getInput();
        while (!line.equals("exit")) {
            output.println(line);
            line = getInput();
        }
        output.println("Bye bye!");
    }

    private String getInput() {
        String line;
        try {
            output.println("Enter some text or type 'exit' to quit:");
            line = input.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}