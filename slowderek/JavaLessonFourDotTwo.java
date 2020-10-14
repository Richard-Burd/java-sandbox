// https://www.youtube.com/watch?v=efvZmFd1prA&list=PLE7E8B7F4856C9B19&index=4
// Java Video Tutorial 4 - Left off at: 4:33 / 13:23

public class JavaLessonFourDotTwo {
  public static void main(String[] args)
  {
    double myPi = 4.0;
    double j = 3.0;

    // so if I wanted to calculate Pi, here's the way I'd do that:
    // 4 - 4/3 + 4/5 - 4/7
    // ...so there's a pattern of dividing by increasing odd numbers...here's how to do that:

    while(j < 1000) // this will only calculate up to 11
    {
      myPi = myPi - (4/j) + (4/(j+2));
      j += 4; // increment the "j" value by 4
      System.out.println(myPi);
    }

    System.out.println("Value of PI: " + Math.PI);

  }
}
