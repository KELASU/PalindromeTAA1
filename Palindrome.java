import java.util.Stack;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter String/a set number to see if it's a palindrome:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        Stack Check = new Stack();

        for (int i = 0; i < word.length(); i++) {
            Check.push(word.charAt(i));
        }

        String Flipped = "";

        while (!Check.isEmpty()) {
            Flipped = Flipped+Check.pop();
        }

        if (word.equals(Flipped)){
            System.out.println("The Inputted String is a Palindrome.");
            System.out.println("The Inputted string: "+ word);
            System.out.println("The Sting on Reverse: "+Flipped);
        }
        else{
            System.out.println("The Inputted String is not a Palindrome.");
            System.out.println("The Inputted String: "+ word);
            System.out.println("The Sting on Reverse: "+Flipped);
        }

    }
}
