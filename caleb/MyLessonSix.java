// Complete Java Tutorial:
// https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF

// Java Programming Tutorial 6 - Variables
// https://www.youtube.com/watch?v=7wWvSn_qiBc&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=7
import java.util.Scanner; // this is a "package" - we need this to get user input

public class MyLessonSix {
  public static void main(String[] args) {
    System.out.println("Hey there, what's your name!?");

    Scanner myScannerVariable = new Scanner(System.in);
    String myName = myScannerVariable.nextLine();
    String easyString = "Why hello " + myName + ", it's so nice to meet you!";

    System.out.println(easyString);

  }
}
