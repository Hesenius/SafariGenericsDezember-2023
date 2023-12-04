package shopping;

// Watch out!!!
//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  java.lang.String s = "Hello";
public class ClothingPair<E extends Object & Sized & Colored> extends Pair<E> {
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matched() {
    return left.getSize() == right.getSize()
      && left.getColor().equals(right.getColor());
  }
}
