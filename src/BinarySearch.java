public class BinarySearch {

    //returns -1 if number is not in an array else returns number

    public int goSearch(int[] array, int searchedNumber){

        int min = 0;
        int max = array.length - 1;

        while(min <= max){

            int current = (min + max)/2;

            System.out.println("searched: " + searchedNumber);
            System.out.println("current value of array[" + current + "]: " + array[current]);
            System.out.println("min value: " + min);
            System.out.println("max value: " + max);
            System.out.println("current index: " + current);
            System.out.println("------------------");

            if(searchedNumber > array[current])
                min = current + 1;
            else if (searchedNumber < array[current])
                max = current - 1;
            else if (searchedNumber == array[current])
                return array[current];
        }

        return -1;
    }
}
