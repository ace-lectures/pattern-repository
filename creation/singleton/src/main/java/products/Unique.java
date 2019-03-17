package products;

public class Unique implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }


    private static Unique instance = null;

    public static Unique build() {
        if (instance == null)
            instance = new Unique();
        return instance;
    }

    private Unique() {
        System.out.println("==>> A new unique product is instantiated <<==");
        counter++;
    }

    @Override
    public void doSomething() {
        System.out.println("I am an unique product doing something");
    }

}
