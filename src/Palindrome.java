import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scnaKeyb = new Scanner(System.in);
        System.out.print("Write sentence to check: ");
        String inputSentence = scnaKeyb.nextLine();
        inputSentence = inputSentence.replace(" ", "").toLowerCase();
        StringBuilder wordReversed = new StringBuilder(inputSentence).reverse();

        System.out.println(inputSentence);
        System.out.println(wordReversed);
        if(inputSentence.equals(wordReversed.toString()))    //porównanie
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");

        scnaKeyb.close();
    }
}