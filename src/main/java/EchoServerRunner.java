package main.java;

public class EchoServerRunner {
    public static void main(String[] args) {
        CommandLine inputOutput = new CommandLine(System.in, System.out);
        EchoServer server = new EchoServer(inputOutput);
        server.run();
    }
}
