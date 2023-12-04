package shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
//    Pair p = new Pair("hello", LocalDate.now());
//    String s = p.getLeft();
    Pair<String> p = new Pair<String>("hello", "bonjour");
    String s = p.getRight();
    System.out.println(s);
  }
}
