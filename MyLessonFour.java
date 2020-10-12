// // Complete Java Tutorial:
// https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF
// Java Programming Tutorial 4 - Arguments and Parameters
// https://www.youtube.com/watch?v=U5b9TH14REM&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=5

// to run this type the following:
// ./java-sandbox (master) $ java MyLessonFour.java "Caleb"
// #=> Hello Caleb
// without the "Caleb" parameter being passed into the program, we would
// get a runtime error thatr says s.thing like: "Exception in thread "main" ..etc.
public class MyLessonFour {
  //---------------------(String[] args) <-This 'main' method is expecting a string as an argument
  public static void main(String[] args) {

    //--------------------------------[0] this is array syntax, it's argument #1
    System.out.println("Hello " + args[0]);
  }

}

// Arguments   -are what you pass into a method
// Parameters  -are the variables that store the data you passed in w/arguments
