package argfuncts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
  public static <E, F> List<F> map(List<E> in, Function<? super E, ? extends F> op) {
    List<F> res = new ArrayList<>();
    for (E e : in) {
      res.add(op.apply(e));
    }
    return res;
  }

  public static <E> List<E> filter(List<E> input, Predicate<? super E> pred) {
    List<E> res = new ArrayList<>();
    for (E e : input) {
      if (pred.test(e)) {
        res.add(e);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");

    Predicate<CharSequence> longPred = s -> s.length() > 3;

    System.out.println(filter(names, longPred));

    List<StringBuilder> moreNames = List.of(
      new StringBuilder("Alice"),
      new StringBuilder("Bob"),
      new StringBuilder("Charlie")
    );

    System.out.println(filter(moreNames, longPred));


    Function<CharSequence, Integer> toLen = cs -> cs.length();
    List<Number> lens = map(moreNames, toLen);
  }
}
