public class SomeClassB extends SomeClassA {
    private int b;
    public SomeClassB( int a, int b ) {
        super( a );
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public String doSomethingA() {
        return "B doSomethingA";
    }

    public String doSomethingC() {
        return "b";
    }

    public String doSomethingD() {
        return "B: " + super.doSomethingA();
    }
}
