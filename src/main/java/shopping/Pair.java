package shopping;

import java.util.function.BiPredicate;

public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

  // should probably have:
  public boolean matchByPredicate(BiPredicate<E, E> bp) {
    return bp.test(getLeft(), getRight());
  }

//  public boolean matched() {
//    return getLeft().getSize() == getRight().getSize();
//  }

  @Override
  public String toString() {
    return "Pair{" +
      "left=" + left +
      ", right=" + right +
      '}';
  }
}
