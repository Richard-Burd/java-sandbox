// https://www.youtube.com/watch?v=efvZmFd1prA&list=PLE7E8B7F4856C9B19&index=4
// Java Video Tutorial 4 - Left off at: 9:30 / 13:23

// Do While Loops
// use do-while loops when you want to absolutely guarantee that code is going
// to be executed at least once

import java.util.Scanner;

public class JavaLessonFourDoWhileLoop {

  // this field below will accept user input:
  static Scanner my_user_input = new Scanner(System.in);

  public static void main(String[] args)
  {
    int k = 4;

    do
    {
      System.out.println(k); // even if "k" is already greater than 10, it will execute this line here
      k++;
    } while (k < 10); // as long as this is true, the loop will continue
  }
}
/*
#=> 4
#=> 5
#=> 6
#=> 7
#=> 8
#=> 9
*/
