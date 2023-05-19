package week2.day4;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		


		String text1 = "stops";

		String text2 = "potss";

		if (text1.length() == text2.length()) {

			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();

			Arrays.sort(text1Array);
			Arrays.sort(text2Array);

			// System.out.println(text1Array);
			// System.out.println(text2Array);

			boolean anagramEqual = Arrays.equals(text1Array, text2Array);
			if (anagramEqual) {
				System.out.println("It is an anagram word");

			} else {
				System.out.println("It isn't an anagaram word");
			}
		}
	}


	}


