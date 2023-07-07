import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Something: ");
        String userInput = scanner.nextLine();
    }
}
