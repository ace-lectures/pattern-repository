import products.Product;
import products.Regular;
import products.Unique;

public class Main {

  public static void main(String[] args) {

    System.out.println("###\n# Regular usage\n###");
    Product reg1 = new Regular();
    reg1.doSomething();
    Product reg2 = new Regular();
    reg2.doSomething();
    Product reg3 = new Regular();
    reg3.doSomething();
    System.out.println("Number of instances created: " + Regular.howManyCreated()+"\n");


    System.out.println("\n###\n# Singleton usage\n###");
    // Product sing1 = new Unique(); // Does not compile, thanks to the private constructor
    Product sing1 = Unique.build();
    sing1.doSomething();
    Product sing2 = Unique.build();
    sing2.doSomething();
    Product sing3 = Unique.build();
    sing3.doSomething();
    System.out.println("Number of instances created: " + Unique.howManyCreated()+"\n");
  }

}
