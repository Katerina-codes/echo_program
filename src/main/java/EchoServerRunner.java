package main.java;

public class EchoServerRunner {
    public static void main(String[] args) {
        EchoServer server = new EchoServer(System.in, System.out);
        server.run();
    }
}
