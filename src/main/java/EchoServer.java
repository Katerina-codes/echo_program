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
        String line = null;
        try {
            line = input.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (!line.equals("exit")) {
            output.println(line);
            try {
                line = input.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        output.println("Bye bye!");
    }
}