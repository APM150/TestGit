public class Question {
    public int[] arr;
    public  Question (int length) {
        arr = new int[length];
    }
    public void copyValues(int [] copy) {
        for (int i = 0; i < copy.length; ++i) {
            arr[i] = copy[i];
        }

    }
    public int[] getArr() {return arr;}
    public int[] doubleValues() {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] *= 2;
        }
        return arr;
    }
}
