import java.util.*; // User the package function "Scanner". 

public class TestPalindrome {

	public static void main(String[] args) {

		System.out.println("Please input a word: ");
		Scanner input = new Scanner(System.in); // Set up the input.
		String sentence = input.nextLine(); // let the variable "sentence" take the input sentence.
		String word = sentence.toLowerCase(); // Make all letter in lower style.
		input.close();
		int begin = 0, end = word.length() - 1; // Find the forward index and backward index.
		char[] chars = word.toCharArray(); // Create an array to store the sentence.

		while (begin < end) {
			if (chars[begin] == chars[end]) { // Determine if words are consistent
				begin++;
				end--;
			} else if (!(Character.isLetter(chars[begin]))) { // Determine if chars are not letter from forward.
				begin++;
			} else if (!(Character.isLetter(chars[end]))) { // Determine if chars are not letter from backward.
				end++;
			} else {
				System.out.println("\"" + sentence + "\"" + " is not a Palindrome."); // Determine if the sentence is
																						// not a palindrome and stop
																						// loop.
				break;
			}
			System.out.println("\"" + sentence + "\"" + " is a Palindrome."); // Determine if the sentence is a
																				// palindrome and stop loop.
			break;
		}

	}

}
