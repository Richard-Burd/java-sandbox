// https://www.youtube.com/watch?v=qZ2pb6BljLk&list=PLE7E8B7F4856C9B19&index=3
// http://www.newthinktank.com/2011/12/java-video-tutorial-3/

/* --Relational Operators--
1.) >  : greater than
2.) <  : less than
3.) == : equal to
4.) != : not equal to
5.) >= : greater than or equal to
6.) <= : less than or equal to
*/

/* Logical Operators:
* Java has 6 logical operators
* ! : Converts the boolean value to its right to its opposite form ie. true to false
* & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
* && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
* | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
* || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
* ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
*/
public class JavaLessonThreeDotOne {
  public static void main(String[] args)
  {
    int randomNumber = (int) (Math.random() * 50);
    if (randomNumber < 25)
    {
      System.out.println("The random number is less than 25");
    }
    else if (randomNumber > 40)
    /* // this could be re-written in the negative:
    else if (!(randomNumber < 40))  <---------------note the nested parenthesis!
      // here is how you would write the syntax using true & false:
    else if ((true) && (true))      <---------------note the nested parenthesis!
    */
    {
      System.out.println("The random number is greater than 40");
    }
    else
    {
      System.out.println("The random number is between 25 and 40");
    }

    System.out.println("The random number is " + randomNumber);
  }
}
