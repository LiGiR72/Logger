package org.example;

public class Logger {
    private int count = 1;
    private static Logger instance = null;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + count++ + "] " + message);
    }

}
