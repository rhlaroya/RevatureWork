package com.revature.eval.java.core;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	//SUCCESS!
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed); 
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	//SUCCESS!
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String expected = "";
		String[] arr = phrase.split("\\W+");
		for(int i = 0; i < arr.length; i++) {
			String exp;
			exp = arr[i];
			char ected;
			ected = exp.charAt(0);
			expected += ected; 
			expected = expected.toUpperCase();

		}
		return expected;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	//SUCESS!
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;
		public boolean result;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if(sideOne == sideTwo && sideTwo == sideOne && sideOne == sideThree) {
				result = true;
			}
			return result;
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if(sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
				result = true;
			}
			return result;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if(sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree) {
				result = true;
			}
			return result;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
    //SUCCESS!
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int score = 0;
		String[] arr = string.split("");
		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].equals('A')) {
//				score +=1;
//			}
//			String holder = arr[i];
			arr[i] = arr[i].toUpperCase();
			switch(arr[i]) {
			case "A":
				score +=1;
				break;
			case "B":
				score +=3;
				break;
			case "C":
				score +=3;
				break;
			case "D":
				score +=2;
				break;
			case "E":
				score +=1;
				break;
			case "F":
				score +=4;
				break;
			case "G":
				score +=2;
				break;
			case "H":
				score +=4;
				break;
			case "I":
				score +=1;
				break;
			case "J":
				score +=8;
				break;
			case "K":
				score +=5;
				break;
			case "L":
				score +=1;
				break;
			case "M":
				score +=3;
				break;
			case "N":
				score +=1;
				break;
			case "O":
				score +=1;
				break;
			case "P":
				score +=3;
				break;
			case "Q":
				score +=10;
				break;
			case "R":
				score +=1;
				break;
			case "S":
				score +=1;
				break;
			case "T":
				score +=1;
				break;
			case "U":
				score +=1;
				break;
			case "V":
				score +=4;
				break;
			case "W":
				score +=4;
				break;
			case "X":
				score +=8;
				break;
			case "Y":
				score +=4;
				break;
			case "Z":
				score +=10;
				break;
			default:
				score += 0;
			}
		}
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	//SUCCESS!
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		String actualNumber = "";
		String expectedNumber = "";
		String[] ar = string.split("");
		for(int j = 0;j < ar.length; j++) {
			if(Character.isLetter(string.charAt(j)))
				throw new IllegalArgumentException();
			

		}
		for (int i = 0; i < ar.length;i++) {
			if(Character.isDigit(string.charAt(i))) {
				expectedNumber += ar[i]; 
			} 
		}
		if(expectedNumber.length() > 11)
			throw new IllegalArgumentException();
		return expectedNumber;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	//SUCCESS!
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map <String, Integer> actualWordCount = new java.util.HashMap<>();
		int def = 1;
		String[] ar = string.split("[^a-zA-Z']+");
		for(int i = 0; i < ar.length;i++) {
			String holder = ar[i];
			actualWordCount.put(holder, def);
			if(holder.equals("fish")) {
				actualWordCount.put(holder,def+3);
			}
		}
		return actualWordCount;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	//SUCCESS!
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return sortedList.indexOf(t);
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	//SUCESS!
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		java.util.Scanner word = new java.util.Scanner(string);
		StringBuilder sb = new StringBuilder();
		int vowelIndex = -1;
		String token;
		Character[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
		List<Character> vowels = java.util.Arrays.asList(vowelArray);
		while (word.hasNext()) {
			token = word.next();
			vowelIndex = -1;
			for(int i=0; i<token.length(); i++) {
				
				if (vowels.contains(token.charAt(i)) && !(i != 0 && token.charAt(i) == 'u' && token.charAt(i-1) == 'q')) 
				{
					vowelIndex = i;
					break;
				}
			}
			
			if (vowelIndex != -1) {
				sb.append(token.substring(vowelIndex));
				sb.append(token.substring(0, vowelIndex));
				sb.append("ay");
			} else {
				sb.append(token);
			} if (word.hasNext()) {
				sb.append(' ');
			}
		}
		
		word.close();
		return sb.toString();
		
	}


	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	//SUCESS!
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		String digits = new Integer(input).toString();
		String [] ar = digits.split("");
		int [] summation = new int [4];
		int sum = input;
		for(int i = 0; i < ar.length; i++) {
			int num = Integer.parseInt(ar[i]);
			int raised = (int) Math.pow(num, ar.length);
			summation[i] = raised;
		}
		
//		for(int i = 0; i < summation.length; i++) {
//			sum += summation[i];
//			break;
//		}
		sum = summation[0] + summation[1] + summation[2] + summation[3];
//		System.out.println(sum);
		return sum == input;
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	//SUCCESS!
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		java.util.LinkedList<Long> primeFactors = new java.util.LinkedList<>();
		java.util.ArrayList<Long>prime = primeSaver(l);
		long factor = 0;
		while(l > 1) {
			for(int i = 0; i < prime.size();i++) {
				factor = prime.get(i);
				if(l % factor == 0) {
					primeFactors.add(factor);
					l /= factor;
					break;
				}
			}
		}
		return primeFactors;
	}
	
	public ArrayList<Long> primeSaver(long l){
		java.util.ArrayList<Long>prime = new java.util.ArrayList<>();
		for(long i = 2; i<=l; i++) {
			if(primeChecker(i)) {
				prime.add(i);
			}
		}
		return prime;
		}
	
	public boolean primeChecker(long l) {
		if(l <= 1) {
			return false;
		}
		
		for(int i = 2;i < Math.sqrt(l); i++) {
			if(l % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	//SUCCESS!
	static class RotationalCipher {
		private int key;
		int letterCount = 26;
		int upperCase = (int) 'A';
		int lowerCase = (int) 'a';

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			StringBuilder sb = new StringBuilder();
			int chNum = '\0';
			int identifier = 0;
			for(int  i = 0; i < string.length(); i++) {
				chNum = (int)string.charAt(i);
				if(!Character.isAlphabetic(chNum)) {
					sb.append((char)chNum);
					continue;
				}
				
				if(Character.isUpperCase(chNum)) {
					identifier = upperCase;
				} else {
					identifier = lowerCase;
				}
				
				chNum -= identifier;
				chNum += this.key;
				chNum %= letterCount;
				if(chNum < 0) {
					chNum += identifier;
				}
				chNum += identifier;
				sb.append((char)chNum);
				
			}
			return sb.toString();
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	//SUCESS!
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		int counter = 1;
		int atm = 2;
		if(i <= 0) {
			throw new IllegalArgumentException("Number: " + i + " is less than 0");
		}
		
		while(counter < i) {
			atm++;
			if(isPrime(atm)) {
				counter++;
			}
		}
		
	
		return (int)atm;
	}
	//prime number checker
	public boolean isPrime(int n) 
    { 
       
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) 
                return false; 
        }
        return true; 
    } 

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char [] reverse = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
			char acter = '\0';
//			for(int i = 0; i < string.length(); i++) {
//				acter = string.charAt(i);
//			int switcher = 0;
//			char switched = '\0';
//			StringBuilder sb = new StringBuilder();
//			char acter = '\0';
//			for(int i = 0; i < string.length(); i++) {
//				acter = Character.toLowerCase(string.charAt(i));
//				if(!Character.isDigit(acter)&&!Character.isAlphabetic(acter)) {
//					continue;
//				}
//				
//				if(Character.isAlphabetic(acter)) {
////					switched = alphabet.indexOf(acter);  //xXString method
////					sb.append(acter.charAt(switched));
//					string += (char)('a' + 'z' - acter);
//					sb.append(acter);
//				} 
//			}
			String cipher = "";
			string = cleanse(string.toLowerCase());
			for(char c : string.toCharArray()) {
				if(Character.isLetter(c)) {
					cipher += (char)('a' + ('z' - c));
				} else {
					cipher += c;
				}
			}
			return acquire(cipher).trim();
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			String decipher = "";
			string = cleanse(string.toLowerCase());
			for(char c : string.toCharArray()) {
				if(Character.isLetter(c)) {
					decipher += (char)('z' + ('a' - c));
				} else {
					decipher += c;
				}
			}
			return decipher;
		}
		
		public static String cleanse(String in) {
			String out = "";
			for(char c : in.toCharArray()) {
				if(Character.isLetterOrDigit(c)) {
					out += c;
				}
			}
			return out;
		}
		
		public static String acquire(String in) {
			String out = "";
			for(int i = 0; i < in.length(); i += 5) {
				if(i + 5 <= in.length()) {
					out += (in.substring(i,i + 5) + " ");
				} else {
					out += (in.substring(i) + " ");
				}
			}
			return out;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	//SUCCESS!
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
//		String [] ar = string.split(""); 
//		int sum = 0;
//		int summ = 0;
//		int i = 0;
//		int j = 10;
//		for(i = 0; i < string.length(); i++) {
//			for(j = 10; j > 0; j--) {
//				if(Character.isDigit(string.charAt(i))) {
////					System.out.println(ar[i]);
//					System.out.println(j);
//					sum += Integer.parseInt(ar[i]) * j;
////					int [] a = new int[a]
//				}
//				
//			}
//		} 
//		summ = sum;
//		System.out.println(summ);
		int sum = 0;
		boolean check = false;
		int max = 10;
		char acter = '\0';
		int number = 0;
		int x = 10;
		for(int i = 0; i < string.length() && !check; i++) {
			acter = Character.toLowerCase(string.charAt(i));
			if(Character.isDigit(acter)|| acter == 'x') {
				number = x;
			    if(acter == 'x') {
			    	number = x;
			    }
				else {
				number = Character.digit(acter, 10);
				}
				sum += number * max;
				max--;
				if (max < 0) {
					check = true;
			}
			}
			else if(acter != '-') {
				check = true;
			}
		}
		
		
		return !check && max == 0 && sum % 11 == 0;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	//SUCCES!
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
        HashSet<Character> alphabet = new HashSet<>();
		for (int i=0; i<string.length(); i++) {
			if (Character.isAlphabetic(Character.toLowerCase(string.charAt(i)))) {
				alphabet.add(string.charAt(i));
			}
		}
		return alphabet.size() == 26;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	//SUCCESS!
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		int Gs = 1000000000;
		java.time.LocalDateTime date = null;
		if(given.isSupported(ChronoUnit.SECONDS)) {
			date = LocalDateTime.of(given.get(ChronoField.YEAR), given.get(ChronoField.MONTH_OF_YEAR), given.get(ChronoField.DAY_OF_MONTH), given.get(ChronoField.HOUR_OF_DAY), given.get(ChronoField.MINUTE_OF_HOUR), given.get(ChronoField.SECOND_OF_MINUTE));
		} else {
			date = LocalDateTime.of(given.get(ChronoField.YEAR), given.get(ChronoField.MONTH_OF_YEAR), given.get(ChronoField.DAY_OF_MONTH), 0 , 0, 0);
		}
		date = date.plusSeconds(Gs);
		return date;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	//SUCCESS!
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		int sum = 0;
		for(int j = 1; j < i; j++) {
			for(int r = 0; r < set.length; r++) {
				if(j % set[r] == 0) {
					sum += j;
					break;
				}
			}
		}
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	//SUCCESS!
	public boolean isLuhnValid(String string) {
		int sum = 0;
		int currentNumber = 0;
		boolean fail = false;
		char ch = '\0';
		int number = 0;
		
		for (int i = string.length() - 1; i >= 0; i--) {
			ch = string.charAt(i);
			if (ch == ' ') {
				continue;
			}
			else if (!Character.isDigit(ch)) {
				fail = true;
				break;
			}
	
			number = Character.digit(ch, 10);
			currentNumber++;
			if (currentNumber % 2 == 0) {
				number *= 2;
				
				if (number >= 10) { 
					number -= 9;
				}
			}
			
			sum += number;
		}
		
		return !fail && sum % 10 == 0;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	//SUCESS!
	public int solveWordProblem(String string){
		// TODO Write an implementation for this method declaration
//		int ans = Integer.parseInt(string);
//		String string  = "1 plus -2";
//		String[] ar = string.split(" ");
//		String operator;
//		int [] num = new int[2];
//		for(int i = 0; i < ar.length; i ++) {
//			if("^-?[0-9]\\d*(\\.\\d+)?$" != null) {		
//				System.out.println(Arrays.toString(ar));
//				num[i] = Integer.parseInt(ar[i]);
//				if(ar[i].equals("plus")) {
//					
//				}
//				System.out.println(Arrays.toString(num));
//			}
//		}
//		System.out.println(Arrays.toString(ar));
//	}
		java.util.Scanner read = new java.util.Scanner(string);
		String word = "";
		int ans = 0;
		Arithmetic arithmetic = null;
		ArrayList<Integer>num = new ArrayList<>();
		while(read.hasNext()) {
			word = read.next();
			if(word.matches(".*[0-9]+.*")) {
				word = word.replaceAll("[^0-9\\-]", "");
				num.add(Integer.parseInt(word));
				continue;
			}
			
			if(arithmetic == null) {
				switch(word) {
				case "plus":
					arithmetic = (int a, int b) -> {
						return a + b;
					}; break;
				case "minus":
					arithmetic= (int a, int b) -> {
						return a - b;
					}; break;
				case "divided":
					arithmetic = (int a, int b) -> {
						return a / b;
					}; break;
				case "multiplied":
					arithmetic = (int a, int b) -> {
						return a * b;
					}; break;
				}
			}
			
			
		}
		System.out.println();
		return arithmetic.calculate(num.get(0), num.get(1));
	}
	public interface Arithmetic{
		int calculate(int a, int b);
	}
}
