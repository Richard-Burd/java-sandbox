// Complete Java Tutorial:
// https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF:
// Java Programming Tutorial 3 - Understanding Java Foundation:
// https://www.youtube.com/watch?v=ovb8njlzvlA&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=4

// everything is inside of a class; in our case the class is "MySweetProgram"
// every class and every method has an identifier; the identifier here is
// "MySweetProgram"
public class MySweetProgram {
// "public" is an access modifier

  // this is a method inside of the MySweetProgram class
  // the method's identifier is "main"
  // because this method is nested inside the MySweetProgram class,
  // it is known as a 'member' of the MySweetProgram class
  public static void main(String[] args) { // Java programs start with 'main'
  // the "static" keyword is saying that you don't need to create an instance
  // of the MySweetProgram class in order to use the "main" method; without the
  // "static" keyword you would need to do this:
  // var menewvar = new MySweetProgram();
  // menewvar.main();

    // inside a method, we execute statements;
    // the line below is an example of a statement
    // here we are accessing the 'System' class member called 'out';
    // 'out' has a member called 'println' (print-line) which is a method
    System.out.println("Hello There!");
  }

  // this is the second member of the MySweetProgram class:
  String x = new String("Hi Everybody"); // this string is an example of a property

  // methods do something whereas properties just store some value
}

// SUMMARY:
// classes contain everything in Java
// methods do something
// properties store something
// access modifiers (like 'public') define who can use the code block
// static = no instance of a class needed to use
// an object is an instance of a class
// Java programs need a 'main' method to know where to start (except with libaries)
