package homework2;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {2, 1, 2, 3, 4};
        int [] arr2 = {2, 0, 0};
        int [] arr3 = {1, 3, 5};
        int [] arr4 = {7, 6, 3, 8, 5};

        System.out.println("---------------------------");
        System.out.println(CountEvens.countEvens(arr1));
        System.out.println(CountEvens.countEvens(arr2));
        System.out.println(CountEvens.countEvens(arr3));
        System.out.println(CountEvens.countEvens(arr4));

        System.out.println("---------------------------");
        System.out.println(Spread.spread(arr1));
        System.out.println(Spread.spread(arr2));
        System.out.println(Spread.spread(arr3));
        System.out.println(Spread.spread(arr4));

        System.out.println("---------------------------");
        System.out.println(Zero2.zero2(arr1));
        System.out.println(Zero2.zero2(arr2));
        System.out.println("---------------------------");
    }
}
