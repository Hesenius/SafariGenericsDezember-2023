package oddball;

public class WontWork {


/*
public static <E extends CharSequence> E getOne() {
    return null;

//    E x = "Hello";
//    E cs = ((Math.random() > 0.5)
//      ? "String" // no, E might be StringBuilder
//      : new StringBuilder("StringBuilder")); // no, E might be String
//    return (E)cs;

//    return ((Math.random() > 0.5)
//      ? "String"
//      : new StringBuilder("StringBuilder"));
  }
*/

  public static CharSequence getOne() {
    return ((Math.random() > 0.5)
      ? "String"
      : new StringBuilder("StringBuilder"));
  }

  public static void main(String[] args) {
    CharSequence cs = WontWork.<String>getOne();
//    String cs = WontWork.<String>getOne();
//    StringBuilder cs = WontWork.<StringBuilder>getOne();
//    System.out.println("Got a " + cs.getClass().getName());
    System.out.println("value is " + cs);
  }
}
