// Import the java scanner system
import java.util.Scanner;

public class MyFirstJavaProgram {

    // Declare the color ANSI code
    public static final String RESET = "\u001B[0m";
    public static final String STANDARD_BLUE = "\u001B[34m";
    public static final String LIGHT_BLUE = "\u001B[1;34m";  
    public static final String STANDAR_PINK = "\u001B[38;5;201m";
    public static final String LIGHT_PINK = "\u001B[38;2;255;182;193m";
    public static final String STANDAR_YELLOW = "\u001B[33m";
    public static final String LIGHT_YELLOW = "\u001B[93m";

    public static void main(String[] args) {

        // Declare variable
        int chooseFacts;
        String javaVersion = System.getProperty("java.version");

        // Randomly choose a fact (0-9)
        chooseFacts = (int) (Math.random() * 10);

        // Set up scanner for user input
        Scanner scanner = new Scanner(System.in);

        String[] facts = {
            "Did you know, Understanding what Java is, its core design principles, and how Java’s object-oriented nature sets it apart from other programming languages.",
            "Did you know, From writing source code to compiling it into bytecode and finally running it on the JVM.",
            "Did you know, Java was initially designed for interactive television, aiming to create a platform-independent language for embedded systems.",
            "Did you know, Java's robustness, security features, and scalability made it a cornerstone for developing large-scale enterprise applications.",
            "Did you know, Java has a massive and active developer community.",
            "Did you know, One of Java's key features is automatic garbage collection.",
            "Did you know, Java's syntax and concepts have influenced many other programming languages, including C#, Kotlin, and Scala.",
            "Did you know, Despite the emergence of newer programming languages, Java remains highly relevant.",
            "Did you know, Java's security model, particularly its sandboxing capabilities within the JVM, was a major selling point in its early days.",
            "Did you know, Java's robustness, security features, and scalability made it a cornerstone for developing large-scale enterprise applications."
        };

        // Welcome message for the user
        System.out.println(STANDARD_BLUE + "Hello user, welcome to this program!" + RESET);
        System.out.print(STANDAR_PINK + "Please enter your name: " + RESET);

        // User input name
        String nama = scanner.nextLine();

        // Greeting user
        System.out.println("\n");
        System.out.println(STANDARD_BLUE + "Hello " + nama + ", Nice to meet you!" + RESET);

        // Java version information
        System.out.println(STANDAR_YELLOW + nama + ", Your Java is running at version " + javaVersion + "." + RESET);

        // Choose and print the facts
        System.out.println("\n");
        if (chooseFacts == 1) {
            System.out.println(LIGHT_BLUE + facts[0] + RESET);
        }
        else if (chooseFacts == 2) {
            System.out.println(LIGHT_PINK + facts[1] + RESET);
        }
        else if (chooseFacts == 3) {
            System.out.println(LIGHT_YELLOW + facts[2] + RESET);
        }
        else if (chooseFacts == 4) {
            System.out.println(LIGHT_BLUE + facts[3] + RESET);
        }
        else if (chooseFacts == 5) {
            System.out.println(LIGHT_PINK + facts[4] + RESET);
        }
        else if (chooseFacts == 6) {
            System.out.println(LIGHT_YELLOW + facts[5] + RESET);
        }
        else if (chooseFacts == 7) {
            System.out.println(LIGHT_BLUE + facts[6] + RESET);
        }
        else if (chooseFacts == 8) {
            System.out.println(LIGHT_PINK + facts[7] + RESET);
        }
        else if (chooseFacts == 9) {
            System.out.println(LIGHT_YELLOW + facts[8] + RESET);
        }
        else if (chooseFacts == 10) {
            System.out.println(LIGHT_BLUE + facts[9] + RESET);
        }

        System.out.println("\n");

        // Clean up by closing the scanner
        scanner.close();
        System.out.println(STANDAR_PINK + "Thank you for using this program, see you again " + nama + "!" + RESET);

        // Set timer and clean the terminal
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}