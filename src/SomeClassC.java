public class SomeClassC extends SomeClassB {
    private int c;
    public SomeClassC( int a, int b, int c ) {
        super( a, b );
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public String doSomethingB() {
        return "C: " + c + super.doSomethingD();
    }

    public String doSomethingC() {
        return "C";
    }
    public String doSomethingD() {
        return "D";
    }
}
