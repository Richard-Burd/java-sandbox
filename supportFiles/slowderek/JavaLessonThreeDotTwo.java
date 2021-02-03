// https://www.youtube.com/watch?v=qZ2pb6BljLk&list=PLE7E8B7F4856C9B19&index=3
// left off at 9:36 / 13:10 of the Vido: Java Video Tutorial 3
// http://www.newthinktank.com/2011/12/java-video-tutorial-3/

public class JavaLessonThreeDotTwo {
  public static void main(String[] args)
  {
    int valueOne = 1;
    int valueTwo = 2;

    // the ternary operator
    // if valueOne is bigger than valueTwo, return the valueOne,
    // but if (":") that is not the case, go ahead and return valueTwo
    int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
    System.out.println(biggestValue);

    // the switch statement------------------------------------------------------
    // use the switch statement when you have a limited number of possible values
    char myGradeValue = 'B'; // change this manually to see what happens

    switch (myGradeValue)
    {
      case 'A':
      case 'a': //check for lower case
        System.out.println("Wow, great job on the A!");
        break; // without this, the line above will not print and the code will continue to execute
      case 'B':
      case 'b': //check for lower case
        System.out.println("Nice job on the B");
        break; // without this, the line above will not print and the code will continue to execute
      case 'C': case 'c': case 'D': case 'd': case 'F': case 'f': //check for lower case
        System.out.println("That grade is unacceptable!");
        break; // without this, the line above will not print and the code will continue to execute
      default:
        System.out.println("I'm afraid that is not a valid entry");
        break; // this is unnecessary because the switch statement has no more options after this one
    }
  }
}
