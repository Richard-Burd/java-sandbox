// https://www.youtube.com/watch?v=1HTsLK_m2ao&list=PLE7E8B7F4856C9B19&index=5
// Java Video Tutorial 5
import java.util.Scanner;

public class JavaLessonFive {

  // the main function calls the "addThem" function
  public static void main(String[] args)
  {
    System.out.println(addThem(1,2));
  }

  // not sure why this is defined with 'int' when it's a function
  public static int addThem(int a, int b)
  {
    int c = a + b;

    return c;
  }

}
