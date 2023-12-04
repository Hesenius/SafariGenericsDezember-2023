package taxable;

import java.util.Collection;
import java.util.List;

public class TaxPreparer {

  static int VALUE = 99;
  public static <E extends Taxable> void doStuff(List<E> le, E another) {
    System.out.println("VALUE is " + VALUE);
    E yetAgain = another;
  }

  public static void showAll(List<?> l) {
//  public static void showAll(List<? extends Object> l) {
//    l.add(new Object());
    for (Object x : l) {
      System.out.println("> " + x);
    }
  }

  public static void prepareTaxes(Taxable t) {}

//  public static <E extends Taxable> void prepareTaxes(List<E> lt) {
  // Java's version of "co-variance"
  public static void prepareTaxes(List<? extends Taxable> lt) {
//    lt.add(new Taxable());
//    lt.add(new Corporation());
//    lt.add(new Charity());
//    lt.add(new Individual());
//    for (Taxable t : lt) {
//      prepareTaxes(t);
//    }

    for (int i = 0; i < lt.size(); i++) {
      Taxable t = lt.get(i);
      prepareTaxes(t);
    }
  }

  public static void getJoesClients(List<? super Individual> joesClients) {
//  public static <E super Indivdual> void getJoesClients(List<E> joesClients) {
//  public static void <E assignableFrom Indivdual> getJoesClients(List<E> joesClients) {
//  public static void <Individual extends E> getJoesClients(List<E> joesClients) {
//  public static void getJoesClients(List<Individual> joesClients) {
    joesClients.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> clients = List.of(
      new Charity(),
      new Corporation(),
      new Corporation(),
      new Individual(),
      new Individual()
    );

    getJoesClients(clients);
    prepareTaxes(clients);

    List<Individual> joesClients = List.of(
      new Individual(),
      new Individual(),
      new Individual()
    );

    getJoesClients(joesClients);
    prepareTaxes(joesClients);

//    prepareTaxes(List.of("x", "y"));
    TaxPreparer.showAll(joesClients);
  }
}
