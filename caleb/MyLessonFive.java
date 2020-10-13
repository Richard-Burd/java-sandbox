// Complete Java Tutorial:
// https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF

// Java Programming Tutorial 5 - Input and Output
// https://www.youtube.com/watch?v=JceW6zvmA_Q&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=6

// NOTE: Java is case sensitive

import java.util.Scanner; // this is a "package" - we need this to get user input

public class MyLessonFive {

  public static void main(String[] args) {

    System.out.println("What is your name?");

    // I could get rid of the 'import' statement on line 7 and do this:
    // java.util.Scanner scanner = new java.util.Scanner(System.in);
    // we say the statement above "fully qualifies" the scanner because it
    // tells you (with dot notation) exactly where the Scanner is comming from
    // ...but the 'import' statement just saves time for us here.

    // So here is the format for creating a new object:
    // 1.) type [Scanner]
    // 2.) identifier [scanner]
    // 3.) assignment operator [=]
    // 4.) the keyword 'new' [new]
    // 5.) type [Scanner]
    // 6.) parenthesis with call constructor [(System.in)] <-where we're getting our info from (console)
    // 7.) semicolon [;]
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine(); // this is NOT static
    System.out.println("Why hello there " + name);
  }

}
