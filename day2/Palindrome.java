package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 12321;   
        int output = 0;      
        int rem;             
        int original = input;

        for (int i = input; i > 0; i = i / 10) {
            rem = i % 10;               
            output = output * 10 + rem; 
        }
        if (original == output) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }
    }
	}

