package products;


public class Factory implements Product {

    private static int counter = 0;
    public static int howManyCreated() { return counter; }

    private Factory() {
        System.out.println("==>> A new factory product is instantiated  <<==");
        counter++;
    }

    public static Factory build() {
    	return new Factory();
    }
    
    @Override
    public void doSomething() {
        System.out.println("I am a factory product doing something");
    }

}
