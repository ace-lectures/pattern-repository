package products;

public class UniqueThreadSafe implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }


    private static UniqueThreadSafe instance = new UniqueThreadSafe();

    public static UniqueThreadSafe build() {
        return instance;
    }

    private UniqueThreadSafe() {
        System.out.println("==>> A new unique product is instantiated <<==");
        counter++;
    }

    @Override
    public void doSomething() {
        System.out.println("I am an unique product doing something");
    }

}
