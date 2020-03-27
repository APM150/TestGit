
public abstract class Playground {
    public Integer a, b;
    Playground() {}

    Playground(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    private int getA() {return a;}

    public int getB() {return b;}

    abstract void getNum();

}
