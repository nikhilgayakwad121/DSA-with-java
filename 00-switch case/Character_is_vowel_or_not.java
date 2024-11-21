import java.util.Scanner;

public class Character_is_vowel_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

        // Use switch case to check if the character is a vowel
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;

            default:
                System.out.println(ch + " is not a vowel.");
                break;
        }

        scanner.close();
    }
}
