import java.util.Scanner;

public class WordReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter your sentence: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String[] arrOfStr = sentence.split(" ");

        for(String a : arrOfStr) {
            System.out.println(a);

        }

    }
}
