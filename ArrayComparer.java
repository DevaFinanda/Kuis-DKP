import java.util.Arrays;

public class ArrayComparer {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        // Gunakan .equals() untuk membandingkan nilai Integer
        if (a.equals(b)) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are NOT equal");
        }

        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};

        // Gunakan Arrays.equals() untuk membandingkan isi array
        if (Arrays.equals(x, y)) {
            System.out.println("Arrays x and y are equal");
        } else {
            System.out.println("Arrays x and y are NOT equal");
        }
    }
}
