import java.util.Random;
import java.util.Scanner;
public class Assignment1Program1 {
  public static void main(String[] args) {
    //Problem 1: Prints out my initials in large block letters
    System.out.println("  S S S S S S  " + "\t\tH H H        H H H");
    System.out.println("S S S S S S S S" + "\t\tH H H        H H H");
    System.out.println("S S S" + "\t\t\tH H H        H H H");
    System.out.println("S S S" + "\t\t\tH H H        H H H");
    System.out.println("S S S S S S S  " + "\t\tH H H H H H H H HH");
    System.out.println("  S S S S S S S" + "\t\tH H H H H H H H HH");
    System.out.println("\t  S S S" + "\t\tH H H        H H H");
    System.out.println("\t  S S S" + "\t\tH H H        H H H");
    System.out.println("S S S S S S S S" + "\t\tH H H        H H H");
    System.out.println("  S S S S S S  " + "\t\tH H H        H H H");

    //Problem 2: Reverses three middle characters
    System.out.println("Please enter a 5-character string:");
    Scanner scan = new Scanner(System.in);
    String word = scan.next(); 

    //Problem 3: Converts temperature from Fahrenheit to Celsius
    System.out.println("Please enter a number in Fahrenheit:");
    
    double conversionFactor = 5.0/9.0;
    double temp = scan.nextDouble();
    double celsius = (conversionFactor * (temp - 32));

    scan.close();

    //Problem 4: Generates and saves random number between 32 – 16,384
    System.out.println("Random number generated:");
    Random generator = new Random();
    int randomNumber = generator.nextInt(32,16385);
  
    //Problem 5: Concatenation of answers from problems 2-4
    System.out.print(celsius);
    System.out.print(word.charAt(3));
    System.out.print(word.charAt(2));
    System.out.print(word.charAt(1));
    System.out.print(randomNumber);
  }
  
}
