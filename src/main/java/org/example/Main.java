package org.example;

record Message(String msg){}
public class Main {
  public static void main(String[] args) {
    Object obj = new Message("Hello Java 21 World!");
    System.out.println(
      switch (obj) {
        case Message(String m) -> m;
        default -> "Huh?";
      }
    );
  }
}