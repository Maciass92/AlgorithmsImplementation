public class MergeSort {

    private int[] arrayToSort;
    private int length;

    public void sort(int[] array){

        this.arrayToSort = array;
        this.length = array.length;
        mergeSort(this.arrayToSort, 0, arrayToSort.length - 1);
    }

    public void mergeSort(int[] array, int min, int max){

        if(min < max){

            int middle = (min + max)/2;
            mergeSort(array, min, middle);
            mergeSort(array,middle + 1, max);

            merge(array, min, middle, max);
        }
    }

    public void merge(int[] array, int min, int mid, int max){

        int l = mid - min + 1;
        int r = max - mid;

        int[] L = new int[l];
        int[] R = new int[r];

        for(int i = 0; i < l; i++)
            L[i] = array[l + i];

        for(int j = 0; j < r; j++)
            R[j] = array[mid + 1 + j];

        int lindex = 0;
        int rindex = 0;
        int x = min;

            while(lindex < l && rindex < r){

                System.out.println("----------------------");
                System.out.println("lindexbefore: " + lindex);
                System.out.println("rindexbefore: " + rindex);
                System.out.println("L[i]: " + L[lindex]);
                System.out.println("R[i]: " + R[rindex]);
                System.out.println("Bool: " + (L[lindex] < R[rindex]));

            if(L[lindex] < R[rindex]){
                array[x] = L[lindex];
                lindex++;
            }
            else{
                array[x] = R[rindex];
                rindex++;
            }

                System.out.println("lindexafter: " + lindex);
                System.out.println("rindexafter: " + rindex);
                System.out.println("i: " + x + ", helperArray[i]: " + array[x]);

            x++;
            }

            while (lindex < l) {
                array[x] = L[lindex];
                lindex++;
                x++;
            }

            while (rindex < r){
                array[x] = R[rindex];
                rindex++;
                x++;
            }





    }





}
