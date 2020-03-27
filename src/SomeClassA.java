public class SomeClassA {
    private int a;
    public SomeClassA( int a ) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public String doSomethingA() {
        return "A: " + a + doSomethingC();
    }

    public String doSomethingB() {
        return "a";
    }

    private String doSomethingC() {
        return "A: doSomethingC";
    }
}
