import java.util.Scanner;

//Caleb Kroon - Computer Science & Digital Media

/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input from user
        System.out.println("Please enter a string:"); // Prompt user for input 
        String input = sc.nextLine(); // Read the input string
        for (int i = 0; i < input.length(); i++) { // Loop through each character in the string
            System.out.println(input.charAt(i)); // Print each character on a new line
        }
    }
}

// Explanation:
// To print out the string character by character, I first used a Scanner to take input from the user.
// Then, I used a for loop to iterate through each character in the string.
// The loop continues as long as the index (i) is less than the length of the string.
// Inside the loop, I used the charAt() method to get each character and print it.`
// The using the charAt() method was the easiest way to achieve this imo.