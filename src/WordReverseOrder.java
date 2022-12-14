import java.util.Scanner;

public class WordReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter your sentence: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String[] arrOfStr = sentence.split(" ");
        String rev = "";

        for(int i = 0; i < arrOfStr.length; i++) {
            rev = arrOfStr[i] + " " + rev;
        }
        System.out.println("Reversed sentence: " + rev);
    }
}
