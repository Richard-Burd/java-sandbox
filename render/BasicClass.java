// left off here:
// https://www.youtube.com/watch?v=TBWX97e1E9g&list=PLE7E8B7F4856C9B19
// at 5:54 / 17:42

public class Simple {

  static String my_$12_String = "I'm classy!";

  // "final" makes the value constant, & by convention, the var name should be all caps "PINUM"
  // double means you can have decemal places
  static final double PINUM = 3.141529;

  public static void main(String[] args) {

    // no "static" used here inside the function
    String my_$5_String = "I'm function-ey"; // declaration statement

    // we can declare multiple variables of a single type once
    String
      my_1st_String = "qwe",
      my_2nd_String = "rty";

    // this is called an expression statement
    String finalString =
      my_1st_String + my_2nd_String;

    System.out.println(my_$12_String);
    System.out.println(PINUM);
    System.out.println(my_$5_String);
    System.out.println(finalString);
  }
}

// to run this file in bash, use: $ java Scratch.java

/* Explanation of Components
1.) public   -this tells Java that this is available to all other classes
2.) class    -this is a blueprint for what we want in
3.) static   -this means that only its class (FirstProgram) can call this function to execute
4.) void     -this states that this function doesn't return ANY values after it executes
5.) main     -this is the function that always executes first & is required in all Java programs
6.) String[] -this is saying that the function will accept an array of string objects as arguments
7.) System   -this prints out stuff in different ways
8.) println  -this prints a line of text in the console and starts a new line afterwards
*/
