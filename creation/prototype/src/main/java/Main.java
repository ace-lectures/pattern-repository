import school.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    System.out.println("\n# Classical instantiation");
    long start = System.currentTimeMillis();
    Set<Student> classical = usingConstructor();
    long stop = System.currentTimeMillis();
    System.out.println("-->> Time consumed: " + (stop - start) + "ms");
    System.out.println("\n## Resulting student set");
    classical.forEach(System.out::println);

    System.out.println("\n# Using clones");
    start = System.currentTimeMillis();
    Set<Student> clones = usingClones();
    stop = System.currentTimeMillis();
    System.out.println("-->> Time consumed: " + (stop - start) + "ms");
    System.out.println("\n## Resulting student set");
    clones.forEach(System.out::println);

    System.out.println("\n# Are resulting sets equivalents ?");
    System.out.println(clones.equals(classical)? "Equivalence" : "Non equivalence");

  }


  private static Set<Student> usingConstructor(){

    Set<Student> result = new HashSet<>();

    Student bob = new Student("Bob");
    bob.registerTo("INF5151");
    bob.registerTo("INF5153");
    bob.registerTo("OPT6000");
    result.add(bob);

    Student alice = new Student("Alice");
    alice.registerTo("INF5151");
    alice.registerTo("INF5153");
    alice.registerTo("OPT3000");
    result.add(alice);

    Student eve = new Student("Eve");
    eve.registerTo("INF5151");
    eve.registerTo("INF5153");
    eve.registerTo("OPT8000");
    result.add(eve);

    return result;

  }


  private static Set<Student> usingClones(){

    Set<Student> result = new HashSet<>();

    Student bob = new Student("Bob");
    bob.registerTo("INF5151");
    bob.registerTo("INF5153");

    Student alice = bob.duplicate();
    alice.setName("Alice");

    Student eve = bob.duplicate();
    eve.setName("Eve");

    bob.registerTo("OPT6000");
    result.add(bob);

    alice.registerTo("OPT3000");
    result.add(alice);

    eve.registerTo("OPT8000");
    result.add(eve);

    return result;

  }

}
