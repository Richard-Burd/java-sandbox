// https://www.youtube.com/watch?v=efvZmFd1prA&list=PLE7E8B7F4856C9B19&index=4
// Java Video Tutorial 4 - Left off at: 7:30 / 13:23
import java.util.Scanner;

public class JavaLessonFourDotThree {

  // this field below will accept user input:
  static Scanner my_user_input = new Scanner(System.in);

  public static void main(String[] args)
  {
    String continue_Yes_or_No = "Y";

    int h = 1;

    //-----------------------.equalsIgnoreCase() <--this method ignores the case entered by the user
    while (continue_Yes_or_No.equalsIgnoreCase("y"))
    {
      System.out.println(h);
      System.out.print("Continue yes or no ?");

      //--------------------------------.nextLine() <-- this grabs whatever the user enters inthe next line
      continue_Yes_or_No = my_user_input.nextLine();
      h++;
    }
  }
}
