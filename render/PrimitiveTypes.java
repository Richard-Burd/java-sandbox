// left off here:
// https://www.youtube.com/watch?v=TBWX97e1E9g&list=PLE7E8B7F4856C9B19
// started at 5:54 / 17:42


public class PrimitiveTypes
{
  // variable names can be upper, or lower camel case and can have underscores.
  static String myString = "\nPrint me, I'm a string\n";

  // "final" will create a variable that is immutable;
  // immutables are conventionally NAMED IN ALL CAPS
  // "double" creates a number with decimals
  static final double PINUMBER = 3.141529;

  public static void main(String[] args)
  {
    // these "int" statements below are not declared "public", "static", or "main"
    // because they're nested in a function (above) that already is.
    int integerOne = 22;                     // declaration statement
    int integerTwo = integerOne + 1;         // expression statement ***
    byte biggest_possible_byte = 127;        // declaration statement
    short biggest_possible_short = 32767;    // declaration statement
    int biggest_possible_int = 2147483647;   // declaration statement

    long biggest_possible_long = 9220000000000000000L; // must have "L" at end
    float biggest_possible_float = 3.14F;              // must have "F" at end

    // the "D" at the end of a float is optional
    double biggest_possible_double = 3.1414141414141414D; // this is for big floats

    System.out.println(biggest_possible_float + myString + PINUMBER + '\n' + integerTwo);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    boolean my_true_or_false = true; // true & false are lower case in Java

    // because of how characters (char) work, both of these evaluate to "A"
    char my_first_character = 65;
    char my_second_character = 'A'; // do not use double-quotes, they won't work

    char escaped_character_1 = '\b'; // backspace
    char escaped_character_2 = '\f'; // formfeed
    char escaped_character_3 = '\r'; // carrage return
    char escaped_character_4 = '\t'; // horizontal tab

    String first_name = "Bob";
    String last_name = "Whu";
    String whole_name = first_name + " " + last_name;

    // this will taka a variable of data type "byte" and convert it to a string
    String my_byte_to_string = Byte.toString(biggest_possible_byte);

    // The other primitive variable types can also be converted into strings:
    String my_short_to_string = Short.toString(biggest_possible_short);
    String my_integer_to_string = Integer.toString(integerOne); // not "Int" but Integer
    String my_float_to_string = Float.toString(biggest_possible_float);
    String my_double_to_string = Double.toString(biggest_possible_double);
    String my_boolean_to_string = Boolean.toString(my_true_or_false);

    System.out.println("First Character evaluates to: " + my_first_character);
    System.out.println("Second Character evaluates to: " + my_second_character);
    System.out.println("Escaped Character: " + escaped_character_4 + whole_name);
    System.out.println("This byte has been stringified: " + my_byte_to_string);
    System.out.println("This integer has been stringified: " + my_integer_to_string);

    // This is how we "cast" one primitive type to another
    double my_double_value = 0.3420221;
    int convert_double_to_int = (int) my_double_value;
    System.out.println("A Casted Primitive: " + my_double_value);

    // Here's how to turn a string into one of the other primitive data types
    String my_number_string = "77";
    int myStringToInteger = Integer.parseInt(my_number_string);
    System.out.println("A string converted to an integer: " + myStringToInteger);
    /*
    Similiar methods include:
    parseLong(), .parseByte(), .parseFloat(), .parseDouble(), .parseBoolean()
    */
  }
}
