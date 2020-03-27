import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Driver implements Polygon {
    public static int mostFrequent(int [][] arr2D) {
        int most = arr2D[0][0];
        int mostCount = 0;
        for (int i = 0; i < arr2D.length; ++i) {
            for (int j = 0; j < arr2D[i].length; ++j) {
                int tempMost = arr2D[i][j];
                int tempCount = 0;
                for (int m = 0; m < arr2D.length; ++m) {
                    for (int n = 0; n < arr2D[m].length; ++n) {
                        if (arr2D[i][j] == arr2D[m][n]) {
                            ++tempCount;
                        }
                    }
                }
                if (tempCount > mostCount) {
                    most = tempMost;
                    mostCount = tempCount;
                }
            }
        }
        return most;
    }
    public static void change(String a) {
        a = "abc";
    }

    public static int getCount(int [][] arr2D, int max) {
        int count = 0;
        for (int i = 0; i < arr2D.length; ++i) {
            for (int j = 0; j < arr2D[i].length; ++j) {
                if (arr2D[i][j] > max) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String [] removeKey( String [] arr, String key ) {
        int count = 0;
        for (String s: arr) {
            if (! s.equals(key)) {
                ++count;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (! arr[i].equals(key)) {
                result[index++] = new String(arr[i]);
            }
        }
        return result;
    }


    static void fun() throws IllegalAccessException
    {

            System.out.println("Inside fun(). ");
            throw new IllegalAccessException("demo");
    }


    public static void main(String args[]) {
        SomeClassC c = new SomeClassC(1, 2, 3);
        System.out.println(c.doSomethingB());
//        FileReader reader  = new FileReader();
//        Scanner input = new Scanner(reader);
//        PrintWriter output = new PrintWriter();


//        try {
//            fun();
//        }
//        catch (Exception e) {
//            System.out.println("haha");
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println(in.next());
//        System.out.println(in.next());

        int[][] a = new int[2][2];
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 2;
            }
        }
        for (int[] i: a) {
            for (int j: i) {
                System.out.println(j);
            }
        }

        String s = "abc";
        System.out.println(s.length());

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        System.out.println(arr.size());


    }

}
