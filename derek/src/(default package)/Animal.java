// This is a single line comment
/*
 This is a multiline comment
*/
import java.util.Scanner;
import java.util.*; // this imports the entire "util" library
public class Animal {
  // Here are some subcomponents of a field
  // 1.) public   -this is shared with everyone else
  //     private  -this can only be shared with methods in the Animal class
  // 2.) static   -this is shared by every Animal object that is created
  // 3.) final    -this is a constant and cannot be changed (usually defined with UPPER CASE LETTERS)
  // 4.) double   -this is a variable type that lets you enter decimal places

  // OK, the line below is a variable or "field"
  public static final double FAVNUMBER = 1.6180;

  // variables or "fields" can start with:
  // 1.) a letter
  // 2.) an underscore
  // 3.) a dollar sign

  // Below are some class attributes

  // "private"  -this can only be shared with methods in the Animal class
  private String name;

  // this is an integer that can be anywhere from -2^31 to 2^31
  private int weight;
  private boolean hasOwner = false; // by default, these animals will not have an owner
  private byte age; // 'byte' can have a value between -28 and 127
  private long uniqueID; // 'long' can have a value between -2^63 to 2^63
  private char favoriteChar; // 'char' are unsigned "int"s that represent UTF-16 codes for single characters
  private double speed; // 'double' is a 64 bit number with deceimals
  private float height; // 'float'  is a 32 bit number with deceimals

  // 'protected' means this can only be accessed by other code in the 'package'
  // here, 'package' seems to mean the folder 'src' that this stuff is in
  protected static int numberOfAnimals = 0;

  static Scanner userInput = new Scanner(System.in);

  // here is the Animal class constructor
  public Animal() {
    numberOfAnimals++; // each time an animal is created, this increases by 1
    // no need for super just yet
    // super();

    int sumOfNumbers = 5 + 1;
    System.out.println("5 + 1 = " + sumOfNumbers);

    int diffOfNumbers = 5 - 1;
    System.out.println("5 - 1 = " + diffOfNumbers);

    int multOfNumbers = 5 * 1;
    System.out.println("5 * 1 = " + multOfNumbers);

    int divOfNumbers = 5 / 1;
    System.out.println("5 / 1 = " + divOfNumbers);

    int modOfNumbers = 5 % 3;
    System.out.println("5 % 3 = " + modOfNumbers);

    System.out.print("Prints without starting a new line");
    System.out.println("Prints with starting a new line");
    System.out.print("If I want a new line with the 'print' method then I need a '\\n' \n");

    // https://www.geeksforgeeks.org/scanner-hasnextline-method-in-java-with-examples/
    //----------"hasNextLine()" <- this is a method to see if the user entered a string
    if(userInput.hasNextLine()){
      this.setName(userInput.nextLine());
    }
  }

  // this "main" is the starting point for the program:
  public static void main(String[] args) {
    //-------------------"Animal()" <- this is the constructor
    Animal myAnimal = new Animal();
  }

}
