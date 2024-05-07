package homework2;

public class CountEvens {

    public static int countEvens(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
