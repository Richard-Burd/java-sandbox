// https://www.youtube.com/watch?v=efvZmFd1prA&list=PLE7E8B7F4856C9B19&index=4
// Java Video Tutorial 4

public class JavaLessonFourDotOne {
  public static void main(String[] args)
  {
    int i = 1;

    while(i <= 20)
    {
      if(i==3)
      {
        i+=2; // this will take "3" out of the number list printed to the console
        continue;// this jumps out of the current "if" conditional & goes back to the parent "while" loop
      }
      System.out.println(i);
      i++;

      if ((i%2) == 0)
      {
        i++; // this ensures that the counter skips all even numbers so the function only prints out odd numbers
      }

      if (i > 10)
      {
        break; // if the increment "i" is greater than 10 at anytime, I want to break out of the "while" loop
        // this will terminate the loop and the function will only print even numbers from 1 to 9
      }
    }
  }
}
