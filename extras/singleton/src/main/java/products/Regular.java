package products;

public class Regular implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }

    public Regular() {
        System.out.println("==>> A new regular product is instantiated  <<==");
        counter++;
    }

    @Override
    public void doSomething() {
        System.out.println("I am a regular product doing something");
    }

}
