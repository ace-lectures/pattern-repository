package products;

public class UniqueLazyThreadSafe implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }


    private static volatile UniqueLazyThreadSafe instance = null;

    private static synchronized void expensiveCheck() {
    	if (instance == null) {
    		instance =  new UniqueLazyThreadSafe();
    	}
    }
    public static UniqueLazyThreadSafe build() {
    	// this is thread safe with volatile 
    	// and double checked locking
    	// https://en.wikipedia.org/wiki/Double-checked_locking
        if (instance == null)
            expensiveCheck();
        return instance;
    }

    private UniqueLazyThreadSafe() {
        System.out.println("==>> A new unique product is instantiated <<==");
        counter++;
    }

    @Override
    public void doSomething() {
        System.out.println("I am an unique product doing something");
    }

}
