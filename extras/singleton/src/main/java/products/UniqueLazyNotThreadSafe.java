package products;

public class UniqueLazyNotThreadSafe implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }


    private static UniqueLazyNotThreadSafe instance = null;

    public static UniqueLazyNotThreadSafe build() {
    	// this test is not thread safe
    	// and double checked locking does not solve the problem
    	// https://en.wikipedia.org/wiki/Double-checked_locking
        if (instance == null)
            instance = new UniqueLazyNotThreadSafe();
        return instance;
    }

    private UniqueLazyNotThreadSafe() {
        System.out.println("==>> A new unique product is instantiated <<==");
        counter++;
    }

    @Override
    public void doSomething() {
        System.out.println("I am an unique product doing something");
    }

}
