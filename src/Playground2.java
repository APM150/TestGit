import java.util.Iterator;

public class Playground2 extends Playground implements Comparable, Iterable{
    public  int l;
    Playground2(int real, int imaginary) {
        super(real, imaginary);
        System.out.println();
    }

    @Override
    void getNum() {

    }

    public String toString() {
        return a.toString() + b.toString();
    }

    public int compareTo(Object o) {
        return this.a.compareTo(((Playground2) o).a);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
