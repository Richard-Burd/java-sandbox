// Left off here:
// https://www.youtube.com/watch?v=yYN8u90MKCg&list=PLE7E8B7F4856C9B19&index=2
// Java Video Tutorial 2

// You can import a specific class from a library...
import java.util.Scanner; // imports just the Scanner class

// ...or you can import an entire library
import java.util.*;       // imports everything from the library

// the name of the class should match the name of the file it is located in
public class JavaLessonTwo
{
  // 'static' means that only the class can call for this statement to execute
  // 'userInput' is the name of the variable in this field below
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args)
  {
    System.out.print("What's your favorite number!?");

    // checks to see if the next thing the user types is an integer by using the
    // "hasNextInt() method on the Scanner class
    if(userInput.hasNextInt()) // you can also use ".hasNextFloat()" & methods for different data types
    {
      // stores the next thing a user types into a variable called "numberEntered"
      int numberEntered = userInput.nextInt();
      System.out.println("You entered " + numberEntered);

      int numberEnteredTimes2 = numberEntered + numberEntered;
      System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);

      // this other stuff has nothing to do with this if-else statement we're currently inside of
      // the Math library is native & doesn't need importing
      // find absolute value for a number
      int numberABS = Math.abs(numberEntered);
      System.out.println(numberABS);
      // the "max" method finds the bigger number
      int whichIsBiggger = Math.max(numberEntered, 7);
      System.out.println("The higher number is: " + whichIsBiggger);
      // find the square root, integers "int" can't be used cuz we want deceimals
      double myNumSquareRoot = Math.sqrt(5.23);
      System.out.println(myNumSquareRoot); // #=> 2.2869193252058544
      // The ceiling ".ceil()" method rounds the number up to the closest integer:
      int myNumericalCeiling = (int) Math.ceil(5.23);
      System.out.println(myNumericalCeiling); // #=> 6
      // The opposite of ceiling is the ".floor()" method that rounds down
      int myNumericalFloor = (int) Math.floor(5.23);
      System.out.println(myNumericalFloor); // #=> 5
      // You can also do a straight rounding:
      int myNumericalRounding = (int) Math.round(5.5);
      System.out.println(myNumericalRounding); // #=> 6

      // here's how you get a random number between 0 and 10:
      int myRando = (int) (Math.random() * 11);
      // https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
      // here's how you get a random number between 200 and 300:
      int myRando2 = (int) (Math.random() * 101 + 200);
      // if you didn't specify a range like this...:
      int myRand3 = (int) (Math.random()); // ...you'd get a nuber between 0.0 & 0.999999
      System.out.println("Small random number is: " + myRando + " And the large one is: " + myRando2);

    } else { // if they don't enter an integer

      System.out.println("Fail; please enter an integer next time!");

    }
  }
}
/*
---------------------------------------------------------------------
Shorthand Math (in this case, the "2" can be any number other than 1)
Long Form:                  Short Form:
myVar = myVar + 2; -------> myVar += 2;
myVar = myVar - 2; -------> myVar -= 2;
myVar = myVar * 2; -------> myVar *= 2;
myVar = myVar / 2; -------> myVar /= 2;
myVar = myVar % 2; -------> myVar %= 2; (modulus)
---------------------------------------------------------------------
Shorthand Math for operating with the number 1

myVar = myVar + 1; -------> myVar++;
myVar = myVar - 1; -------> myVar--;
---------------------------------------------------------------------
*/
