package shopping;

public class Shop {
  public static void main(String[] args) {
    ClothingPair<Shoe> ps =
      new ClothingPair<>(new Shoe("Brown", 10), new Shoe("Brown", 11));
    ClothingPair<Shoe> ps2 =
      new ClothingPair<>(new Shoe("Black", 10), new Shoe("Brown", 10));
    System.out.println(ps);
    System.out.println("do they match? " + ps.matched());
    System.out.println("do the new ones match? " + ps2.matched());
  }
}

