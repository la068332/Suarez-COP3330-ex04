import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = scanner.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();
        System.out.println("Do you "+verb+" your "+adj+" "+noun+" "+adverb+"? That's hilarious!");

    }
}
