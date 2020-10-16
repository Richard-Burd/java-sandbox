// https://www.youtube.com/watch?v=1HTsLK_m2ao&list=PLE7E8B7F4856C9B19&index=5
// Java Video Tutorial 5 - Methods or Functions
import java.util.Scanner;

public class JavaLessonFive {
  // accessable from other classes
  // although this variable is defined in a higher scope, its value can be
  // changed in a lower scope
  static double myPI = 3.14159; // class variable

  public static void main(String[] args)
  {
    addThem(1,2);

    // This should print out s.thing like: #=> Global 3.14159
    // but because the myPI above is re-defined in a
    System.out.println("Global " + myPI);



    //// ------------static <--this is required anytime you want to execute a method that is not part of a class definition
    //accessModifier static returnType methodName ()
  }

  public static int addThem(int a, int b)
  {
    double smallPI = 3.140; // local variable
    //double myPI = 3.14; // class variable
    myPI = myPI + 3.0;
    System.out.println("Local " + myPI);
    // #=> Local 3.14

    return 1;
  }

}

/*
NOTE: in JavaScript, the my_value is re-defined in the sibling scope or child
scope, but that redefinition does not reach the parrallel scope (or up into the
parent scope) and re-define the "my_var" in the sibling (or parent) function.
Java is quite different, as the re-definition in the lower sibling will reach up ]
into the upper sibling

Here are two JavaScript examples
-----------------------------------------------
function brotherScope(){
  var my_value = "A"
  console.log(`So, my value is ${my_value}`)
}

function sisterScope(){
  my_value = "B"
  console.log(`So, my value is ${my_value}`)
}

brotherScope()
sisterScope()
#=> So, my value is A
#=> So, my value is B
-----------------------------------------------
-----------------------------------------------
function parentScope(){
  var my_value = "A"
  console.log(`So, my value is ${my_value}`)

  function childScope(){
    my_value = "B"
    console.log(`So, my value is ${my_value}`)
  }
  childScope()
}

parentScope()
#=> So, my value is A
#=> So, my value is B
-----------------------------------------------





*/
