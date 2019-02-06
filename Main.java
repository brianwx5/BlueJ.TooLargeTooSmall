
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Main
{
    
 

    public static void Main(String args[]) 
    {    
     Random randomNumber = new Random();
     int rando = randomNumber.nextInt(10) + 1;
     Scanner scanner = new Scanner(System.in);
     int guesses = 0;
     int input = -1;
     
     System.out.println("Welcome to the guessing game! Guess between 1-10 to win.");

       while(true) {
           int previousGuess = input;
          input = scanner.nextInt();
           
        
           if(input == rando) {   
               System.out.println("You are correct." + "You took " + guesses + " guesses");
                break;
                }
           else if(input >rando) {
           guesses = (input == previousGuess) ? guesses : (guesses + 1);
           System.out.println("You are too high!" + "You took " + guesses + " guesses");
           
         
        } else if (input < rando) {
            guesses = (input == previousGuess) ? guesses : (guesses + 1);
            System.out.println("You are too low!" + "You took " + guesses + " guesses");
            }
            
        } 
    } 
}


 


