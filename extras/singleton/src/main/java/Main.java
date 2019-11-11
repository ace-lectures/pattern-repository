import products.Factory;
import products.Product;
import products.Regular;
import products.UniqueLazyNotThreadSafe;
import products.UniqueThreadSafe;

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


    System.out.println("###\n# Factory usage\n###");
    // Product fact1 = new Factory(); // Does not compile, thanks to the private constructor
    Product fact1 = Factory.build();
    fact1.doSomething();
    Product fact2 = Factory.build();
    fact2.doSomething();
    Product fact3 = Factory.build();
    fact3.doSomething();
    System.out.println("Number of instances created: " + Factory.howManyCreated()+"\n");
    
    System.out.println("\n###\n# Singleton Lazy usage\n###");
    // Product sing1 = new UniqueLazyNotThreadSafe(); // Does not compile, thanks to the private constructor
    System.out.println("Number of instances created: " + UniqueLazyNotThreadSafe.howManyCreated()+"\n");
    Product sing1 = UniqueLazyNotThreadSafe.build();
    sing1.doSomething();
    Product sing2 = UniqueLazyNotThreadSafe.build();
    sing2.doSomething();
    Product sing3 = UniqueLazyNotThreadSafe.build();
    sing3.doSomething();
    System.out.println("Number of instances created: " + UniqueLazyNotThreadSafe.howManyCreated()+"\n");
    
    System.out.println("\n###\n# Singleton usage\n###");
    // Product sing1 = new UniqueLazyNotThreadSafe(); // Does not compile, thanks to the private constructor
    System.out.println("Number of instances created: " + UniqueThreadSafe.howManyCreated()+"\n");
    sing1 = UniqueThreadSafe.build();
    sing1.doSomething();
    sing2 = UniqueThreadSafe.build();
    sing2.doSomething();
    sing3 = UniqueThreadSafe.build();
    sing3.doSomething();
    System.out.println("Number of instances created: " + UniqueThreadSafe.howManyCreated()+"\n");
  }

}
