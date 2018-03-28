public class Main {

    public static void main(String[] args) {

                               //0, 1, 2, 3, 4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

                                   // 0,  1,  2, 3,  4, 5,  6, 7, 8,  9,  10, 11, 12,13, 14,15, 16, 17
        int[] arrayToSort = new int[]{14, 15, 3, 26, 9, 44, 6, 2, 54, 25, 76, 33, 2, 65, 88, 2, 22, 99};

        FactorialFunction factorialFunction = new FactorialFunction();
        FactorialFunctionRecursive factorialRecursive = new FactorialFunctionRecursive();
        isPalindromeRecursive isPalindromeRecursive = new isPalindromeRecursive();
        findSquareRoot findSquareRoot = new findSquareRoot();
        findPower findPower = new findPower();
        MergeSort mergeSort = new MergeSort();

        System.out.println("-----------------------");

        String result = "";

        for (int i = 0; i < arrayToSort.length; i++)
            result += arrayToSort[i] + ", ";

        mergeSort.sort(arrayToSort);

        System.out.println(result);

        for (int i = 0; i < arrayToSort.length; i++)
            System.out.print(arrayToSort[i] + ", ");

    }













}
