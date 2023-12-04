package arrayfiddle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
  public static <E> void showVarArgs(E ... values) {
    Object [] vals = values;
    System.out.println(values);
    System.out.println(values.getClass().getName());
  }

  // java arrays behave "co-variant", but fail
  // at runtime if used contra-variant
  public static void showArray(Object [] oa) {
    for (Object o : oa) {
      System.out.println("> " + o);
    }
//    oa[0] = new Object(); // likely to break!
  }

  public static <E extends F, F> F[] getAsArray(List<E> le, Class<F> cl) {
    int size = le.size();
//    E[] result = (E[])new Object[size];
    F[] result = (F[]) Array.newInstance(cl, size);
    Iterator<E> iter = le.iterator();
    for (int i = 0; i < size; i++) {
      E item = iter.next();
      result[i] = item;
    }
    return result;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    CharSequence[] nameArray = getAsArray(names, CharSequence.class);
    nameArray[0] = new StringBuilder("SB");
    System.out.println("array type: " + nameArray.getClass().getName());
    System.out.println(Arrays.toString(nameArray));




//    showVarArgs(1,2,3,4);

//    Object [] oa = {1,2,3,4};
//    showArray(oa);
//
//    Class<?> cl = oa.getClass();
//    System.out.println(cl.getName());
  }
}
