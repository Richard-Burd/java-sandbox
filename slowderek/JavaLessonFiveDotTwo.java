// https://www.youtube.com/watch?v=1HTsLK_m2ao&list=PLE7E8B7F4856C9B19&index=5
// Java Video Tutorial 5 - Methods or Functions Left off at 9:28 / 14:06
import java.util.Scanner;

public class JavaLessonFive {

  static int randomNumber;
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args)
  {
    System.out.println("Here's the random number: " + getRandomNum());

    int guessResult = 1;
    int randomGuess = 0;
    while(guessResult != -1)
    {
      System.out.println("Guess a number between 0 and 50: ");
      randomGuess = userInput.nextInt();
      guessResult = checkGuess(randomGuess);
    }

    System.out.println("Yes, the random number is " + randomGuess);
  }

  public static int getRandomNum()
  {
    randomNumber = (int) (Math.random() * 51);
    return randomNumber;
  }

  public static int checkGuess(int guess)
  {
    if(guess == randomNumber)
    {
      return -1;
    } else {
      return guess;
    }
  }

}
